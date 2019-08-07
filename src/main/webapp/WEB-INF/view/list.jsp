<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="resource/css/index.css" rel="stylesheet">
<script type="text/javascript" src="resource/js/jquery-3.3.1.js"></script>
<script type="text/javascript">
function fy(pageNum) {
	$("[name=pageNum]").val(pageNum);
	$("form").submit();
}
function add() {
	location = "toAdd";
}
function update(zid) {
	location = "toUpdate?zid="+zid;
}
function qx(own) {
	$("[name=ids]").prop("checked",own.checked)
}
function deleteAll() {
	var ids = new Array();
	$("[name=ids]:checked").each(function (i) {
		ids[i] = this.value;
	})
	if(ids.length==0){
		alert("必须选择一个");
		return;
	}
	$.post("deleteAll",{ids:ids},function(flg){
		if(flg){
			alert("删除成功");
			location = "toList";
		}else{
			alert("删除失败");
		}
	},"json")
}
function deleteOne(zid) {
	$.post("deleteOne",{zid:zid},function(flg){
		if(flg){
			alert("删除成功");
			location = "toList";
		}else{
			alert("删除失败");
		}
	},"json")
}
function look(zid) {
	location = "toLook?zid="+zid;
}
</script>
</head>
<body>
<h1>展示页面</h1>
<table>
	<tr>
		<td><button onclick="add()">添加</button></td>
		<td colspan="10">
		<form action="toList" method="post">
			查询内容<input type="text" name="mohu" value="${mohu }">
			<input type="hidden" name="pageNum">
			<button>搜索</button>
		</form>
		</td>
	</tr>
	<tr>
		<td>
			<input type="checkbox" onclick="qx(this)">
			全选
		</td>
		<td>序号</td>
		<td>植物名称</td>
		<td>描述</td>
		<td>类别</td>
		<td>操作</td>
	<c:forEach items="${pageInfo.list }" var="l" varStatus="count">
		</tr>
			<td>
				<input type="checkbox" name="ids" value="${l.zid }">
			</td>
			<td>${count.count+(pageInfo.pageNum-1)*pageSize }</td>
			<td>${l.zname }</td>
			<td>${l.durle }</td>
			<td>${l.tname }</td>
			<td>
				<button onclick="look(${l.zid})">查看</button>
				<button onclick="update(${l.zid})">修改</button>
				<button onclick="deleteOne(${l.zid})">删除</button>
			</td>
		<tr>
	</c:forEach>
		<td>
			<button onclick="deleteAll()">批量删除</button>
		</td>
		<td colspan="10">
			<button onclick="fy(1)">首页</button>
			<button onclick="fy(${pageInfo.prePage==0?1:pageInfo.prePage})">上一页</button>
			<button onclick="fy(${pageInfo.nextPage==0?pageInfo.lastPage:pageInfo.nextPage})">下一页</button>
			<button onclick="fy(${pageInfo.lastPage})">尾页</button>
			当前是第${pageInfo.pageNum }页/共计${pageInfo.lastPage }页
		</td>
	
	</tr>
</table>
</body>
</html>