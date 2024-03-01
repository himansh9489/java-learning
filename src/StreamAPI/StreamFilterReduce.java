package src.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamFilterReduce {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,20,35,46,55,68,75);

        List<Integer> list1 = Arrays.asList(12,24,39);

        // add elements who are divisible by 5
        Integer result = 0;
        for (Integer el:list){
            if(el % 5 == 0)
                result += el;
        }
        System.out.println(result);

        // using stream
//        Predicate<Integer> predicate = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer el) {
//                return el % 5 == 0;
//            }
//        };

        Predicate<Integer> predicate = el -> el % 5 == 0;


//        BinaryOperator<Integer> binaryOperator = new BinaryOperator<Integer>() {
//            @Override
//            public Integer apply(Integer carry, Integer el) {
//                return carry+el;
//            }
//        };
        BinaryOperator<Integer> binaryOperator = (carry,el) -> carry+el;

        Stream<Integer> s = list.stream();

        Stream<Integer> s1 = s.filter(predicate);

        result = s1.reduce(0,binaryOperator);

        System.out.println(result);

        System.out.println(list.stream()
                               .filter( el -> el % 5 == 0)
                               .map(el -> el*2)
                               .reduce(0,(c,e) -> c+e));

        System.out.println(list.stream()
                .filter( el -> el % 5 == 0)
                .map(el -> el*2)
                .findFirst().orElse(0));
    }
}
