package com.telusko.JobApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.JobApp.model.JobPost;
import com.telusko.JobApp.repo.JobRepo;

@Service
public class JobService {

	@Autowired
	public JobRepo repo;

	public List<JobPost> returnAllJobPosts() {
		return repo.returnAllJobPosts();
	}

	public void addJobPost(JobPost jobPost) {
		 repo.addJobPost(jobPost);
	}
}
