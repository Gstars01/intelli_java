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
        while (left<right){
            while(left<right && arr[left] < pivot){
                left++;
            }
            while(right<left && arr[right] < pivot){
                right++;
            }
            if(left <right) {
                memory = change(arr[left], arr[right]);
                memory[0] = arr[right];
                memory[1] = arr[left];
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