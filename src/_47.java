//Dynamic_method dispatch
class Phone{
    public void meth2(){
        System.out.println("I am met of A");
    }
    public void Showtime(){
        System.out.println("time is 8am");
    }
}
class Smartphone extends Phone{
    @Override
    public void meth2(){
        System.out.println("I am met of B");
    }
    public void music(){
        System.out.println("Playing music");
    }
}
public class _47 {
    public static void main(String[] args) {
  /*      A o=new A();//allowed
        o.meth2();
        B obj=new B();//allowed
        obj.meth2();*/
        Phone obj = new Smartphone(); // Superclass reference -> Subclass object
        // B obj=new A();//Not allowed
        obj.Showtime();//allowed
        obj.meth2();//allowed
        // obj.music();//not allowed  compile time error
            //So, at compile time, Java sees obj as a Phone, and checks:
        //❌ Phone doesn’t have a music() method → compile-time error.
        // Summary:

     /*   You can only call methods that are defined in the reference type (Phone), even if the object is a subclass.

                If the subclass overrides those methods, the subclass version runs at runtime (dynamic dispatch).

                To call subclass-specific methods (like music()), you must cast the reference:

        ((Smartphone) obj).music(); */// ✅ Now allowed

    }
}
