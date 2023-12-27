public class TrafficArray {
    public static int traffic(int n, int m, int[] vehicle) {

        int i = 0;

        int j = 0;
        // 6 3
        // 0 1 0 0 1 0
        // 3 1
        // 0 1 1

        // 25 17
        // 1 0 1 1 1 1 1 0 1 0 1 1 1 0 0 1 0 0 1 0 0 0 1 1 0

        while (i < n) {

            if (vehicle[i] == 0) {

                m--;

            }
            if (m <= -1) {

                if (vehicle[j] == 0) {

                    m++;

                }
                j++;

            }
            i++;

        }
        return i - j;

    }

}
