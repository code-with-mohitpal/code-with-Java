public class Main {
	public static void main(String[] args) {
		for (char ch : "12345".toCharArray()) {
            if (ch == '3') {
                continue;
            }
            System.out.print(ch + " ");
        }
	}
}