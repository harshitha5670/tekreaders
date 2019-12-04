package com.tekreaders.dao;

import com.tekreaders.model.Users;

import java.util.List;

public interface UsersDao {

  List<Users> get();
  Users get(int id);
  void save(Users user);
  void delete(int id);
}
