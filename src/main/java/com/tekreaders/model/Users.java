package com.tekreaders.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class Users {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column
  private Integer empid;
  @Column
  private String firstname;
  @Column
  private String lastname;
  @Column
  private String Gender;
  @Column
  private String mobilenumber;
  @Column
  private String emailid;
  @Column
  private String practice;

  public Users() {
  }

  public Integer getEmpid() {
    return empid;
  }

  public void setEmpid(Integer empid) {
    this.empid = empid;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public String getGender() {
    return Gender;
  }

  public void setGender(String gender) {
    Gender = gender;
  }

  public String getMobilenumber() {
    return mobilenumber;
  }

  public void setMobilenumber(String mobilenumber) {
    this.mobilenumber = mobilenumber;
  }

  public String getEmailid() {
    return emailid;
  }

  public void setEmailid(String emailid) {
    this.emailid = emailid;
  }

  public String getPractice() {
    return practice;
  }

  public void setPractice(String practice) {
    this.practice = practice;
  }

  @Override
  public String toString() {
    return "Users{" +
      "empid=" + empid +
      ", firstname='" + firstname + '\'' +
      ", lastname='" + lastname + '\'' +
      ", Gender='" + Gender + '\'' +
      ", mobilenumber='" + mobilenumber + '\'' +
      ", emailid='" + emailid + '\'' +
      ", practice='" + practice + '\'' +
      '}';
  }
}
