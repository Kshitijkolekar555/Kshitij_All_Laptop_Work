import java.util.Scanner;

class employee{

    int id;
    String name;
    public void printdetails(){
        System.out.println("this is my id : "+id);
        System.out.println("this is my name : "+name);
    }
    public void getdetails(int iid,String s){
        id=iid;
        name=s;
    }

    private class Scanner {
    }
};
public class _38 {
    public static void main(String[] args) {
        System.out.println("this is our class");
        employee harry=new employee();
      harry.getdetails(14,"kshitij");
        harry.printdetails();
    }
}
