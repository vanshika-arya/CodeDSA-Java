import java.util.Scanner;

public class AnaGram {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s1= sc.nextLine();
        String s2=sc.nextLine();
        s1=s1.replaceAll(" ","").toLowerCase();
        s2=s2.replaceAll(" ","").toLowerCase();
        if(s1.length()!=s2.length()){
         System.out.println("not anagram");
         return;
        }
        int count[]= new int[256];
        for(int i=0;i<s1.length();i++){
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for(int i=0;i<256;i++){
            if(count[i]!=0){
            System.out.println("not anagram");
            return;
            }
        }
        System.out.println("anagram");
    }
    
}
