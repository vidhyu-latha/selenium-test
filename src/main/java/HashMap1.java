package study.testng;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
    public static void main(String args[]){
        //Creating HashSet and adding elements
        Map<Integer,String> map=new HashMap<Integer,String>();
        //Set<String> set=new HashSet<String>(); //Set is and interface and HashSet is a class
        //Adding
        map.put(1,"Mango");
        map.put(2,"Orange");
        for (Integer k:map.keySet()) {
            System.out.println(map.get(k));
        }
        //AddingALL
        System.out.println("adding all");
        Map<Integer,String> map2=new HashMap<Integer,String>();
        map2.put(3,"Apple");
        map2.put(4,"Apple");
        map.putAll(map2);
        for (Integer k:map.keySet()) {
            System.out.println(map.get(k));
        }
        //Remove
        System.out.println("Remove");
        map.remove(4);
        for (Integer k:map.keySet()) {
            System.out.println(map.get(k));
        }
    }
}
