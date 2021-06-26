package Generic;
class GStack<T>{
    int tos;
    Object [] stck; //스택에 저장된 요소의 개수
    public GStack(){
        tos = 0;
        stck = new Object[10];
    }
    public void push(T item){
        if (tos == 10)
            return ;
        stck[tos] = item;
        tos++;
    }
    public T pop(){
        if (tos == 0 )
            return null;
        tos --;
        return (T)stck[tos];
    }

}
public class MyStack {
    public static void main(String[] args){
        GStack<String> stringStack = new GStack<String>();
        stringStack.push("Seoul");
        stringStack.push("busan");
        stringStack.push("LA");

        for( int n = 0; n < 3; n++)
            System.out.println(stringStack.pop());

        GStack<Integer> intStack = new GStack<Integer>();
        intStack.push(3);
        intStack.push(5);
        for (int i=0; i<2; i++){
            System.out.println(intStack.pop());
        }

    }
}
