package day03.extra;

public class RoundingAmount {
    public  int getRoundedAmount(int amount){
        String amountString = String.valueOf(amount);
        int rounded;
        int lastIndex = amountString.length() - 1;
        switch (amountString.substring(lastIndex)){
            case "1":
            case "6":
                rounded = amount - 1;
                break;
            case "2":
            case "7":
                rounded = amount - 2;
                break;
            case "3":
            case "8":
                rounded = amount + 2;
                break;
            case "4":
            case "9":
                rounded = amount + 1;
                break;
            default:
                rounded = amount;
        }
        return rounded;
    }

    public static void main(String[] args) {
        RoundingAmount roundingAmount = new RoundingAmount();
        System.out.println(roundingAmount.getRoundedAmount(48));
    }
}
