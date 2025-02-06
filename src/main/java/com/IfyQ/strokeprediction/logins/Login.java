package com.ifyq.strokeprediction.logins;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Login")
public class Login {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID adminId;

  @Column (unique = true, nullable = false)
private String username;

@Column (nullable = false, unique = false)
  private String password;
  
  public Login() {
  }

  public Login(String username, String password) {
    this.username = username;
    this.password = password;
  }

  public UUID getAdminId() {
    return adminId;
  }

  public String getUsername() {
    return username;
  }

}
