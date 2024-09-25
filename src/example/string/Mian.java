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

    public static void main(String[] args) {
        ReverseStringWithOutSpecialCharacters main = new ReverseStringWithOutSpecialCharacters();
        System.out.println(main.reverseString(main.str));
    }
}
