package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptions {
    public static void main(String[] args) {
        File file = new File("files/numbers.txt");
        try {
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNext()) {
                System.out.println(fileReader.nextDouble());
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        } catch (Exception e) {

        }
        // Also possible:
        // catch (FileNotFoundException | InputMismatchException e)
    }
}
