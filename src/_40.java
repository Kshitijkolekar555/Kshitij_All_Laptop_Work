class employee_{
    private int id;
    private String name;
    public void getid(int x){
        id=x;

    }
    public void getname(String s){
        name=s;
    }
};
public class _40 {
    public static void main(String[] args) {

        employee_ e=new employee_();
        e.getid(45);
        e.getname("hello");

    }
}
