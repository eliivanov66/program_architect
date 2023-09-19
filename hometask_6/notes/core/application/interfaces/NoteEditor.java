package notes.core.application.interfaces;

import java.util.Collection;
import java.util.Optional;

import notes.core.domain.Note;

public interface NoteEditor extends Editor<Note, Integer> {
    void printAll();

    boolean add(Note item);

    boolean edit(Note item);

    boolean remove(Note item);

    Optional<Note> getById(Integer id);

    Collection<Note> getAll();

    
}
