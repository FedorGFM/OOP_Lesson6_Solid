package solid;

import jdk.jshell.spi.ExecutionControl;
import solid.isp.InternetPaymentService;
import solid.isp.TerminalPaymentService;

public class Main {
    public static void main(String[] args) throws ExecutionControl.NotImplementedException {
        InternetPaymentService internetService = new InternetPaymentService();
        internetService.payWebMoney(10);
        internetService.payWebMoney(10);
        internetService.payWebMoney(10);

        TerminalPaymentService terminalService = new TerminalPaymentService();
        terminalService.payWebMoney(10);
        terminalService.payCreditCard(10);
    }
}
