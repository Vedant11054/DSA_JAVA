class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> nintervals = new ArrayList<>();
        boolean inser = false;

        for (int i = 0; i < intervals.length; i++) {
            if (inser == false && (intervals[i][0] >= newInterval[0])) {
                nintervals.add(newInterval);
                inser = true;
            }
            nintervals.add(intervals[i]);
        }
        if (inser == false) {
            nintervals.add(newInterval);
        }
        List<int[]> ans = new ArrayList<>();

        int start1 = nintervals.get(0)[0];
        int end1 = nintervals.get(0)[1];

        for (int i = 1; i < nintervals.size(); i++) {
            int start2 = nintervals.get(i)[0];
            int end2 = nintervals.get(i)[1];

            if (end1 >= start2) {
                end1 = Math.max(end1, end2);
            } else {
                ans.add(new int[] { start1, end1 });
                start1 = start2;
                end1 = end2;
            }
        }

        ans.add(new int[] { start1, end1 });

        return ans.toArray(new int[ans.size()][]);
    }
}