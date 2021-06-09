import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {12,8,16,5,2};
        System.out.println(Arrays.toString(arr));
        InsertionSort obj = new InsertionSort();
        obj.insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public void insertionSort(int[] arr){
        //steps 1
        int sortedIndex = 0;
        int unsortedIndex =1;

        //step 2
        for (int i = unsortedIndex; i <arr.length ; i++) {
            //step 3
            int nextElement = arr[1];
            //step 4
            for (int j = i; j >0; j--) {
                //step 5
                if (arr[j]<arr[j-1]){
                    System.out.println("swappiing ->"+arr[j]+"  with  "+arr[j-1]);
                    int temp =arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
                else break;

            }

        }
    }
}
