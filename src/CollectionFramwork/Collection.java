package src.CollectionFramwork;
import java.util.*;

public class Collection {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(5);
        System.out.println(stack);
        stack.add(2);
        System.out.println(stack);
        stack.pop();
        System.out.println( stack.peek());
        Integer arr[] =  {1,2,3,3,4,2,1,5,5};
        HashMap<Integer,String> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        set.add(5);set.add(5);set.add(1);set.add(3); set.add(0);
        System.out.println(set);
        map.put(1,"Himanshu");map.put(2,"Himans");map.put(3,"Him");map.put(4,"Hi");
        System.out.println(map);
//        for(Integer key:map.keySet()){
//            System.out.println(key+" : "+map.get(key));
//        }
//        for(Integer key:set){
//            System.out.print(key+" ");
//        }
        System.out.println(set.contains(1));
        Iterator it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());

        }
    }
}
