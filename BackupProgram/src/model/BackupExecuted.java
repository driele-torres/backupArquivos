package model;

import java.io.Serializable;
import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "backupexecuted")
public class BackupExecuted implements Serializable {
    
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "idbackupexecuted", unique = true, nullable = false)
    private int id;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idbackup",  nullable = false)
    private Backup backup;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "data_executed", nullable = false)
    private Date dataExecuted;
    
    @Column(name = "situacao_backup", nullable = false)
    private SituacaoBackup situacao;    
    
    @Column(name = "arquivo_destino", nullable = false)
    private String arquivoDestino;    

    public String getArquivoDestino() {
        return arquivoDestino;
    }

    public void setArquivoDestino(String arquivoDestino) {
        this.arquivoDestino = arquivoDestino;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Backup getBackup() {
        return backup;
    }

    public void setBackup(Backup backup) {
        this.backup = backup;
    }

    public Date getDataExecuted() {
        return dataExecuted;
    }

    public void setDataExecuted(Date dataExecuted) {
        this.dataExecuted = dataExecuted;
    }

    public SituacaoBackup getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoBackup situacao) {
        this.situacao = situacao;
    }
}
