import java.util.Random;
import java.util.Scanner;

public class lotre {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10 : ");
        int angka = in.nextInt();
        Random rnd = new Random();
        int win = rnd.nextInt(10)+1;
        System.out.println("Your number : " + angka);

        if(angka == win){
            System.out.println("Congratulation your number "+ angka+" winner!!");
        }else{
            System.out.println("Never Give up");
        }
        in.close();

    }
}
