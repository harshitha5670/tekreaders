package com.tekreaders.dao;

import com.tekreaders.model.Users;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class UsersDaoImplementation implements UsersDao {

  @Autowired
  private EntityManager entityManager;

  @Override
  public List<Users> get() {
    Session currentSession = entityManager.unwrap(Session.class);
    Query<Users> query = currentSession.createQuery("from User", Users.class);
    List<Users> list = query.getResultList();
    return list;
  }

  @Override
  public Users get(int id) {
    return null;
  }

  @Override
  public void save(Users user) {

  }

  @Override
  public void delete(int id) {

  }
}
