import java.util.ArrayList;

class NoteService {

    private ArrayList<Note> notes = new ArrayList<>();
    private int idCounter = 1;

    public void addNote(String content) {
        notes.add(new Note(idCounter++, content));
        System.out.println("Note Added");
    }

    public void viewNotes() {
        if (notes.isEmpty()) {
            System.out.println("No notes available");
            return;
        }

        for (Note n : notes) {
            System.out.println(n);
        }
    }

    public void updateNote(int id, String newContent) {
        for (Note n : notes) {
            if (n.id == id) {
                n.content = newContent;
                System.out.println("Note Updated");
                return;
            }
        }
        System.out.println("Note not found");
    }

    public void deleteNote(int id) {
        notes.removeIf(n -> n.id == id);
        System.out.println("Note Deleted");
    }
}
