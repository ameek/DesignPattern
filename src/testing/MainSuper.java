package testing;
class Base{
    private int b;
    Base(int x){
        b = x;
    }
}
class Derived extends Base{
    private int d;

    Derived(int x,int y) {
        super(x);
        d = y;
        System.out.println("Derived constructor called");
    }
}

public class MainSuper {
    public static void main(String[] args) {
        Derived d = new Derived(1,3);
    }
}
