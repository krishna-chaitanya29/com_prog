import java.util.*;

public class LetterCombinations {
    // Mapping of digits to corresponding letters
    private static final String[] KEYPAD = {
        "",     "",    "abc", "def",  // 0, 1, 2, 3
        "ghi", "jkl", "mno",         // 4, 5, 6
        "pqrs", "tuv", "wxyz"        // 7, 8, 9
    };

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) return result; // Edge case
        
        backtrack(result, new StringBuilder(), digits, 0);
        return result;
    }

    private void backtrack(List<String> result, StringBuilder current, String digits, int index) {
        if (index == digits.length()) {  // Base case: if we have formed a valid combination
            result.add(current.toString());
            return;
        }

        String letters = KEYPAD[digits.charAt(index) - '0']; // Get letters for current digit
        for (char c : letters.toCharArray()) { // Loop through all possible letters
            current.append(c); // Choose a letter
            backtrack(result, current, digits, index + 1); // Move to the next digit
            current.deleteCharAt(current.length() - 1); // Undo the choice (Backtrack)
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LetterCombinations solution = new LetterCombinations();
        String s = sc.nextLine();
        System.out.println(solution.letterCombinations(s)); // Expected Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]
    }
}
