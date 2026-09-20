class PrefixTree {
    public Trie root;

    public PrefixTree() {
        root = new Trie();
    }

    public void insert(String word) {
        Trie curr = root;
        for (char c : word.toCharArray()) {
            int i = c - 'a';
            if (curr.children[i] == null)
                curr.children[i] = new Trie();
            curr = curr.children[i];
        }
        curr.endOfWord = true;
    }

    public boolean search(String word) {
        Trie curr = root;
        for (char c : word.toCharArray()) {
            int i = c - 'a';
            if (curr.children[i] == null)
                return false;
            curr = curr.children[i];
        }
        return curr.endOfWord;
    }

    public boolean startsWith(String prefix) {
        Trie curr = root;
        for (char c : prefix.toCharArray()) {
            int i = c - 'a';
            if (curr.children[i] == null)
                return false;
            curr = curr.children[i];
        }
        return true;
    }
}

class Trie {
    Trie[] children = new Trie[26];
    boolean endOfWord = false;
}