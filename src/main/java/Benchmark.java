public class Benchmark {
public int firstValue = 1000;
public int  secondValue = 1000;

      public long getPlusTime(){
        Calculator calculator = new Calculator();

        long startTime = System.currentTimeMillis();
        for (int count = 0; count < 1000000; count++){
        calculator.plus( firstValue,  secondValue);

        }
        for (int count = 0; count < 1000000; count++){
              calculator.minus( firstValue,  secondValue);

        }
        for (int count = 0; count < 1000000; count++){
              calculator.divide( firstValue,  secondValue);

        }
        for (int count = 0; count < 1000000; count++){
              calculator.multiply( firstValue,  secondValue);

        }

        long endTime = System.currentTimeMillis();

        long duration = endTime - startTime;
        return duration;
      }
}







