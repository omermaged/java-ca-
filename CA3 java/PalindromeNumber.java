class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int original = x;
        int reverse = 0;
        while (x > 0) {
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x = x / 10;
        }
        return original == reverse;
    }

    public static void main(String[] args) {
        PalindromeNumber sol = new PalindromeNumber();
        System.out.println("Is 121 palindrome? " + sol.isPalindrome(121));   // true
        System.out.println("Is -121 palindrome? " + sol.isPalindrome(-121)); // false
    }
}