import java.util.ArrayList;
import java.util.Iterator;

public class JavaIterator {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        Iterator<Integer> it = numbers.iterator();
        while(it.hasNext()) {
            Integer i = it.next();
            System.out.println(i);
        }
       System.out.println(numbers);
    }
}
