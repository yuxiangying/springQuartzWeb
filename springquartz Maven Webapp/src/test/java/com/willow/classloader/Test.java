package com.willow.classloader;
/**
 * 
 */

/**
  * <p>Title: Test</p>
  * <p>Description: </p>
  * <p>Company: </p> 
  * @author PC
  * @date 2019年2月21日下午3:30:32
*/
public class Test {
	public static void main(String[] arg){
		 
	      ClassLoader c  = Test.class.getClassLoader();  //获取Test类的类加载器
	 
	        System.out.println(c); 
	 
	      ClassLoader c1 = c.getParent();  //获取c这个类加载器的父类加载器
	 
	        System.out.println(c1);
	 
	      ClassLoader c2 = c1.getParent();//获取c1这个类加载器的父类加载器
	 
	        System.out.println(c2);
	 
	  }
}
