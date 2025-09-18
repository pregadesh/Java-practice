public class volcount{
    public static void main(String[] args){
        String s = "Pregadesh";
        s = s.toLowerCase();
        String vol = "aeiou";
        int vcount = 0;
        int concount = 0;
        for (int i = 0; i < s.length();i++){
            char c = s.charAt(i);
            if (Character.isLetter(c)){
                if (vol.indexOf(c) != -1) vcount ++;
                else concount++;
            }
        }
        System.out.print("vol_count : "+ vcount + "," + "con_count: "+ concount);
    }
}
