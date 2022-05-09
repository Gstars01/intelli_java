import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[] {10,20,30,40,50};
        int[] arr2 = new int[6];

        System.out.println("arr[0] = "+arr[0]);
        System.out.println("arr[1] = "+arr[1]);
        System.out.println("arr[2] = "+arr[2]);
        for(int i=0;i<arr2.length;i++){
            System.out.println("수"+(i+1)+"번 입력 : ");
            int num = sc.nextInt();
            arr2[i] = num;
        }
        for(int j=0;j<arr2.length;j++){
            System.out.println((j+1)+"번째 수 : "+arr2[j]);
        }

    }
}
