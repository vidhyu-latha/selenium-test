package study.testng;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
    public static void main(String args[]){
        //Creating HashSet and adding elements
        List<String> list=new ArrayList<String>();
        //Set<String> set=new HashSet<String>(); //Set is and interface and HashSet is a class
        //Adding
        list.add("Mango");
        list.add("Orange");
        for (String s: list) {
            System.out.println(s);
        }
        //AddingALL
        System.out.println("adding all");
        List<String> list2=new ArrayList<String>();
        list2.add("Apple");
        list2.add("Apple");
        list.addAll(list2);
        for (int i=0;i<list.size();i++) {
            System.out.println(i +":"+list.get(i));
        }
        //Remove
        System.out.println("Remove");
        list.remove("Apple");
//        for (String s: list) {
//            System.out.println(s);
//        }
        for (int i=0;i<list.size();i++) {
            System.out.println(i +":"+list.get(i));
        }

    }
}
