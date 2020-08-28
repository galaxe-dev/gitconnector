
package com.galaxe.gitconnector.dto;

import java.util.List;

public class PullRequestDetails {

    private String url;
    private Integer id;
    private Integer number;
    private String state;
    private Boolean locked;
    private String title;
    private Owner user;
    private String createdAt;
    private String updatedAt;
    private Object closedAt;
    private Object mergedAt;
    private String mergeCommitSha;
    private Object assignee;
    private List<Object> assignees = null;
    private List<Object> requestedReviewers = null;
    private List<Object> requestedTeams = null;

    public PullRequestDetails() {
    }

    public PullRequestDetails(String url, Integer id, Integer number, String state, Boolean locked, String title, Owner user, String createdAt, String updatedAt, Object closedAt, Object mergedAt, String mergeCommitSha, Object assignee, List<Object> assignees, List<Object> requestedReviewers, List<Object> requestedTeams) {
        super();
        this.url = url;
        this.id = id;
        this.number = number;
        this.state = state;
        this.locked = locked;
        this.title = title;
        this.user = user;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.closedAt = closedAt;
        this.mergedAt = mergedAt;
        this.mergeCommitSha = mergeCommitSha;
        this.assignee = assignee;
        this.assignees = assignees;
        this.requestedReviewers = requestedReviewers;
        this.requestedTeams = requestedTeams;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Owner getUser() {
        return user;
    }

    public void setUser(Owner user) {
        this.user = user;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Object getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(Object closedAt) {
        this.closedAt = closedAt;
    }

    public Object getMergedAt() {
        return mergedAt;
    }

    public void setMergedAt(Object mergedAt) {
        this.mergedAt = mergedAt;
    }

    public String getMergeCommitSha() {
        return mergeCommitSha;
    }

    public void setMergeCommitSha(String mergeCommitSha) {
        this.mergeCommitSha = mergeCommitSha;
    }

    public Object getAssignee() {
        return assignee;
    }

    public void setAssignee(Object assignee) {
        this.assignee = assignee;
    }

    public List<Object> getAssignees() {
        return assignees;
    }

    public void setAssignees(List<Object> assignees) {
        this.assignees = assignees;
    }

    public List<Object> getRequestedReviewers() {
        return requestedReviewers;
    }

    public void setRequestedReviewers(List<Object> requestedReviewers) {
        this.requestedReviewers = requestedReviewers;
    }

    public List<Object> getRequestedTeams() {
        return requestedTeams;
    }

    public void setRequestedTeams(List<Object> requestedTeams) {
        this.requestedTeams = requestedTeams;
    }

    @Override
    public String toString() {
        return "PullRequestDetails{" +
                "url='" + url + '\'' +
                ", id=" + id +
                ", number=" + number +
                ", state='" + state + '\'' +
                ", locked=" + locked +
                ", title='" + title + '\'' +
                ", user=" + user +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", closedAt=" + closedAt +
                ", mergedAt=" + mergedAt +
                ", mergeCommitSha='" + mergeCommitSha + '\'' +
                ", assignee=" + assignee +
                ", assignees=" + assignees +
                ", requestedReviewers=" + requestedReviewers +
                ", requestedTeams=" + requestedTeams +
                '}';
    }
}
