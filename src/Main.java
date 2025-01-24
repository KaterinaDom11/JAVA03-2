public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bodyWeight = 70;
        double height = 1.75;
        double index = service.calculate(bodyWeight, height);
        System.out.println((int) index);

    }
}

