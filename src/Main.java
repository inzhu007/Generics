class Printer <T> {
    T value;
    void detValue(T value){
        this.value = value;
    }
    T getValue(){
        return value;
    }
    void printValue(T value){
        System.out.println("value is: " + value);
    }
    void refresh(){
        value = null;
    }
}
 public class Main {
    public static void main(String[] args) {
        Printer<String> printer = new Printer<>();
        printer.printValue("Hello");
        printer.refresh();

    }
 }
