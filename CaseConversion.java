
class CaseConversion {
    public static void main(String[] args) {
        String str = "Hello World";
        String lower = "";
        String upper = "";

        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);

            if(c >= 'A' && c <= 'Z'){
                lower += (char)(c + 32);
                upper += c;
            } else if(c >= 'a' && c <= 'z'){
                upper += (char)(c - 32);
                lower += c;
            } else {
                lower += c;
                upper += c;
            }
        }

        System.out.println("Lowercase: " + lower);
        System.out.println("Uppercase: " + upper);
    }
}
