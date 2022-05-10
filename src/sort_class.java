public class sort_class {
    public static int sort(int[] arr){
        int memory;
        int num = arr.length;
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                if(arr[i]<arr[j]){
                    memory = arr[i];
                    arr[i] = arr[j];
                    arr[j] = memory;
                }
                else{
                    continue;
                }
            }
        }
        for(int i : arr)
            System.out.println(i);
        return 0;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{4,8,2,7,6};
        sort(arr);
    }
}
