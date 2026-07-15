class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        Integer[] idx = new Integer[n];
        for (int i = 0; i < n; i++) idx[i] = i;

        // Sort indices by position descending (closest to target first)
        Arrays.sort(idx, (a, b) -> position[b] - position[a]);

        Deque<Double> stack = new ArrayDeque<>();

        for (int i : idx) {
            double time = (double) (target - position[i]) / speed[i];

            if (stack.isEmpty() || time > stack.peek()) {
                stack.push(time);
            }
            // else: catches up to fleet ahead, merges (no push)
        }

        return stack.size();
    }
}
