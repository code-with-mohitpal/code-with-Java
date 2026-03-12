class SuperClass {
    int variableA;

    SuperClass(int variableA) {
        this.variableA = variableA;
    }
}

class SubClass extends SuperClass {
    int variableB;

    SubClass(int variableA) {
        super(variableA);   // calling superclass constructor
        variableB = 2 * super.variableA;
    }

    void displayVariables() {
        System.out.println("The value of SuperClass: " + super.variableA);
        System.out.println("The value of SubClass: " + variableB);
    }
}