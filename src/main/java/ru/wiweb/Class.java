package ru.wiweb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 */
public class Class {

    /**
     * Это главный метод приложения 22222
     *
     * @param args входные параметры приложения
     */
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String input = "";
            int first = 0;
            int second = 0;

            while (!"q".equalsIgnoreCase(input)) {
                System.out.print("Укажите первый операнд (q to quite): ");
                input = br.readLine();

                if (!input.isEmpty()) {
                    first = Integer.parseInt(input);
                    break;
                }
            }


            while (!"q".equalsIgnoreCase(input)) {
                System.out.print("Укажите второй операнд (q to quite): ");
                input = br.readLine();

                if (!input.isEmpty()) {
                    second = Integer.parseInt(input);
                    break;
                }
            }
            System.out.println("Сумма " + first + " + " + second + " = " + (first + second));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
