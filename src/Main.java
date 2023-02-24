public class Main {
    public static void main(String[] args) {

        int initialAmount = 300; // Переменная для хранения изначальной суммы на счету
        int depositAmount = 1100; // Переменная для хранения суммы к зачислению
        boolean bonusProvided = depositAmount > 1000; // Проверка выполнения условия для начисления бонусных рублей
        int bonus; // Переменная для хранения бонусов к начислению

        if (bonusProvided) {
            bonus = depositAmount / 100 * 1;
            int totalSumWithBonus = initialAmount + depositAmount + bonus;
            System.out.println("Итоговый счет: " + totalSumWithBonus);
            System.out.println("Бонусов начислено: " + bonus);
        } else {
            bonus = 0;
            int totalSum = initialAmount + depositAmount;
            System.out.println("Итоговый счет: " + totalSum);
            System.out.println("Бонусов начислено: " + bonus);
        }

    }
}