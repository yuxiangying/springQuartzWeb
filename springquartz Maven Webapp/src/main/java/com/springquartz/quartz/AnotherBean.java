/**
 * 
 */
package com.springquartz.quartz;

import org.springframework.stereotype.Component;

/**
  * <p>Title: AnotherBean</p>
  * <p>Description: </p>
  * <p>Company: </p> 
  * @author PC
  * @date 2019年2月15日下午2:20:43
*/
@Component("anotherBean")
public class AnotherBean {
	public void printAnotherMessage(){
		System.out.println("AnotherMessage!");
	}
}
