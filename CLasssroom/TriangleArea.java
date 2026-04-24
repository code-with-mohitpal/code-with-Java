class TriangleArea<T extends Number> {
    private T base;
    private T height;

    public TriangleArea(T base, T height) {
        this.base = base;
        this.height = height;
    }

    public void displayArea() {
        double b = base.doubleValue();
        double h = height.doubleValue();
        double area = 0.5 * b * h;

        if (base instanceof Integer) {
            System.out.println("Base: " + base.intValue());
            System.out.println("Height: " + height.intValue());
        } else {
            System.out.println("Base: " + b);
            System.out.println("Height: " + h);
        }

        System.out.printf("Area of Triangle: %.2f\n", area);
    }
}
