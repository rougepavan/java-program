import java.util.*;  
import java.util.stream.*;  
public class order  
{  
public static void main(String[] args)   
{    
List<String> slist = Arrays.asList("Banana","Carrot","Radish","Apple","Jack");
List<String> sortedList = slist.stream().sorted().collect(Collectors.toList());     
sortedList.forEach(System.out::println);  
}  
}  