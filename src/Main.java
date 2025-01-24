public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bodyWeight = 98;
        double height = 1.87;
        double index = service.calculate(bodyWeight, height);
        System.out.println((int) index);

    }
}

