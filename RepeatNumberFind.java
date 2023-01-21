package patika;

import java.util.Arrays;


public class RepeatNumberFind {

    static boolean isFind(int arry[], int value) {
        for (int i : arry) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 9, 3, 6, 9, 3, 1, 5, 3, 7, 9};
        int[] duplicate = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i != j) && (arr[i] == arr[j])) {
                    if (!isFind(duplicate, arr[i])) {
                        duplicate[count++] = arr[i];

                    }break;
                }

            }

        }
        for (int value:duplicate) {
            if(value!=0){
                System.out.println(value);
            }
        }
        System.out.println(Arrays.toString(duplicate));
    }
}
