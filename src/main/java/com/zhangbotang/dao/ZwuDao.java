/**   
 * Copyright © 2019 公司名. 八维董事长.
 * 
 * @Title: ZwuDao.java 
 * @Prject: zhangbotang-week1
 * @Package: com.zhangbotang.dao 
 * @Description: TODO
 * @author: 11209   
 * @date: 2019年8月6日 上午9:05:14 
 * @version: V1.0   
 */
package com.zhangbotang.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.zhangbotang.domain.Ztype;
import com.zhangbotang.domain.Zwu;

/** 
 * @ClassName: ZwuDao 
 * @Description: TODO
 * @author: 11209
 * @date: 2019年8月6日 上午9:05:14  
 */
public interface ZwuDao {

	/** 
	 * @Title: selects 
	 * @Description: TODO
	 * @param mohu
	 * @return
	 * @return: List<Zwu>
	 */
	List<Zwu> selects(@Param("mohu")String mohu);

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
	 * @return: void
	 */
	void add(Zwu zwu);

	/** 
	 * @Title: getOne 
	 * @Description: TODO
	 * @param zid
	 * @return
	 * @return: Zwu
	 */
	@Select("select zid,zname,durle,z.tid,tname from zw z,ztype t where z.tid=t.tid and zid=#{zid}")
	Zwu getOne(Integer zid);

	/** 
	 * @Title: update 
	 * @Description: TODO
	 * @param zwu
	 * @return: void
	 */
	void update(Zwu zwu);

	/** 
	 * @Title: deleteAll 
	 * @Description: TODO
	 * @param ids
	 * @return
	 * @return: boolean
	 */
	boolean deleteAll(@Param("ids")int[] ids);

	/** 
	 * @Title: deleteOne 
	 * @Description: TODO
	 * @param zid
	 * @return: void
	 */
	@Delete("delete from zw where zid=#{zid}")
	void deleteOne(int zid);

}
