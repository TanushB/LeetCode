import java.util.Arrays;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
    public boolean checkInclusion(String s1, String s2) {
        int s1Length = s1.length();
        char s1Array[] = s1.toCharArray();
        Arrays.sort(s1Array);
        s1 = new String(s1Array);
        String toCheck;
        for (int i = 0; i<=s2.length()-s1Length; i++){
            toCheck = s2.substring(i, i+s1Length);
            char[] toCheckArray = toCheck.toCharArray();
            Arrays.sort(toCheckArray);
            toCheck = new String(toCheckArray);
            if (s1.equals(toCheck)) return true;
        }
        return false;
    }
}
