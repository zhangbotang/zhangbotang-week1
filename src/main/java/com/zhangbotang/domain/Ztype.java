/**   
 * Copyright © 2019 公司名. 八维董事长.
 * 
 * @Title: Ztype.java 
 * @Prject: zhangbotang-week1
 * @Package: com.zhangbotang.domain 
 * @Description: TODO
 * @author: 11209   
 * @date: 2019年8月6日 上午9:35:09 
 * @version: V1.0   
 */
package com.zhangbotang.domain;

/** 
 * @ClassName: Ztype 
 * @Description: TODO
 * @author: 11209
 * @date: 2019年8月6日 上午9:35:09  
 */
public class Ztype {

	private Integer tid;//id
	private String tname;//类别名称
	/**
	 * @return the tid
	 */
	public Integer getTid() {
		return tid;
	}
	/**
	 * @param tid the tid to set
	 */
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	/**
	 * @return the tname
	 */
	public String getTname() {
		return tname;
	}
	/**
	 * @param tname the tname to set
	 */
	public void setTname(String tname) {
		this.tname = tname;
	}
	/* (non Javadoc) 
	 * @Title: toString
	 * @Description: TODO
	 * @return 
	 * @see java.lang.Object#toString() 
	 */
	@Override
	public String toString() {
		return "Ztype [tid=" + tid + ", tname=" + tname + "]";
	}
	
}
