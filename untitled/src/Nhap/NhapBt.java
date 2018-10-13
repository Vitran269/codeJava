package Nhap;
import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;
public class NhapBt {

        public static  void print_line_multiplication(int row,int col){
            if(row<10){
                System.out.print("  " + row);
            }
            else{
                System.out.print(" " + row);
            }
            int res;
            for (int i = 0; i < col ; i++){
                res = row * i;
                if(res<10){
                    System.out.print("   " + res);
                }
                else if(res < 100){
                    System.out.print("   " + res);
                }
                else{
                    System.out.print(" " + res);
                }
            }
        }

        //kashfkjasfasfasfbasf

    public static void print_multiplication_table(int rows, int cols){
        cols = cols + 1;
        rows = rows + 1;
        System.out.print(" x");
        for (int i = 0; i < cols; i++){
            if (i < 5){
                System.out.print("   " + i);
            }
            else if(i < 10){
                System.out.print("   " + i);
            }
            else{
                System.out.print("   " + i);
            }
        }
        System.out.println();
        for(int i = 0; i < rows; i++){
            print_line_multiplication(i, cols);
            System.out.println();
        }
    }

    public static void main(String[] args) {

        System.out.println();
        print_multiplication_table(12,12);
        System.out.println();

//        double a = 10 ;
//        char x = 'a';
//        System.out.printf("Day la bien %.2f va bien %.0f",a,a);
//        System.out.println();
//        System.out.printf("My ch%cr%ccter is %c ",x,x,x);
//        System.out.println();
//        String s = String.format("Day la bien %.2f va bien %.0f",a,a);
//        System.out.println(s);

//       ---------------------------------------------------------------

//        double sum = 0;
//        double s;
//        double i;
//        for ( i = 0; i < 1.1 ; i= i + 0.1) {
//            s = sum + i;
//
//            System.out.println(s);

//            Scanner input = new Scanner(System.in);
//             int  s = input.nextInt();
//             int sum = 0 ;
//             while (s != 0) {
//                 sum = sum + s ;
//                 s = input.nextInt();
//             }
//             System.out.println(sum);
        ///---------------------------

//        double data = Math.pow(Math.sqrt(2), 2) - 2;
//        System.out.println(data);
//        if (data == 0)
//            System.out.println("data is zero");
//        else
//            System.out.println("data is not zero");

        //------------------------------------
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Do you want to continue? (Y/N)");
//        String answer = scanner.nextLine();
//        if ("N".equals(answer)) {
//            System.out.println("Goodbye!");
//        }
//-------------------

//        int s = 1;
//        while (s <= 10) {
//            System.out.println(s);
//            s++;
//
//        }

//        int i = 1;
//        do{
//            System.out.println(i);
//            i++;
//        }while(i<=10);

        //--------------
//       int i;
//       for (i = 0 ; i <= 10; i = i + 2 ){
//           System.out.println(i);
//       }
        //for (int i = 1; i <= 10; System.out.println(i++));

//        for (int i = 0, j = 0; (i + j < 10); i++, j++) {
//            System.out.println(i);
//            System.out.println(j);
//        }

       //function definition





    }
}
