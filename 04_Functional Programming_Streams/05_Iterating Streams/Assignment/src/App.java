import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) throws Exception {
 
        // use streams and Functions with lambdas to make a list with 5 added to each numbers in the ints list
        // use streams and foreach to print out the values

        //What else you need to do.  
        //TODO:  repeate the mapping wtih an extra div2Function and map the list of intsPlus5 to make
        // a list intsPlus5Div2.  
        //TODO:  use foreach to print intsPlus5Div2

        List<Integer> ints = IntStream.rangeClosed(0, 10).boxed().toList();
        Function<Integer, Integer> add5Func = (number) -> number + 5;    
        List<Integer> intsPlus5 = ints.stream().map(add5Func).toList();
        Consumer<Integer> intPrinter = (number) -> System.out.println(number);
        intsPlus5.stream().forEach(intPrinter);
        
        Function<Integer, Integer> div2Func = (number) -> number / 2;
        List<Integer> divAndPlus = intsPlus5.stream().map(div2Func).toList();
        divAndPlus.stream().forEach(intPrinter);
        
    }
}
