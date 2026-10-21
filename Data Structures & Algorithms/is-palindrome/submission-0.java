class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        s = s.toLowerCase();
        while (left < right) {
            if (s.charAt(right) == s.charAt(left)) {
                left++;
                right--;
            } else if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            } else if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            } else {
                return false;
            }
        }
        return true;
    }
}
