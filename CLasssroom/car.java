class CarUtility {

    double calculateRange(double fuel, double mileage) {
        double range = fuel * mileage;

        if (range < 50) {
            System.out.println("Low Range Warning!");
        }

        return range;
    }
}

class EcoCarUtility extends CarUtility {

    double calculateRange(double fuel, double mileage) {
        double range = fuel * mileage;

        if (range < 50) {
            System.out.println("Low Range Warning!");
        } else {
            range = range + 20;
        }

        return range;
    }
}
