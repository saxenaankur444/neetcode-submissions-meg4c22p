class Trie {
    Trie[] children = new Trie[26];
    boolean endOfWord = false;
}

class PrefixTree {
    Trie root;

    public PrefixTree() {
        root = new Trie();
    }

    public void insert(String word) {
        Trie cur = root;
        for (char c : word.toCharArray()) {
            int i = c - 'a';
            if (cur.children[i] == null)
                cur.children[i] = new Trie();
            cur = cur.children[i];
        }
        cur.endOfWord = true;
    }

    public boolean search(String word) {
        Trie cur = root;
        for (char c : word.toCharArray()) {
            int i = c - 'a';
            if (cur.children[i] == null)
                return false;
            cur = cur.children[i];
        }
        return cur.endOfWord;
    }

    public boolean startsWith(String prefix) {
        Trie cur = root;
        for (char c : prefix.toCharArray()) {
            int i = c - 'a';
            if (cur.children[i] == null)
                return false;
            cur = cur.children[i];
        }
        return true;
    }
}