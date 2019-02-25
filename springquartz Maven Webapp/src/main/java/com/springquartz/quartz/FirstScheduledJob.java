/**
 * 
 */
package com.springquartz.quartz;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
  * <p>Title: FirstScheduledJob</p>
  * <p>Description: </p>
  * <p>Company: </p> 
  * @author PC
  * @date 2019年2月15日下午2:18:16
*/
public class FirstScheduledJob extends QuartzJobBean{
	private AnotherBean anotherBean;

	public void setAnotherBean(AnotherBean anotherBean) {
		this.anotherBean = anotherBean;
	}
	
	@Override
	protected void executeInternal(JobExecutionContext arg0) throws JobExecutionException {
		Date date = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("FirstScheduledJob Executes!" + sf.format(date));
		this.anotherBean.printAnotherMessage();	
	}

}
