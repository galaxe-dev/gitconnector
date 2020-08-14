package com.galaxe.gitconnector.resttemplate;

import com.galaxe.gitconnector.dto.*;
import com.galaxe.gitconnector.gitservice.GitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitHubRestController {

    @Autowired
    private GitService gitService;

    @GetMapping(value="/users/{owner}")
    public Owner getOwner(@PathVariable String owner){
        return gitService.getOwner(owner);
    }

    @GetMapping(value="/repos/{owner}/{repo}/pulls/{pull_number}/commits")
    public PullRequestCommits[] getListOfPullNumberCommits(@PathVariable String owner, @PathVariable String repo, @PathVariable int pull_number){
        return gitService.getListOfPullNumberCommits(owner,repo,pull_number);
    }

    //List pull requests
    @GetMapping(value="/repos/{owner}/{repo}/pulls")
    public PullRequestDetails[] getListOfRepoPulls(@PathVariable String owner, @PathVariable String repo,@RequestParam String state){
        return gitService.getListOfRepoPulls(owner,repo,state);
    }

    //Get a pull request
    @GetMapping(value="/repos/{owner}/{repo}/pulls/{pull_number}")
    public PullRequestDetails getPullNumberDetails(@PathVariable String owner,@PathVariable String repo,@PathVariable  int pull_number){
        return gitService.getPullNumberDetails(owner,repo,pull_number);
    }

    //List pull requests files
    @GetMapping(value="/repos/{owner}/{repo}/pulls/{pull_number}/files")
    public Object[] getListOfPullNumberFiles(@PathVariable String owner,@PathVariable String repo,@PathVariable  int pull_number){
        return gitService.getListOfPullNumberFiles(owner,repo,pull_number);
    }

    //Check if a pull request has been merged
//    @GetMapping(value="/repos/{owner}/{repo}/pulls/{pull_number}/merge")
//    public Object[] getListOfPullNumberMerge(@PathVariable String owner,@PathVariable String repo,@PathVariable  int pull_number){
//        return gitService.getListOfPullNumberMerge(owner,repo,pull_number);
//    }

    //List reviews for a pull request
    @GetMapping(value="/repos/{owner}/{repo}/pulls/{pull_number}/reviews")
    public Object[] getListOfPullNumberReviews(@PathVariable String owner,@PathVariable String repo,@PathVariable  int pull_number){
        return gitService.getListOfPullNumberReviews(owner,repo,pull_number);
    }

    //Get a review for a pull request
    @GetMapping(value="/repos/{owner}/{repo}/pulls/{pull_number}/reviews/{review_id}")
    public Object[] getPullReviewsById(@PathVariable String owner,@PathVariable String repo,@PathVariable  int pull_number,@PathVariable  int review_id){
        return gitService.getPullReviewsById(owner,repo,pull_number,review_id);
    }

    //List comments for a pull request review
    @GetMapping(value="/repos/{owner}/{repo}/pulls/{pull_number}/reviews/{review_id}/comments")
    public Object getPullNumberReviewComments(@PathVariable String owner,@PathVariable String repo,@PathVariable  int pull_number,@PathVariable  int review_id){
        return gitService.getPullNumberReviewComments(owner,repo,pull_number,review_id);
    }

    //List review comments on a pull request
    @GetMapping(value="/repos/{owner}/{repo}/pulls/comments")
    public Object[] getRepoPullsComments(@PathVariable String owner,@PathVariable String repo){
        return gitService.getRepoPullsComments(owner,repo);
    }

    //Get a review comment for a pull request
    @GetMapping(value="/repos/{owner}/{repo}/pulls/comments/{comment_id}")
    public Object[] getListOfPullsCommentsById(@PathVariable String owner,@PathVariable String repo,@PathVariable  int comment_id){
        return gitService.getListOfPullsCommentsById(owner,repo,comment_id);
    }

    //List review comments on a pull request
    @GetMapping(value="/repos/{owner}/{repo}/pulls/{pull_number}/comments")
    public Object[] getListOfPullNumberComments(@PathVariable String owner,@PathVariable String repo,@PathVariable  int pull_number){
        return gitService.getListOfPullNumberComments(owner,repo,pull_number);
    }

    //List requested reviewers for a pull request
    @GetMapping(value="/repos/{owner}/{repo}/pulls/{pull_number}/requested_reviewers")
    public Object getListOfPullNumberRequestedReviews(@PathVariable String owner,@PathVariable String repo,@PathVariable  int pull_number){
        return gitService.getListOfPullNumberRequestedReviews(owner,repo,pull_number);
    }


    //List branches
    @GetMapping(value="repos/{owner}/{repo}/branches")
    public Object[] getRepoBranches(@PathVariable String owner,@PathVariable String repo){
        return gitService.getRepoBranches(owner,repo);
    }

    //Get a branch
    @GetMapping(value="repos/{owner}/{repo}/branches/{branch}")
    public Object getRepoBranchDetails(@PathVariable String owner,@PathVariable String repo,@PathVariable String branch){
        return gitService.getRepoBranchDetails(owner,repo,branch);
    }

    //List repositories for a user
    @GetMapping(value="/users/{username}/repos")
    public RepositoryDetails[] getListOfRepos(@PathVariable String username){
        return gitService.getListOfRepos(username);
    }

    //List commit comments for a repository
    @GetMapping(value="/repos/{owner}/{repo}/comments")
    public Object[] getListOfRepoComments(@PathVariable String owner,@PathVariable String repo){
        return gitService.getListOfRepoComments(owner,repo);
    }

    //Get a commit comment
    @GetMapping(value="/repos/{owner}/{repo}/comments/{comment_id}")
    public Object getRepoCommentsById(@PathVariable String owner,@PathVariable String repo,@PathVariable int comment_id){
        return gitService.getRepoCommentsById(owner,repo,comment_id);
    }

    //List commits
    @GetMapping(value="/repos/{owner}/{repo}/commits")
    public Object[] getRepoCommits(@PathVariable String owner,@PathVariable String repo){
        return gitService.getRepoCommits(owner,repo);
    }

    //List commits
    @GetMapping(value="/repos/{owner}/{repo}/issues")
    public Object[] getRepoIssues(@PathVariable String owner,@PathVariable String repo){
        return gitService.getRepoIssues(owner,repo);
    }

    //Repo details
    @GetMapping(value="/repos/{owner}/{repo}")
    public RepositoryDetails getRepoDetails(@PathVariable String owner, @PathVariable String repo){
        return gitService.getRepoDetails(owner,repo);
    }

    @GetMapping(value="/repos/{owner}/{repo}/info")
    public RepoInfo getRepoInfo(@PathVariable String owner, @PathVariable String repo){
        return gitService.getRepoInfo(owner,repo);
    }

}
