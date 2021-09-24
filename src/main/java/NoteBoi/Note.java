package NoteBoi;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class Note implements Serializable {
    private static final long serialVersionUID = 1L;

    public int id;
    public String title;
    public String author;
    public String note;
    public Date date;

    public Note() {

    }

    public Note(int id, String title, String author, String note) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.note = note;
        date = Calendar.getInstance().getTime();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "NoteBoi.Note [id=" + id + ", title=" + title + ", author=" + author + ", created=" + date + ", note=" + note
                + "]";
    }

}
