public record _25_loops() {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 0; i <= 3; i++) {

            sum+=2*i;
        }
        System.out.println(sum);

        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=4+1-i ; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
        for (int i = 10; i >=1 ; i--) {
            System.out.println("10 X "+i+"= "+10*i);

        }
        int sum_of_10_table=0;
        int i=10;
        while (i>=1){
            System.out.println("8 X "+i+"= "+8*i);
            sum_of_10_table+=8*i;
            i--;

        }
        System.out.println("Sum is :"+sum_of_10_table);

        sum_of_10_table=0;
        i=10;
        do {
            sum_of_10_table+=10*i;
            i--;
        }while(i>=1);
        System.out.println("Sum is :"+sum_of_10_table);

    }

}

