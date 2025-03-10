public class PalindromeChecker {
    // Field
    String text;

    // Constructor to initialize text
    PalindromeChecker(String text){
        this.text = text;
    }

    // Method to check if text is palindrome
    public boolean isPalindrome(){
        String revText = "";
        for (int i = this.text.length() - 1 ; i >= 0; i--){
            revText += this.text.charAt(i);
        }
        return  this.text.equals(revText);
    }

    // Method to display the result of isPalindrome method
    public void displayIsPalindrome(){
        if(isPalindrome()) System.out.println("Text is palindrome");
        else System.out.println("Text is not palindrome");
    }
}
/*
PalindromeChecker palindromeChecker = new PalindromeChecker("abcdcba");
palindromeChecker.displayIsPalindrome();

Text is palindrome
*/
