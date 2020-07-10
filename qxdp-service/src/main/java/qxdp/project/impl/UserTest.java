package qxdp.project.impl;

import qxdp.project.dao.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserTest {

    public User createEmployee(String name, String role, String password) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("UserService");
        EntityManager em = emf.createEntityManager();
        User emp = new User();
        emp.setName(name);
        emp.setRole(role);
        emp.setPassword(password);
        em.persist(emp);
        return emp;
    }

}
