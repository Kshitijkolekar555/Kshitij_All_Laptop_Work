public class _26_array {
    public static void main(String[] args) {
       //m1
        int [] marks=new int[5];//declare + memory allocation
        marks[0]=10;
        marks[1]=10;
        marks[4]=100;
        marks[3]=140;
        marks[2]=10;

        for (int i = 0; i < 5; i++) {
            System.out.println(marks[i]);

        }
        //m2
        int[] arr;//declare
        marks=new int[5];//memory allocation

        //m3
        int[] arr2={1,5,3,6,5,6,6};//declare + initilization java allocates memory on its own


        System.out.println(arr2.length);
        for (int i = 0; i <arr2.length ; i++) {
            System.out.print(arr2[i]+" ");
        }

        for(int i:arr2){
            System.out.println(i);
        }



    }
}
