public class toggleCase {
    public static void main(String[] args) {
        String str="vanSGIJeFGwer";
       String result="";
        for(int i=0;i<str.length();i++){
           char ch=str.charAt(i);
           if(ch>='a'&& ch<='z')
           ch=(char)(ch-32);
           else
           ch=(char)(ch+32);
          result+=ch;
        }
        System.out.println(result);
    }
    
}
