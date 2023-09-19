
import database.NotesDatabase;
import notes.core.application.ConcreteNoteEditor;
import notes.core.domain.Note;
import notes.infrastructure.persistance.NotesDbContext;
import notes.presentation.queries.controllers.NotesController;
import notes.presentation.queries.views.NotesConsolePresenter;
public class Program {

    public static void main(String[] args) {
        NotesController controller = new NotesController(
                new ConcreteNoteEditor(new NotesDbContext(new NotesDatabase()), new NotesConsolePresenter()));
        
        controller.routeGetAll();
        
        controller.routeAddNote(new Note(1100, 0, "new item", "details new item", null));
        controller.routeGetAll();

        // controller.routeRemoveNote( controller.routeGetNote(0));
        // controller.routeGetAll();

    }

}
