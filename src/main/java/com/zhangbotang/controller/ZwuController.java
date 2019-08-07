/**   
 * Copyright © 2019 公司名. 八维董事长.
 * 
 * @Title: ZwuController.java 
 * @Prject: zhangbotang-week1
 * @Package: com.zhangbotang.controller 
 * @Description: TODO
 * @author: 11209   
 * @date: 2019年8月6日 上午8:58:46 
 * @version: V1.0   
 */
package com.zhangbotang.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.zhangbotang.domain.Ztype;
import com.zhangbotang.domain.Zwu;
import com.zhangbotang.service.ZwuService;

/** 
 * @ClassName: ZwuController 
 * @Description: TODO
 * @author: 11209
 * @date: 2019年8月6日 上午8:58:46  
 */
@Controller
public class ZwuController {

	@Resource
	private ZwuService ser;
	/**
	 * 
	 * @Title: toList 
	 * @Description: TODO
	 * @param mohu
	 * @param pageNum
	 * @param request
	 * @return
	 * @return: String
	 */
	@RequestMapping("toList")
	public String toList(String mohu,@RequestParam(defaultValue = "1")int pageNum,HttpServletRequest request) {
//		(1)分页展示（5分）
//		(2)按植物名称模糊搜索（5分），搜索后的数据也能正确分页（5分）
//		(3)完成“查看”功能。点击“查看”按钮后，弹出一个新网页，当前数据要正确显示，分类要进行回显。（5分）
		int pageSize = 4;
		PageInfo<Zwu> pageInfo = ser.selects(mohu,pageNum,pageSize);
		request.setAttribute("pageInfo", pageInfo);
		request.setAttribute("mohu", mohu);
		request.setAttribute("pageSize", pageSize);
		return "list";
	}
	//添加页面
	@RequestMapping("toAdd")
	public String toAdd() {
		return "add";
	}
//	(1)打开添加页面时，可展示 “分类”的数据，
//	必须使用ajax获取“分类”表中数据(5分)，
//	将数据通过下拉框进行展示(5分)。
	@RequestMapping("getZtype")
	@ResponseBody
	public List<Ztype> getZtype(){
		return ser.getZtype();
	}
//	(3)保存成功显示“保存成功!”提示按钮(alert)，
//	点击“确定”后并跳转到列表页面（4分）。
//	保存失败，提示“保存失败!”，点击“确定”按钮后停留在添加页面（4分）
	@RequestMapping("add")
	@ResponseBody
	public boolean add(Zwu zwu) {
		return ser.add(zwu);
	}
//	(1)点击“编辑”按钮后，弹出一个网页能够实现普通字段数据回显(4分)，实现“分类”数据的下拉框回显（5分），
//	(2)修改数据后，点击保存。保存成功跳转到列表页面（4）
	@RequestMapping("toUpdate")
	public String toUpdate(Integer zid,HttpServletRequest request) {
		Zwu zwu = ser.getOne(zid);
		request.setAttribute("zwu", zwu);
		return "update";
	}
	//修改
	@RequestMapping("update")
	@ResponseBody
	public boolean update(Zwu zwu) {
		return ser.update(zwu);
	}
	//批量删除
	@RequestMapping("deleteAll")
	@ResponseBody
	public boolean deleteAll(@RequestParam("ids[]")int[] ids) {
		return ser.deleteAll(ids);
	}
	//单删
	@RequestMapping("deleteOne")
	@ResponseBody
	public boolean deleteOne(int zid) {
		return ser.deleteOne(zid);
	}
	
	//查看
	@RequestMapping("toLook")
	public String toLook(Integer zid, HttpServletRequest request) {
		Zwu one = ser.getOne(zid);
		request.setAttribute("one", one);
		return "look";
	}
	
	
}
