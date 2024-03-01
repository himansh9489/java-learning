package src.CollectionFramwork;

import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapImplementation {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        TreeMap<String,Integer> treeMap = new TreeMap<>();
        String[] stringsArr = {"apple","banana","mango"};
        map.put(3,"Him");map.put(4,"Hi"); map.put(1,"Himanshu");map.put(2,"Himans");
        System.out.println(map);
        map.remove(3);
        for(Integer key:map.keySet()){
            System.out.println(key+" : "+map.get(key));
        }
        for( Map.Entry<Integer,String> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

    }
}
