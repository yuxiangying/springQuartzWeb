/**
 * 
 */
package com.springquartz.quartz;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

/**
  * <p>Title: MyBean</p>
  * <p>Description: </p>
  * <p>Company: </p> 
  * @author PC
  * @date 2019年2月15日下午2:15:03
*/
@Component("myBean")
public class MyBean {
	public void printMessage() {
		// 打印当前的执行时间，格式为2017-01-01 00:00:00
		Date date = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("MyBean Executes!" + sf.format(date));
	}
}
