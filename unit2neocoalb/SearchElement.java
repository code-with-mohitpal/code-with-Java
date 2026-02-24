public class SearchElement {
    public static void main(String[] args) {
        int[] arr = {3, 7, 11, 25, 40};
        int key = 11;
        boolean found = false;

        for(int num : arr) {
            if(num == key) {
                found = true;
                break;
            }
        }

        if(found)
            System.out.println("Element found");
        else
            System.out.println("Element not found");
    }
}
