package trycatchfinally;
import java.util.*;
import java.util.stream.*;
public class Sample {
    public static void main(String[] args) {
        Set<String> distinctWords = Arrays.asList(args).stream().collect(Collectors.toSet());
        System.out.println(distinctWords.size()+ " distinct words: " + distinctWords);
    }
}
//import java.util.*;
class List{
    public static void main(String args[]){
        LinkedList list= new LinkedList();
        list.add(4);
        list.add("Hello");
        list.add("");
        list.add("");
        list.add(5.6);
        list.add(true);
        System.out.println(list);
        //list.remove(4);
        System.out.println(list.remove(0));
        System.out.println(list);
        list.remove();
        System.out.println(list);
    }
}
