package warmup;

import java.util.Scanner;

public class TimeConversion {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hour = Integer.valueOf(s.next());
        int minutes = s.nextInt();
        String seconds = s.next();
        int sec = Integer.valueOf(seconds.substring(0, 2));
        String m = seconds.substring(2);
        StringBuilder sb = new StringBuilder();
        if("PM".equalsIgnoreCase(m)) {
            hour += 12;
        }
        sb.append(hour);
        sb.append(":");
        sb.append(minutes);
        sb.append(":");
        sb.append(sec);
        System.out.println(sb.toString());
    }
}
