package com.cirta.soft.graphql.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "names")
public class Name {

    @Id
    @Column(name="name_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer nameId;

    @ManyToOne
    @JoinColumn(name = "contest_id", nullable = false, updatable = false)
    private Contest contest;

    private String label;
    private String normalizedLabel;
    private String description;
    private Timestamp createdAt;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "created_by", referencedColumnName = "user_id")
    private User createdBy;

    public Name() {
    }

    public Name(Contest contest, String label, String normalizedLabel, String description, Timestamp createdAt, User createdBy) {
        this.contest = contest;
        this.label= label;
        this.normalizedLabel = normalizedLabel;
        this.description = description;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
    }

    public Integer getNameId() {
        return nameId;
    }

    public void setNameId(Integer nameId) {
        this.nameId = nameId;
    }

    public Contest getContest() {
        return contest;
    }

    public void setContest(Contest contest) {
        this.contest = contest;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getNormalizedLabel() {
        return normalizedLabel;
    }

    public void setNormalizedLabel(String normalizedLabel) {
        this.normalizedLabel = normalizedLabel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        return "Name{" +
                "nameId=" + nameId +
                ", contest=" + contest +
                ", label='" + label + '\'' +
                ", normalizedLabel='" + normalizedLabel + '\'' +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", createdBy=" + createdBy +
                '}';
    }
}
