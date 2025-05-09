package kk_package;
class c1{
    public int x=10;    // accessible in class=1 package=1 subclass=1 world=1
    protected int y=78; // accessible in class=1 package=1 subclass=1 world=0
    int z=78;           // accessible in class=1 package=1 subclass=1 world=0
    private int k=40;   // accessible in class=1 package=0 subclass=0 world=0
    public void meth(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(k);
    }
}
class c2 extends c1{
    public void meth2(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
//        System.out.println(k);
    }
}
public class _66_access_specifier {
    public static void main(String[] args) {
        c1 o=new c1();
        System.out.println(o.x);
//        System.out.println(o.k);
        System.out.println(o.y);// not accessible within the same package just accessible
        // within the same class so use method for this
    }
}
