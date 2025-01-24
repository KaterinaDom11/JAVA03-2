public class BmiService {
    public double calculate(double weightInKilograms, double heightInMeters) {
        double index = weightInKilograms / (heightInMeters * heightInMeters);

        return index;
    }
}
