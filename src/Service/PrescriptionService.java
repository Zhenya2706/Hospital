package Service;

public interface PrescriptionService {
    void addPrescription(Prescription prescription);

    void updatePrescription(Prescription prescription);

    void removePrescription(Integer id);

    Prescription getPrescriptionById(Integer id);

    List<Prescription> listPrescriptions();
}

