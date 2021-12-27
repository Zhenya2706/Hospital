package Service;

public interface PatientService {
    void addPatient(Patient patient);

    void updatePatient(Patient patient);

    void removePatient(Integer id);

    Patient getPatientById(Integer id);

    List<Patient> listPatients();

}

