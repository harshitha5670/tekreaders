package com.tekreaders.controller;

import com.tekreaders.model.Users;
import com.tekreaders.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/tekreader")
public class UsersController {

  @Autowired
  private UsersService usersService;

  @GetMapping(value = "/users")
  public List<Users> get() {
    return usersService.get();
  }

  @GetMapping(value = "/users/{id}")
  public List<Users> getById(int id) {
    return (List<Users>) usersService.get(id);
  }

  @PostMapping(value = "/add/users")
  public List<Users> addUser(@RequestBody final  Users users) {
  //usersService.save(users);
  return usersService.save(users);
  }

  @DeleteMapping(value = "/users/{id}")
  public List<Users> delete(int id) {
    return usersService.delete(id);
  }



}
