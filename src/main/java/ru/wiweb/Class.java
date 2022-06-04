package ru.wiweb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 */
public class Class {

    /**
     * Это главный метод
     *
     * @param args входные параметры приложения
     */
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            double first = 0;
            double second = 0;
            String op = "";
            String input = "";

            while (true) {

                System.out.print("Укажите первый операнд (q to quite): ");

                try {
                    first = getInputFromSystemInput(br);
                } catch (Exception e) {

                    if (e instanceof NumberFormatException) {
                        break;
                    }
                    e.printStackTrace();
                }

                System.out.print("Укажите второй операнд (q to quite): ");

                try {
                    second = getInputFromSystemInput(br);
                } catch (Exception e) {

                    if (e instanceof NumberFormatException) {
                        break;
                    }
                    e.printStackTrace();
                }
                System.out.print("Укажите действие (*,+,-,/): ");

                try {
                    op = getInputString(br);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println(StringUtils.getOperation(op, first, second));
                System.out.print("Что бы выйти нажмите q, для продолжения введите любой символ, кроме q: ");

                try {
                    input = getInputString(br);
                } catch (IOException e) {
                    e.printStackTrace();
                }

                if (input.equals("q")) {
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static double getInputFromSystemInput(BufferedReader br) throws IOException {
        String input;

        while (true) {

            input = br.readLine().trim();

            if (!input.isEmpty()) {
                return Double.parseDouble(input);
            }
        }
    }

    private static String getInputString(BufferedReader br) throws IOException {
        String input;

        while (true) {

            input = br.readLine().trim();

            if (!input.isEmpty()) {
                return input;
            }
        }
    }
}
