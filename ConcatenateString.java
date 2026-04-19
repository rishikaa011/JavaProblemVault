
class ConcatenateString {
    public static void main(String[] args) {
        String a = "Hello ";
        String b = "World";
        char[] result = new char[a.length() + b.length()];

        int k = 0;
        for(int i=0;i<a.length();i++){
            result[k++] = a.charAt(i);
        }
        for(int i=0;i<b.length();i++){
            result[k++] = b.charAt(i);
        }

        System.out.println(new String(result));
    }
}
