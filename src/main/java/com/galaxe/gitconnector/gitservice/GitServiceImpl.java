package com.galaxe.gitconnector.gitservice;

import com.galaxe.gitconnector.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

@Service
public class GitServiceImpl implements  GitService{

    @Value("${github.users_url}")
    private String USERS_URL;
    @Value("${github.repos_url}")
    private String REPOS_URL ;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Owner getOwner(String owner) {
        return restTemplate.getForObject(USERS_URL+owner, Owner.class);
    }

    @Override
    public PullRequestCommits[] getListOfPullNumberCommits(String owner, String repo,int pull_number){
        String url=REPOS_URL+owner+"/"+repo+"/pulls/"+pull_number+"/commits";
        return restTemplate.getForObject(url,PullRequestCommits[].class);
    }

    @Override
    public RepositoryDetails[] getListOfRepos(String username) {
        return restTemplate.getForObject(USERS_URL+username+"/repos", RepositoryDetails[].class);
    }

    @Override
    public Object[] getListOfRepoComments(String owner, String repo) {
        return restTemplate.getForObject(REPOS_URL+owner+"/"+repo+"/comments",Object[].class);
    }

    @Override
    public Object getRepoCommentsById(String owner, String repo, int comment_id) {
        return restTemplate.getForObject(REPOS_URL+owner+"/"+repo+"/comments/"+comment_id,Object.class);
    }

    @Override
    public Object[] getRepoCommits(String owner, String repo) {
        return restTemplate.getForObject(REPOS_URL+owner+"/"+repo+"/commits",Object[].class);
    }

    @Override
    public RepositoryDetails getRepoDetails(String owner, String repo) {
        return restTemplate.getForObject(REPOS_URL+owner+"/"+repo,RepositoryDetails.class);
    }

    @Override
    public RepoInfo getRepoInfo(String owner, String repo) {
        RepoInfo repoInfo = new RepoInfo();
        repoInfo.setBranches((restTemplate.getForObject(REPOS_URL+owner+"/"+repo+"/branches",Object[].class)).length);
        repoInfo.setOpen_pulls((restTemplate.getForObject(REPOS_URL+owner+"/"+repo+"/pulls?state=open",Object[].class)).length);
        repoInfo.setClosed_pulls((restTemplate.getForObject(REPOS_URL+owner+"/"+repo+"/pulls?state=closed",Object[].class)).length);
        repoInfo.setAll_pulls((restTemplate.getForObject(REPOS_URL+owner+"/"+repo+"/pulls?state=all",Object[].class)).length);
        repoInfo.setCommits((restTemplate.getForObject(REPOS_URL+owner+"/"+repo+"/commits",Object[].class)).length);
        repoInfo.setIssues((restTemplate.getForObject(REPOS_URL+owner+"/"+repo+"/issues",Object[].class)).length);
        return repoInfo;
    }

    @Override
    public PullRequestDetails[] getListOfRepoPulls(String owner, String repo,String state) {
        return restTemplate.getForObject(REPOS_URL+owner+"/"+repo+"/pulls?state="+state,PullRequestDetails[].class);
    }

    @Override
    public PullRequestDetails getPullNumberDetails(String owner, String repo,int pull_number){
        return restTemplate.getForObject(REPOS_URL+owner+"/"+repo+"/pulls/"+pull_number,PullRequestDetails.class);
    }

    @Override
    public Object[] getListOfPullNumberFiles(String owner, String repo,int pull_number){
        return restTemplate.getForObject(REPOS_URL+owner+"/"+repo+"/pulls/"+pull_number+"/files",Object[].class);
    }

    @Override
    public Object[] getListOfPullNumberReviews(String owner, String repo, int pull_number) {
        return restTemplate.getForObject(REPOS_URL+owner+"/"+repo+"/pulls/"+pull_number+"/reviews",Object[].class);
    }

    @Override
    public Object[] getListOfPullNumberMerge(String owner, String repo, int pull_number) {
        //Response if pull request has not been merged  Status: 404 Not Found
        return restTemplate.getForObject(REPOS_URL+owner+"/"+repo+"/comments/"+pull_number+"/merge",Object[].class);
    }

    @Override
    public Object[] getListOfPullsCommentsById(@PathVariable String owner,@PathVariable String repo,int comment_id) {
        return restTemplate.getForObject(REPOS_URL+owner+"/"+repo+"/pulls/comments"+comment_id,Object[].class);
    }

    @Override
    public Object[] getListOfPullNumberComments(String owner,String repo,int pull_number){
        return restTemplate.getForObject(REPOS_URL+owner+"/"+repo+"/pulls/"+pull_number+"/comments",Object[].class);
    }
    @Override
    public Object getListOfPullNumberRequestedReviews(String owner,String repo,int pull_number){
        return restTemplate.getForObject(REPOS_URL+owner+"/"+repo+"/pulls/"+pull_number+"/requested_reviewers",Object.class);
    }

    @Override
    public Object[] getRepoBranches(String owner, String repo) {
        return restTemplate.getForObject(REPOS_URL+owner+"/"+repo+"/branches",Object[].class);
    }

    @Override
    public Object getRepoBranchDetails(String owner, String repo,String branch) {
        return restTemplate.getForObject(REPOS_URL+owner+"/"+repo+"/branches/"+branch,Object.class);
    }



    @Override
    public Object[] getRepoPullsComments(String owner, String repo) {
        return restTemplate.getForObject(REPOS_URL+owner+"/"+repo+"/pulls/comments",Object[].class);
    }

    @Override
    public Object[] getPullReviewsById(String owner, String repo, int pull_number, int review_id) {
        return restTemplate.getForObject(REPOS_URL+owner+"/"+repo+"/pulls/"+pull_number+"/reviews/"+review_id,Object[].class);
    }

    @Override
    public Object getPullNumberReviewComments(String owner, String repo, int pull_number, int review_id) {
        return restTemplate.getForObject(REPOS_URL+owner+"/"+repo+"/pulls/"+pull_number+"/reviews/"+review_id+"/comments",Object.class);
    }
}
