package id.code.interviewtest.models.pendidikan;

import id.code.interviewtest.models.murid.Murid;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
public class Pendidikan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "id_murid")
    private int idMurid;

    @Column(name = "status")
    private String status;

    @Column(name = "time_create")
    private Date timeCreate;

    public Pendidikan() {
    }

    public Pendidikan(int id, int idMurid, String status, Date timeCreate) {
        this.id = id;
        this.idMurid = idMurid;
        this.status = status;
        this.timeCreate = timeCreate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdMurid() {
        return idMurid;
    }

    public void setIdMurid(int idMurid) {
        this.idMurid = idMurid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getTimeCreate() {
        return timeCreate;
    }

    public void setTimeCreate(Date timeCreate) {
        this.timeCreate = timeCreate;
    }
}
