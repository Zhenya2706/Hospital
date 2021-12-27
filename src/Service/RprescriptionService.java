package Service;

import Entities.Rprescription;

import java.util.List;

public interface RprescriptionService {
    void addRprescription (Rprescription rprescription);

    void updateRprescription (Rprescription rprescription);

    void removeRprescription (Integer id);

    Rprescription getRprescriptionById (Integer id);

    List<Rprescription> listRprescriptions();

    List<Rprescription> listPrescriptionsByReceptionId(Integer id);

    void executeReceptionPrescriptionById (Integer id);
}
