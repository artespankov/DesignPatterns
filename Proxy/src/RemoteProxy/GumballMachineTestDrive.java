package RemoteProxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class GumballMachineTestDrive {
    public static void main(String[] args) throws RemoteException {
        int count = 0;

        if (args.length < 2) {
            System.out.println("Gumball machine <name> <inventory>");
            System.exit(1);
        }

        try {
            count = Integer.parseInt(args[1]);
            GumballMachine machine = new GumballMachine(args[0], count);
            Naming.rebind("//" + args[0] + "/gumballmachine", machine);
            GumballMonitor monitor = new GumballMonitor(machine);
            monitor.report();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
