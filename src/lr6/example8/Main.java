package lr6.example8;

public class Main {
    public static double getAvg(int[] array) {
        double avg=0;
        for (int i : array) {
            avg+=i;
        }
        avg/=array.length;
        return avg;
    }
}
