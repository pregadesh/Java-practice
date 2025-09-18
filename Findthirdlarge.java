public class Findthirdlarge{
    public static void main(String[] args){
        int[] arr = {10,9,8,7};
        int first = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for(int num : arr){
            if (num > first){
                third = sec;
                sec = first;
                first = num;
            }
            else if(num > sec && num != first){
                third = sec;
                sec = num;
            }
            else if (num > third && num != sec){
                third = num;
            }
        }
        System.out.print(third);
    }
}
