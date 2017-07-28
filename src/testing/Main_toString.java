package testing;

class Complex {
    private double re, im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }
//    if you dont overide to string method

//
//    @Override
//    public String toString() {
//        return "Complex{" +
//                "re=" + re +
//                ", im=" + im +
//                '}';
//    }
    @Override
    public String toString(){
        return String.format(re + " + i" + im);
    }
}

public class Main_toString {
    public static void main(String[] args) {
        Complex c1 = new Complex(11, 152);
        System.out.println(c1);
    }

}