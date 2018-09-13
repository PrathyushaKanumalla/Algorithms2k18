package resources;

import java.util.Scanner;

public class InputsDisplay {

    public enum STATE {
        INPUT, OUTPUT, INTERMEDIATE
    }

    public static int[] displayNOverrideIntArray(STATE state, int[] arrayInput) {
        printIntArray(state, arrayInput);
        System.out.print("Do you want to override the input? Press y or n - ");
        Scanner scanner = new Scanner(System. in);
        String answer = scanner.next();
        if (answer.equals("y") || answer.equals("Y")) {
            System.out.printf("Overriding %s Enter size and input - " , state.toString());
            scanner = new Scanner(System. in);
            int size = scanner.nextInt();
            arrayInput = new int[size];
            for (int i = 0 ; i < size; i ++) {
                arrayInput[i] = scanner.nextInt();
            }
            System.out.print("Overriden Input -");
        }
        return arrayInput;
    }

    public static void printIntArray(STATE state, int[] arrayInput) {
        System.out.print(state.toString());
        for (int i = 0; i < arrayInput.length; i++) {
            System.out.print("\t" + arrayInput[i]);
        }
        System.out.println();
    }
}
