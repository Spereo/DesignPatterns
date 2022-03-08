package org.example.labs.lab7.DAO.ORM;

import org.example.labs.lab7.DAO.GroupDao;
import org.example.labs.lab7.Entity.Group;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class SessionGroupDao implements GroupDao {
    private final SessionFactory sessionFactory;

    public SessionGroupDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Group findById(Long id) {
        Session session = sessionFactory.openSession();
        return session.get(Group.class, id);
    }

    public void save(Group entity) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(entity);
        transaction.commit();
        session.close();
    }

    public void update(Group entity) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(entity);
        transaction.commit();
        session.close();
    }

    public void delete(Group entity) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(entity);
        transaction.commit();
        session.close();
    }

    public List<Group> findAll() {
        Session session = sessionFactory.openSession();
        return (List<Group>) session.createQuery("from Group").list();
    }
}
