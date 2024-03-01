package src.LambdaExpression;

@FunctionalInterface
interface Greeting{
    void perform();
}
//class HelloWorldGreeting implements Greeting{
//    @Override
//    public void perform() {
//        System.out.println("Hello World");
//    }
//}

public class LambdaExpression {

    public void greet(Greeting greeting){
        greeting.perform();
    }
    public static void main(String[] args) {
        //Greeting hellWorldGreeting = new HelloWorldGreeting();
        // instance of a class that implements Greeting      interface
        // hellWorldGreeting.perform();

        Greeting lambdaGreeting = ()-> System.out.println("Hello World");
        // almost as if implementing interface by creating lambda expression
        // using function but it not implementation.
        // it is Lambda Expression of type Greeting Interface

        Greeting innerClassGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Hello World");
            }
        };
        // Anonymous class

        LambdaExpression greeter = new LambdaExpression();
        greeter.greet(lambdaGreeting);
        greeter.greet(innerClassGreeting);

    }
}
