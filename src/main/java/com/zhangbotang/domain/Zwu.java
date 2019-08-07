/**   
 * Copyright © 2019 公司名. 八维董事长.
 * 
 * @Title: Zwu.java 
 * @Prject: zhangbotang-week1
 * @Package: com.zhangbotang.domain 
 * @Description: TODO
 * @author: 11209   
 * @date: 2019年8月6日 上午8:43:50 
 * @version: V1.0   
 */
package com.zhangbotang.domain;

/** 
 * @ClassName: Zwu 
 * @Description: TODO
 * @author: 11209
 * @date: 2019年8月6日 上午8:43:50  
 */
public class Zwu {

	private Integer zid; //id
	private String zname;//植物名称
	private String durle;//助手
	private Integer tid;//id
	private String tname;//类别名称
	/**
	 * @return the zid
	 */
	public Integer getZid() {
		return zid;
	}
	/**
	 * @param zid the zid to set
	 */
	public void setZid(Integer zid) {
		this.zid = zid;
	}
	/**
	 * @return the zname
	 */
	public String getZname() {
		return zname;
	}
	/**
	 * @param zname the zname to set
	 */
	public void setZname(String zname) {
		this.zname = zname;
	}
	/**
	 * @return the durle
	 */
	public String getDurle() {
		return durle;
	}
	/**
	 * @param durle the durle to set
	 */
	public void setDurle(String durle) {
		this.durle = durle;
	}
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
		return "Zwu [zid=" + zid + ", zname=" + zname + ", durle=" + durle + ", tid=" + tid + ", tname=" + tname + "]";
	}
	
}
