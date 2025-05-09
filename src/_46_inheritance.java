class base{
    int x ;

    public void setX(int x) {
        this.x = x;
    }

    public int getX(){
        return x;
    }
    public base(){
        System.out.println("i am constructor");
    }
}
class derived extends base{
    int y;

    public int getY(){
    return y;
    }

    public void setY(int y){
        this.y=y;
    }
}

public class _46_inheritance {
    public static void main(String[] args) {
        derived d=new derived();
        d.x=78;
        System.out.println(d.getX());
        d.setX(45);
        System.out.println(d.getX());


    }
}
