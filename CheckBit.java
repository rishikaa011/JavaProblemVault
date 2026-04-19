class CheckBit {
    public static void main(String[] args){
        int n=5, pos=1;
        if((n & (1<<pos))!=0)
            System.out.println("Bit is set");
        else
            System.out.println("Bit is not set");
    }
}