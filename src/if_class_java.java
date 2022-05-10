import java.util.Scanner;

public class if_class_java {
    public static int choose(int n1,int n2){
        if (n1>n2){
            return n1;
        }
        else if (n2>n1){
            return n2;
        }
        else{
            return 0;
        }
    }

    public static void main(String[] args) {
        int num1,num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("두 정수 입력 : ");
        num1 = sc.nextInt(); num2 = sc.nextInt();

        int choosingNum = choose(num1,num2);
        if (choosingNum == 1){
            System.out.println("두 정수는 같은 수 입니다");
        }
        else {
            System.out.printf("두 정수중 %d가 더 큰수 입니다",choosingNum);
        }
    }
}
