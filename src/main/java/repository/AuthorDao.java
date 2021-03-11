package repository;

import model.Author;
import org.hibernate.Session;
import util.HibernateUtil;

public class AuthorDao {

    public Author findByIdAuthor(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            Author author = session.find(Author.class, id);
            return author;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        } finally {
            session.close();
        }
    }
}
