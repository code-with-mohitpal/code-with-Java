import java.util.*;

class AnagramGrouper {

    public static List<List<String>> groupAnagrams(String[] words) {

        HashMap<String, List<String>> map = new HashMap<>();

        // Group words by sorted characters
        for (String word : words) {

            char[] chars = word.toCharArray();
            Arrays.sort(chars);

            String key = new String(chars);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(word);
        }

        List<List<String>> result = new ArrayList<>();

        // Sort words inside each group
        for (List<String> group : map.values()) {
            Collections.sort(group);
            result.add(group);
        }

        // Sort groups based on first word
        Collections.sort(result, (a, b) -> a.get(0).compareTo(b.get(0)));

        return result;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String[] words = new String[N];

        for (int i = 0; i < N; i++) {
            words[i] = scanner.next();
        }

        List<List<String>> result = AnagramGrouper.groupAnagrams(words);

        for (List<String> group : result) {

            for (int i = 0; i < group.size(); i++) {

                if (i > 0) {
                    System.out.print(" ");
                }

                System.out.print(group.get(i));
            }

            System.out.println();
        }

        scanner.close();
    }
}
