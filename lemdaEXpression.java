 import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class lemdaEXpression {
   

    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("vanshika");
        list.add("alshifa");
       
           Collections.sort(list,(a,b)->a.compareTo(b));

        System.out.println(list);
    }
    
}
    

