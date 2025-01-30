public class Main {
    public static void main(String[] args) {

        int balance = 100; //объявляем переменные согласно условию
        int topUpBalance = 1100; //объявляем переменные согласно условию

        int bonus = 0; //объясвялем переменную бонус = 0
        if (topUpBalance > 1000) { //если пополнение > 1000 рублей
            bonus = topUpBalance / 100; // то бонус = сумма пополнения / 100 (1 руб. за каждые 100 руб.)
        }
        int finalBalance = balance + topUpBalance + bonus; //объявляем переменную с итоговым балансом
        System.out.println("Всего на счету: " + finalBalance); //выводим на экран всего на счету
        System.out.println("Количество бонусных рублей: " + bonus); //выводим на экран бонусные рубли

    }
}
