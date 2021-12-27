package Service;

import Entities.Reception;

import java.util.List;

public interface ReceptionService {
    void addReception(Reception reception);

    void updateReception(Reception reception);

    void removeReception(Integer id);

    Reception getReceptionById(Integer id);

    List<Reception> listReceptions();

    List<Reception> listHospitalizedReceptions();

    void dischargePatient(Reception reception);
}
