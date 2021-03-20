import java.util.Scanner;

public class TaskWork5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a numbers: ");
        double x = in.nextDouble();
        double y = in.nextDouble();
        System.out.println("Input operation: ");
        String operation = in.next();
        switch (operation){
            case "+" : System.out.println(x+y);
                break;
            case "*":
                System.out.println(x*y);
                break;
            case "-":
                System.out.println(x-y);
        break;
            case "/":
                System.out.println(x/y);
        break;}
    }
}
