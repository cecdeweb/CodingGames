import java.util.*;

public class StaticInitBlock {
    public static Scanner scanner;
    public static int B;
    public static int H;
    public static boolean flag;

    static {
        scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();
        if(B<0 || B>=100 || H<0 || H>=100){
            flag=false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }else{
            flag=true;
        }

    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }
