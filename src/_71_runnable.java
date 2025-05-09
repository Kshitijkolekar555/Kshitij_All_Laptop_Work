
class MythreadRunnable1 implements Runnable {
    public void run(){
        int i=0;
        while (i<4000){
        System.out.println("01111===>>>I am thread no 1");
        i++;
       }}
}
class MythreadRunnable2 implements Runnable {
    public void run(){
        int i=0;
        while (i<4000){
            System.out.println("02222===>>>I am thread no 2");
            i++;
        }

    }}
public class _71_runnable {
    public static void main(String[] args) {
        MythreadRunnable1 bullet1= new MythreadRunnable1();
        MythreadRunnable2 bullet2=new MythreadRunnable2();

        Thread gun1=new Thread(bullet1);
        Thread gun2=new Thread(bullet2);

        gun1.start();
        gun2.start();

     }
}
