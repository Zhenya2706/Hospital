package Entities;

import java.util.Date;

public class Rprescription {
    private int id;
    private Date rprescriptionDate;
    private boolean isExecuted;
    private Date executionDate;
    private Reception receptions;
    private Prescription prescription;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getRprescriptionDate() {
        return rprescriptionDate;
    }

    public void setRprescriptionDate(Date rprescriptionDate) {
        this.rprescriptionDate = rprescriptionDate;
    }

    public Prescription getPrescription() {
        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }

    public Reception getReceptions() {
        return receptions;
    }

    public void setReceptions(Reception receptions) {
        this.receptions = receptions;
    }

    public boolean isExecuted() {
        return isExecuted;
    }

    public void setExecuted(boolean executed) {
        isExecuted = executed;
    }

    public Date getExecutionDate() {
        return executionDate;
    }

    public void setExecutionDate(Date executionDate) {
        this.executionDate = executionDate;
    }


    @Override
    public String toString() {
        return "Entities.Rprescription{" +
                "id=" + id +
                ", rprescriptionDate=" + rprescriptionDate +
                ", isExecuted=" + isExecuted +
                ", executionDate=" + executionDate +
                ", receptions=" + receptions +
//        ", user=" + user +
                ", prescription=" + prescription +
                '}';
    }
}
