class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> pt = new ArrayList<>(numRows);

        for(int i = 0; i < numRows; i++){
            List<Integer> cols = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                cols.add(1);
            }

            for(int k = 1; k < i; k++)
            {
                cols.set(k, pt.get(i - 1).get(k - 1) + pt.get(i - 1).get(k));
            }
            pt.add(cols);
        }
        return pt; 
        
    }
}
