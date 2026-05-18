class TypeConversion {
    public static void main(String[] args) {

        int num = 100;
        double d = num; // implicit conversion

        double x = 9.8;
        int y = (int)x; // explicit conversion

        System.out.println("Integer to Double: " + d);
        System.out.println("Double to Integer: " + y);
    }
}
