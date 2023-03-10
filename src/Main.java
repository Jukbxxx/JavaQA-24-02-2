public class Main {
    public static void main(String[] args) {

        int initialAmount = 300; // Переменная для хранения изначальной суммы на счету
        int depositAmount = 1100; // Переменная для хранения суммы к зачислению
        boolean bonusProvided = depositAmount > 1000; // Проверка выполнения условия для начисления бонусных рублей

//     Вариант решения с использованием тернарного условного оператора:

        int bonus = bonusProvided ? depositAmount / 100 * 1 : 0;
        int totalSum = initialAmount + depositAmount + bonus;
        System.out.println("Итоговый счет: " + totalSum);
        System.out.println("Бонусов начислено: " + bonus);

//     Вариант решения с использованием операторов if/else:

//        int bonus; // Переменная для хранения бонусов к начислению
//        int totalSum; // Переменная для хранения итоговой суммы

//        if (bonusProvided) {
//            bonus = depositAmount / 100 * 1;
//            totalSum = depositAmount + initialAmount + bonus;
//            System.out.println("Итоговый счет: " + totalSum);
//            System.out.println("Бонусов начислено: " + bonus);
//        } else {
//            bonus = 0;
//            totalSum = depositAmount + initialAmount + bonus;
//            System.out.println("Итоговый счет: " + totalSum);
//            System.out.println("Бонусов начислено: " + bonus);




        }

    }
