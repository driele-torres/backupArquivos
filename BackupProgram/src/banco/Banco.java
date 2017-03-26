package banco;

import java.sql.Connection;
import java.sql.Statement;

public class Banco
{
  private static String nome = "test.db";
  private static String driver = "org.sqlite.JDBC";
  private static String endereco = "jdbc:sqlite:";
  
  public Banco() {}
  
  public static void iniciaConexao() { 
    Connection c = null;
    try {
      Class.forName(driver);
      c = java.sql.DriverManager.getConnection(endereco + nome);
    } catch (Exception e) {
      System.err.println(e.getClass().getName() + ": " + e.getMessage());
      System.exit(0);
    }
    System.out.println("Opened database successfully");
  }
  
  private static Connection c;
  
  public String getNome() { return nome; }
  

  public void setNome(String nome) {
    nome = nome;
  }
  
  public String getDriver() {
    return driver;
  }
  
  public void setDriver(String driver) {
    driver = driver;
  }
  
  public String getEndereco() {
    return endereco;
  }
  
  public void setEndereco(String endereco) {
    endereco = endereco;
  }
  
  public Connection getConnection() {
    if (c == null)
      iniciaConexao();
    return c;
  }
  public void initBanco(Connection c){
    Statement stmt = null;
    if (c != null){
    try {
      stmt = c.createStatement();
      
      String sql = "CREATE TABLE COMPANY " +
                   "(ID INT PRIMARY KEY     NOT NULL," +
                   " NAME           TEXT    NOT NULL, " + 
                   " AGE            INT     NOT NULL, " + 
                   " ADDRESS        CHAR(50), " + 
                   " SALARY         REAL)"; 
      stmt.executeUpdate(sql);
      stmt.close();
      c.close();
    } catch ( Exception e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
    }
    System.out.println("Table created successfully");
    }
  }
}