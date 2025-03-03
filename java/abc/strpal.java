import java.util.*;
class strpal
{
    public static void main (String args[])
    {
        String s1,s2="";
        int i;
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word");
        s1=sc.next();
        for(i=s1.length()-1;i>=0;i--)
        {
            ch=s1.charAt(i);
            s2=s2+ch;
            
        }
        if(s1.compareTo(s2)==0)
        System.out.println("It is a Palindrome word");
        else
        System.out.println("It is not a Palindrome word");
    }
}