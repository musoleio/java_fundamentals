package strings;

public class TextProcessor {
    private static final char BLANK = ' ';

    public static void main(String[] args) {
//        countWords("The quick brown fox jumps over the lazy dog");
//        reverseString("hello world");
        addSpaces("TheQuickBrownFoxJumpsOverTheLazyDog");
    }

    public static void addSpaces(String text) {
        var builder = new StringBuilder(text);
        for (int i = 1; i < builder.length(); i++) {
            if (Character.isUpperCase(builder.charAt(i))) {
                builder.insert(i, BLANK);
                i++;
            }
        }
        System.out.println(builder);
    }

    private static void reverseString(String text) {
        for (int i = (text.length() - 1); i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
    }

    public static void countWords(String text) {
        var words = text.split("\s+");
        var wordCount = words.length;
        var message = String.format("Your text contains %d words", wordCount);
        System.out.println(message);
        for (var word : words) {
            System.out.println(word);
        }
    }
}
