package codewithharry;
class shape{
    int x,y;
    shape(){
        this.x=0;
        this.y=0;
    }
    shape(int x,int y){
        this.x=x;
        this.y=y;
    }
    public int dim1(){
        return this.x;
    }
    public int dim2(){
        return this.y;
    }
    public void set_dim1(){
        this.x=x;
    }
    public void set_dim2(){
        this.y=y;
    }
}
class Rectangle extends shape{
    void area(int x,int y){
        System.out.println("Area is :"+x*y);
    }
}
class Square{
   void area(int x){
       System.out.println("Area of sq is : "+x*x);
   }
}
class circle extends shape{
    void area(){
        System.out.println("Area of circle is :"+2*Math.PI*x*(x+y));
    }
}
class Cylinder extends shape{
    void area(){
        System.out.println("Area of Cylinder is :"+Math.PI*x*x);
    }
    void vol(){
        System.out.println("Vol is : "+Math.PI*x*x*y);
    }
}
public class _68_practice_polygon{
    public static void main(String[] args) {

    }
}
