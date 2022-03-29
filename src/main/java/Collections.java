import java.util.*;

public class Collections {
    public static void main(String[] args){
        int[] arr1={23, 45, 67, 84, 45,67,84 };
        //Method 1
        System.out.println("*********Method 1---> array to set********");
        Set<Integer> set1=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
           set1.add(arr1[i]);
        }
        for (Integer n:set1) {
            System.out.println(n);
        }
      //Method 2
        System.out.println("*********Method 2---->array to list to set********");
        List<Integer> list1= new ArrayList();
         for(int i=0;i<arr1.length;i++){
             list1.add(arr1[i]);
         }
        System.out.println("*********Before Removing Duplicates********");
        for (Integer n:list1) {
            System.out.println(n);
        }
        System.out.println("*********After Removing Duplicates********");
        Set<Integer> set2=new HashSet<>();
        set2.addAll(list1);
        for (Integer n:set2) {
           System.out.println(n);
        }

        System.out.println("********* Convert set to Hash Map*************");
        Map<Integer,Integer> map1=new HashMap<>();
        int i=0;
        for (Integer n:set2) {
            map1.put(i,n);
            i++;
        }
        for(Integer n:map1.keySet()){
        System.out.println(map1.get(n));
        }
    }

}
