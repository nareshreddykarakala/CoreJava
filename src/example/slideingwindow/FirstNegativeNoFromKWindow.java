package example.slideingwindow;

import java.util.LinkedList;

public class FirstNegativeNoFromKWindow {
    public static void main(String[] args) {
        FirstNegativeNoFromKWindow firstNegativeNoFromKWindow = new FirstNegativeNoFromKWindow();
        firstNegativeNoFromKWindow.firstNegativeElementInWindowOfSizeK();
    }

    void firstNegativeElementInWindowOfSizeK() {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;

        var queue = new LinkedList<>();

        for (int i = 0; i < k; i++) {
            if (arr[i] < 0) {
                queue.add(arr[i]);
            }
        }

        int left = 0, right = 2;
        while (right < arr.length) {

            if (queue.isEmpty()) {
                System.out.println(0);
            } else {
                System.out.println(queue.peek());
            }

            if (right == arr.length - 1){
                break;
            }

            if (arr[left] < 0) {
                queue.pop();
            }
            left++;
            right++;
            if (arr[right] < 0) {
                queue.addLast(arr[right]);
            }
        }
    }
}
