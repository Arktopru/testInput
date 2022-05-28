package ru.wiweb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 */
public class MainClass {

    /**
     *
     *
     * @param args
     */
    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            String input = "";
            while (!"q".equalsIgnoreCase(input)) {

                System.out.print("Укажите номер дня недели (q to quite): ");

                input = br.readLine();
                String dayOfWeek = "";
                int dOWint = 0;

                if (!input.isEmpty()) {
                    dOWint = Integer.parseInt(input);
                }

                switch (dOWint) {
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

                System.out.println("input : " + dayOfWeek);
            }

            System.out.println("bye bye!");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
