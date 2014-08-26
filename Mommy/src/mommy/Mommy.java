package mommy;

public class Mommy {
    private static final Character[] vowels = {'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U'};
    private static final String VOWELS = ".(?i)[aeiou]";
    private static final String CONSECUTIVE_VOWELS = "(^.[aeiou]{2,})";
    private static final String CONSONANTS = "([b-df-hj-np-tv-z])";


    public static boolean hasVowels(String string) {
        if(string.matches(VOWELS)){
            return true;
        }
        return false;
    }

    private static Boolean isVowel(char c) {
        if(VOWELS.contains(c))

        for(char vowel : vowels){
            if(c == vowel){
                return true;
            }
        }
        return false;
    }

    public static boolean shouldBeMommyfied(String word) {

        if(word == null){
            throw new IllegalArgumentException("input cannot be null");
        }

        float lengthOfString = word.length();
        float numberOfVowels = vowelCount(word);
        float ratio = ((numberOfVowels / lengthOfString) * 100);
        return ratio > 30.0 ? true : false;
    }

    private static int vowelCount(String word) {
        int vowelsInWord = 0;
        for(int i = 0; i < word.length(); i++){
            if(isVowel(word.charAt(i))){
                vowelsInWord++;
            }
        }
        return vowelsInWord;
    }

    public static String mommyfy(String word) {
        if(Mommy.shouldBeMommyfied(word)){
           return replaceVowels(word);
        }
        return word;
    }

    private static String replaceVowels(String word) {
        String alteredString = "";
        for(char i : word.toCharArray()){
            if(isVowel(i)){
                if(alteredString.endsWith("mommy")){
                    break;
                }
                alteredString += "mommy";
            } else {
                alteredString += i;
            }
        }
        return alteredString;
    }


//    public String mommyfy(String wordToMommyfy) {
//
//        String result = "";
//        Boolean consecutiveVowels = false;
//        if(Mommy.shouldBeMommyfied(wordToMommyfy)) {
//            for (int i = 0; i < wordToMommyfy.length(); i++) {
//                if (i != wordToMommyfy.length() - 1) {
//                    if ((isVowel(wordToMommyfy.charAt(i)) && isVowel(wordToMommyfy.charAt(i + 1)))) {
//                        result = result.concat("mommy");
//                        consecutiveVowels = true;
//                    } else {
//                        if (isVowel(wordToMommyfy.charAt(i)) && !consecutiveVowels) {
//                            result = result.concat("mommy");
//                        } else {
//                            result = result.concat(wordToMommyfy.charAt(i) + "");
//                        }
//                    }
//                } else {
//                    if (isVowel(wordToMommyfy.charAt(i)) && isVowel(wordToMommyfy.charAt(i - 1))) {
//                        if (!consecutiveVowels) {
//                            result = result.concat("mommy");
//                        }
//                    } else {
//                        if (!consecutiveVowels) {
//                            result = result.concat("mommy");
//                        } else {
//                            result = result.concat(wordToMommyfy.charAt(i) + "");
//                        }
//                    }
//                }
//            }
//        } else{
//            result = result.concat(wordToMommyfy);
//        }
//        return result;
//    }
}
