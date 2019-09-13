public class Lexicograph {

    public static void main(String[] args){
        String str1 = "Strings are so cool!";
        String str2 = "Strings are so cool";

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        int lexi = str1.compareToIgnoreCase(str2);

        if (lexi == 0){
            System.out.println("\"" + str1 + "\"" +
                    " is equal to " +
                    "\"" + str2 + "\"");
        }
        else{
            System.out.println("\"" + str1 + "\"" +
                    " is not equal to " +
                    "\"" + str2 + "\"");
        }
    }
}
