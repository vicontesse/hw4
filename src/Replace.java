public class Replace {

    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog.";

        String new_str = str.replaceAll("fox", "cat");

        System.out.println("Sample string: " + str);
        System.out.println("Replaced: " + new_str);
    }
}
