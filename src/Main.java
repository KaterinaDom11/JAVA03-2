public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bodyWeight = 98;
        double height = 1.87;
        int index = service.calculate(bodyWeight, height);
        System.out.println(index);
    }
}

