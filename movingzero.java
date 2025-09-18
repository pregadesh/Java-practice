import java.util.Arrays;
public class movingzero{
    public static void main(String[] args){
        int [] arr = {1,0,1,0};
        int idx = 0;
        for (int num : arr){
            if (num != 0){
                arr[idx++]= num;
            }
        }
        while (idx < arr.length){
            arr[idx++]=0;
        }
        System.out.print(Arrays.toString(arr));
    }
}
