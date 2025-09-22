import java.util.Scanner;

public class Main  extends Oprestion {
    public static void main(String[] args) {
        Oprestion oprestion = new Oprestion();
        char operator,choice;
        int a, b;
        do {
            System.out.println("enter the first number");
            Scanner scanner = new Scanner(System.in);
            a = scanner.nextInt();
            System.out.println("enter the Second number");
            b = scanner.nextInt();
            System.out.println("enter the operator  to perform the task releated to calculator like + ,-,*,/");
            operator = scanner.next().charAt(0);
            switch (operator) {
                case '+':
                    oprestion.addistion(a,b);
                    break;
                case '-':
                    oprestion.subtration(a,b);
                    break;
                case '*':
                    oprestion.multiplication(a,b);
                    break;
                case '/':
                    oprestion.dividestion(a,b);
                    break;
                default:
                    System.out.println("please enter the valid operator link  +,-,*,/ ");
            }
            System.out.print("Do you want to perform another calculation ");
            choice= scanner.next().charAt(0);


        } while (choice == 'y' || choice == 'Y') ;
        System.out.println("Calculator exited. Goodbye!");


    }
}