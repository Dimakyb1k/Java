package CalcTest;

import java.io.IOException;
import java.util.Scanner;

public class Calc {

    public static void main(String[] args) throws Exception {
        System.out.println("Добро пожаловать в калькулятор,приступайте к работе");
        Scanner sc = new Scanner(System.in);
        String ty = sc.nextLine();
        String[] s = ty.split(" ");
        boolean t = true;
        int x;
        String operation = s[1];
        int y;
        try {
            x = Integer.parseInt(s[0]);
            y = Integer.parseInt(s[2]);
        } catch (NumberFormatException e) {
            EnumRim xRomanEnum = EnumRim.valueOf(s[0]);
            x = xRomanEnum.resultOneTwo();
            EnumRim yRomanEnum = EnumRim.valueOf(s[2]);
            y = yRomanEnum.resultOneTwo();
            t = false;
        }
        int calcul = calcul(x, operation, y);
        if (!t) {
            ResultAraboRimsk araboRimsk = new ResultAraboRimsk();
            System.out.println(araboRimsk.arabicToRimsk(calcul));
        }
        if (t) {
            System.out.println(calcul);
        }
    }

    public static int calcul(int x, String operation, int y) throws IOException {
        int result = 0;
        if (x <=0)
        {
            System.out.println("Число не может быть меньше нуля");
            throw new IOException();
        }
        if(x >=11)
        {
            System.out.println("Число не может быть больше 10");
            throw new IOException();
        }
        if(y <=0)
        {
            System.out.println("Число не может быть меньше нуля");
            throw new IOException();
        }
        if(y >=11)
        {
            System.out.println("Число не может быть больше 10");
            throw new IOException();
        }
        switch (operation) {
            case "-":
                result = x - y;
                break;
            case "+":
                result = x + y;
                break;
            case "/":
                result = x / y;
                break;
            case "*":
                result = x * y;
                break;
            default:
                throw new IOException();
        }
        return result;


}
}






