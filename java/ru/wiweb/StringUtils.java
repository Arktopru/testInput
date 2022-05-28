package ru.wiweb;

/**
 * Строковые утилиты
 * Тестовые задания здесь же
 */
public class StringUtils {

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
}
