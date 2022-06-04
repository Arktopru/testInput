
package ru.wiweb;

/**
 * Строковые утилиты
 * Тестовые задания здесь же
 */
public class StringUtils {

    /**
     * получить название месяца по его номеру
     * @param monthNumber номер месяца
     * @return возвращает название месяца
     */
    public static String getMonthName(int monthNumber) {
        String month = "";

        switch (monthNumber) {
            case 1:
                month = "январь";
                break;
            case 2:
                month = "февраль";
                break;
            case 3:
                month = "март";
                break;
            case 4:
                month = "апрель";
                break;
            case 5:
                month = "май";
                break;
            case 6:
                month = "июнь";
                break;
            case 7:
                month = "июль";
                break;
            case 8:
                month = "август";
                break;
            case 9:
                month = "сентябрь";
                break;
            case 10:
                month = "октябрь";
                break;
            case 11:
                month = "ноябрь";
                break;
            case 12:
                month = "декабрь";
                break;
            default:
                month = "не определенно!";
                break;
        }
        return month;
    }

    /**
     * Получить название дня недели по его номеру
     *
     * @param weekDayNumber номер дня недели
     * @return
     */
    public static String getWeekDayName(int weekDayNumber){
        String dayOfWeek = "";

        switch (weekDayNumber) {
            case 1:
                dayOfWeek = "понедельник";
                break;
            case 2:
                dayOfWeek = "вторник";
                break;
            case 3:
                dayOfWeek = "среда";
                break;
            case 4:
                dayOfWeek = "четверг";
                break;
            case 5:
                dayOfWeek = "пятница";
                break;
            case 6:
                dayOfWeek = "суббота";
                break;
            case 7:
                dayOfWeek = "воскресенье";
                break;
            default:
                dayOfWeek = "не определенно!";
        }
        return dayOfWeek;
    }

    /**
     * Этот метод анализирует операнд и выводит результат на печать
     * @param op действия калькулятора
     * @param first первый операнд
     * @param second второй операнд
     */
    public static void getOperation (String op, double first, double second){

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


