import java.util.Scanner;

public class fibo {

    static int fibonaci(int value){
        if(value == 1 || value == 2){
            return 1;
        }else{
            return fibonaci(value-1) + fibonaci(value-2);
        }
    }

    public static void main(String[] args) {

            Scanner obj = new Scanner(System.in); 
            System.out.print("Masukkan angka : ");
            int number = obj.nextInt();

            System.out.println(fibonaci(number));

            obj.close();
        
    }
}
