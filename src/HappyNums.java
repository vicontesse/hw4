import java.util.*;
public class HappyNums {
    public static void main(String[] args){
        System.out.println("First 8 Happy numbers:");
        for(long i = 1,count = 0;count<8;i++){
            if(happy(i)){
                System.out.println(i);
                count++;
            }
        }
    }
    public static boolean happy(long i){
        int m = 0;
        int digit = 0;
        HashSet<Long> cycle = new HashSet<Long>();
        while(i != 1 && cycle.add(i)){
            m = 0;
            while(i > 0){
                digit = (int)(1% 10);
                m += digit*digit;
                i /= 10;
            }
            i = m;
        }
        return i == 1;
    }
}
