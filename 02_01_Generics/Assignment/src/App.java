public class App {
    public static void main(String[] args) throws Exception {

        Property<Integer> myIntegerProperty = new Property<Integer>();
        myIntegerProperty.set(2);
        System.out.println(myIntegerProperty.get());
        myIntegerProperty.set(5);
        System.out.println(myIntegerProperty.get());

        
        Property<Boolean> myBooleanProperty = new Property<Boolean>();
        myBooleanProperty.set(true);
        System.out.println(myBooleanProperty.get());
        myBooleanProperty.set(false);
        System.out.println(myBooleanProperty.get());



        Property<Double> myShortProperty = new Property<Double>();
        myShortProperty.set(3761.0);
        System.out.println(myShortProperty.get());
        myShortProperty.set(5654.0);
        System.out.println(myShortProperty.get());






    }
}