import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {


        Scanner coolGuys = new Scanner(System.in);
        System.out.println("Please enter a number");
        int firstNum = coolGuys.nextInt();
        int secondNum = coolGuys.nextInt();

        try{
             int result = firstNum/secondNum;
        } catch(NumberFormatException ex){
            
        }finally{

        System.out.println("This run has crashed");
        }
    }
}
