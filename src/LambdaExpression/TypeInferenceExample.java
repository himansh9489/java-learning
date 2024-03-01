package src.LambdaExpression;

public class TypeInferenceExample {
    public static void main(String[] args) {
        StringLengthLambda myLambda = s -> s.length();
        printLambda(myLambda,"hello");
        printLambda(s -> s.length(),"welcome");
    }

    public static void printLambda(StringLengthLambda l,String str){
        System.out.println(l.getLength(str));

    }
    interface StringLengthLambda{
        int getLength(String s);
    }
}
