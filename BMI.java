import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

            String greeting = "Java World!";
            String w = greeting.substring(7, 11);
            System.out.println(w);

            String firstString = "Java";
            firstString = firstString.concat("World");
            System.out.println(firstString);

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the weight in pounds : ");
        double weight = in.nextDouble();
        System.out.print("Enter the height in inches : ");
        double height = in.nextDouble();
        double bmi = weight / (height*height) * 703.0;
        System.out.println("Yout body Mass Index is " + bmi);
        in.close();

    }
}
