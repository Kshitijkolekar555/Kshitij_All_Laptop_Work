//abstract method means method declared without implementation// which exist in
abstract class base2{
    public base2(){
        System.out.println("base2 constructor");
    }
    public void sayHello(){
        System.out.println("hello");
    }
    abstract public void greet();
}

class derived2 extends base2{
    @Override
    public void greet(){
        System.out.println("GM");
    }
}
//class derived3 extends base2{// this will give error as it should override the greet or declare the class as abstract
//    public void tk(){
//        System.out.println("thank U");
//    }
//}
abstract class derived3 extends base2{// this will give error as it should override the greet or declare the class as abstract
    public void tk(){
        System.out.println("thank U");
    }
}
class derived4 extends base2{// this will give error as it should override the greet or declare the class as abstract
    public void tk(){
        System.out.println("thank U");
    }
    public void greet(){
        System.out.println("this is overridden function so error is gone");
    }
}
public class _53_abstract {
    public static void main(String[] args) {
//        base2 b=new base2() {}// throws an error as it is abstract class no obj is created of tha
    }
}
