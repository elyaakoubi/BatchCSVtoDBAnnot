package org.ensa.batch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.support.SimpleJobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service("batchLauncher")
public class BatchLauncher {
	
	private Job job;
	
	@Autowired
	public void setJob(Job job) {
		this.job = job;
	}
	
	private SimpleJobLauncher jobLauncher;

	@Autowired
	public void setJobLauncher(SimpleJobLauncher jobLauncher) {
		this.jobLauncher = jobLauncher;
	}
	
	public void run() throws JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException, JobParametersInvalidException{
	
		JobParameters parameters = new JobParametersBuilder().addLong("Current Time", new Long(System.currentTimeMillis())).toJobParameters();
		jobLauncher.run(job, parameters);
	}

}
