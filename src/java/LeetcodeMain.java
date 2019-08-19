public class LeetcodeMain {
    public static void main(String[] args) {
        ValidParentheses vp = new ValidParentheses();
        if (vp.isValid("{()[}]")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}