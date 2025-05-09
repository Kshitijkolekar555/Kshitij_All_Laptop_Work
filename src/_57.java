interface Camera{
    void takesnap();
    void recordVid();
   default void _4kvid(){
        System.out.println("recording vid in 4k");
        greet();
    }//in order to keep the method const in all the class which are inplementing ghe camera interface
    private void greet(){
        System.out.println("hello buddy");//not accessisible even in the class which are implementing this interface thus its use is when the default method is becomming
        // large thus then we can use the private method within that default method as ucan see that in the above case
    }
}
interface wifi{
    String [] getnetwork();
    void connectnetwork(String network);
}
class MyCellPhone{

    void MyCellPhone(int phoneno){
        System.out.println("calling:" + phoneno);
    }
    void Pickcall(){
        System.out.println("connecting" );
    }
}
class mysmartphone extends MyCellPhone implements wifi,Camera{

    public void takesnap(){
        System.out.println("taking snap");

    }
    public void recordVid(){
        System.out.println("shooting a vid");
    }
    public String[] getnetwork(){
        System.out.println("getting list of network");
        String[] networkList={"Harry","sunil","mahesh"};
        return networkList;
    }
    public void connectnetwork(String network){
        System.out.println("connecting to "+ network);
    }
}

public class _57 {
    public static void main(String[] args) {
        mysmartphone ms=new mysmartphone();
        String []arr=ms.getnetwork();
        for (String item:arr){
            System.out.println(item);
        }
        ms.connectnetwork("harry");
        ms._4kvid();
//        ms.greet();//not accessible anywhere outsite the same interface thus u can use it only in the default method of that class

    }
}
