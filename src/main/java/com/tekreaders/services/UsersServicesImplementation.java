package com.tekreaders.services;

import com.tekreaders.dao.UsersDao;
import com.tekreaders.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsersServicesImplementation implements UsersService {

  @Autowired
  private UsersDao usersRepository;

  @Transactional
  @Override
  public List<Users> get() {
    return usersRepository.get();
  }

  @Transactional
  @Override
  public Users get(int id) {
    return null;
  }

  @Transactional
  @Override
  public List<Users> save(Users user) {
    return null;
  }

  @Transactional
  @Override
  public List<Users> delete(int id) {
    return null;
  }

}
