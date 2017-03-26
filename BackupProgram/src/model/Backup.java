package model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "backup")
public class Backup
{
  private int id;
  private String descricao;
  private Date dataInicio;
  private Date dataTermino;
  private SituacaoBackup situacao;
  
  public Backup() {}
  
  public Backup(String descricao, Date dataInicio, Date dataTermino) {
    this.dataInicio = dataInicio;
    this.dataTermino = dataTermino;
    this.descricao = descricao;
    situacao = SituacaoBackup.PENDENTE;
  }
  
  public SituacaoBackup getSituacao() {
    return situacao;
  }
  
  public void setSituacao(SituacaoBackup situacao) {
    this.situacao = situacao;
  }
  
  @Id
  public int getId() {
    return id;
  }
  
  public void setId(int id) {
    this.id = id;
  }
  
  public String getDescricao() {
    return descricao;
  }
  
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
  
  public Date getDataInicio() {
    return dataInicio;
  }
  
  public void setDataInicio(Date dataInicio) {
    this.dataInicio = dataInicio;
  }
  
  public Date getDataTermino() {
    return dataTermino;
  }
  
  public void setDataTermino(Date dataTermino) {
    this.dataTermino = dataTermino;
  }
}