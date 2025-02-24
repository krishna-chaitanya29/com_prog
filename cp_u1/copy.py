import pyautogui
import time
code_to_type = '''
import java.util.*;

public class ValidAbbreviation {
    public static boolean isValidAbbreviation(String s, String abbr) {
        int i = 0, j = 0;
        
        while (i < s.length() && j < abbr.length()) {
            if (Character.isLetter(abbr.charAt(j))) { 
                // Direct character match
                if (s.charAt(i) != abbr.charAt(j)) return false;
                i++;
                j++;
            } else { 
                // Number handling
                if (abbr.charAt(j) == '0') return false; // No leading zeros allowed
                
                int num = 0;
                while (j < abbr.length() && Character.isDigit(abbr.charAt(j))) {
                    num = num * 10 + (abbr.charAt(j) - '0');
                    j++;
                }
                i += num; // Skip these many characters in `s`
            }
        }
        
        return i == s.length() && j == abbr.length(); // Both should reach the end together
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String abbr = sc.next();
        System.out.println(isValidAbbreviation(s, abbr));
    }
}


'''
# Time in seconds before auto typing starts (make sure that your text cursor is placed in the text box where you want to auto type the code)
wait_time = 5
time.sleep(wait_time)
# Time interval between entering characters
time_interval = 0.00000000000000000000000000001
def avoid_auto_complete():
   '''Hotkey to avoid auto completion and indentation'''
   pyautogui.hotkey('esc', 'space', 'backspace', 'enter', 'space', 'ctrl', 'left')
lines = list(code_to_type.split('\n'))
for line in lines:
    if line != '':
        pyautogui.typewrite(line, interval=time_interval)
        avoid_auto_complete()
    else:
        pyautogui.press('enter')