package com.galaxe.gitconnector.gitservice;

import com.galaxe.gitconnector.dto.*;
import org.springframework.web.bind.annotation.PathVariable;

public interface GitService {

    public Owner getOwner(String owner);

    public PullRequestCommits[] getListOfPullNumberCommits(String owner, String repo,int pull_number);

    public PullRequestDetails[] getListOfRepoPulls(String owner, String repo,String state);

    public PullRequestDetails getPullNumberDetails(String owner, String repo,int pull_number);

    public Object[] getListOfPullNumberFiles(String owner, String repo,int pull_number);

    public Object[] getListOfPullNumberMerge(String owner, String repo, int pull_number);

    public Object[] getListOfPullNumberReviews(String owner, String repo, int pull_number);

    public Object[] getPullReviewsById(String owner,String repo,int pull_number,int review_id);

    public Object getPullNumberReviewComments(String owner, String repo, int pull_number, int review_id);

    public Object[] getRepoPullsComments(String owner, String repo);

    public Object[] getListOfPullsCommentsById(String owner,String repo,int comment_id);

    public Object[] getListOfPullNumberComments(String owner,String repo,int pull_number);

    public Object getListOfPullNumberRequestedReviews(String owner,String repo,int pull_number);

    public Object[] getRepoBranches(String owner,String repo);

    public Object getRepoBranchDetails(String owner, String repo,String branch);

    public RepositoryDetails[] getListOfRepos(String username);

    public Object[] getListOfRepoComments(String owner,String repo);

    public Object getRepoCommentsById(String owner,String repo,int comment_id);

    public Object[] getRepoCommits(String owner, String repo);

    public Object[] getRepoIssues(String owner,String repo);

    public RepositoryDetails getRepoDetails(String owner,String repo);

    public RepoInfo getRepoInfo(String owner, String repo);

}
