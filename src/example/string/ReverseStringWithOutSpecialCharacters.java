package example.string;

public class ReverseStringWithOutSpecialCharacters {
    String str = "Ab#cdefg@i";
    public String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int left = 0, right = charArray.length - 1;

        while (left < right) {
            if (!Character.isLetter(charArray[left])) {
                left++;
            } else if (!Character.isLetter(charArray[right])) {
                right--;
            } else {
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
                left++;
                right--;
            }
        }
        return new String(charArray);
    }

    void reverseStringWithoutMovingSpecialCharacters(String str) {
        //String str = "Ab#cdefgi@hi";
        char[] arr = str.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            if (Character.isLetter(str.charAt(left)) && Character.isLetter(str.charAt(right))) {
                arr[left] = str.charAt(right);
                arr[right] = str.charAt(left);
                left++;
                right--;
            } else {
                if (!Character.isLetter(str.charAt(left))) {
                    arr[left] = str.charAt(left);
                    left++;
                }
                if (!Character.isLetter(str.charAt(right))) {
                    arr[right] = str.charAt(right);
                    right--;
                }
            }
        }

        System.out.println(arr);
    }

    public static void main(String[] args) {
        ReverseStringWithOutSpecialCharacters main = new ReverseStringWithOutSpecialCharacters();
        main.reverseStringWithoutMovingSpecialCharacters(main.str);
        System.out.println(main.reverseString(main.str));
    }
}
