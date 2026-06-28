class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        class Pair {
            int first;   // frequency
            int second;  // number

            Pair(int f, int s) {
                first = f;
                second = s;
            }
        }

        PriorityQueue<Pair> heap = new PriorityQueue<>(
            (a, b) -> Integer.compare(a.first, b.first)
        );

        for (int key : map.keySet()) {
            heap.offer(new Pair(map.get(key), key));

            if (heap.size() > k) {
                heap.poll();
            }
        }

        int[] ans = new int[k];

        for (int i = k - 1; i >= 0; i--) {
            ans[i] = heap.poll().second;
        }

        return ans;
    }
}