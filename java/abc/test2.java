import java.util.*;
class test2
{
    public static void main(String args[])
    {
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age:");
        age=sc.nextInt();
        try
        {
            if(age<18)
            throw new Exception();
            else
            System.out.println("You can vote");
        }
        catch(Exception e)
        {
            System.out.println("You cannot Vote");
            System.out.println(e);
        }
    }
}