/**
 * 
 */
package com.springquartz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
  * <p>Title: MyController</p>
  * <p>Description: </p>
  * <p>Company: </p> 
  * @author PC
  * @date 2019年2月15日上午11:05:02
*/
@Controller
public class MyController {
	@RequestMapping("login") // 用来处理前台的login请求
	private @ResponseBody String hello(
			@RequestParam(value = "username", required = false) String username,
			@RequestParam(value = "password", required = false) String password) {
		System.out.println("测试git提交1！！！");
		System.out.println("测试git提交2！！！");
		return "Hello " + username + ",Your password is: " + password;

	}
}
