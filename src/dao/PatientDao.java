package dao;

public interface PatientDao {
    void addPatient(Patient patient);

    void updatePatient(Patient patient);

    void removePatient(Integer id);

    Patient getPatientById(Integer id);

    List<Patient> listPatients();

}
