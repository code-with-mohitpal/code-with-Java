interface Add {
    int sum(int a, int b);
}

class LambdaAdd {
    public static void main(String[] args) {

        Add obj = (a, b) -> a + b;

        System.out.println("Addition = " + obj.sum(10, 20));
    }
}
