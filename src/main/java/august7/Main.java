package august7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Re-throw exceptions.
 *
 * @author Kseniya Shavonina
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        Main main = new Main();

        try {
            main.checkEx();
        } catch (IOException e) {
            throw new IllegalAccessException();
        }
    }

    private void checkEx() throws IOException {
        try {
            throw new IOException();
        } catch (IOException e) {
            throw e;
        }
    }

}
