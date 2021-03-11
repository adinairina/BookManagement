package model;

/**
 * One window for CRUD operations on Author (firstname, lastname): allows the viewing of all the authors;
 * adding a new author; deleting an existing author and updating an existing author
 * One window for CRUD operations on Book (title, description, author): allows the viewing of all the books;
 * adding a new book - and assigning one of the existing authors; deleting an existing book and updating an
 * existing book
 * One window for Reviews (book, score, comment): allows the viewing of all the reviews; adding a new review
 * for one of the existing books
 * <p>
 * O fereastră pentru operațiile CRUD pe autor (prenume, nume): permite vizualizarea tuturor autorilor;
 * adăugarea unui nou autor; ștergerea unui autor existent și actualizarea unui autor existent
 * O fereastră pentru operațiile CRUD pe carte (titlu, descriere, autor): permite vizualizarea tuturor cărților;
 * adăugarea unei cărți noi - și atribuirea unuia dintre autorii existenți; ștergerea unei cărți existente și
 * actualizarea unei cărți existente
 * O fereastră pentru Recenzii (carte, scor, comentariu): permite vizualizarea tuturor recenziilor; adăugând o
 * nouă recenzie pentru una dintre cărțile existente
 */

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long authorId;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @ManyToMany(mappedBy = "authors", cascade = CascadeType.ALL)
    private List<Book> books;

    public Author() {
    }

    public Author(String firstName, String lastNAme) {
        this.firstName = firstName;
        this.lastName = lastNAme;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        authorId = authorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastNAme() {
        return lastName;
    }

    public void setLastNAme(String lastNAme) {
        this.lastName = lastNAme;
    }

    @Override
    public String toString() {
        return "Author{" +
                "AuthorId=" + authorId +
                ", firstName='" + firstName + '\'' +
                ", lastNAme='" + lastName + '\'' +
                '}';
    }
}