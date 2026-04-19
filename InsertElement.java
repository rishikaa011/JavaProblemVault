
class InsertElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int pos = 2, element = 99;

        int[] newArr = new int[arr.length + 1];

        for(int i=0,j=0;i<newArr.length;i++){
            if(i == pos){
                newArr[i] = element;
            } else {
                newArr[i] = arr[j++];
            }
        }

        for(int i : newArr){
            System.out.print(i + " ");
        }
    }
}
