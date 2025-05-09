public class _29_array_prac {
    public static void main(String[] args) {
//        float [] arr={ 45.2f,45.2f,65.3f,89.5f,102.6f};
//        float sum=0;
//        for (float val:arr){
//           sum+=val;
//
//        }
//        System.out.println(sum);
//        float num=45.0f;
//          isnumthere(arr,num);
         //prac 4
//        int mat1[][]={ {1,2},
//                       {3,4}};
//        int mat2[][]={ {1,2},
//                        {3,4}};
//        int res[][]=new int[2][2];
//
//        for (int i=0;i<mat1.length;i++){
//            for (int j = 0; j<mat1[i].length;j++){
//                res[i][j]=mat1[i][j]+mat2[i][j];
//            }
//        }
//        for (int i=0;i<mat1.length;i++){
//            for (int k=0;k<mat1[i].length;k++){
//                System.out.print(res[i][k]+" ");
//            }
//            System.out.println();
//        }


        //prac 5
        int[] arr2={1,42,32,4,15,6};
        int[] arr3=new int[6];

        int mid=Math.floorDiv((arr2.length),2);
        int l=arr2.length;

        for (int i=0;i<mid;i++){
            int t=arr2[i];
            arr2[i]=arr2[l-1-i];
            arr2[l-i-1]=t;
        }
        for (int val:arr2){
            System.out.print(val+" ");
        }
        //6
        int max=arr2[0];
        for (int i = 0; i < l; i++) {
            if(max<arr2[i]){
                int t=max;
                max=arr2[i];
                arr2[i]=t;
            }
        }
        System.out.println();
        System.out.println("max no is "+max);

        //prac7
        boolean issorted=true;
        for (int i = 0; i <l; i++) {
            if(arr2[i]>arr2[i+i]){
                issorted=false;
                break;
            }

        }
        if(issorted==true){
            System.out.println("array is sorted ");
        }
        else {
            System.out.println("array is not sorted ");
        }
        //prac 8

        for (int i = 0; i <l-1; i++) {
            for (int j = i+1; j <l; j++) {
                if(arr2[i]>arr2[j]){
                 int t=arr2[i];
                 arr2[i]=arr2[j];
                 arr2[j]=t;
                }

            }
        }
        System.out.println("sorted array is :\n");
        for (int i = 0; i <l; i++) {
            System.out.print(arr2[i]+" ");

        }

        }
    public static void isnumthere(float arr[],float num){
        boolean isnum=false;
        for(float i:arr){
            if(i==num){
                isnum=true;

            }
        }
        if(isnum==true){
            System.out.println("Number is there in the array");
        }
        else {
            System.out.println("Number is not there in the array");

        }

    }



}
