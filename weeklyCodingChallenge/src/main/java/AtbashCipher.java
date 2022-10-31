public class AtbashCipher {

    public static void main(String[] args) {

        System.out.println(atBashCipher("abcdefghijklmnopqrstuvwxyz"));
        System.out.println("abcdefghijklmnopqrstuvwxyz");
        System.out.println(atBashCipher("it is October 31th"));

    }


    public static String atBashCipher(String input){

        StringBuilder string=new StringBuilder(input);
        for(int i=0; i<string.length(); i++){
            char temp=string.charAt(i);
            if(Character.isLowerCase(temp)) {
                int distance = temp - 'a';
                char newChar = (char) ('z' - distance);
                string.setCharAt(i, newChar);
            } else if (Character.isUpperCase(temp)) {
                int distance=temp-'A';
                char newChar=(char) ('Z'-distance);
                string.setCharAt(i,newChar);
            }

        }

        return string.toString();
    }
}
