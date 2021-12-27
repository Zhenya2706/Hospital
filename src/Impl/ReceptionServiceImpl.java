package Impl;

import Service.ReceptionService;

public class ReceptionServiceImpl  implements ReceptionService {
    ReceptionDao receptionDao;

    @Override
    public void addReception(Reception reception) {
        this.receptionDao.addReception(reception);
    }

    @Override
    public void updateReception(Reception reception) {
        this.receptionDao.updateReception(reception);
    }

    @Override
    public void removeReception(Integer id) {
        this.receptionDao.removeReception(id);
    }

    @Override
    public Reception getReceptionById(Integer id) {
        return this.receptionDao.getReceptionById(id);
    }

    @Override
    public List<Reception> listReceptions() {
        return this.receptionDao.listReceptions();
    }

    @Override
    public List<Reception> listHospitalizedReceptions() {
        return this.receptionDao.listHospitalizedReceptions();
    }

    @Override
    public void dischargePatient(Reception reception) {
        this.receptionDao.dischargePatient(reception);
    }
}
