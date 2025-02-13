package com.ifyq.strokeprediction.medicalrecords;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ifyq.strokeprediction.patients.Patient;

@RestController
@RequestMapping("/api/patients")
public class MedicalRecordsController {
   
    private MedicalRecordsService MedicalRecordsService;
    
    public MedicalRecordsController(MedicalRecordsService MedicalRecordsService) {
        this.MedicalRecordsService = MedicalRecordsService;
    }

    @PostMapping
    public MedicalRecords createMedicalRecords(@RequestBody MedicalRecords medicalrecords) {
        return MedicalRecordsService.createPatient(medicalrecords);
    }

    @GetMapping
    public List<Patient> getPatients() {
        return MedicalRecordsService.getMedicalRecords();
    }

    @GetMapping("/{id}")
    public Patient getPatientById(@PathVariable UUID id) {
        return MedicalRecordsService.getMedicalRecordsById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteMedicalRecords(@PathVariable UUID id) {
        MedicalRecordsService.deleteMedicalRecords(id);
    }

    @PutMapping("/{id}")
    public Patient updatePatient(@PathVariable UUID id, @RequestBody Patient patient) {
        return MedicalRecordsService.updateMedicalRecords(id, patient);
    }
 
    
}
