package testing;
//abstract class example
abstract class myAbstractClass{
    //an abstract method
    abstract void myAbstractFun();

    void fun(){
        System.out.println("printing form abstract fun as inheritance");
    }

}

public class myClass_abs extends myAbstractClass{
    @Override
    void myAbstractFun() {
        System.out.println("i am implemented method");
    }

    public static void main(String[] args) {
        myClass_abs myabs = new myClass_abs();
        myabs.fun();  //calling the inheritance functuon
        myabs.myAbstractFun(); //calling the abstract function implemented here.
    }
}
