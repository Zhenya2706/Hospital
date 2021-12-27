package Impl;

import dao.PrescriptionDao;

import java.util.logging.Logger;

public class PrescriptionDaoImpl implements PrescriptionDao {
    private static final Logger LOGGER = LoggerFactory.getLogger(PrescriptionDaoImpl.class);

    @Autowired
    private SessionFactory sessionFactory;

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void addPrescription(Prescription prescription) {
        getSession().persist(prescription);
        LOGGER.info("Entities.Prescription successfully saved. Entities.Prescription details: " + prescription);
    }

    @Override
    public void updatePrescription(Prescription prescription) {
        getSession().update(prescription);
        LOGGER.info("Entities.Prescription successfully update. Entities.Prescription details: " + prescription);
    }

    @Override
    public void removePrescription(Integer id) {

        Prescription prescription = (Prescription) getSession().load(Prescription.class, id);

        if(prescription !=null){
            getSession().delete(prescription);
        }
        LOGGER.info("Entities.Prescription successfully removed. Entities.Prescription details: " + prescription);
    }

    @Override
    public Prescription getPrescriptionById(Integer id) {

        Prescription prescription = (Prescription) getSession().load(Prescription.class, id);
        LOGGER.info("Entities.Prescription successfully loaded. Entities.Prescription details: " + prescription);

        return prescription;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Prescription> listPrescriptions() {

        List<Prescription> prescriptionList = getSession().createQuery("from Entities.Prescription").list();

        for(Prescription prescription : prescriptionList){
            LOGGER.info("Entities.Prescription list: " + prescription);
        }

        return prescriptionList;
    }
}
