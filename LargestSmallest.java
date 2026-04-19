
class LargestSmallest {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8};
        int max = arr[0], min = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i] > max) max = arr[i];
            if(arr[i] < min) min = arr[i];
        }

        System.out.println("Largest = " + max);
        System.out.println("Smallest = " + min);
    }
}
