public class StringProperty {

    public static StringProperty of(String value){
        return new StringProperty(value);
    }

    private int value;

    private StringProperty(int value) {
        this.value = value;
    }

    public int get() {
        return value;
    }

    public void set(int value) {
        this.value = value;
    }

    public StringProperty plus(StringProperty value) {
        this.value += value.get();
        return this;
    }

    public StringProperty minus(StringProperty value) {
        this.value -= value.get();
        return this;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

}