class base1{
    int x ;



    public void setX(int x) {
        this.x = x;
    }

    public int getX(){
        return x;
    }
    public base1(){
        System.out.println("i am constructor of base");
    }
    public base1(int x){
        this.x=x;
        System.out.println("i am para constructor of base with x :"+ x);
    }
}
class derived1 extends base1{
    int y;

    public int getY(){
        return y;
    }

    public void setY(int y){
        this.y=y;
    }
    public derived1(){
        System.out.println("i am derived class constructor");
    }
    public derived1(int x){
//        super(x);
        System.out.println("i am para const derived class with x "+x);
    }
    public derived1(int x,int y){
        super();//enables to access the base class para constructor
        System.out.println("i am para const derived class with x "+x+" y : "+y);
    }
}
class baby_derived extends derived1{
    int z=100;
    public baby_derived(int x,int y,int z){
        super(y);
        System.out.println("i am constructor of baby_derived with x y z val "+x +" "+ y+" "+z);
    }
}

public class _46_ {
    public static void main(String[] args) {
//    derived1 d=new derived1(45);// it will call both construtor of base first then of derived
     // cant access para constructor like this so
        //In Java, yes, you can access a parameterized constructor of a
        // superclass (parent class) from a derived (subclass) using the super keyword.
        // This is a common way to ensure proper initialization
        // of fields defined in the superclass.6
        baby_derived b=new baby_derived(14,15,16);

    }
}
