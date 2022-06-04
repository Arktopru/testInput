
package ru.wiweb;

/**
 * Строковые утилиты
 * Тестовые задания здесь же
 */
public class StringUtils {

    private static String[] months = new String[]{
            "январь",//0
            "февраль", //1
            "март",//2
            "апрель", //3
            "май", //4
            "июнь", //5
            "июль", //6
            "август", //7
            "сентябрь", //8
            "октябрь", //9
            "ноябрь", //10
            "декабрь" //11
    };

    private static String[] weekDays = new String[]{
            "понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"
    };

    /**
     * получить название месяца по его номеру
     *
     * @param monthNumber номер месяца
     * @return возвращает название месяца
     */
    public static String getMonthName(int monthNumber) {

        if (monthNumber >= 1 && monthNumber <= 12) {
            return months[monthNumber - 1];
        }
        return "Неопределенно";
    }

    /**
     * Получить название дня недели по его номеру
     *
     * @param weekDayNumber номер дня недели
     * @return
     */
    public static String getWeekDayName(int weekDayNumber) {

        if(weekDayNumber >= 1 && weekDayNumber <= 7) {
            return weekDays[weekDayNumber - 1];
        }
        return "Неопределенно";
    }

    /**
     * Этот метод анализирует операнд и выводит результат на печать
     *
     * @param op     действия калькулятора
     * @param first  первый операнд
     * @param second второй операнд
     */
    public static void getOperation(String op, double first, double second) {

        switch (op) {
            case "+":
                System.out.println("Сумма " + first + " + " + second + " = " + (first + second));
                break;
            case "*":
                System.out.println("Произведение " + first + " * " + second + " = " + (first * second));
                break;
            case "-":
                System.out.println("Вычитание " + first + " - " + second + " = " + (first - second));
                break;
            case "/":
                System.out.println("Деление " + first + " / " + second + " = " + (first / second));
                break;
            default:
                System.out.println("Не известная операция");
                break;
        }
    }

}


