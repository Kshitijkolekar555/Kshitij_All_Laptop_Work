public class _array {
    public static void main(String[] args) {
        int [] marks=new int[5];
        int flat[][] = new int[2][2];

        flat[0][0]=15;
        flat[0][1]=10;
        flat[1][0]=20;
        flat[1][1]=30;


        for (int i=0;i< flat.length;i++){
            for(int j=0;j<flat[i].length;j++){
                System.out.print(flat[i][j]+" ");
            }
        }


    }
}
