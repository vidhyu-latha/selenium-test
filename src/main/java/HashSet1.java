package study.testng;

import java.util.HashSet;

public class HashSet1 {
    public static void main(String args[]){
        //Creating HashSet and adding elements
        HashSet<String> set=new HashSet<String>();
        //Set<String> set=new HashSet<String>(); //Set is and interface and HashSet is a class
        //Adding
        set.add("Vidhyu");
        set.add("Latha");
        for (String s: set) {
            System.out.println(s);
        }
        //AddingALL
        System.out.println("adding all");
        HashSet<String> set2=new HashSet<String>();
        set2.add("a");
        set2.add("Vidhyu");
        set.addAll(set2);
        for (String s: set) {
            System.out.println(s);
        }
        //Remove
        System.out.println("Remove");
        set.remove("Vidhyu");
        for (String s: set) {
            System.out.println(s);
        }

    }
}
