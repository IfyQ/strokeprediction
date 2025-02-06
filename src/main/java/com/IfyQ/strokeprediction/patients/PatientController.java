package com.ifyq.strokeprediction.patients;

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

@RestController
@RequestMapping("/api/patients")
public class PatientController {

    private PatientService patientService;
    
    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @PostMapping
    public Patient createPatient(@RequestBody Patient patient) {
        return patientService.createPatient(patient);
    }

    @GetMapping
    public List<Patient> getPatients() {
        return patientService.getPatients();
    }

    @GetMapping("/{id}")
    public Patient getPatientById(@PathVariable UUID id) {
        return patientService.getPatientById(id);
    }

    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable UUID id) {
        patientService.deletePatient(id);
    }

    @PutMapping("/{id}")
    public Patient updatePatient(@PathVariable UUID id, @RequestBody Patient patient) {
        return patientService.updatePatient(id, patient);
    }

}
