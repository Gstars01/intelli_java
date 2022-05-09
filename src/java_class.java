import java.util.Scanner;

public class java_class {
    public static int sum(int n1, int n2) {
        int result;
        result = n1+n2;
        return result;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2,total;

        System.out.println("두 정수 입력 : ");
        num1 = sc.nextInt(); num2 = sc.nextInt();

        total = sum(num1,num2);
        System.out.println("두 정수의 합 : "+total);

    }
}
