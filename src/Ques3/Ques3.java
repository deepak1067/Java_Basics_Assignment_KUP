package Ques3;

public class Ques3 {
    public static void main(String[] args) {
        String str1 = "abcdefabcdeabcdaaa";
        char g_char = 'a';
        String result = remove_Character(str1, g_char);
        System.out.println("\nOriginal string:");
        System.out.println(str1);
        System.out.println("\nSecond string:");
        System.out.println(result);
    }
    public static String remove_Character(String str1, char g_char) {
        if (str1 == null || str1.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        char[] chArray = str1.toCharArray();
        for (int i = 0; i < chArray.length; i++) {
            if (chArray[i] != g_char) {
                sb.append(chArray[i]);
            }
        }
        return sb.toString();
    }
}

