package testing;

class A {
    protected int x = 10, y = 20;

    public void changeVar(int var){
        var = 12;
        System.out.println("var before method call: "+ var);
    }

}

public class B {
    public static void main(String args[]) {
        A a = new A();
        System.out.println(a.x + " " + a.y);
        int var = 10;
        a.changeVar(var);
        System.out.println("var before method call: "+ var);

    }
}