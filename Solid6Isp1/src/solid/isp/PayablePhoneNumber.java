package solid.isp;

import jdk.jshell.spi.ExecutionControl;

public interface PayablePhoneNumber {
    void payPhoneNumber(int amount) throws ExecutionControl.NotImplementedException;
}
