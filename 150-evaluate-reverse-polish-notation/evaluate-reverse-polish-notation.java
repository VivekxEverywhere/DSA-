class Solution {
    public int evalRPN(String[] tokens) {
        int i = -1;
        for (String s : tokens) {
            if (s.equals("+")) {
                tokens[i - 1] = String.valueOf(
                    Integer.parseInt(tokens[i - 1]) + Integer.parseInt(tokens[i--]));
            } else if (s.equals("-")) {
                tokens[i - 1] = String.valueOf(
                    Integer.parseInt(tokens[i - 1]) - Integer.parseInt(tokens[i--]));
            } else if (s.equals("*")) {
                tokens[i - 1] = String.valueOf(
                    Integer.parseInt(tokens[i - 1]) * Integer.parseInt(tokens[i--]));
            } else if (s.equals("/")) {
                tokens[i - 1] = String.valueOf(
                    Integer.parseInt(tokens[i - 1]) / Integer.parseInt(tokens[i--]));
            } else {
                tokens[++i] = s;
            }
        }
        return Integer.valueOf(tokens[0]);
    }
}