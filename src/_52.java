class circle{
    public double radius;
    public circle(){
        this.radius=0;
    }
    public circle(double radius){
        this.radius=radius;
    }
    public double area() {
        return Math.PI * this.radius * this.radius;
    }
}
class cylinder1 extends circle{
    public double height;
    public cylinder1(double r,double height){
        super(r);
        this.height=height;

    }
    public double vol(){
        return Math.PI*this.radius*this.radius*height;
    }

}
public class _52 {

    public static void main(String[] args) {
        circle o=new circle();
        System.out.println(o.area());
        cylinder1 c=new cylinder1(40,45);
        System.out.println(c.vol());
        System.out.println(c.area());


    }
}
