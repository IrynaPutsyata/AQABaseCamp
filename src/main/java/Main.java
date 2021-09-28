import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstValue = 0;
        int secondValue = 0;
        double answer = 0;
        char operation = 0;


        System.out.println("Input value:");

        firstValue =sc.nextInt();
        secondValue =sc.nextInt();
        System.out.println("Input operation (+ - * /)");

        operation =sc.next().charAt(0);

        System.out.println("The result is:");
        System.out.println(firstValue + " " +  operation + " " +  secondValue + " = ");
    }

}
