package Impl;

import dao.ReceptionDao;

import java.util.logging.Logger;

public class ReceptionDaoImpl implements ReceptionDao {
    private static final Logger LOGGER = LoggerFactory.getLogger(ReceptionDaoImpl.class);

    @Autowired
    SessionFactory sessionFactory;

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void addReception(Reception reception) {
        reception.setReceptionDate(new java.util.Date());
        getSession().persist(reception);
        LOGGER.info("Entities.Reception successfully saved. Entities.Reception details: " + reception);
    }

    @Override
    public void updateReception(Reception reception) {
        getSession().update(reception);
        LOGGER.info("Entities.Reception successfully update. Entities.Reception details: " + reception);
    }

    @Override
    public void removeReception(Integer id) {

        Reception reception = (Reception) getSession().load(Reception.class, id);

        if(reception !=null){
            getSession().delete(reception);
        }
        LOGGER.info("Entities.Reception successfully removed. Entities.Reception details: " + reception);
    }

    @Override
    public Reception getReceptionById(Integer id) {

        Reception reception = (Reception) getSession().load(Reception.class, id);
        LOGGER.info("Entities.Reception successfully loaded. Entities.Reception details: " + reception);

        return reception;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Reception> listReceptions() {

        List<Reception> receptionList = getSession().createQuery("from Entities.Reception").list();

        for(Reception reception : receptionList){
            LOGGER.info("Entities.Reception list: " + reception);
        }

        return receptionList;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Reception> listHospitalizedReceptions() {
        List<Reception> hospitalizedReceptionList = getSession().createQuery("from Entities.Reception "
                + "where isDischarge='false'").list();

        for(Reception reception : hospitalizedReceptionList){
            LOGGER.info("HospitalizedReception list: " + reception);
        }

        return hospitalizedReceptionList;
    }

    @Override
    public void dischargePatient(Reception reception) {
        reception.setDischargeDate(new java.util.Date());
        reception.setDischarge(true);
        getSession().update(reception);
        LOGGER.info("Entities.Reception successfully update. Entities.Reception details: " + reception);
    }

}
