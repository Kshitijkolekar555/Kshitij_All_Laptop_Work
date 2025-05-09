import java.awt.*;

class Mythr extends Thread{
    public Mythr(String name){
        super(name);
    }
    public void run(){
        int i=1000;
        while(i>0){
            System.out.println("what's up buddy" );
            i--;
        }
    }
}
class Mythr1 extends Thread{
    public Mythr1(String name){
        super(name);
    }
    public void run(){
        int i=1000;
        while(i>0){
            System.out.println("Hello buddy");
            i--;
        }
    }
}
class Mythr2 extends Thread{
    public Mythr2(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while(i<4000){
            System.out.println("Hello kk bhau");
        i++;
        }

    }
}

public class _73_thread_constructor {
    public static void main(String[] args) {
        Mythr o=new Mythr("Harry");
        Mythr2 obj=new Mythr2("PICT");
        System.out.println(obj.getName());
        System.out.println(obj.getId());
        Mythr o1=new Mythr("KSHITIJ");
//        o.start();
//        o1.start();
        System.out.println("the id of the thread is "+o.getId());
        System.out.println("the id of the thread is "+o1.getId());

        System.out.println("The name of the thread is : "+o.getName());
        System.out.println("The name of the thread is : "+o1.getName());
    }
}
