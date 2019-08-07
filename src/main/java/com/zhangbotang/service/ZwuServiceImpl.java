/**   
 * Copyright © 2019 公司名. 八维董事长.
 * 
 * @Title: ZwuServiceImpl.java 
 * @Prject: zhangbotang-week1
 * @Package: com.zhangbotang.service 
 * @Description: TODO
 * @author: 11209   
 * @date: 2019年8月6日 上午9:04:36 
 * @version: V1.0   
 */
package com.zhangbotang.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhangbotang.dao.ZwuDao;
import com.zhangbotang.domain.Ztype;
import com.zhangbotang.domain.Zwu;

/** 
 * @ClassName: ZwuServiceImpl 
 * @Description: TODO
 * @author: 11209
 * @date: 2019年8月6日 上午9:04:36  
 */
@Service
public class ZwuServiceImpl implements ZwuService {

	@Resource
	private ZwuDao dao;
	/* (non Javadoc) 
	 * @Title: selects
	 * @Description: TODO
	 * @param mohu
	 * @param pageNum
	 * @param pageSize
	 * @return 
	 * @see com.zhangbotang.service.ZwuService#selects(java.lang.String, int, int) 
	 */
	@Override
	public PageInfo<Zwu> selects(String mohu, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<Zwu> list = dao.selects(mohu);
		PageInfo<Zwu> pageInfo = new PageInfo<Zwu>(list);
		return pageInfo;
	}
	/* (non Javadoc) 
	 * @Title: getZtype
	 * @Description: TODO
	 * @return 
	 * @see com.zhangbotang.service.ZwuService#getZtype() 
	 */
	@Override
	public List<Ztype> getZtype() {
		
		return dao.getZtype();
	}
	/* (non Javadoc) 
	 * @Title: add
	 * @Description: TODO
	 * @param zwu
	 * @return 
	 * @see com.zhangbotang.service.ZwuService#add(com.zhangbotang.domain.Zwu) 
	 */
	@Override
	public boolean add(Zwu zwu) {
		try {
			dao.add(zwu);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return false;
		}
	}
	/* (non Javadoc) 
	 * @Title: getOne
	 * @Description: TODO
	 * @param zid
	 * @return 
	 * @see com.zhangbotang.service.ZwuService#getOne(java.lang.Integer) 
	 */
	@Override
	public Zwu getOne(Integer zid) {
		
		return dao.getOne(zid);
	}
	/* (non Javadoc) 
	 * @Title: update
	 * @Description: TODO
	 * @param zwu
	 * @return 
	 * @see com.zhangbotang.service.ZwuService#update(com.zhangbotang.domain.Zwu) 
	 */
	@Override
	public boolean update(Zwu zwu) {
		try {
			dao.update(zwu);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	/* (non Javadoc) 
	 * @Title: deleteAll
	 * @Description: TODO
	 * @param ids
	 * @return 
	 * @see com.zhangbotang.service.ZwuService#deleteAll(int[]) 
	 */
	@Override
	public boolean deleteAll(int[] ids) {
		return dao.deleteAll(ids);
	}
	/* (non Javadoc) 
	 * @Title: deleteOne
	 * @Description: TODO
	 * @param zid
	 * @return 
	 * @see com.zhangbotang.service.ZwuService#deleteOne(int) 
	 */
	@Override
	public boolean deleteOne(int zid) {
		try {
			dao.deleteOne(zid);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
