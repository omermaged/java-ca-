import java.util.HashMap;
import java.util.Map;

class RomanToInteger {
    public int romanToInt(String s) {
        Map<Integer, Integer> m = new HashMap<>();
        // سنستخدم الأرقام بدلاً من الـ Characters لتجنب مشاكل التوافق، أو كالتالي:
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1); map.put('V', 5); map.put('X', 10);
        map.put('L', 50); map.put('C', 100); map.put('D', 500); map.put('M', 1000);

        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                ans -= map.get(s.charAt(i));
            } else {
                ans += map.get(s.charAt(i));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        RomanToInteger sol = new RomanToInteger();
        System.out.println("Roman III to Int: " + sol.romanToInt("III"));     // 3
    }
}