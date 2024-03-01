package src.StreamAPI;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamMapReduce {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,4,2,4,5,2,6);//Arrays.asList(1,4,2,4,5,2,6);

//        Function<Integer,Integer> function = new Function<Integer, Integer>() {
//            @Override
//            public Integer apply(Integer integer) {
//                return integer*2;
//            }
//        };

// or
        Function<Integer,Integer> function = (e) -> e*2;

//        BinaryOperator<Integer> binaryOperator = new BinaryOperator<Integer>() {
//            @Override
//            public Integer apply(Integer result, Integer element) {
//                return result+element;
//            }
//        };

//or
        BinaryOperator<Integer> binaryOperator = (carry,el) -> carry + el;

        Stream<Integer> s = list.stream();

        Stream<Integer> s1 = s.map(function);

        Integer result = s1.reduce(0,binaryOperator);

        System.out.println(result);

        // we can reduce all that above code into this single line
        System.out.println(list.stream().map(e -> e*2).reduce(0,(carry,el) -> carry+el));
        System.out.println(list.stream().map(e -> e*2).reduce(0,Integer::sum));
        System.out.println(list.stream().map(e -> e*2).reduce(777777,(carry,el) -> carry/el));
        System.out.println(list.stream().map(e -> e*2).reduce(1,(carry,el) -> carry*el));

    }
}
