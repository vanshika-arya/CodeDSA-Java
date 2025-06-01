public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str="abbbccreads";
        System.out.println("Non repeating Characters: ");
       for(int i=0;i<str.length();i++){
        int count=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)&&i!=j)
                count++;
            }
            if(count==0)
            System.out.println(str.charAt(i));
        }
    }
    
}
