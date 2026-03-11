

class CompileTime {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    float add(int a, float b) {
        return a + b;
    }
}

class Employee {
    public void working() {
        System.out.println("Employee is working....");
    }
}

class SDE extends Employee {
    @Override
    public void working() {
        System.out.println("SDE is working...");
    }
}

class Polymorphison {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.working();
    }
}
