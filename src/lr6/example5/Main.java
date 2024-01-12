package lr6.example5;

public class Main {
    public static int getSumOfSqrs(int n) {
        int sum=0;
        for(int i=1; i<=n; i++){
            sum+=Math.pow(i, 2);
        }
        return sum;
    }
}
