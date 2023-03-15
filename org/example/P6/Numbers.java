import java.util.Scanner;

import static java.lang.Character.isDigit;
import static java.lang.Integer.parseInt;

public class Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        // 1st Way
        try {
            int np = Math.abs(Integer.parseInt(str));
            String n = Integer.toString(np);
            int num1 = np, num2 = parseInt(n + n), num3 = parseInt(n + n + n);
            int sum = num1 + num2 + num3;
            if(np == 0) System.out.println("0 + 00 + 000 = " + sum);
            else System.out.printf("%d + %d + %d = %d", num1, num2, num3, sum);
        } catch (Exception e) {
            System.out.print("error");
        }
        // 2nd Way
//        for(int i = 0; i < str.length(); i++) {
//            if(str.charAt(0) == '-') {
//                continue;
//            } else if(!isDigit(str.charAt(i))) {
//                System.out.print("error");
//                return;
//            }
//        }
//        int n = Math.abs(parseInt(str));
//        String sn = Integer.toString(n);
//        int f = n, s = parseInt(sn + sn), t = parseInt(sn + sn + sn);
//        int result = f + s + t;
//        if(n == 0) System.out.println("0" + " + " + "00" + " + " + "000" + " = " + result);
//        else System.out.println(f + " + " + s + " + " + t + " = " + result);
    }
}