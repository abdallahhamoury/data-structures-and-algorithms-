package hashtable;

import java.util.HashMap;

import java.util.Locale;

import java.util.Map;

public class App {
    public static void main(String[] args) {
        HashTable myTable = new HashTable();
//        myTable.add("Cat", 1);
//        myTable.add("container", 2);
//        myTable.add("ddd", 2);
//        myTable.add(555, 3);
//        myTable.add(8, 4);
//        System.out.println(myTable.get("Cat"));
//        System.out.println(myTable.get("container"));
//        System.out.println(myTable.get("test"));
//        System.out.println(myTable.contains("aseel"));
//        System.out.println(myTable.contains("Cat"));
//        System.out.println(myTable.hash("555"));
//        System.out.println(myTable.hash("Cat"));
//        System.out.println(myTable.hash("ddd"));
//        System.out.println(myTable);
        System.out.println(repeatedWord("\"Once upon a time, there was a brave princess who...\""));
    }
    public static String repeatedWord(String sentence) {
        Map<String,String> hashMap = new HashMap<>();
        sentence = sentence.replace("," , "");
        String[] allWords = sentence.split(" ");
        for (String word : allWords) {
            word = word.toLowerCase();
            if (hashMap.containsKey(word))return word;
            else  hashMap.put(word,word);
        }
        return null;
    }
}