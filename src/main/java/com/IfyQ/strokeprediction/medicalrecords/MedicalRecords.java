package com.ifyq.strokeprediction.medicalrecords;


import java.util.UUID;

import com.ifyq.strokeprediction.patients.Patient;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "medicalrecords")
public class MedicalRecords {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID recordId;

  @ManyToOne
  @JoinColumn(name = "patient_id", nullable = false)
  private Patient patient;
  private boolean hypertension;
  private double avgGlucoseLevel;
  private double bmi;
  private boolean stroke;

  //getters and setters
  public UUID getRecordId() {
    return recordId;
  }

  public void setRecordId(UUID recordId) {
    this.recordId = recordId;
  }

  public Patient getPatient() {
    return patient;
  }

  public void setPatient(Patient patient) {
    this.patient = patient;
  }

  public boolean isHypertension() {
    return hypertension;
  }

  public void setHypertension(boolean hypertension) {
    this.hypertension = hypertension;
  }

  public double getAvgGlucoseLevel() {
    return avgGlucoseLevel;
  }

  public void setAvgGlucoseLevel(double avgGlucoseLevel) {
    this.avgGlucoseLevel = avgGlucoseLevel;
  }

  public double getBmi() {
    return bmi;
  }

  public void setBmi(double bmi) {
    this.bmi = bmi;
  }

  public boolean isStroke() {
    return stroke;
  }

  public void setStroke(boolean stroke) {
    this.stroke = stroke;
  }

}
