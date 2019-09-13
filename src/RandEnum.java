import java.util.Random;


public class RandEnum {
    public enum IRandom{
        one (1),
        two(2),
        three (3),
        four(4),
        five (5),
        six (6),
        seven(7),
        eigth(8),
        nine(9),
        ten(10),
        eleven(11),
        twelve(12),
        thirteen(13),
        fourteen(14),
        fifteen(15),
        sixteen(16),
        seventeen(17),
        eighteen(18),
        nineteen(19),
        twenty(20),
        twentyOne(21),
        twentyTwo(22),
        twentyThree(23),
        twentyFour(24),
        twentyFive(25),
        twentySix(26),
        twentySeven(27),
        twentyEight(28),
        twentyNine(29),
        thirty(30);
        private int index;
        private IRandom (int index){
            this.index = index;
        }
        int getIndex(){
            return index;
        }

        public static IRandom getRandom() {
            return values()[(int) (Math.random() * values().length)];
        }
    }
    public static void main(String args[]) {

        System.out.println(IRandom.getRandom().getIndex());

    }
}
