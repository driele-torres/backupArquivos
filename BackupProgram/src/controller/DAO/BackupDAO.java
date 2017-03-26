package controller.DAO;

import java.util.List;
import model.Backup;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

public class BackupDAO extends DAOHibernate<Backup> {

    public BackupDAO(Session session) {
        super(session, Backup.class);
    }
    
    public List<Backup> procuraPorParteDaDescricao(String parte) {
        Criteria crit = getSession().createCriteria(Backup.class);
        crit.add(Restrictions.like("descricao", parte, MatchMode.ANYWHERE));
        System.out.println(parte);
        return (List<Backup>) crit.list();
    }
}
