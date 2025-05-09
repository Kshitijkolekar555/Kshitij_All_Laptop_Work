class Mythread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<4000){
            System.out.println("Thread 1 cooking is good");
            System.out.println("I am sad");
        i++;
        }

    }
}
class Mythread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<4000){
            System.out.println("Thread 2 playing is good");
            System.out.println("I am happy");
            i++;
        }
    }
}
public class _70_threading {
    public static void main(String[] args) {
        Mythread1 t1 = new Mythread1();
        Mythread2 t2 = new Mythread2();
        t1.start();t2.start();
    }
    }
