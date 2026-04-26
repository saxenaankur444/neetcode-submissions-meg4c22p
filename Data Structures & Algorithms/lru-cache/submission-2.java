class LRUCache {
public ArrayList<int[]> cache = new ArrayList<>();
	public int capacity;
    public LRUCache(int cap) {
		cache = new ArrayList<>();
		capacity = cap;
    }
    
    public int get(int key) {        
		for (int i = 0; i < cache.size(); i++) {
			if (cache.get(i)[0] == key) {
				int[] temp = cache.get(i);
				cache.remove(i);
				cache.add(temp);
				return temp[1];
			}
		}
		return -1;	
    }
    
    public void put(int key, int value) {        
		for (int i = 0; i < cache.size(); i++) {
			if (cache.get(i)[0] == key) {
				int[] temp = cache.get(i);
				cache.remove(i);
				cache.add(temp);temp[1] = value;
				return;
			}
		}
		if (cache.size() >= capacity) {
			cache.remove(0);
		}
		cache.add(new int[] { key, value });	
    }
}
