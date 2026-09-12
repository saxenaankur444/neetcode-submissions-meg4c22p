class StockSpanner {
	List<Integer> arr;
	Stack<Integer[]> st = new Stack<>();

    public StockSpanner() {
		arr = new ArrayList<>();
    }
    
    public int next(int p) {
        int span = 1;
        while (!st.isEmpty() && st.peek()[0] <= p) {
            span += st.pop()[1];
        }
        st.push(new Integer[] {p, span});
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */