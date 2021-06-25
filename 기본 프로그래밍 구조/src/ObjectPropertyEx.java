package Package;
class Point{
    int x, y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "Point(" + x + "," + y +")";
    }
    public boolean equals(Point p ){
        if ( x == p.x && y ==p.y) return true;
            else return false;
    }
}
public class ObjectPropertyEx {
    public static void main(String[] args){
        Point p = new Point(2, 3);
        System.out.println(p.getClass().getName());
        System.out.println(p.hashCode());
        System.out.println(p.toString());
    }
}
