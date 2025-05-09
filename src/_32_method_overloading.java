public class _32_method_overloading
{
    //for method overloading cannot be performed by changing the return type of the function so para type matters as well as  no of pare
    static void tellJoke(){
        System.out.println("I invented a new word\n"+" Plagiarism!");
    }
//    static int sum(int x,int y){
//        return x+y;
//    }
//
//    static int sum(int x,int y,int z){
//        return x+y+z;
//    }
//
//    static int sum(int x,int z,int u,int y){
//    return x+y+u+z;
//}
        static int sum(int x,int ...arr){
        int sum=x;
        for (int i:arr){
            sum+=i;
        }

    return sum;
}
//    static int sum(int ...arr){
//        int sum=0;
//        for (int i:arr){
//            sum+=i;
//        }
//
//        return sum;
//    }

    static void change(int x){
        x=15;
    }
    static void change(int[] arr){
        arr[0]=15;
    }
    public static void main(String[] args) {

        tellJoke();//if static is used then no need to create obj thus without it we can call telljoke

        int y=10;
        change(y);
        System.out.println(y);

        int[] arr={1,2,3,5,6,6,40};
        change(arr);
        System.out.println(arr[0]);//Java passes a copy of the reference to the array — and that reference still points to the same memory
        // where the array is stored.


        System.out.println(sum(1,20));
        System.out.println(sum(1,20,50));
        System.out.println(sum(1,20,70));
        System.out.println(sum(1,20,80));
        System.out.println(sum(12));
     }
}
