package medicalsystem;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Jianpeng Ji
 */
public class Doctor extends Person {

    private Hospital hospital;
    private String medicalDepartment;
    private DiagnosisRequestDirectory diagnosisRequestDirectory;
    private EncounterHistory encounterHistory;

    public Doctor(Hospital hospital, String medicalDepartment, int id, int age, String firstName, String lastName, int residenceId, int communityId, String position) {
        super(id, age, firstName, lastName, residenceId, communityId, position);
        this.hospital = hospital;
        this.medicalDepartment = medicalDepartment;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public String getMedicalDepartment() {
        return medicalDepartment;
    }

    public void setMedicalDepartment(String medicalDepartment) {
        this.medicalDepartment = medicalDepartment;
    }
    
    

}
