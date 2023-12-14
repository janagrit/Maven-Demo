package FiveArrays;

public class findtheLargestElement {

    public static void main(String[] args) {

        int [] nums = {5,6,2,5,33,543,2,111,222,345,1,164,444,44};

        System.out.println(getMaxValue(nums));
        System.out.println(getMinIndex(nums));

    }


    public static int getMaxValue(int [] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
         return max;
    }

    public static int getMinIndex(int [] arr){
        int min = arr[0];
        int indexOfMin = 0;
        for (int i = 1; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
                indexOfMin = i;
            }
        }
        return indexOfMin;
    }
}
