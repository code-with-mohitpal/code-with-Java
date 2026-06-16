import java.util.Arrays;
import java.util.List;

class ForEachDemo {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(10, 20, 30, 40);

        nums.forEach(n -> System.out.println(n));
    }
}
