package day03.sumofdigits;

public class SumOfDigits {
    int getSumOfDigits(int number){
        String str = Integer.toString(number);
        String[] temp = str.split("");

        int count = 0;
        for (int i = 0; i < temp.length; i++){
            count += Integer.parseInt(temp[i]);
        }
        return count;
    }

    public static void main(String[] args) {
        SumOfDigits sumOfDigits = new SumOfDigits();

        System.out.println(sumOfDigits.getSumOfDigits(1234));
    }
}
