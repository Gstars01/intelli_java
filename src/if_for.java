import java.util.Scanner;

public class if_for {
    public static void main(String[] args) {
        System.out.println("if");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b) {
            System.out.println(a + "is bigger than" + b);
        } else if (b>a) {
            System.out.println(b+"is bigger than"+a);
        }
        else {
            System.out.println(a+"="+b);
        }
    }
}
