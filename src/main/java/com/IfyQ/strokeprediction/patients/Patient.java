package com.ifyq.strokeprediction.patients;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Patients")
public class Patient{

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID patientId;

  private String gender;
  private String everMarried;
  private int age;
  private String worktype;
  private String residenceType;
  
  public Patient() {
  }

  public Patient(String gender, String everMarried, int age, String workType, String residenceType) {
    this.gender = gender;
    this.everMarried = everMarried;
    this.age = age;
    this.worktype = workType;
    this.residenceType = residenceType;
  }

  public UUID getPatientId() {
    return patientId;
  }

  public String getGender() {
    return gender;
  }


  public void setGender(String gender) {
    this.gender = gender;
  }


  public String getEverMarried() {
    return everMarried;
  }


  public void setEverMarried(String everMarried) {
    this.everMarried = everMarried;
  }


  public int getAge() {
    return age;
  }


  public void setAge(int age) {
    this.age = age;
  }


  public String getWorkType() {
    return worktype;
  }


  public void setWorkType(String workType) {
    this.worktype = workType;
  }


  public String getResidenceType() {
    return residenceType;
  }


  public void setResidenceType(String residenceType) {
    this.residenceType = residenceType;
  }

}
