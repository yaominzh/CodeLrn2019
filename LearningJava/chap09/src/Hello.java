import java.util.*;

public class Hello {
    public static void main(String[] args) {
        ResourceBundle bun;
//        bun = ResourceBundle.getBundle("Message", Locale.ITALY);
//        System.out.println(bun.getString("HelloMessage"));
        bun = ResourceBundle.getBundle("Message", Locale.CHINA);
        System.out.println(bun.getString("HelloMessage"));
    }
}