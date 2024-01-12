package lr6.example4;

public class Main {
    public static int getDoubleFactorial(int n) {
        int factorial=n;
        for (int i=1; i<n-1; ++i){
            i++;
            factorial*=(n-i);
        }
        return factorial;
    }
}
