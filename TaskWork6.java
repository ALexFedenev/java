import java.util.Scanner;

public class TaskWork6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(">Что будем конвертировать: \n >1-масса \n >2-длинна");
        String what = in.next();
        switch (what) {
            case "2": System.out.println(">Выберем единицу измерения:\n >1-метр\n >2-миля\n >3-ярд\n >4-фут");
                String unit2 = in.next();
                switch (unit2){
                    case "1" : System.out.println(">Введите число:");
                     double metr = in.nextDouble();
                        System.out.println(" Метры: "+metr+ "\n Мили: " +(metr/1609)+ "\n Ярды: "+(metr/0.9144)+ "\n Футы: " +(metr/0.3048));
                    break;
                        case "2": System.out.println(">Введите число");
                    double mile= in.nextDouble();
                        System.out.println(" Метры: "+(mile*1609)+ "\n Мили: " +mile+ "\n Ярды: "+(mile*1760)+ "\n Футы: " +(mile*5280));
                    break;
                    case "3": System.out.println(">Введите число");
                        double yard= in.nextDouble();
                        System.out.println(" Метры: "+(yard*0.9144)+ "\n Мили: " +(yard*0.00057)+ "\n Ярды: "+yard+ "\n Футы: " +(yard*3));
                    break;
                    case "4": System.out.println(">Введите число");
                        double foot = in.nextDouble();
                        System.out.println(" Метры: "+(foot*0.3)+ "\n Мили: " +(foot*0.00019)+ "\n Ярды: "+(foot*0.33)+ "\n Футы: " +foot);
                    break;
                }
                break;
            case "1": System.out.println(">Выбираем единицу измерения:\n 1-кг\n 2-грамм");
                String unit1 = in.next();
                switch (unit1){
                    case "1": System.out.println(">Введите число");
                    double kg= in.nextDouble();
                        System.out.println("Килограмм:"+kg+ "\n Грамм:"+ (kg*1000));
                        break;
                    case "2": System.out.println(">Введите число");
                    double gramm= in.nextDouble();
                        System.out.println("Килограмм:"+(gramm*.001)+ "\n Грамм:"+gramm);
                break;
                }
                break;
        }
    }

    }


