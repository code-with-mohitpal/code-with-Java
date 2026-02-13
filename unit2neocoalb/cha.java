public class cha {
	public static void main(String[] args) {
    int sum = 0;
    for (char ch : "12345".toCharArray()) {
        sum += ch - '0';
    }
    System.out.println(sum);
	}
}
