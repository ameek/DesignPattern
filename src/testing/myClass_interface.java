package testing;
//an interface example
interface myInterface{
//    myAbstractfun in public and abstract, eve if we dont these words
    void myAbstractFun(); //is same as public abstract void myAbstractFun()

}
class implementingInterface implements myInterface{
    public void myAbstractFun(){
        System.out.println("inside my fun");
    }
}

public class myClass_interface{
    public static void main(String[] args) {
        implementingInterface myabs = new implementingInterface();
        myabs.myAbstractFun();
    }
}