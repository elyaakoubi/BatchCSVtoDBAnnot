import org.ensa.config.AppConfig;
import org.ensa.dao.Idao;
import org.ensa.entities.Personne;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) throws JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException, JobParametersInvalidException {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
//		Job job = (Job) ctx.getBean("importPersonnes");
//		JobLauncher jobLauncher = (JobLauncher) ctx.getBean("jobLauncher"); 
//		JobExecution jobex = jobLauncher.run(job, new JobParameters());
//		System.out.println(jobex.getStatus());
	
	}

}
