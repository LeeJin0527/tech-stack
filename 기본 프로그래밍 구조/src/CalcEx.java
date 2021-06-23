package Package;
class Calc{
    public static int abs(int a){ return a > 0? a: -a; }
    public static int max(int a, int b){ return a > b? a: b; }
    public static int min(int a, int b){ return a > b? b: a; }
}
public class CalcEx {
    public static void main(String[] args){
        System.out.println(Calc.abs(-5));
        System.out.println(Calc.max(5,6));
        System.out.println(Calc.min(6,10));

    }
}
