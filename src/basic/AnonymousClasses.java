package src.basic;

interface AnoDemo{
    void math1();
    void math2();
}
class  DemoAnonymous implements AnoDemo{

    @Override
    public void math1() {
        System.out.println("I am Math1");
    }

    @Override
    public void math2() {
        System.out.println("I am Math2");
    }

}

//@FunctionalInterface
interface DemoAno{
    void meth1(int a);
    //void meth2();
}


class HarryFunc implements DemoAno{

    @Override
    public void meth1(int a) {
        System.out.println("I am Math :"+ a);
    }
//    @Override
//    public void meth2() {
//        System.out.println("I am Math2");
//    }
}

public class AnonymousClasses {
    public static void main(String[] args) {
        //DemoAnonymous obj  = new DemoAnonymous();
        //obj.math1();
        //obj.math2();

        // this is how  you create Anonymous Class
        // this anonymous class will work the same as DemoAnonymous class you created above
        // no need to create  DemoAnonymous class
        AnoDemo obj = new AnoDemo() {
            @Override
            public void math1() {
                System.out.println("I am Math1");
            }

            @Override
            public void math2() {
                System.out.println("I am Math2");
            }
        };
        obj.math1();

        //DemoAno obj1 = new HarryFunc();
        //obj1.meth1(5);
        // instead of doing it this way we can use
        // Lambda Expression to do the same thing

        DemoAno obj1 = (a)->{
            System.out.println("I am Math :"+ a);
        };
        obj1.meth1(8);


    }
}
