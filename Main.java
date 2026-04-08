public class Main {
    public static void main(String[] args) {

        NoteService service = new NoteService();

        service.addNote("First Note");
        service.addNote("Second Note");

        service.viewNotes();

        service.updateNote(1, "Updated Note");

        service.viewNotes();

        service.deleteNote(2);

        service.viewNotes();
    }
}