
package com.galaxe.gitconnector.dto;


public class PullRequestCommits {

    private String sha;
    private Commit commit;
    private String url;
    private String htmlUrl;
    private String commentsUrl;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PullRequestCommits() {
    }

    /**
     * 
     * @param commentsUrl
     * @param commit
     * @param htmlUrl
     * @param sha
     * @param url
     */
    public PullRequestCommits(String sha, Commit commit, String url, String htmlUrl, String commentsUrl) {
        super();
        this.sha = sha;
        this.commit = commit;
        this.url = url;
        this.htmlUrl = htmlUrl;
        this.commentsUrl = commentsUrl;
    }

    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public Commit getCommit() {
        return commit;
    }

    public void setCommit(Commit commit) {
        this.commit = commit;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public String getCommentsUrl() {
        return commentsUrl;
    }

    public void setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    @Override
    public String toString() {
        return "PullRequestCommits{" +
                "sha='" + sha + '\'' +
                ", commit=" + commit +
                ", url='" + url + '\'' +
                ", htmlUrl='" + htmlUrl + '\'' +
                ", commentsUrl='" + commentsUrl + '\'' +
                '}';
    }
}
