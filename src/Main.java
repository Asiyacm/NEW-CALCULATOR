import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int option;
        int First;
        int Second;

        do {
            System.out.println("Choose the opertion:");
            System.out.println("\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit");
            Scanner xy = new Scanner(System.in);
            option = xy.nextInt();
            switch (option) {
                case 1:

                    System.out.println("Enter First Number");
                    First = xy.nextInt();
                    System.out.println("Enter Second Number");
                    Second = xy.nextInt();
                    int Addition = First + Second;
                    System.out.println("Addition is :" + Addition);
                    break;
                case 2:

                    System.out.println("Enter First Number");
                    First = xy.nextInt();
                    System.out.println("Enter Second Number");
                    Second = xy.nextInt();
                    int Subtraction = First - Second;
                    System.out.println("Subtraction is :" + Subtraction);
                    break;
                case 3:

                    System.out.println("Enter First Number");
                    First = xy.nextInt();
                    System.out.println("Enter Second Number");
                    Second = xy.nextInt();
                    int Multiplication = First * Second;
                    System.out.println("Multiplication is :" + Multiplication);
                    break;
                case 4:

                    System.out.println("Enter First Number");
                    First = xy.nextInt();
                    System.out.println("Enter Second Number");
                    Second = xy.nextInt();
                    try {
                        int Division = First / Second;
                        System.out.println("Division is :" + Division);
                    }
                    catch(ArithmeticException e) {

                        System.out.println(e);
                    }

                    break;
                case 5:

                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid entry");
                    break;
            }
        }while (option != 5);
    }
}