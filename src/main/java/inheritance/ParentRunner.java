package inheritance;

public class ParentRunner {

    public static void main(String[] args) throws InterruptedException {

////        Parent.staticParentMethod();
////
////        Child.staticParentMethod();
////
////        Child child = new Child("Billy");
////        child.sayMyName();
//
//        TimeTeller first = new TimeTeller();
//
//        Thread.sleep(2000);
//
//        TimeTeller second = new TimeTeller();
//
//        System.out.println(first.tellMyTime());
//        System.out.println(second.tellMyTime());
//
//        Child.staticParentMethod();

        Child c = new Child();
        c.tellThemAboutYourself();
        c.staticMethod();

        Parent p = new Child("Billy Bob");
        p.sayMyName();
        p.staticMethod();

        p = new ChildTwo();
        p.sayMyName();

    }

}
