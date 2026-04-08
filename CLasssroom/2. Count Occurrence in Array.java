class Main {
    public static void main(String[] args) {
        int[] t = {1, 2, 3, 2, 4, 2};
        int count = 0;

        for (int i : t) {
            if (i == 2) count++;
        }

        System.out.println(count);
    }
}
