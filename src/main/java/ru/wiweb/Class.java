package ru.wiweb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 */
public class Class {

    /**
     * Это главный метод приложения
     *
     * @param args входные параметры приложения
     */
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int first = 0;
            int second = 0;
            System.out.print("Укажите первый операнд (q to quite): ");

            try {
                first = getInputFromSystemInput(br);
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.print("Укажите второй операнд (q to quite): ");

            try {
                second = getInputFromSystemInput(br);
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Сумма " + first + " + " + second + " = " + (first + second));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int getInputFromSystemInput(BufferedReader br) throws IOException {
        String input = "";

        while (!"q".equalsIgnoreCase(input)) {

            input = br.readLine();

            if (!input.isEmpty()) {
                return Integer.parseInt(input);

            }
        }
        return 0;
    }
}
