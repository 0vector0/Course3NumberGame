package game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
           int count = game();


            System.out.println("count = " + count);
            System.out.println("continue y/n");
            String isContinue = reader.readLine();
            if (isContinue.equals("n")) {
                break;
            }
        }
    }

    private static boolean isNumeric(String numberString) {
        try {
            Integer.parseInt(numberString);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private static int game() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int computerNumber = (int) (Math.random() * 50);
        int count = 0;
        System.out.println("computer number " + computerNumber);
        while (true) {
            int number = 0;
            System.out.println("Input number");
            String numberString = reader.readLine();
            if ("q".equals(numberString)) {
                break;
            }

            if (isNumeric(numberString)) {
                number = Integer.parseInt(numberString);
            }

            if (number != computerNumber) {
                System.out.println("no");
                count++;
            } else {
                System.out.println("yes");
                break;
            }
        }
        return count;
    }
}

