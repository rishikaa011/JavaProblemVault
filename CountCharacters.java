
class CountCharacters {
    public static void main(String[] args) {
        String str = "Hello 123";
        int vowels=0, consonants=0, digits=0, spaces=0;

        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);

            if("aeiouAEIOU".indexOf(c) != -1){
                vowels++;
            } else if(Character.isLetter(c)){
                consonants++;
            } else if(Character.isDigit(c)){
                digits++;
            } else if(c == ' '){
                spaces++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
    }
}
