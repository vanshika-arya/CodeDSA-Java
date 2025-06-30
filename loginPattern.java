import java.util.*;
public class loginPattern {
    

    public static boolean hasSuspiciousLogins(String[] logins) {
        int[] minutes = new int[logins.length];
        for (int i = 0; i < logins.length; i++) {
            String[] parts = logins[i].split(":");
            minutes[i] = Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
        }

        Arrays.sort(minutes);

        for (int i = 0; i <= minutes.length - 3; i++) {
            if (minutes[i + 2] - minutes[i] <= 60)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String[] logins = {"09:10", "09:50", "10:00", "11:30", "12:00"};
        System.out.println("Suspicious activity: " + hasSuspiciousLogins(logins));
    }
}
