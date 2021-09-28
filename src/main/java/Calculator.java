public class Calculator {
    public double doMath(String operation, int firstValue, int secondValue, double answer) {

        switch (operation) {
            case "+":
                return answer = firstValue + secondValue;
            case "-":
                return answer = firstValue - secondValue;
            case "*":
                return answer = firstValue * secondValue;
            case "/":
                return answer = firstValue / secondValue;
            default:
                System.out.println("Your operation is not correct! Input correct operation");
        }
        return (answer);
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
