class Solution {
    private static String encode(List<String> strs) {
        StringBuilder enc = new StringBuilder();
        for (String s : strs) {
            enc.append(s.length()).append(",");
        }
        enc.append("#");
        for (String s : strs) {
            enc.append(s);
        }
        return enc.toString();
    }

    private static List<String> decode(String str) {
        if (str.length() == 0)
            return new ArrayList<>();
        List<String> res = new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();
        int i = 0;
        while (str.charAt(i) != '#') {
            StringBuilder cur = new StringBuilder();
            while (str.charAt(i) != ',') {
                cur.append(str.charAt(i) + "");
                i++;
            }
            sizes.add(Integer.parseInt(cur.toString()));
            i++;
        }
        i++;
        for (int s : sizes) {
            res.add(str.substring(i, i + s));
            i += s;
        }
        return res;
    }
}
