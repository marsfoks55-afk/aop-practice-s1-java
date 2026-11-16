package homework.h12;

// LeetCode 1122: https://leetcode.com/problems/relative-sort-array/

public class T2 {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
        int index = 0;

        for (int num : arr2) {
            for (int value : arr1) {
                if (value == num) {
                    result[index++] = num;
                }
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] > arr1[j]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }

        for (int num : arr1) {
            boolean found = false;

            for (int value : arr2) {
                if (num == value) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                result[index++] = num;
            }
        }

        return result;
    }
}