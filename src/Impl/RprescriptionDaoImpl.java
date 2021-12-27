package Impl;

import dao.RprescriptionDao;

public class RprescriptionDaoImpl implements RprescriptionDao {
    private static final Logger LOGGER = LoggerFactory.getLogger(RprescriptionDaoImpl.class);

    @Autowired
    ReceptionService receptionService;

    @Autowired
    private SessionFactory sessionFactory;

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void addRprescription(Rprescription rprescription) {
        rprescription.setRprescriptionDate(new java.util.Date());
        getSession().persist(rprescription);
        LOGGER.info("Entities.Rprescription successfully saved. Entities.Rprescription details: " + rprescription);
    }

    @Override
    public void updateRprescription(Rprescription rprescription) {
        getSession().update(rprescription);
        LOGGER.info("Entities.Rprescription successfully update. Entities.Rprescription details: " + rprescription);
    }

    @Override
    public void removeRprescription(Integer id) {

        Rprescription rprescription = (Rprescription) getSession().load(Rprescription.class, id);

        if(rprescription !=null){
            getSession().delete(rprescription);
        }
        LOGGER.info("Entities.Rprescription successfully removed. Entities.Rprescription details: " + rprescription);
    }

    @Override
    @SuppressWarnings("unchecked")
    public Rprescription getRprescriptionById(Integer id) {

        Rprescription rprescription = (Rprescription) getSession().load(Rprescription.class, id);
        LOGGER.info("Entities.Rprescription successfully loaded. Entities.Rprescription details: " + rprescription);

        return rprescription;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Rprescription> listRprescriptions() {

        List<Rprescription> rprescriptionList = getSession().createQuery("from Entities.Rprescription").list();

        for(Rprescription rprescription : rprescriptionList){
            LOGGER.info("Entities.Rprescription list: " + rprescription);
        }

        return rprescriptionList;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Rprescription> listPrescriptionsByReceptionId(Integer id) {
        Query query = getSession().createQuery("from Entities.Rprescription where receptions.id = :id");
        query.setParameter("id", id);
        List<Rprescription> patientPrescriptionsList = query.list();

        for(Rprescription rprescription : patientPrescriptionsList){
            LOGGER.info("Prescriptioins of patient: " + rprescription);
        }
        return patientPrescriptionsList;
    }


    @Override
    public void executeReceptionPrescriptionById(Integer id) {
        Rprescription rprescription = (Rprescription) getSession().load(Rprescription.class, id);
        rprescription.setExecutionDate(new java.util.Date());
        rprescription.setExecuted(true);
        getSession().update(rprescription);
        LOGGER.info("Entities.Rprescription successfully execute. Entities.Reception details: " + rprescription);
    }

}
