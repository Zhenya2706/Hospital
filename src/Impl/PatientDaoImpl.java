package Impl;

import dao.PatientDao;

public class PatientDaoImpl implements PatientDao {
    private static final Logger LOGGER = LoggerFactory.getLogger(PatientDaoImpl.class);

    @Autowired
    SessionFactory sessionFactory;

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void addPatient(Patient patient) {
        patient.setCreateDate(new java.util.Date());
        getSession().persist(patient);
        LOGGER.info("Entities.Patient successfully saved. Entities.Patient details: " + patient);
    }

    @Override
    public void updatePatient(Patient patient) {
        patient.setUpdateDate(new java.util.Date());
        getSession().update(patient);
        LOGGER.info("Entities.Patient successfully update. Entities.Patient details: " + patient);
    }

    @Override
    public void removePatient(Integer id) {

        Patient patient = (Patient) getSession().load(Patient.class, id);

        if(patient !=null){
            getSession().delete(patient);
        }
        LOGGER.info("Entities.Patient successfully removed. Entities.Patient details: " + patient);
    }

    @Override
    public Patient getPatientById(Integer id) {

        Patient patient = (Patient) getSession().load(Patient.class, id);
        LOGGER.info("Entities.Patient successfully loaded. Entities.Patient details: " + patient);

        return patient;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Patient> listPatients() {

        List<Patient> patientList = getSession().createQuery("from Entities.Patient ORDER BY lastname ASC").list();

        for(Patient patient : patientList){
            LOGGER.info("Entities.Patient list: " + patient);
        }

        return patientList;
    }
}

