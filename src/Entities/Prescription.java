package Entities;

import Enums.TypePrescription;

import java.util.List;

public class Prescription {
    private int id;
    private String namePrescription;
    private TypePrescription typePrescription;
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamePrescription() {
        return namePrescription;
    }

    public void setNamePrescription(String namePrescription) {
        this.namePrescription = namePrescription;
    }

    public TypePrescription getTypePrescription() {
        return typePrescription;
    }

    public void setTypePrescription(TypePrescription typePrescription) {
        this.typePrescription = typePrescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    @Override
    public String toString() {
        return "Entities.Prescription{" +
                "id=" + id +
                ", namePrescription='" + namePrescription + '\'' +
                ", typePrescription=" + typePrescription +
                ", description='" + description + '\'' +
                '}';
    }
}

