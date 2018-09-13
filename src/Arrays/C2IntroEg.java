package Arrays;


import resources.InputsDisplay;

public class C2IntroEg {

    public static void main(String[] args) {
        System.out.println("*** Introduction example problems of EPI ***");
        algorithm1();
        System.out.println("*** END ***");
    }

    /**
     * Algorithm:- To separate even and odd entries in an array
     * */
    private static void algorithm1() {
        System.out.println("Algorithm:- To separate even and odd entries in an array");

        int input[] = InputsDisplay.displayNOverrideIntArray(InputsDisplay.STATE.INPUT, new int[]{3, 2, 4, 5, 6, 7, 1, 8, 9, 10});
        int start = 0, end = input.length - 1;
        for (int i = 0; i < end; i++) {
            if (input[i] % 2 == 0) {
                start++;
            } else {
                int temp = input[i];
                input[i--] = input[end];
                input[end--] = temp;
            }
        }

        InputsDisplay.printIntArray(InputsDisplay.STATE.OUTPUT, input);
    }
}
