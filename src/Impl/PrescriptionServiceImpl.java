package Impl;

import Service.PrescriptionService;

public class PrescriptionServiceImpl implements PrescriptionService {

    private PrescriptionDao prescriptionDao;


    public void addPrescription(Prescription prescription) {
        this.prescriptionDao.addPrescription(prescription);
    }


    public void updatePrescription(Prescription prescription) {
        this.prescriptionDao.updatePrescription(prescription);
    }


    public void removePrescription(Integer id) {
        this.prescriptionDao.removePrescription(id);
    }


    public Prescription getPrescriptionById(Integer id) {
        return this.prescriptionDao.getPrescriptionById(id);
    }


    public List<Prescription> listPrescriptions() {
        return this.prescriptionDao.listPrescriptions();
    }
}

