package lr6.example7;

public class Main {
    public static int[] getCodes(char[] symbols) {
        int[] codes=new int[symbols.length];
        int i = 0;
        for (char j : symbols) {
            codes[i]=(int) j;
            i++;
        }
        return codes;
    }
}
