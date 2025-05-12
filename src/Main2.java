public class Main2 {
    public static void main(String[] args) {

        Pair <Integer,String> pair= new Pair<>(3,"Inzhu");
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

    }
}

class Pair <A, B>{
    public A first;
    public B second;

    public Pair(A first, B second ){
        this.first=first;
        this.second=second;
    }
    public Pair(){};

    public A getFirst(){
        return first;
    }
    public B getSecond(){
        return second;
    }
    public void setFirst(A first){
        this.first = first;
    }
    public void setSecond(B second){
        this.second = second;
    }
}
