import java.util.Scanner;

class employee_42{

    int id;
    String name;
    int salary;
    public employee_42(String s){
        id=45;
        name=s;
    }
    public employee_42(String s,int i){
        id=i;
        name=s;
    }

    public employee_42(int sal){
        salary=sal;

    }
    public void printdetails(){
        System.out.println("this is my id : "+id);
        System.out.println("this is my name : "+name);
        System.out.println("Salary is "+ salary);
         }
    public void getdetails(int iid,String s){
        id=iid;
        name=s;
    }
};
public class _42 {
    public static void main(String[] args) {
        System.out.println("this is our class");
        employee_42 harry= new employee_42("kk");
        harry.printdetails();
         harry= new employee_42("kk",54);
        harry.printdetails();
        harry =new employee_42(4500);
        harry.printdetails();
        harry.getdetails(14,"kshitij");
        harry.printdetails();

    }
}
