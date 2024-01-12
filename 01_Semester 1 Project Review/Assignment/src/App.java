import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int total;


        

        try(Scanner nums = new Scanner(System.in)){

            System.out.println("Enter the numerator");
            int firstNum= nums.nextInt();
            System.out.println("Enter the denominator");
            int secondNum= nums.nextInt();

            total = firstNum/secondNum;

            System.out.println(total);
        }catch(Exception ex){
            System.out.println("Undefined");

        }

    }
}
