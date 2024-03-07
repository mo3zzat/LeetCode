class RandomizedSet {

    private Set<Integer> internalSet;
    Random rand = new Random();

    public RandomizedSet() {
        this.internalSet  = new HashSet<Integer>();
    }
    
    public boolean insert(int val) {
        return internalSet.add(val);
    }
    
    public boolean remove(int val) {
        return internalSet.remove(val);
    }
    
    public int getRandom() {
        int n = rand.nextInt(this.internalSet.size());
        return (int) this.internalSet.toArray()[n];
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */