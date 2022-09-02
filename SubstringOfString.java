import java.util.Scanner;

public class SubstringOfString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        System.err.println(S.length());
        if (!(S.length()>=1 && S.length()<=100)){
            System.err.println("Your word must be between 0 and 100");
            System.exit(0);
        }
        int start = in.nextInt();
        int end = in.nextInt();
        if ( start<0 || start>end || end>S.length()){
            System.err.println("Number \"start\" and \"end\" must be between 0 and the last characters index to your word");
            System.exit(0);
        }

        in.close();

        System.out.println(S.substring(start, end));
    }
}
