public class Calculator {
   public double doMath(char operation, int firstValue, int secondValue) {

        switch (operation) {
            case '+':
                return  firstValue + secondValue;
            case '-':
                return  firstValue - secondValue;
            case '*':
                return firstValue * secondValue;
            case '/':
                return  firstValue / secondValue;
            default:
                System.out.println("Your operation is not correct! Input correct operation");
                return 0;
        }
    }

    public double plus(int firstValue, int secondValue) {
        return firstValue + secondValue;
    }

    public double minus(int firstValue, int secondValue) {
        return firstValue - secondValue;
    }

    public double divide(int firstValue, int secondValue) {
        return firstValue / secondValue;
    }

    public double multiply(int firstValue, int secondValue) {
        return firstValue * secondValue;
    }



}
