import java.util.Scanner;
public class Automorph {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number : ");
        int i = sc.nextInt();
        int iSquare = i*i;

        String num = Integer.toString(i);
        String square = Integer.toString(iSquare);

        if(square.endsWith(num))
            System.out.println("Automorphic Number.");
        else
            System.out.println("Not an Automorphic Number.");
    }
}
