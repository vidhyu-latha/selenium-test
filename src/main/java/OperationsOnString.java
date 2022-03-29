import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class OperationsOnString {
    public static void main(String[] args){

        //********reverse
        String str="vidhyu";
        String str2=new StringBuffer(str).reverse().toString();
        System.out.println(str2);

        String input = "tutorialspoint";
        char[] try1 = input.toCharArray();
        for (int i = try1.length-1;i >= 0; i--)
            System.out.print(try1[i]);
        //**************
        HashMap<Integer,String> map=new HashMap<Integer,String>();
        System.out.println();
        String str1="Vidhyu Latha 123 456 abc xyz";
        List<String> list1=new ArrayList<String>();
        String[] splitStr=str1.split(" ");
        list1= Arrays.asList(splitStr);
        for(int i=0;i<=list1.size()-1;i++){
            //System.out.println(list1.get(i));
            map.put(i,list1.get(i));
        }
        System.out.println("*****HASHMAP******");
        for (Integer k:map.keySet()) {
            System.out.println(map.get(k));
        }
        //        for (String list2: list1) {
//            System.out.println(list2);
//            map.put()
//
//        }
        //String Condition
        String s1= "hello";
        String s2="hello";

        if(s1==s2){
            System.out.println("Same ==");
        }else{
            System.out.println("not Same ==");
        }

        //String Concatinate
        String s="hello";
        System.out.println("Concate "+s.concat("world"));

        //String with New

        String s3=new String("hello");
        String s4=new String("hello");
        if(s3==s4){
            System.out.println(" s3 and s4 -Same ==");
        }else{
            System.out.println("s3 and s4 - not Same ==");
        }
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s3));
        System.out.println(System.identityHashCode(s4));

    }

}

