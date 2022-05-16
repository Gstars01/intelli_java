public class quick_sort {
    public static int[] change(int n1,int n2){
        int memory=0;
        memory = n1;
        n1 = n2;
        n2 = memory;
        return new int[]{n1,n2};
    }
    public static int quick_sort(int[] arr,int start,int end){
        int pivot = arr[0];
        int left = start;
        int right = end;
        int[] memory = new int[]{};
        while (left<right){     //left(start)가 right(end)보다 클동안만
            while(left<right && arr[left] < pivot){     //arr[left(start)]가 pivot 보다 작거나 left(start)가 right(end)보다 작을때만 실행
                left++;                                 //left 의 좌료를 오른쪽으로 한칸 이동
            }
            while(right<left && arr[right] < pivot){    //arr[right(end)]가 pivot 보다 크거나 right(end) left(start)보다 클동안만 실행
                right--;                                //right 의 좌표를 왼쪽으로 한칸 이동
            }
            if(left <right) {
                memory = change(arr[left], arr[right]); //left(pivot 보다 큰수)와 right(pivot 보다 작은수 )를 교환
                arr[right] = memory[0];                 //바꿔서 돌아온수를 각자 원래 위치로 이동
                arr[left] = memory[1];
            }

        }
        System.out.println(arr);
        return 0;
    }
    public static void main(String[] args) {
        System.out.println("quick sort");

        int[] arr = new int[]{4,1,2,3,9,7,8,6,10,5};

        int start = 1;
        int end = arr.length-1;

        quick_sort(arr,start,end);

    }
}