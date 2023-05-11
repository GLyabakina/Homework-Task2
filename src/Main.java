public class Main {
    public static void main(String[] args) {
        int amount = 5000;
        int check = 100;

        int bonus;
        if (amount > 1000) {
            bonus = amount / 100;
        } else {
            bonus = 0;
        }

        int total = check + amount + bonus;

        System.out.println("Итоговый бонус:" + bonus);
        System.out.println("Итоговый счет:" + total);
    }

}