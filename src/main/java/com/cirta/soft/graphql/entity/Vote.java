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
@Table(name = "votes")
public class Vote {

    @Id
    @Column(name="vote_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer voteId;

    @ManyToOne
    @JoinColumn(name = "name_id", nullable = false, updatable = false)
    private Name name;

    private Boolean up;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "created_by", referencedColumnName = "user_id")
    private User createdBy;

    public Vote() {
    }

    public Vote(Name name, Boolean up, Timestamp createdAt, User createdBy) {
        this.name = name;
        this.up = up;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
    }

    public Integer getVoteId() {
        return voteId;
    }

    public void setVoteId(Integer voteId) {
        this.voteId = voteId;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Boolean getUp() {
        return up;
    }

    public void setUp(Boolean up) {
        this.up = up;
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
        return "Vote{" +
                "voteId=" + voteId +
                ", name=" + name +
                ", up=" + up +
                ", createdAt=" + createdAt +
                ", createdBy=" + createdBy +
                '}';
    }
}
