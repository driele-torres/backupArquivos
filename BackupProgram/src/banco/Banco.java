package banco;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class Banco {

    private static SessionFactory sessionFactory = null;
    private static ServiceRegistry serviceRegistry = null;
    private static Configuration configuration = null;

    public static SessionFactory createSessionFactory() {
        configuration = new Configuration();
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

    public static void createTables(){
        SchemaExport se = new SchemaExport(getConfig());
        se.create(true, true);
    }
}
