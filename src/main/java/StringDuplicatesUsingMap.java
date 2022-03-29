import java.util.HashMap;
import java.util.Map;

public class StringDuplicatesUsingMap {
    public static void main(String[] args){
        String str="howtodoinjava dot com";
        char[] ch=str.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        int counter=0;
        for (char c: ch) {
            counter=0;
            if(map.containsKey(c)){
                counter=map.get(c);
                counter++;
                map.put(c,counter);
            }else{
                map.put(c,1);
            }
        }
        System.out.println("Duplicates");
        for(Character c:map.keySet()){
            if(map.get(c)>1 && c!=' ' ){
                System.out.println( "Character "+c+" repeated "+map.get(c));
            }
        }
        System.out.println("Distinct");
        for(Character c:map.keySet()){
            if(map.get(c)==1 ){
                System.out.println( "Character "+c+" repeated "+map.get(c));
            }
        }
    }

}
