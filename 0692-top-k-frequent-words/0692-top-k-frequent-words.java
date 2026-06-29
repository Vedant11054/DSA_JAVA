class Solution {
    public List<String> topKFrequent(String[] words, int k) {

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        PriorityQueue<String> heap = new PriorityQueue<>(
            (a, b) -> {
                if (!map.get(a).equals(map.get(b))) {
                    return map.get(a) - map.get(b); 
                }
                return b.compareTo(a); 
            }
        );

        for (String word : map.keySet()) {
            heap.offer(word);

            if (heap.size() > k) {
                heap.poll();
            }
        }

        List<String> ans = new ArrayList<>();

        while (!heap.isEmpty()) {
            ans.add(heap.poll());
        }

        Collections.reverse(ans);

        return ans;
    }
}