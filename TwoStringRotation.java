public class TwoStringRotation {
    public static void main(String[] args) {
          String s1 = "ABCD";
        String s2 = "bcad";

        if (s1.length() != s2.length()) {
            System.out.println("Not Rotation");
        } else {
            String s3 = s1 + s1;

            if (s3.contains(s2)) {
                System.out.println("Rotation");
            } else {
                System.out.println("Not Rotation");
            }
        }
    }
    
}
