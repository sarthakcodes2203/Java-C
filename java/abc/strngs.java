import java.util.*;
class strngs
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        String s1="India";
        System.out.println(s1.toUpperCase());
        String s2="INDIA";
        System.out.println(s2.toLowerCase());
        char p1= 'A';
        System.out.println(Character.isUpperCase(p1));
        char p2= 'A';
        System.out.println(Character.isLowerCase(p2));
        char p3='A';
        System.out.println(Character.isLetter(p3));
        char p4='A';
        System.out.println(Character.isDigit(p4));
        char p5='A';
        System.out.println(Character.isLetterOrDigit(p5));
        String s3="INDIA";
        System.out.println(s3.charAt(2));
        String s4="INDIA";
        System.out.println(s4.length());
        String s5="DURGAPUR";
        System.out.println(s5.indexOf('U'));
        String s6="DURGAPUR";
        System.out.println(s6.lastIndexOf('U'));
        String s7="  INDIA ";
        System.out.println(s7.trim());
        String s8="INDIA", s9="India";
        System.out.println(s8.equals(s9));
        String s10="INDIA", s11="India";
        System.out.println(s10.equalsIgnoreCase(s11));
        String s12="INDIA", s13="India";
        System.out.println(s12.compareTo(s13));
        Integer x=5;
        System.out.println(x.toString());
        System.out.println(Integer.toString(x));
        int y=30;
        System.out.println(String.valueOf(y));
        String s14="INDIA";
        char a[]=s14.toCharArray();
        for(int i=0;i<s14.length();i++)
        System.out.println(a[i]+" ");
        String s15="DURGAPUR";
        System.out.println(s15.substring(2,5));
        System.out.println(s15.substring(5));
        
    }
}