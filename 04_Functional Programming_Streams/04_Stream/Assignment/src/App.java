import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class App {
    public static void main(String[] args) throws Exception {



        List<Integer> myList = List.of(1, 2, 3);
        List <String> stringList = new ArrayList<>();
       
        stringList.add("Spanish ");
        stringList.add("APUSH ");
        stringList.add("Physics");
        stringList.add("Soft Dev");
        stringList.add("English");
        stringList.add("Trig");
        stringList.add("Jewlery");

        Integer cumulativeSum = myList.stream().reduce(0, (a, b) -> a + b );
        System.out.println(cumulativeSum);
        
        Integer cumulativeProduct = myList.stream().reduce(1, (a, b) -> a * b);

        Function<String, String> toLowerCase = (s) -> s.toLowerCase();

         List <String> lowerCaseSchedule = stringList.stream().map(toLowerCase).toList();

         System.out.println(lowerCaseSchedule);


        
        //create  a list of strings.  
        //fill that list with your daily school schedule
        //write a Function<String, String> toLowerCase
        //the function will equal (s) -> s.toLowerCase();
        //map your list of strings to another list of strings using 
        //.stream().map(toLowerCase).toList(); and set to a variable called lowerCaseSchedule
        //System.out.println(your lower cased list)


    }
}
