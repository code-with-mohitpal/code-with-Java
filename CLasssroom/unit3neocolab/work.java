class WordEntry {
    String word;

    WordEntry(String word) {
        this.word = word;
    }

    @Override
    public boolean equals(Object obj) {
        WordEntry other = (WordEntry) obj;

        String w1 = this.word.replaceAll("\\s+", "").toLowerCase();
        String w2 = other.word.replaceAll("\\s+", "").toLowerCase();

        return w1.equals(w2);
    }
}
