package src.basic;

public class StringsExample {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String sentence = "1243232";
//        System.out.print(Integer.parseInt(sentence,10));
        StringBuilder sb = new StringBuilder("himanshu kushwah");
        System.out.println(sb);
        sb.setCharAt(0,'k');
        System.out.println(sb);
        sb.insert(0,'g');
        System.out.println(sb);
        sb.delete(0,2);
        System.out.println(sb);
        sb.insert(0,'h');
        System.out.println(sb);
        sb.append(4);
        System.out.println(sb +" "+ sb.length());
        sb.reverse();
        System.out.println(sb);
    }
    public void fun1(){
        String firstName = "Himanshu";
        String lastName  = "Kushwah";
        String fullName = firstName+" "+lastName;
       char [] charArr = fullName.toCharArray();
       for (char ch:charArr)
           System.out.print(ch);
        System.out.print(fullName.lastIndexOf('h'));
    }
    public void  fun2(){
        //Always use compareTo function to compare strings

        String name1 = "hello";
        String name2  ="hello";
//        if (name1.compareTo(name2) == 0) {
//            System.out.print("equal");
//        } else {
//            System.out.print("not equal");
//        }
//        if (name1 == name2) {
//            System.out.print("equal");
//        } else {
//            System.out.print("not equal");
//        }
        if (new String("hello") == new String("hello ")) {
            System.out.print("equal");
        } else {
            System.out.print("not equal");
        }
    }

}
