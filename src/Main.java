public class Main {
    public static void main(String[] args) {
        int check = 100;
        int topup = 1234;
        int bonus;
        if (topup > 1000) {
            bonus = topup / 100;
        } else {
            bonus = 0;
        }
        int balance = check + topup;
        System.out.println("Ваш счет: " + balance);
        System.out.println("Ваши бонусы: " + bonus);
    }
}