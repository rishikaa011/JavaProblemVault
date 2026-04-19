
class RemoveNonAlphabets {
    public static void main(String[] args) {
        String str = "Hello123 World!";
        String result = "";

        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(Character.isLetter(c)){
                result += c;
            }
        }

        System.out.println(result);
    }
}
