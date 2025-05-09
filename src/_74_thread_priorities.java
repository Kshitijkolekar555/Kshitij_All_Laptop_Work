import java.awt.*;

class Mythr5 extends Thread{
    public Mythr5(String name){
        super(name);
    }
    public void run(){
        int i=1000;
        System.out.println("Good day " +this.getName());
        while(i>0){
        System.out.println("Good day " +this.getName());
            i--;
        }
    }
}
public class _74_thread_priorities {
    public static void main(String[] args) {
        Mythr5 o=new Mythr5("Harry");
        Mythr5 obj=new Mythr5("PICT");
        Mythr5 o2=new Mythr5("COEP(Min priority");
        Mythr5 o3=new Mythr5("VJTI(###############MAX PRIORITY)");

        o3.setPriority(Thread.MAX_PRIORITY);
        o2.setPriority(Thread.MIN_PRIORITY);
        o3.start();
        o2.start();
        o.start();
//        obj.start();
        }
}
