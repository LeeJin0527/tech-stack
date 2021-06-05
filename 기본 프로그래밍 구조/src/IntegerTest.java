package variable;

public class IntegerTest {
    public static void main(String[] agrs){
        byte bs = -128;
        System.out.println(bs);

        /* out of range
         int ival = 12345678900;
        literal 기본적으로 4byte안에 넣음
        넘어가면 뒤에 L을 써야함
        */
        long lval = 12345678900L;
    }
}
