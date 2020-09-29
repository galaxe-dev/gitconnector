
package com.galaxe.gitconnector.dto;


public class Commit {

    private Owner author;
    private Owner committer;
    private String message;
    private String url;
    private Integer commentCount;

   
    public Commit() {
    }

  
    public Commit(Owner author, Owner committer, String message, String url, Integer commentCount) {
        super();
        this.author = author;
        this.committer = committer;
        this.message = message;
        this.url = url;
        this.commentCount = commentCount;
    }

    public Owner getAuthor() {
        return author;
    }

    public void setAuthor(Owner author) {
        this.author = author;
    }

    public Owner getCommitter() {
        return committer;
    }

    public void setCommitter(Owner committer) {
        this.committer = committer;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    @Override
    public String toString() {
        return "Commit{" +
                "author=" + author +
                ", committer=" + committer +
                ", message='" + message + '\'' +
                ", url='" + url + '\'' +
                ", commentCount=" + commentCount +
                '}';
    }
}
