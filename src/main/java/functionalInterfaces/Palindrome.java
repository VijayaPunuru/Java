package functionalInterfaces;

public class Palindrome {
    public static int checkpalindrome(int num){
        int rev=0;
        int rem=0;
        while(num!=0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println(rev);
        return rev;
    }

}
