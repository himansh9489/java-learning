package src.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class StreamAPIs {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,4,2,4,5,2,6);//Arrays.asList(1,4,2,4,5,2,6);
        ArrayList<Integer> arrList = new ArrayList<>(list);

//        /* Internal Iteration */
////        Consumer<Integer> consumer = e -> System.out.print(e+" ");
////        list.forEach(consumer);
//
//        list.forEach(e -> System.out.print(e+" "));
//        System.out.println();
//        list.forEach(e -> System.out.print(e*2+" "));
//        System.out.println();
//
//        // passing method reference(passing method as reference)
//        // instead of Lambda Expression
//        list.forEach(System.out::print);
//        System.out.println();
//        list.forEach(StreamAPIs::doubleIt);


//        Consumer<Integer> consumer = e -> System.out.print(e+" ");
//        list.stream().forEach(consumer);

        list.stream().forEach(e -> System.out.print(e+" "));
        System.out.println();

        list.stream().forEach(StreamAPIs::printIt);
        System.out.println();

        list.stream().forEach(e -> System.out.print(e*2+" "));
        System.out.println();

        // passing method reference(passing method as reference)
        // instead of Lambda Expression
        //list.stream().forEach(System.out::print);
        //System.out.println();
        //list.stream().forEach(StreamAPIs::doubleIt);
        //System.out.println();

        list.parallelStream().forEach(e -> System.out.print(e+" ")); //(StreamAPIs::printIt);
        System.out.println();

        System.out.println(list.stream().map(e -> e*2).reduce(0,(c,e) -> c+e));
    }
    public static void doubleIt(Integer i){
        System.out.print(i*2 + " ");
    }
    public static void printIt(Integer i){
        System.out.print(i + " ");
    }
}

/* External Iteration */
//
//        for (int i = 0; i < list.size();i++){
//            System.out.print(list.get(i)+" ");
//        }
//        System.out.println();

//        Iterator it = list.iterator();
//
//        while (it.hasNext()){
//            System.out.print(it.next()+" ");
//        }
//        System.out.println();

//        for (Integer val:list){
//            System.out.print(val+" ");
//        }
//        System.out.println();
