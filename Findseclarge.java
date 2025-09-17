public class Findseclarge{
    public static void main(String[] args){
        int[] arr = {10,9,8,7};
        int first = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;
        for(int num : arr){
            if (num > first){
                sec = first;
                first = num;
            }
            else if(num > sec && num != first){
                sec = num;
            }
        }
        System.out.print(sec);
    }
}
