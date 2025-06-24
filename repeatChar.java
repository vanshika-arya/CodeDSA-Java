public class repeatChar {
    public static void main(String[] args) {
        String s="vanshika";
    char target='a';
        int total=0;
        for(int i=0;i<s.length();i++){
            int count =0;
            if(s.charAt(i)==target){
                total++;
            }
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            System.out.println(s.charAt(i)+ "=" + count);

            }
            System.out.println("target is " + " "+ total + " times in string");
        }
    
}
