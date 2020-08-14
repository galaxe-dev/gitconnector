
package com.galaxe.gitconnector.dto;


public class RepositoryDetails {

    private Integer id;
    private String name;
    private String fullName;
    private Boolean _private;
    private Owner owner;
    private String htmlUrl;
    private String description;
    private Boolean fork;
    private String url;
    private String createdAt;
    private String updatedAt;
    private String pushedAt;
    private String cloneUrl;
    private Object homepage;
    private Integer openIssuesCount;
    private Object license;
    private Integer openIssues;
    private String defaultBranch;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RepositoryDetails() {
    }

    /**
     * 
     * @param owner
     * @param defaultBranch
     * @param htmlUrl
     * @param fullName
     * @param description
     * @param openIssues
     * @param url
     * @param pushedAt
     * @param cloneUrl
     * @param openIssuesCount
     * @param createdAt
     * @param license
     * @param fork
     * @param _private
     * @param name
     * @param id
     * @param updatedAt
     * @param homepage
     */
    public RepositoryDetails(Integer id, String name, String fullName, Boolean _private, Owner owner, String htmlUrl, String description, Boolean fork, String url, String createdAt, String updatedAt, String pushedAt, String cloneUrl, Object homepage, Integer openIssuesCount, Object license, Integer openIssues, String defaultBranch) {
        super();
        this.id = id;
        this.name = name;
        this.fullName = fullName;
        this._private = _private;
        this.owner = owner;
        this.htmlUrl = htmlUrl;
        this.description = description;
        this.fork = fork;
        this.url = url;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.pushedAt = pushedAt;
        this.cloneUrl = cloneUrl;
        this.homepage = homepage;
        this.openIssuesCount = openIssuesCount;
        this.license = license;
        this.openIssues = openIssues;
        this.defaultBranch = defaultBranch;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Boolean getPrivate() {
        return _private;
    }

    public void setPrivate(Boolean _private) {
        this._private = _private;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getFork() {
        return fork;
    }

    public void setFork(Boolean fork) {
        this.fork = fork;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    public String getPushedAt() {
        return pushedAt;
    }

    public void setPushedAt(String pushedAt) {
        this.pushedAt = pushedAt;
    }

    public String getCloneUrl() {
        return cloneUrl;
    }

    public void setCloneUrl(String cloneUrl) {
        this.cloneUrl = cloneUrl;
    }

    public Object getHomepage() {
        return homepage;
    }

    public void setHomepage(Object homepage) {
        this.homepage = homepage;
    }

    public Integer getOpenIssuesCount() {
        return openIssuesCount;
    }

    public void setOpenIssuesCount(Integer openIssuesCount) {
        this.openIssuesCount = openIssuesCount;
    }

    public Object getLicense() {
        return license;
    }

    public void setLicense(Object license) {
        this.license = license;
    }

    public Integer getOpenIssues() {
        return openIssues;
    }

    public void setOpenIssues(Integer openIssues) {
        this.openIssues = openIssues;
    }

    public String getDefaultBranch() {
        return defaultBranch;
    }

    public void setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    @Override
    public String toString() {
        return "RepositoryDetail{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fullName='" + fullName + '\'' +
                ", _private=" + _private +
                ", owner=" + owner +
                ", htmlUrl='" + htmlUrl + '\'' +
                ", description='" + description + '\'' +
                ", fork=" + fork +
                ", url='" + url + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", pushedAt='" + pushedAt + '\'' +
                ", cloneUrl='" + cloneUrl + '\'' +
                ", homepage=" + homepage +
                ", openIssuesCount=" + openIssuesCount +
                ", license=" + license +
                ", openIssues=" + openIssues +
                ", defaultBranch='" + defaultBranch + '\'' +
                '}';
    }
}
