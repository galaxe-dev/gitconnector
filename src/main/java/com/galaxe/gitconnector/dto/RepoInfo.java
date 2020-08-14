package com.galaxe.gitconnector.dto;

public class RepoInfo {
    private int open_pulls;
    private int closed_pulls;
    private int all_pulls;
    private int branches;
    private int issues;
    private int commits;

    public RepoInfo() {
    }


    public RepoInfo(int open_pulls, int closed_pulls, int all_pulls, int branches, int issues, int commits) {
        this.open_pulls = open_pulls;
        this.closed_pulls = closed_pulls;
        this.all_pulls = all_pulls;
        this.branches = branches;
        this.issues = issues;
        this.commits = commits;
    }

    public int getOpen_pulls() {
        return open_pulls;
    }

    public void setOpen_pulls(int open_pulls) {
        this.open_pulls = open_pulls;
    }

    public int getClosed_pulls() {
        return closed_pulls;
    }

    public void setClosed_pulls(int closed_pulls) {
        this.closed_pulls = closed_pulls;
    }

    public int getAll_pulls() {
        return all_pulls;
    }

    public void setAll_pulls(int all_pulls) {
        this.all_pulls = all_pulls;
    }

    public int getBranches() {
        return branches;
    }

    public void setBranches(int branches) {
        this.branches = branches;
    }

    public int getIssues() {
        return issues;
    }

    public void setIssues(int issues) {
        this.issues = issues;
    }

    public int getCommits() {
        return commits;
    }

    public void setCommits(int commits) {
        this.commits = commits;
    }

    @Override
    public String toString() {
        return "RepoInfo{" +
                "open_pulls=" + open_pulls +
                ", closed_pulls=" + closed_pulls +
                ", all_pulls=" + all_pulls +
                ", branches=" + branches +
                ", issues=" + issues +
                ", commits=" + commits +
                '}';
    }
}
