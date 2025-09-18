public class largandsmall{
    public static void main(String[] args){
        int[] arr = {10,9,8,7};
        int largest = arr[0];
        int smallest = arr[0];
        for(int num : arr){
            if (num < smallest) smallest = num;
            if (num > largest) largest = num;
        }
        System.out.print("Smallest : "+ smallest + " largest :" + largest);
    }
}
