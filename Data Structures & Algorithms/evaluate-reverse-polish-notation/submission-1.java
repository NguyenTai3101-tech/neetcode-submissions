class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stackTokens = new ArrayDeque<>();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")) {
                int a = stackTokens.pop();
                int b = stackTokens.pop();
                stackTokens.push(exchange(tokens[i], a, b));
            } else {
                stackTokens.push(Integer.parseInt(tokens[i]));
            }
        }
        return stackTokens.peek();
    }

    public int exchange(String str, int numberA, int numberB) {
        switch (str) {
            case "+":
                return numberA + numberB;
            case "-":
                return numberB - numberA;
            case "*":
                return numberA * numberB;
            case "/":
                return numberB / numberA;
            default:
                return 0;
        }
    }
}
