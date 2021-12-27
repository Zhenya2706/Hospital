package Impl;

import Service.RprescriptionService;

public class RprescriptionServiceImpl  implements RprescriptionService {

    private RprescriptionDao rprescriptionDao;


    public void addRprescription(Rprescription rprescription) {
        this.rprescriptionDao.addRprescription(rprescription);
    }


    public void updateRprescription(Rprescription rprescription) {
        this.rprescriptionDao.updateRprescription(rprescription);
    }


    public void removeRprescription(Integer id) {
        this.rprescriptionDao.removeRprescription(id);
    }


    public Rprescription getRprescriptionById(Integer id) {
        return this.rprescriptionDao.getRprescriptionById(id);
    }


    public List<Rprescription> listRprescriptions() {
        return this.rprescriptionDao.listRprescriptions();
    }


    public List<Rprescription> listPrescriptionsByReceptionId(Integer id) {
        return this.rprescriptionDao.listPrescriptionsByReceptionId(id);
    }

    @
    public void executeReceptionPrescriptionById(Integer id) {
        this.rprescriptionDao.executeReceptionPrescriptionById(id);
    }
}
