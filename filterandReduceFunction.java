import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class filterandReduceFunction {
    public static void main(String[] args) {
         List <Integer> list= Arrays.asList(2,10,30,87,6);
                 List <Integer> evenlist=list.stream()
                                .filter(n-> n%2==0)
                              .filter(n->n>2)
                                .collect(Collectors.toList());
        Optional <Integer> sum=evenlist.stream().reduce((a,b)->a+b);
        System.out.println(sum);
    }
    }
    

