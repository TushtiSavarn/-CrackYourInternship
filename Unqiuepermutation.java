import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Solution {
    public List<List<Integer>> uniquePerms(int n, int[] arr) {
        TreeSet<List<Integer>> result = new TreeSet<>((a, b) -> {
            for (int i = 0; i < a.size(); i++) {
                if (!a.get(i).equals(b.get(i))) {
                    return a.get(i) - b.get(i);
                }
            }
            return 0;
        });
        Arrays.sort(arr); // Sort the array to handle duplicates and ensure order
        backtrack(arr, new boolean[arr.length], new ArrayList<>(), result);
        return new ArrayList<>(result);
    }

    private void backtrack(int[] arr, boolean[] used, List<Integer> current, TreeSet<List<Integer>> result) {
        if (current.size() == arr.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (used[i] || (i > 0 && arr[i] == arr[i - 1] && !used[i - 1])) {
                continue;
            }
            used[i] = true;
            current.add(arr[i]);
            backtrack(arr, used, current, result);
            used[i] = false;
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr1 = {1, 2, 1};
        int[] arr2 = {4, 5};
        System.out.println(sol.uniquePerms(3, arr1));
        System.out.println(sol.uniquePerms(2, arr2));
    }
}
