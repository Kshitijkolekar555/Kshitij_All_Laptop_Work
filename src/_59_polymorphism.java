//inorder to maintain the privacy for exam if u dont want to give access to the obj to the camera just want to give access tothe wifi u should give reference of the wifi and create obj of that class

interface Camera1{
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
interface wifi1{
    String [] getnetwork();
    void connectnetwork(String network);
}
class MyCellPhone1{

    void MyCellPhone(int phoneno){
        System.out.println("calling:" + phoneno);
    }
    void Pickcall(){
        System.out.println("connecting" );
    }
}
class mysmartphone1 extends MyCellPhone1 implements wifi1,Camera1{

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
public class _59_polymorphism {
    public static void main(String[] args) {
    wifi1 wifi_ph=new mysmartphone1();
//    wifi_ph.takesnap();// not allowed as we are just givving the ref of the wifi so cant accces the methods of the Camera1
//     wifi_ph.Pickcall();  this is also not allowed u have just wifi access i.e ph with just wifi access

        wifi_ph.connectnetwork("KK_networks");

        mysmartphone1 ms=new mysmartphone1();
        ms.MyCellPhone(87677);
    }
}
