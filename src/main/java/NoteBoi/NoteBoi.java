package NoteBoi;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@WebService(
        endpointInterface = "NoteBoi.INoteBoi",
        portName = "NoteBoiPort")
public class NoteBoi implements INoteBoi{

    private List<Note> allNotes;

    public NoteBoi(){
        allNotes = new ArrayList<Note>();
        allNotes.add(new Note(1,"Första Noteringen", "PetterFörsta", "Köp mjölk"));
    }

    @Override
    public List<Note> getAllNotes() {
        System.out.println("Get all notes");
        return allNotes;
    }

    @Override
    public Note getNoteById(int id) {
        System.out.printf("Get Note By Id: %s", id);
        for(Note n: allNotes) {
            if(n.getId() == id) {
                return n;
            }
        }
        return null;
    }

    @Override
    public Boolean addNote(int id, String title, String author, String note) {
        System.out.println("Add Note");
        for(Note n: allNotes) {
            if(n.id == id) {
                throw new IllegalArgumentException("ID already exists");
            }
        }

        return allNotes.add(new Note(id,title,author,note));
    }

    @Override
    public void deleteNoteById(int id) {
        for(int i = 0; i<allNotes.size(); i++) {
            if(allNotes.get(i).id == id) {
                allNotes.remove(i);			}
        }
    }

    @Override
    public void upDateNoteById(int id, String title, String author, String note) {

        for(Note n : allNotes) {
            if(n.id == id) {
                throw new IllegalArgumentException("ID already exists");
            }
        }

        for(int i = 0; i<allNotes.size()-1; i++) {
            if(allNotes.get(i).id == id) {
                allNotes.get(i).author = author;
                allNotes.get(i).title = title;
                allNotes.get(i).id = id;
                allNotes.get(i).date = Calendar.getInstance().getTime();
            }
        }
    }
}
