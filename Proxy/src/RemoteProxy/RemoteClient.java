package RemoteProxy;

import java.rmi.Naming;

public class RemoteClient {
    public static void main (String[] args) {
        new RemoteClient().go();
    }

    public void go() {
        try {
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");

            String s = service.sayHello();

            System.out.println(s);
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
