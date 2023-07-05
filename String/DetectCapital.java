package String;

public class DetectCapital {
    public static boolean detectCapitalUse(String word) {
        int numberofcapital = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                numberofcapital++;
            }
        }
        if (numberofcapital == word.length() || numberofcapital == 0) {
            return true;
        }
        return numberofcapital == 1 && Character.isUpperCase(word.charAt(0));
    }

    public static void main(String[] args) {
        String word = "USA";
        System.out.println(detectCapitalUse(word));
    }
}
