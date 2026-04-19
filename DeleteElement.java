
class DeleteElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int pos = 2;

        int[] newArr = new int[arr.length - 1];

        for(int i=0,j=0;i<arr.length;i++){
            if(i != pos){
                newArr[j++] = arr[i];
            }
        }

        for(int i : newArr){
            System.out.print(i + " ");
        }
    }
}
