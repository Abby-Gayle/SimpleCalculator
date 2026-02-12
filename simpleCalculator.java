import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args){ //main method
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("Enter number: ");
            int number1 = sc.nextInt();
            System.out.print("Enter number: ");
            int number2 = sc.nextInt();
            displayMenu();  //displays menu
            int choice = sc.nextInt();//user enters choice
            switch (choice) {
                case 1 -> System.out.println(add(number1, number2));
                case 2 -> System.out.println(subtract(number1, number2));
                case 3 -> System.out.println(multiply(number1, number2));
                case 4 -> System.out.println(divide(number1, number2));
                case 5 -> exit();
            }
        }
    }

    public static int add(int a, int b){   //add method
        return a + b;
    }

    public static void displayMenu(){
        System.out.println("1. Add\n2. Subtract\n3. Multiply\n" +
                "4. Divide\n5. Exit");
    }

    public static int divide(int a, int b){
        try{
            return a/b;
        } catch(ArithmeticException e){
            System.out.println("Can't divide by zero");
            return 0;
        }
    }

    public static int multiply(int a, int b){
        return a * b;
    }

    public static int subtract(int a, int b){
        return a - b;
    }

    public static void exit(){
        System.out.println("Thank you for using our calculator!");
        System.exit(0);
    }

}
