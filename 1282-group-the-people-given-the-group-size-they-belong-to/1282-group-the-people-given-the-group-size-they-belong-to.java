class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer , List<Integer>> mp = new HashMap<>();
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0 ; i < groupSizes.length ; i++) {
            List<Integer> s = new ArrayList<>();
            int x = groupSizes[i];
            if (x == 1) {
                s.add(i);
                res.add(s);
            } else {
                if (mp.containsKey(x)) {
                    s = mp.get(x);
                    if (x - 1 > s.size())
                        s.add(i);
                    else{
                        mp.remove(x);
                        s.add(i);
                        res.add(s);
                    }
                } else {
                    mp.put(x, new ArrayList<>());
                    mp.get(x).add(i);
                }
            }
        }

        return res;
    }
}