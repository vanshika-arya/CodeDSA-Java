public class CountVowels {
    public static void main(String[] args) {
        String str="aeevievdrfs";
        int vowel=0,consonant=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'|| str.charAt(i)=='o'||str.charAt(i)=='i'||str.charAt(i)=='e'||str.charAt(i)=='u')
            vowel++;
            else
            consonant++;
        }
        System.out.println("Vowel: "+vowel);
        System.out.println("Consonant: "+consonant);
    }
    
}
