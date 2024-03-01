package src.Generics;

import java.util.*;

/*
Java Generics
    -> Introduced from JDK 5.0 onwards.
    -> The Java Generics helps us to deal with the compiler time type-safety.
    -> With the help of the Generics, we can write a single method and call it with
       different argument types(integer, strings, etc.).
 */

class MyGeneric <T1,T2>{ //Example of Generic Class
    int num;
    T1 t1;
    T2 t2;
    public MyGeneric(int num, T1 t1, T2 t2) {
        this.num = num;
        this.t1 = t1;
        this.t2 = t2;
    }
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }
}

class Util { // Example of
    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) &&
                p1.getValue().equals(p2.getValue());
    }
}
class Pair<K, V> {

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void setKey(K key) { this.key = key; }
    public void setValue(V value) { this.value = value; }
    public K getKey()   { return key; }
    public V getValue() { return value; }
}

public class Generics {
    public static void main(String[] args) {
/*
       // Without Java Generics :
        ArrayList myArrayList = new ArrayList();
        myArrayList.add(10);  //Integer value
        myArrayList.add("Harry Bhai!"); //String value
        myArrayList.add(20.4); //Double value

        int x = (int) myArrayList.get(0); //b=object typecasted into
        String x1 = (String) myArrayList.get(1);
        System.out.println(x);
        System.out.println(x1);

        ArrayList<Integer> myArrayList = new ArrayList<>();
        myArrayList.add(10);
        myArrayList.add(30);
        myArrayList.add(20);
*/

        MyGeneric<Integer,String> g1 = new MyGeneric(12,50,"welcome");
        System.out.println(g1.getT1());
        System.out.println(g1.getT2());
        System.out.println(g1.getNum());
        g1.setNum(40);
        g1.setT1(1200);
        g1.setT2("Himanshu Kushwah");
        System.out.println(g1.getT1());
        System.out.println(g1.getT2());
        System.out.println(g1.getNum());

        Pair<Integer,String> p1 = new Pair<>(1,"Apple");
        Pair<Integer,String> p2 = new Pair<>(2,"Banana");
        Pair<Integer,String> p3 = new Pair<>(1,"Apple");

        System.out.println(Util.compare(p1,p2));
        System.out.println(Util.compare(p1,p3));
    }
}
