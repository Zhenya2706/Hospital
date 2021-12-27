package dao;

public interface ReceptionDao {
    void addReception (Reception reception);

    void updateReception (Reception reception);

    void removeReception (Integer id);

    Reception getReceptionById (Integer id);

    List<Reception>listReceptions();

    List<Reception>listHospitalizedReceptions();

    void dischargePatient (Reception reception);
}