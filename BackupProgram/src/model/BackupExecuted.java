package model;

import java.util.Date;

public class BackupExecuted {
    
    private int id;
    private Backup backup;
    private Date dataExecuted;
    private SituacaoBackup estado;

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

    public SituacaoBackup getEstado() {
        return estado;
    }

    public void setEstado(SituacaoBackup estado) {
        this.estado = estado;
    }
}
