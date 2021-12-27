package Entities;

import java.util.Date;
import java.util.List;

public class Reception {

    private int id;
    private Date receptionDate;
    private String preliminaryDiagnosis;
    private Date dischargeDate;
    private String finalDiagnosis;
    private boolean isDischarge;
    private Patient patient;
    private User user;


    private List<Rprescription> rprescription;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public java.util.Date getReceptionDate() {
        return receptionDate;
    }

    public void setReceptionDate(Date receptionDate) {
        this.receptionDate = receptionDate;
    }

    public String getPreliminaryDiagnosis() {
        return preliminaryDiagnosis;
    }

    public void setPreliminaryDiagnosis(String preliminaryDiagnosis) {
        this.preliminaryDiagnosis = preliminaryDiagnosis;
    }

    public Date getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(Date dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

    public String getFinalDiagnosis() {
        return finalDiagnosis;
    }

    public void setFinalDiagnosis(String finalDiagnosis) {
        this.finalDiagnosis = finalDiagnosis;
    }

    public boolean isDischarge() {
        return isDischarge;
    }

    public void setDischarge(boolean discharge) {
        isDischarge = discharge;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Rprescription> getRprescription() {
        return rprescription;
    }

    public void setRprescription(List<Rprescription> rprescription) {
        this.rprescription = rprescription;
    }

    @Override
    public String toString() {
        return "Entities.Reception{" +
                "idReception=" + id +
                ", receptionDate=" + receptionDate +
                ", preliminaryDiagnosis='" + preliminaryDiagnosis + '\'' +
                ", dischargeDate=" + dischargeDate +
                ", finalDiagnosis='" + finalDiagnosis + '\'' +
                ", isDischrge=" + isDischarge +
                '}';
    }
}
