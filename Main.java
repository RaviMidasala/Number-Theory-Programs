import java.util.Scanner;
import java.util.*;

class NumberTheory{
    public static boolean anagram(String s1,String s2){
        if(s1.length()!=s2.length()) return false;
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        
        return Arrays.equals(c1, c2);
    }
    
    public static int countDigits(int num){
        
        int digits=0;
        while(num>0){
            digits++;
            num/=10;
        }
        return digits;
    }
    public static int reverseNumber(int num){ 
        int reverse=0;
        while(num>0){
            reverse=reverse*10+num%10;
            num/=10;
        }
        return reverse;
    }
    public static boolean palindrome(int num){
        int original=num;
        int reverse=0;
        while(num>0){ 
            reverse=reverse*10+num%10;
            num/=10;
        }
        return original==reverse;
    }
    public static boolean amstrongNumber(int num){
        int original=num;
        int digits=String.valueOf(num).length();
        int sum=0;
        while(num>0){ 
            int digit=num%10;
            sum+=(int)Math.pow(digit, digits);
            num/=10;
        }
        return original==sum;
    }

    public static boolean isPrime(int num){
        if(num<=1)return false;
        for(int i=2;i*i<=num;i++){
            if(num%i==0) return false;
        }
        return true;
    }

}
class Main{
     
    public static void main(String[] a){
        // Scanner sc=new Scanner(System.in);
        // int num=sc.nextInt();
        // System.out.println(NumberTheory.countDigits(num));
        // System.out.println(NumberTheory.reverseNumber(num));
        System.out.println(NumberTheory.palindrome(131));
        System.out.println(NumberTheory.amstrongNumber(153));
        System.out.println(NumberTheory.isPrime(153));
        
    }
}