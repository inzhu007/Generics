import java.util.ArrayList;
import java.util.List;
public class Main3 {
    public static void main(String [] args){
        Box<Integer> box = new Box <>();
        box.add(1);
        box.add(2);
        box.add(3);

        List<Integer> el = box.getContents();
        System.out.println(el);
    }
}

class Box <T> {
    private List<T> contents= new ArrayList<>();

    public Box(T content) {

        this.contents=contents;
    }
    public Box(){}

    void add(T item){
        contents.add(item);
    }
    List<T> getContents(){
        return contents;
    }
}

