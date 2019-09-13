import java.util.*;
class Reverse {
        public static void main(String args[]){

            String str = "The quick brown fox jumps";
            System.out.println("The given string is: " + str);
            String reverse = "";

            int length = str.length();

            for (int i = length - 1 ; i >= 0 ; i--)
                reverse = reverse + str.charAt(i);

            System.out.println("The string in reverse order is:" + reverse);
        }
    }


