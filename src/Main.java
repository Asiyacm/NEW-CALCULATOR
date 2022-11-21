import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        System.out.println("Choose the opertion:");
        System.out.println("\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.No operation");
        Scanner xy = new Scanner(System.in);
        int option = xy.nextInt();
        System.out.println("Choose the option:");
        System.out.println("Enter First Number");
        float First = xy.nextInt();
        System.out.println("Enter Second Number");
        float Second = xy.nextInt();
        switch (option) {
            case 1:
                float Addition = First + Second;
                System.out.println("Addition is" + Addition);
                break;
        }
    }
}