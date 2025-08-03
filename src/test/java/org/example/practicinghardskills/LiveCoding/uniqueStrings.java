package org.example.practicinghardskills.LiveCoding;

/*
*
* */
public class uniqueStrings {
    public static void main(String[] args) {
        String str1 = "banana apple mango";
        String str2 = "house banana java";


    }

    public static String[] getUniqueValuesFromTwoStrings(String str1, String str2){
        StringBuilder stringBuilder = new StringBuilder(str1);
        stringBuilder.append(" ");
        stringBuilder.append(str2);
        String[] words = stringBuilder.toString().toLowerCase().split(" ");
//        Map<String, Integer> frequencyOfWords = new HashMap()
//        for (String word : allWords) {
//            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
//        }
        return null;
    }
}
