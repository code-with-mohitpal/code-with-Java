class Box {
    int length;

    Box() {
        length = 0;
    }

    Box(int l) {
        length = l;
    }

    void show() {
        System.out.println("Length = " + length);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(10);

        b1.show();
        b2.show();
    }
}
