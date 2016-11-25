package ru.simplgroupp.ejb;

import org.admnkz.crypto.app.ICryptoService;
import org.apache.openejb.api.LocalClient;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.simplgroupp.exception.ActionException;
import ru.simplgroupp.exception.KassaException;
import ru.simplgroupp.fixtures.AccountFixture;
import ru.simplgroupp.fixtures.CreditFixture;
import ru.simplgroupp.fixtures.CreditRequestFixture;
import ru.simplgroupp.fixtures.PaymentFixture;
import ru.simplgroupp.interfaces.ActionProcessorBeanLocal;
import ru.simplgroupp.interfaces.KassaBeanLocal;
import ru.simplgroupp.interfaces.ReferenceBooksLocal;
import ru.simplgroupp.interfaces.WorkflowBeanLocal;
import ru.simplgroupp.interfaces.WorkflowEngineBeanLocal;
import ru.simplgroupp.interfaces.plugins.payment.WinpayPayBeanLocal;
import ru.simplgroupp.toolkit.common.Utils;
import ru.simplgroupp.transfer.Account;
import ru.simplgroupp.transfer.Credit;
import ru.simplgroupp.transfer.CreditRequest;
import ru.simplgroupp.transfer.Payment;
import ru.simplgroupp.util.ErrorKeys;
import ru.simplgroupp.workflow.PluginExecutionContext;

import javax.ejb.EJB;
import javax.ejb.embeddable.EJBContainer;
import javax.naming.Context;
import java.util.Collections;
import java.util.Properties;

/**
 * @author Khodyrev DS
 */
@LocalClient
public class WinPayBeanTest {

    @EJB
    private ActionProcessorBeanLocal actProc;

    @EJB
    private WorkflowEngineBeanLocal wfEng;

    @EJB
    private WorkflowBeanLocal wfBean;

    @EJB
    private WinpayPayBeanLocal winPay;

    @EJB
    private ReferenceBooksLocal refBooks;

    @EJB
    private KassaBeanLocal kassaBean;

    @EJB
    private ICryptoService cryptoService;

    @Before
    public void setUp() throws Exception {
        System.setProperty("javax.xml.bind.JAXBContext","com.sun.xml.internal.bind.v2.ContextFactory");

        final Properties p = new Properties();
        p.load(this.getClass().getResourceAsStream("/test.properties"));

        final Context context = EJBContainer.createEJBContainer(p).getContext();
        context.bind("inject", this);

        wfEng = (WorkflowEngineBeanLocal) context.lookup("java:global/Engine-EJB/WorkflowEngineBean!ru.simplgroupp.interfaces.WorkflowEngineBeanLocal");
        wfBean = (WorkflowBeanLocal) context.lookup("java:global/Engine-EJB/WorkflowBean!ru.simplgroupp.interfaces.WorkflowBeanLocal");
        actProc = wfEng.getActionProcessor();
    }

    @Test
    public void pay() {
    	ActionContext context = actProc.createActionContext(null, true);
    	PluginExecutionContext plctx = new PluginExecutionContext(context.getPlugins()
                .getPluginConfig(WinpayPayBeanLocal.SYSTEM_NAME), null, 0, Utils.<String, Object>mapOf(), context.getPluginState(
                WinpayPayBeanLocal.SYSTEM_NAME));
    	
        winPay = context.getPlugins().getWinpayPay();

        Account invalidAccount = AccountFixture.getYandexInvalidAccount();
        CreditRequest creditRequest = CreditRequestFixture.createCreditRequest(invalidAccount);
        Credit credit = CreditFixture.createCredit(creditRequest);
        Payment payment = PaymentFixture.createPayment(credit);
        try {
            winPay.pay(payment.getEntity(), plctx);
            Assert.assertEquals(1,2);
        } catch (ActionException e) {
            Assert.assertEquals(e.getInfo().getCode(), ErrorKeys.INVALID_ACCOUNT);
        }

        Account validAccount = AccountFixture.getYandexValidAccount();
        creditRequest = CreditRequestFixture.createCreditRequest(validAccount);
        credit = CreditFixture.createCredit(creditRequest);
        payment = PaymentFixture.createPayment(credit);

        try {
            winPay.pay(payment.getEntity(), plctx);
        } catch (ActionException e) {
            Assert.assertEquals(1,2);
        }
    }

    @Test
    public void statusTest() {
    	ActionContext context = actProc.createActionContext(null, true);
    	PluginExecutionContext plctx = new PluginExecutionContext(context.getPlugins()
                .getPluginConfig(WinpayPayBeanLocal.SYSTEM_NAME), null, 0, Collections.<String, Object>emptyMap(), context.getPluginState(
                WinpayPayBeanLocal.SYSTEM_NAME));
        winPay = context.getPlugins().getWinpayPay();

        Account invalidAccount = AccountFixture.getYandexInvalidAccount();
        CreditRequest creditRequest = CreditRequestFixture.createCreditRequest(invalidAccount);
        Credit credit = CreditFixture.createCredit(creditRequest);
        Payment payment = PaymentFixture.createPayment(credit);
        try {
            winPay.status(payment.getEntity(), plctx);
            Assert.assertEquals(1,2);
        } catch (ActionException e) {
            Assert.assertEquals(e.getInfo().getCode(), ErrorKeys.INVALID_ACCOUNT);
        }

        Account validAccount = AccountFixture.getYandexValidAccount();
        creditRequest = CreditRequestFixture.createCreditRequest(validAccount);
        credit = CreditFixture.createCredit(creditRequest);
        payment = PaymentFixture.createPayment(credit);

        try {
            winPay.status(payment.getEntity(), plctx);
            winPay.status(payment.getEntity(), plctx);
        } catch (ActionException e) {
            Assert.assertEquals(1,2);
        }

        payment = PaymentFixture.createPayment(credit);
        payment.getEntity().setAmount(1001.0);
        try {
            winPay.status(payment.getEntity(), plctx);
            Assert.assertEquals(1,2);
        } catch (ActionException e) {
        }

        try {
            payment = PaymentFixture.createPayment(credit);
            payment.getEntity().setAmount(999.0);
            winPay.status(payment.getEntity(), plctx);

            payment = PaymentFixture.createPayment(credit);
            payment.getEntity().setAmount(999.0);
            winPay.status(payment.getEntity(), plctx);

        } catch (ActionException e) {

        }
    }

    @Test
    public void balanceTest() throws ActionException, KassaException {
    	ActionContext context = actProc.createActionContext(null, true);
        PluginExecutionContext plctx = new PluginExecutionContext(context.getPlugins()
                .getPluginConfig(WinpayPayBeanLocal.SYSTEM_NAME), null, 0, Collections.<String, Object>emptyMap(), context.getPluginState(
                WinpayPayBeanLocal.SYSTEM_NAME));
        winPay = context.getPlugins().getWinpayPay();

        double f = winPay.balance(plctx);
    }

    //@Test
    public void testRun() throws Exception {


    	ActionContext context = actProc.createActionContext(null, true);
        //wfEng.removeProcessByBusinessKey(ProcessKeys.DEF_SUB_STANDART, new Integer(1316).toString());
        //actProc.runPlugin(YandexPayBeanLocal.SYSTEM_NAME, Payment.class.getName(), new Integer(1316), null);
        winPay = context.getPlugins().getWinpayPay();

        winPay.sendSingleRequest(Payment.class.getName(), 1318, null);
    }
}