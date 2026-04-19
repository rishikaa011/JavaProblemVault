
class CharFrequency {
    public static void main(String[] args) {
        String str = "hello";

        for(int i=0;i<str.length();i++){
            int count = 1;
            char c = str.charAt(i);

            if(c == '0') continue;

            for(int j=i+1;j<str.length();j++){
                if(c == str.charAt(j)){
                    count++;
                    str = str.substring(0,j) + '0' + str.substring(j+1);
                }
            }
            System.out.println(c + " = " + count);
        }
    }
}
