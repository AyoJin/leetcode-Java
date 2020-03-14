package problems;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int length = s.length();
        int lengthOfLastWord = 0;
        int i = length - 1;
        // 注意：跳过末尾的空格
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        while (i >= 0) {
            if (i >= 0 && s.charAt(i) != ' ') {
                lengthOfLastWord++;
                i--;
            } else {
                break;
            }
        }
        return lengthOfLastWord;
    }
}
