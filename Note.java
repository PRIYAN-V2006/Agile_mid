class Note {
    int id;
    String content;

    public Note(int id, String content) {
        this.id = id;
        this.content = content;
    }

    public String toString() {
        return "ID: " + id + " | Note: " + content;
    }
}
