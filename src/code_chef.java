import java.util.Scanner;

public class code_chef {
    public static void main(String[] args) {

        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int a=0;
            int b=0;
            int x=sc.nextInt();
            int []arr=new int[x];

            for (int i=0;i<x;i++){
                arr[i]=sc.nextInt();

                if(arr[i]==1){
                    a++;
                }
                if(arr[i]==2){
                    b++;
                }
            }
            t--;
        System.out.println(a+" "+b);
        }

    }
}
