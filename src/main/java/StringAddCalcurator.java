public class StringAddCalcurator {
    public int solve(String expression) {
        try {
            return Integer.parseInt(expression);
        } catch (Exception e) {

        }
        if (expression == null) return 0;
        if (expression.isEmpty()) return 0;
        String[] tokens = expression.split(",|:");
        int length = tokens.length;
        int total = 0;
        for (int i = 0; i < length; i++) {
            total+=Integer.parseInt(tokens[i]);
        }
        return total;
    }
}
