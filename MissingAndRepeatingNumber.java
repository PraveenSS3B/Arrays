public class MissingAndRepeatingNumber {
    public static int[] findMissingRepeatingNumbers(int[] a) {

        int n = a.length;
        boolean visited[] = new boolean[n+1];

        int repeated = 0;

        for (int i = 1; i <= n; i++) {
            if (visited[a[i - 1]]) {
                repeated = a[i - 1];
            }

            else {
                visited[a[i - 1]] = true;
            }
        }

        for(int i = 1;i <= n; i++)
        {
            if(!visited[i])
            {
                return new int[]{repeated, i};
            }
        }

        return new int[]{};

    }
}
