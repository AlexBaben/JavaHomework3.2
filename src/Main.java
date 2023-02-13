public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bmi = service.calculate(1.90, 76);
        System.out.println(bmi);
    }
}