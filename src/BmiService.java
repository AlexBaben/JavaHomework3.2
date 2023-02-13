public class BmiService {
    public int calculate(double heightM, double weightKg) {
        int result = (int) (weightKg / Math.pow(heightM, 2));
        return result;
    }
}
