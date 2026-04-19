
class CompareStrings {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "Hello";

        boolean isEqual = true;

        if(a.length() != b.length()){
            isEqual = false;
        } else {
            for(int i=0;i<a.length();i++){
                if(a.charAt(i) != b.charAt(i)){
                    isEqual = false;
                    break;
                }
            }
        }

        if(isEqual)
            System.out.println("Strings are Equal");
        else
            System.out.println("Strings are Not Equal");
    }
}
