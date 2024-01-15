package palindromechechker;
import java.util.Scanner;

public class PalindromeChechker 
{
    public static void main(String[] args) 
    {
        System.out.println("Palindrome Checker");
        String word;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word or phrase: ");
        word=sc.nextLine();
        String replaceAll = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int n=replaceAll.length();
        boolean isPalindrome=true;
        for(int i=0;i<n/2;i++)
        {
            if(replaceAll.charAt(i)!=replaceAll.charAt(n-i-1)){
                isPalindrome=false;
                break;}
        }
        if(!isPalindrome)
            System.out.println("The word or phrase is not a palindrome ");
        else {
            System.out.println("The word or phrase is a palindrome");
        }
        sc.close();
    }
    
}
