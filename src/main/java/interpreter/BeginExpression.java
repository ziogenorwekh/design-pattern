package interpreter;

public class BeginExpression implements Expression {

    private CommandListExpression expression;

    @Override
    public boolean parse(Context context) {
        if (checkValidKeyword(context.getCurrentKeyword())) {
            context.readNextKeyword();
            expression = new CommandListExpression();
            return expression.parse(context);
        } else {
            return false;
        }
    }

    private boolean checkValidKeyword(String keyword) {
        return keyword.equals("BEGIN");
    }

    @Override
    public boolean run() {
        return expression.run();
    }

    @Override
    public String toString() {
        return "BEGIN " + expression;
    }
}
