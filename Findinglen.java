public class Findinglen{
    public static void main(String[] args){
        String s = "pregadesh";
        int count =0;
        for (char n : s.toCharArray()){
            count++;
        }
        System.out.println("length of the string :" + count);
    }
}
