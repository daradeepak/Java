package javaprograms;

public class Palindrome {

    public static void main(String[] args)
    {
        int num = 101, rem=0, rev=0; 
        int temp = num; 
        
        while (num>0) 
        {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        System.out.println(rev);

        if (temp == rev)
        {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
