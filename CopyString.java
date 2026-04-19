
class CopyString {
    public static void main(String[] args) {
        String str = "Hello";
        char[] copy = new char[str.length()];

        for(int i=0;i<str.length();i++){
            copy[i] = str.charAt(i);
        }

        System.out.println(new String(copy));
    }
}
