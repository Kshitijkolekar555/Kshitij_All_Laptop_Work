class cylinder {
    double h, r;

    public double getH() {
        return h;
    }


    public cylinder() {
        this.h = 4;
        this.r = 5;
    }
    public cylinder(double x,double y){
        this.h=x;
        this.r=y;
    }


    public void setH(double h) {
        this.h = h;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double vol() {
        return Math.PI * r * r * h;
    }
    public double TSA() {
        return 2 * Math.PI * r * (r + h);
    }
    
}
public class _44 {

    public static void main(String[] args) {
        cylinder c = new cylinder();

        System.out.println(c.vol());

        System.out.println(c.TSA());

       c = new cylinder(40,50);
        System.out.println(c.vol());
        System.out.println(c.TSA());
        c.setH(15);
        System.out.println( c.getH());
        c.setR(56);
        System.out.println(c.getR());
    }}
