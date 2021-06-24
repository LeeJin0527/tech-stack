package Inheritance;

import javax.security.auth.Subject;

class SuperObject{
    protected String name;
    public void paint(){
        draw();
    }
    public void draw(){
        System.out.println(name);
    }
}
public class SubObject extends SuperObject{
    protected String name;
    public void draw(){
        name = "Sub";
        super.name = "Super";
        super.draw(); //정적 바인딩
        System.out.println(name);
    }
    public static void main(String[] args){
        SuperObject b = new SubObject();
        b.paint();
    }
}
