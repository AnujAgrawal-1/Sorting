import java.util.Arrays;

public class MySelectionSort {
    public static void main(String[] args) {
        int[] arr={12,8,16,5,2,16,12};
        MySelectionSort obj=new MySelectionSort();
        System.out.println("unsorted--->"+ Arrays.toString(arr));

        obj.MySelectionSort(arr);
        System.out.println("sorted--->"+ Arrays.toString(arr));
    }
    public void MySelectionSort(int[] arr){
        int  soredIndex = arr.length;
        int maxElement;
        int maxElementIndex;
        for (int i = 0; i < arr.length; i++) {
            //step 3 find Maximum
            maxElement=arr[0];
            maxElementIndex =0;
            for (int j = 0; j < soredIndex; j++) {
                if (maxElement<arr[j]){
                    maxElement=arr[j];
                    maxElementIndex=j;
                }
            }
            //step 4 swap
            int  temp=arr[maxElementIndex];
            soredIndex--;
            arr[maxElementIndex]=arr[soredIndex];
            arr[soredIndex]=temp;

        }

    }

}
