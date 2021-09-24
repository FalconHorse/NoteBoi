package NoteBoi;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

@WebService(name="NoteBoi.INoteBoi",
        targetNamespace = "http://NoteBoi.ws/")
public interface INoteBoi {
    @WebMethod(operationName = "GetAllNotes")
    public List<Note> getAllNotes();

    @WebMethod(operationName="GetNoteById")
    public Note getNoteById(@WebParam(name="NoteId") int id);

    @WebMethod(operationName="AddNote")
    public Boolean addNote(@WebParam(name="NoteId") int id,
                           @WebParam(name="title") String title,
                           @WebParam(name="Author") String author,
                           @WebParam(name="NoteBoi.Note") String note);

    @WebMethod(operationName="DeleteNoteById")
    public void deleteNoteById(@WebParam(name="NoteId") int id);

    @WebMethod(operationName="UpdateNoteById")
    public void upDateNoteById(@WebParam(name="NoteId") int id,
                               @WebParam(name="title") String title,
                               @WebParam(name="Author") String author,
                               @WebParam(name="NoteBoi.Note") String note);
}
