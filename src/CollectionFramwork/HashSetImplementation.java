package src.CollectionFramwork;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetImplementation {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);set.add(3); set.add(0); set.add(5);set.add(5);
        System.out.println(set);
          for(Integer key:set){
            System.out.print(key+" ");
        }
        System.out.println(set.contains(1));
        // Iterator
        Iterator it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
