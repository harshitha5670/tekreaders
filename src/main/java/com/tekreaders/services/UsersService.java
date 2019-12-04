package com.tekreaders.services;

import com.tekreaders.model.Users;

import java.util.List;

public interface UsersService {
  List<Users> get();
  Users get(int id);
  List<Users> save(Users users);
  List<Users> delete(int id);
}
