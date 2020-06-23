package com.cirta.soft.graphql.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity()
@Table(name = "contests")
public class Contest {

    @Id
    @Column(name="contest_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer contestId;

    private String code;
    private String title;
    private String description;
    private String status;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "created_by", referencedColumnName = "user_id")
    private User createdBy;

    public Contest() {
    }

    public Contest(String code, String title, String description, String status ,Timestamp createdAt, User createdBy){
        this.code = code;
        this.title = title;
        this.description = description;
        this.status = status;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
    }

    public Integer getContestId() {
        return contestId;
    }

    public void setContestId(Integer contestId) {
        this.contestId = contestId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public String toString() {
        return "Contest{" +
                "contestId=" + contestId +
                ", code='" + code + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", createdAt=" + createdAt +
                ", createdBy=" + createdBy +
                '}';
    }
}
