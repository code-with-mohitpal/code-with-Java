import java.util.LinkedHashSet;

class UniqueElementFinder<T> {
    private T[] array;

    public UniqueElementFinder(T[] array) {
        this.array = array;
    }

    public void displayOriginalArray() {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public void displayUniqueElements() {
        LinkedHashSet<T> set = new LinkedHashSet<>();

        for (T element : array) {
            set.add(element);
        }

        for (T element : set) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
