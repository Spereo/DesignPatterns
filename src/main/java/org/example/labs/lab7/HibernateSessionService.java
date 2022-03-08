package org.example.labs.lab7;

import org.example.labs.lab7.Configuration.HibernateConfiguration;
import org.example.labs.lab7.DAO.JavaEE.EntityManagerStudentDao;
import org.example.labs.lab7.DAO.ORM.SessionGroupDao;
import org.example.labs.lab7.DAO.StudentDao;
import org.example.labs.lab7.Entity.Group;
import org.example.labs.lab7.Entity.Student;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class HibernateSessionService {
    private static final Logger LOGGER = LoggerFactory.getLogger(HibernateSessionService.class);

    private final SessionGroupDao groupDao;
    private final StudentDao studentDao;

    public HibernateSessionService() {
        SessionFactory sessionFactory = HibernateConfiguration.getFactory();
        //studentDao = new SessionStudentDao(sessionFactory);
        studentDao = new EntityManagerStudentDao(sessionFactory);
        groupDao = new SessionGroupDao(sessionFactory);
    }

    public void execute() {
        Student student = studentDao.findById(1L);
        LOGGER.info("{}", student);

        List<Student> students = studentDao.findAll();
        LOGGER.info("{}", students);

        Group group = groupDao.findById(1L);

        Student newStudent = new Student();
        newStudent.setName("Максим");
        newStudent.setSurname("Солопов");
        newStudent.setGroup(group);
        studentDao.save(newStudent);
    }
}
