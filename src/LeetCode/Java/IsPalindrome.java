package LeetCode.Java;

public class IsPalindrome {

    public boolean isPalindrome(int x) { //принимает число, определяет симметричное оно или нет

        boolean result = false;
        int length;
        int step;
        String charStart;
        String charEnd;

        Integer xx = x;
        String str = xx.toString();
        length = str.length();

        if (length > 1) {
            step = length / 2;


            for (int i = 0; i < step; i++) {

                charStart = str.substring(i, i + 1);
                charEnd = str.substring(length - i - 1, length - i);

                if (charStart.equals(charEnd)) {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }
        } else {
            result = true;
        }
        return result;
    }

}
