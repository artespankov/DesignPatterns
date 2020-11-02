package ProtectionProxy;

import javax.naming.InitialContext;

public class MatchMakingTestDrive {
    public static void main(String[] args) {
        MatchMakingTestDrive test = new MatchMakingTestDrive();
        test.drive();
    }

    public MatchMakingTestDrive() {
        initializeDatabase();
    }

    public void initializeDatabase(){};

    public void drive() {
//        PersonBean joe = getPersonFromDatabase("Joe Javabean");
//        PersonBean ownerProxy = getOwnerProxy(joe);
//        System.out.println("Name is " + ownerProxy.getName());
//        ownerProxy.setInterests("bowling, Go"); System.out.println("Interests set from owner proxy"); try {
//            ownerProxy.setHotOrNotRating(10);
//        } catch (Exception e) {
//            System.out.println("Can’t set rating from owner proxy");
//        }
//        System.out.println("Rating is " + ownerProxy.getHotOrNotRating());
//        PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
//        System.out.println("Name is " + nonOwnerProxy.getName());
//        try {
//            nonOwnerProxy.setInterests("bowling, Go");
//        } catch (Exception e) {
//            System.out.println("Can’t set interests from non owner proxy");
//        }
//        nonOwnerProxy.setHotOrNotRating(3);
//        System.out.println("Rating set from non owner proxy");
//        System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());
//    }
//
//    PersonBean getOwnerProxy(PersonBean person) {
//        return (PersonBean) Proxy.newProxyInstance(
//                person.getClass().getClassLoader(),
//                person.getClass().getInterfaces(),
//                new OwnerInvocationHandler(person)
//        );
//    }
//    PersonBean getPersonFromDatabase(String name) {
//        return (PersonBean) Proxy.newProxyInstance(
//
//        );
    }
}