import java.util.*;

public class SplitStringAndPrintInMap {
    public static void main(String[] args){
        String str="Vidhyu I am working.xyz abc.123 456.";
        //Split
        String[] arr=str.split("\\.");
        System.out.println("************Printing using arrays*****************");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("***************Printing using ArraysList by using Arrays.asList method***********");
        List<String> list1=new ArrayList();
        list1= Arrays.asList(arr);
        for(int i=0;i<list1.size();i++) {
            System.out.println(list1.get(i));
        }

        System.out.println("***************Printing using ArraysList by using Add method***********");
        List<String> list2=new ArrayList();
       for(int i=0;i<arr.length;i++){
           list2.add(arr[1]);
       }
        for(int i=0;i<list2.size();i++) {
            System.out.println(list2.get(i));
        }

        System.out.println("***************Printing using Set with Add Method***********");
        Set<String> set1=new HashSet<>();
        for(int i=0;i<list1.size();i++){
            set1.add(list1.get(i));
        }
        for (String s:set1) {
            System.out.println(s);
        }

        System.out.println("***************Printing using Set with AddAll Method***********");
        Set<String> set2=new HashSet<>();
        set2.addAll(list1);
        for (String s:set2) {
            System.out.println(s);
        }
        System.out.println("***************Printing using Hash Map ***********");
        Map<Integer,String> map1=new HashMap();
        int i=0;
        for (String s:set1) {
            map1.put(i,s);
            i++;
        }
        for (Integer n:map1.keySet()) {
            System.out.println(map1.get(n));
        }
    }
}
