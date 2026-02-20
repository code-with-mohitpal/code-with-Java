public class Main {
    public static void main(String[] args) {

        // Create StringBuilder
        StringBuilder sb = new StringBuilder("Hello");

        // append()
        sb.append(" World");
        System.out.println("After append: " + sb);

        // insert()
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);

        // replace()
        sb.replace(6, 10, "C++");
        System.out.println("After replace: " + sb);

        // delete()
        sb.delete(5, 9);
        System.out.println("After delete: " + sb);

        // reverse()
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // length()
        System.out.println("Length: " + sb.length());

        // capacity()
        System.out.println("Capacity: " + sb.capacity());

        // charAt()
        System.out.println("Character at index 2: " + sb.charAt(2));

        // setCharAt()
        sb.setCharAt(0, 'h');
        System.out.println("After setCharAt: " + sb);

        // substring()
        String sub = sb.substring(1, 4);
        System.out.println("Substring(1,4): " + sub);

        // setLength()
        sb.setLength(5);
        System.out.println("After setLength(5): " + sb);

        // ensureCapacity()
        sb.ensureCapacity(50);
        System.out.println("Capacity after ensureCapacity(50): " + sb.capacity());

        // trimToSize()
        sb.trimToSize();
        System.out.println("Capacity after trimToSize(): " + sb.capacity());
    }
}