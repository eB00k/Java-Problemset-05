import java.util.Scanner;
public class LettersSpacesNumbers {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        count(str);
    }

    public static void count(String str) {
        int cntSpace = 0, cntLetter = 0, cntOthers = 0, cntDigit = 0;
        for(int i = 0; i < str.length(); ++i) {
            if(Character.isLetter(str.charAt(i))) cntLetter++;
            else if(Character.isDigit((str.charAt(i)))) cntDigit++;
            else if(str.charAt(i) == ' ') cntSpace++;
            else cntOthers++;
        }
        System.out.printf("letter: %d\n space: %d\n number: %d\n other: %d", cntLetter, cntSpace, cntDigit, cntOthers);
    }
}