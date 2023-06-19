package solid.isp;

import jdk.jshell.spi.ExecutionControl;

public interface Payable extends PayableCreditCard, PayablePhoneNumber, PayableWebMoney {

}
