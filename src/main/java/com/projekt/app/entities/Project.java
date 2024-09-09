package com.projekt.app.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

public class Project {
    private enum ProjectStatus {
        PLANNED,
        IN_PROGRESS,
        ON_HOLD,
        COMPLETED,
        CLOSED,
        PENDING_APPROVAL,
        UNDER_REVIEW,
        ARCHIVED
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String body;


    private int pm_id;
    private ProjectStatus status;
    private LocalDateTime creationTime;

    public Project(String title, String body, int pm_id, ProjectStatus status) {
        this.title = title;
        this.body = body;
        this.pm_id = pm_id;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getPm_id() {
        return pm_id;
    }

    public void setPm_id(int pm_id) {
        this.pm_id = pm_id;
    }

    public ProjectStatus getStatus() {
        return status;
    }

    public void setStatus(ProjectStatus status) {
        this.status = status;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }
}
