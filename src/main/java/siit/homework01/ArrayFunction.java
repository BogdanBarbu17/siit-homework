package siit.homework01;

public class ArrayFunction {

    public static Integer smallestArr(int arrLength, int[] arr) {

        int smallest = arr[0];
        for (int i = 1; i < arrLength; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        return (smallest);
    }

}
