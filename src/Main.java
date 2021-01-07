public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int transfer = 100;
        int bonus;
        int amount;
        if (transfer > 1000) {
            bonus = transfer / 100;
            amount = balance + transfer;
        } else {
            bonus = 0;
            amount = balance + transfer;
        }
        System.out.println(bonus);
        System.out.println(amount);
    }
    }



