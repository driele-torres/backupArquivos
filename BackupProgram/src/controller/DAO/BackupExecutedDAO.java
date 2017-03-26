package controller.DAO;
import org.hibernate.Session;
import java.util.List;
import model.BackupExecuted;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class BackupExecutedDAO extends DAOHibernate<BackupExecuted>{

	public BackupExecutedDAO(Session session) {
		super(session,BackupExecuted.class);
	}
        
        public List<BackupExecuted> procuraBackupExecutedPor(int idBackup){
		Criteria crit = getSession().createCriteria(BackupExecuted.class);
		crit.add(Restrictions.gt("backup",idBackup));
		return (List<BackupExecuted>)crit.list();
	}
}
