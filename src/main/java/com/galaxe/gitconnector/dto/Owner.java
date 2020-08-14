
package com.galaxe.gitconnector.dto;


import java.util.Date;

public class Owner {

    private String login;
    private Integer id;
    private String url;
    private String htmlUrl;
    private String organizationsUrl;
    private String reposUrl;
    private String type;
    private Boolean siteAdmin;
    private String name;
    private String company;
    private String location;
    private Object email;
    private Date date;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Owner() {
    }

    public Owner(String login, Integer id, String url, String htmlUrl, String organizationsUrl, String reposUrl, String type, Boolean siteAdmin, String name, String company, String location, Object email, Date date) {
        this.login = login;
        this.id = id;
        this.url = url;
        this.htmlUrl = htmlUrl;
        this.organizationsUrl = organizationsUrl;
        this.reposUrl = reposUrl;
        this.type = type;
        this.siteAdmin = siteAdmin;
        this.name = name;
        this.company = company;
        this.location = location;
        this.email = email;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * 
     * @param siteAdmin
     * @param organizationsUrl
     * @param reposUrl
     * @param htmlUrl
     * @param name
     * @param company
     * @param location
     * @param id
     * @param login
     * @param type
     * @param url
     * @param email
     */


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getOrganizationsUrl() {
        return organizationsUrl;
    }

    public void setOrganizationsUrl(String organizationsUrl) {
        this.organizationsUrl = organizationsUrl;
    }

    public String getReposUrl() {
        return reposUrl;
    }

    public void setReposUrl(String reposUrl) {
        this.reposUrl = reposUrl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getSiteAdmin() {
        return siteAdmin;
    }

    public void setSiteAdmin(Boolean siteAdmin) {
        this.siteAdmin = siteAdmin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Object getEmail() {
        return email;
    }

    public void setEmail(Object email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "login='" + login + '\'' +
                ", id=" + id +
                ", url='" + url + '\'' +
                ", htmlUrl='" + htmlUrl + '\'' +
                ", organizationsUrl='" + organizationsUrl + '\'' +
                ", reposUrl='" + reposUrl + '\'' +
                ", type='" + type + '\'' +
                ", siteAdmin=" + siteAdmin +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", location='" + location + '\'' +
                ", email=" + email +
                ", date=" + date +
                '}';
    }
}
