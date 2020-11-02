package RemoteProxy;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemoteService extends UnicastRemoteObject implements MyRemote {
    private static final long serialVersionUID = 1L;

    public RemoteService() throws RemoteException{}

    public String sayHello(){
        return "Server says, 'Hey!'";
    }

    public static void main (String[] args){
        try {
            MyRemote service = new RemoteService();
            Naming.rebind("RemoteHello", service);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


}
