class StockSpanner {
    static Stack<Integer[]> st;
    static int count = 0;

    public StockSpanner() {
        st = new Stack<>();
    }

    public int next(int price) {
        int span = 1;
        while (!st.isEmpty()) {
            if (st.peek()[0] <= price) {
                span += st.pop()[1];
            } else
                break;
        }
        st.push(new Integer[] {price, span});
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */