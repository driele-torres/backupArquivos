package banco;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.cfg.Configuration;
//import org.hibernate.boot.MetadataSources;
//import org.hibernate.boot.spi.MetadataImplementor;
//import org.hibernate.tool.hbm2ddl.SchemaExport;
            

public class Banco {

    private static SessionFactory sessionFactory = null;
    private static ServiceRegistry serviceRegistry = null;
    private static Configuration configuration = null;

    public static SessionFactory createSessionFactory() {
        
        configuration = new Configuration();
        configuration.addAnnotatedClass(model.Backup.class);
        configuration.addAnnotatedClass(model.BackupExecuted.class);
        configuration.configure();
        serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
                configuration.getProperties()).build();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        return sessionFactory;
    }

    public static Session getSession() {
        if (sessionFactory == null) {
            createSessionFactory();
        }
        return sessionFactory.openSession();
    }

    public static Configuration getConfig() {
        if (configuration == null) {
            createSessionFactory();
        }
        return configuration;
    }

//    public static void createTables(){
//    MetadataSources metadata = new MetadataSources(new StandardServiceRegistryBuilder().applySettings(
//                getConfig().getProperties()).build());
//    
//    SchemaExport export = new SchemaExport(
//            (MetadataImplementor) metadata.buildMetadata()
//    );
//    export.setDelimiter(";");
//    export.setOutputFile("isso.sql");
//    export.setFormat(true);
//    export.create(true, true);
//    export.execute(true, false, false, false);
//    }
}
