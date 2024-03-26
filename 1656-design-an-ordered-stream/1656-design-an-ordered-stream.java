class OrderedStream {
    String[] stream;
    int id;
    public OrderedStream(int n) {
        stream = new String[n];
        id = 0;
    }
    
    public List<String> insert(int idKey, String value) {
        stream[idKey - 1] = value;
        List<String> result = new ArrayList<>();
        for(int i = id;i<stream.length;i++){
            if(stream[i] == null) break;
            result.add(stream[i]);
            id++;
        }
        return result;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */