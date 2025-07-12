package Strings;

public class Skipchar {
    public static void main(String[] args) {
        Skip("","absscfa");
        Skipapple("","ahihhapplehd");
        SkipString("","varshithgoud","varshith");
    }
    static void Skip(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            Skip(p, up.substring(1));
        } else {
            Skip(p + ch, up.substring(1));
        }
    }
    static void Skipapple(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        if (up.startsWith("apple") ) {
            Skipapple(p, up.substring(5));
        } else {
            Skipapple(p + up.charAt(0), up.substring(1));
        }
    }

    static void SkipString(String p, String up,String np) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        if (up.startsWith(np) ) {
            SkipString(p, up.substring(np.length()),np);
        } else {
            SkipString(p + up.charAt(0), up.substring(1),np);
        }
    }
}
