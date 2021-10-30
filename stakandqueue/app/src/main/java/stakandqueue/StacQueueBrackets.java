package stakandqueue;

public class StacQueueBrackets {
    public boolean checkStackQueueBrackets(String brackets) {
        Stack<Character> stackBrackets = new Stack<>();
        if (brackets.isEmpty()) {
            return true;
        }
        for (int b = 0; b < brackets.length(); b++) {
            char bracket = brackets.charAt(b);
            if (bracket == '(' || bracket == '[' || bracket == '{') {
                stackBrackets.push(bracket);
            } //stackBrackets.pop();
            Character peekCurrent = stackBrackets.peek();
            if (peekCurrent == '{' && bracket == '}') {
                stackBrackets.pop();
                // return false;
            } else if (peekCurrent == '(' && bracket == ')') {
                stackBrackets.pop();
            } else if (peekCurrent == '[' && bracket == ']') {
                stackBrackets.pop();
            }
        }return stackBrackets.isEmppty();
    }
}
