
import java.util.Scanner;

public class TaskWork4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a numbers x,y,z: ");
        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();
        double arm = (x+y+z)/3;
        System.out.println("Arithmetic mean:" +arm);
        double del = arm/2;
        double res = Math.floor(del);
        if (res>3){
            System.out.println("\nПрограмма выполнена корректно");
        }
    }
    }

