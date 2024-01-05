class MergingIntervals {
    public int[][] merge(int[][] arr) {

        if(arr.length == 1)
        {
            return arr;
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[0], b[0]);
            }
        });

        int n = arr.length;
        List<int[]> ansList = new ArrayList<>();

        for(int i = 0; i < n; i++)
        {
            int first = arr[i][0];
            int second = arr[i][1];

            if(!ansList.isEmpty() && second <= ansList.get(ansList.size() - 1)[1]){
                continue;
            }

            for (int j = i + 1; j < n; j++) {
                if (arr[j][0] <= second) {
                    second = Math.max(second, arr[j][1]);
                } else {
                    break;
                }
            }

            ansList.add(new int[]{first, second});
        }

        int[][] ansArray = new int[ansList.size()][2];
        for (int i = 0; i < ansList.size(); i++) {
            ansArray[i] = ansList.get(i);
        }

        return ansArray;
    }
}
