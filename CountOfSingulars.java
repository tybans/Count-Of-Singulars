import java.util.HashMap;
import java.util.Map;

public class CountOfSingulars {
    public static void main(String[] args) {
        int[] arrNum = {10, 20, 20, 10, 10, 30, 50, 10, 20};

        Map<Integer, Integer> countMap = new HashMap<>();

        // Counting the occurrences of each sock ID
        for (int sockId : arrNum) {
            countMap.put(sockId, countMap.getOrDefault(sockId, 0) + 1);
        }

        // Counting the number of singular socks
        int singularCount = 0;
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int totalCount = entry.getValue();
            int pairs = totalCount / 2;
            int singulars = totalCount % 2;
            
            singularCount += singulars;
        }

        // Displaying the count of singular socks
        System.out.println("Count of singular socks = " + singularCount);
    }
}
