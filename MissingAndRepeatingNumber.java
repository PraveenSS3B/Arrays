public class MissingAndRepeatingNumber {
    public static int[] findMissingRepeatingNumbers(int[] a) {

        int n = a.length;

        long sumOfN = n * (n + 1) / 2;

        long sumOfSqs = n * (n + 1) * (2 * n + 1) / 6;

        long sum = 0;
        long sqs = 0;

        for (int i = 0; i < n; i++) {
            sum += a[i];
            sqs += (long) (a[i] * a[i]);
        }

        int subtractSqs = (int) (sumOfSqs - sqs);

        int subtractSum = (int) (sumOfN - sum);

        int tmp = subtractSqs / subtractSum;

        int ans = (tmp + subtractSum) / 2;

        return new int[] { ans - subtractSum, ans };

    }
}
