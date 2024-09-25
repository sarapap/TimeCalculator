public class TimeCalculator {
    public double calculateTime(double distance, double speed) {
        if (speed <= 0) {
            throw new IllegalArgumentException("Speed must be greater than zero.");
        }
        return distance / speed;
    }

    public static void main(String[] args) {
        TimeCalculator calculator = new TimeCalculator();
        System.out.println(calculator.calculateTime(100.0, 50.0));
    }
}
