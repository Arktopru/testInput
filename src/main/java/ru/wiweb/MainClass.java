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

                int dOWint = 0;

                if (!input.isEmpty()) {
                    dOWint = Integer.parseInt(input);
                }
                System.out.println("input : " + StringUtils.getWeekDayName(dOWint));
            }

            System.out.println("bye bye!");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
