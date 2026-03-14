class Employee {
    String name;
    double baseSalary;
    double bonus;

    Employee(String name, double baseSalary, double bonus) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    double calculateNetSalary() {
        return 0;
    }
}

class Engineer extends Employee {

    Engineer(String name, double baseSalary, double bonus) {
        super(name, baseSalary, bonus);
    }

    double calculateNetSalary() {
        double gross = baseSalary + bonus;
        double tax = gross * 0.10;
        double benefit = 100;
        return gross - tax + benefit;
    }
}

class SoftwareEngineer extends Employee {

    SoftwareEngineer(String name, double baseSalary, double bonus) {
        super(name, baseSalary, bonus);
    }

    double calculateNetSalary() {
        double gross = baseSalary + bonus;
        double tax = gross * 0.15;
        double benefit = 150;
        return gross - tax + benefit;
    }
}
