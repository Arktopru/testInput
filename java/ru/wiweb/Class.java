package org.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 */
public class Class {

    /**
     *
     *
     * @param args
     */
    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            String input = "";
            while (!"q".equalsIgnoreCase(input)) {

                System.out.print("Укажите номер месяца (q to quite): ");

                input = br.readLine();

                int mint = 0;

                if (!input.isEmpty()) {
                    mint = Integer.parseInt(input);
                }
                System.out.println("input : " + StringUtils.getmonthName(mint));
            }

            System.out.println("bye bye!");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
