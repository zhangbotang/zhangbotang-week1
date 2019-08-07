/**   
 * Copyright © 2019 公司名. 八维董事长.
 * 
 * @Title: ZwuService.java 
 * @Prject: zhangbotang-week1
 * @Package: com.zhangbotang.service 
 * @Description: TODO
 * @author: 11209   
 * @date: 2019年8月6日 上午9:02:29 
 * @version: V1.0   
 */
package com.zhangbotang.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.zhangbotang.domain.Ztype;
import com.zhangbotang.domain.Zwu;

/** 
 * @ClassName: ZwuService 
 * @Description: TODO
 * @author: 11209
 * @date: 2019年8月6日 上午9:02:29  
 */
public interface ZwuService {

	/** 
	 * @Title: selects 
	 * @Description: TODO
	 * @param mohu
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @return: PageInfo<Zwu>
	 */
	PageInfo<Zwu> selects(String mohu, int pageNum, int pageSize);

	/** 
	 * @Title: getZtype 
	 * @Description: TODO
	 * @return
	 * @return: List<Ztype>
	 */
	List<Ztype> getZtype();

	/** 
	 * @Title: add 
	 * @Description: TODO
	 * @param zwu
	 * @return
	 * @return: boolean
	 */
	boolean add(Zwu zwu);

	/** 
	 * @Title: getOne 
	 * @Description: TODO
	 * @param zid
	 * @return
	 * @return: Zwu
	 */
	Zwu getOne(Integer zid);

	/** 
	 * @Title: update 
	 * @Description: TODO
	 * @param zwu
	 * @return
	 * @return: boolean
	 */
	boolean update(Zwu zwu);

	/** 
	 * @Title: deleteAll 
	 * @Description: TODO
	 * @param ids
	 * @return
	 * @return: boolean
	 */
	boolean deleteAll(int[] ids);

	/** 
	 * @Title: deleteOne 
	 * @Description: TODO
	 * @param zid
	 * @return
	 * @return: boolean
	 */
	boolean deleteOne(int zid);

}
