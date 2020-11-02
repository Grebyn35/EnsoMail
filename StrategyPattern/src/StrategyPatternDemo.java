public class StrategyPatternDemo {
    public static void main(String[] args){
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationDivide());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationCompare());
        System.out.println("Largest of 10 and 15 = " + context.executeStrategy(10, 15));
    }
}
