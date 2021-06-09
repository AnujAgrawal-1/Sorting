import java.util.Arrays;

public class BubbleSort {
    public void MyBUbbleSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }

        }

    }

    public static void main(String[] args) {
        int[ ] arr = {12,8,16,5,2};
        BubbleSort bs = new BubbleSort();
        bs.MyBUbbleSort(arr);
        System.out.println("final arrays :"+ Arrays.toString(arr));
    }
}
