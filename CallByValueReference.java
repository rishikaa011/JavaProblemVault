class CallByValueReference {
    static void changeValue(int x){
        x=100;
    }

    static void changeArray(int arr[]){
        arr[0]=100;
    }

    public static void main(String[] args){
        int a=10;
        changeValue(a);
        System.out.println("Call by Value: "+a);

        int arr[]={1,2,3};
        changeArray(arr);
        System.out.println("Call by Reference: "+arr[0]);
    }
}