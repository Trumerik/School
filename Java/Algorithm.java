public class Algorithm {

    public int[] insertionSort(int[] arr){
        System.out.print("\n...Now executing insertion sort...\nResult: ");

        for (int i=1; i<arr.length; i++){
            int j = i-1;
            int temp = arr[i];
            while(j>=0 && temp<arr[j]){
                arr[j+1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
        return arr;
    }
}
