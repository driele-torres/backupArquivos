package model;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Id;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "backup_table")
public class Backup implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "idvenda", unique = true, nullable = false)
    private int idBackup;

    @Column(name = "descricao", nullable = true)
    private String descricao;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_inicio", nullable = true)
    private Date dataInicio;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_termino", nullable = true)
    private Date dataTermino;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "backup_table")
    private List<BackupExecuted> backupExecutados;

    public Backup() {
    }

    public Backup(String descricao, Date dataInicio, Date dataTermino) {
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.descricao = descricao;
    }

    public int getIdBackup() {
        return idBackup;
    }

    public void setIdBackup(int idBackup) {
        this.idBackup = idBackup;
    }

    public List<BackupExecuted> getBackupExecutados() {
        return backupExecutados;
    }

    public void setBackupExecutados(List<BackupExecuted> backupExecutados) {
        this.backupExecutados = backupExecutados;
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
