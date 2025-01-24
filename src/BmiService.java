public class BmiService {
    public int calculate(double weightInKilograms, double heightInMeters) {
        double index = weightInKilograms / (heightInMeters * heightInMeters);

        return (int) index;
    }
}
