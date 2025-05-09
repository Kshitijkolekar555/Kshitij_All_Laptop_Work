class Mythr_new extends Thread{
    public Mythr_new(String name){
        super(name);
    }
    public void run(){
        int i=115;
        while(i>0){
            System.out.println("##############  TK   ############" );
            i--;
        }
    }}
    class Mythr2_new extends Thread{
        public Mythr2_new(String name){
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

     class Mythr_new_1 extends Thread{
        public Mythr_new_1(String name){
            super(name);
        }
        public void run(){
            while(true){
                System.out.println(" ***********  HELOO **********" );
                try {
                    Thread.sleep(454);// sleep for 4.54 seconds
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                }
            }
        }
public class _75_thread_method {

    public static void main(String[] args) {
        Mythr2_new obj=new Mythr2_new("PICT");
//        Mythr_new o=new Mythr_new("Harry");
//            o.join();// this ensures that unless o is finished no one is allowed if error occur then it will throw an error
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
//        o.start();

        Mythr_new_1 o3=new Mythr_new_1("John");
        o3.start();
        obj.start();
    }
}
