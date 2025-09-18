public class Palindrome {
    public static void main(String[] args){
        int num = 121;
        int og = num;
        int rev = 0;
        while (num > 0){
            int formula = num % 10;
            rev = rev  * 10 + formula;
            num /= 10;
        }
        if(og == rev) System.out.print("Is palindrom");
        else System.out.print("Not a palindrom");
    }
}
