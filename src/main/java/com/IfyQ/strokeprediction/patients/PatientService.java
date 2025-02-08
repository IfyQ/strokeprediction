package com.ifyq.strokeprediction.patients;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@Service

public class PatientService {
    
    private PatientRepository patientRepository;
    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public Patient createPatient(Patient patient) {
        return patientRepository.save(patient);
    }
    
    public List<Patient> getPatients() {
        System.out.println("getPatients");
        return patientRepository.findAll();
    }

    public Patient getPatientById(UUID id) {
        return patientRepository.findById(id).orElse(null);
    }

    public void deletePatient(UUID id) {
        patientRepository.deleteById(id);
    }

    public Patient updatePatient(UUID id, Patient patient) {
        Patient existingPatient = patientRepository.findById(id).orElse(null);
        if (existingPatient != null) {
            patient.setGender(patient.getGender());
            patient.setEverMarried(patient.getEverMarried());
            patient.setAge(patient.getAge());
            patient.setWorkType(patient.getWorkType());
            patient.setResidenceType(patient.getResidenceType());
            return patientRepository.save(patient);
            } ;
            return null;

    }
}
