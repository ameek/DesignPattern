package testing;
interface myA{
    void funForA();
}

interface myB{
    void funForB();
}

class Multi_implements implements myA,myB{

    @Override
    public void funForA() {
        System.out.println("i am implemented from myA");
    }

    @Override
    public void funForB(){
        System.out.println("i am implemented from myB");
    }
}

public class Multi_implement{
    public static void main(String[] args) {
        Multi_implements M_imp = new Multi_implements();
        M_imp.funForA();
        M_imp.funForB();
    }
}