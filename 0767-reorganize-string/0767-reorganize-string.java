class Solution {
    public String reorganizeString(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        class Pair {
            char ch;
            int freq;

            Pair(char c, int f) {
                ch = c;
                freq = f;
            }
        }

        PriorityQueue<Pair> heap = new PriorityQueue<>(
            (a, b) -> b.freq - a.freq
        );

        for (char ch : map.keySet()) {
            heap.add(new Pair(ch, map.get(ch)));
        }

        StringBuilder ans = new StringBuilder();

        Pair prev = null;

        while (!heap.isEmpty()) {

            Pair curr = heap.poll();

            ans.append(curr.ch);
            curr.freq--;

            if (prev != null && prev.freq > 0) {
                heap.add(prev);
            }

            prev = curr;
        }

        if (ans.length() != s.length()) {
            return "";
        }

        return ans.toString();
    }
}