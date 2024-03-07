import java.util.function.Function;

public class App {
    public static void main(String[] args) throws Exception {

        DoubleProperty startProperty = DoubleProperty.of(15);
        Function<DoubleProperty, DoubleProperty> addToStartProperty = (integer) -> {
            startProperty.plus(integer);
            return startProperty;

            StringProperty starProperty = StringProperty.of("Cool");
        Function<DoubleProperty, DoubleProperty> addToStarProperty = (String) -> {
            starProperty.toString()(String);
            return starProperty;
        }
    
    };

}

}

