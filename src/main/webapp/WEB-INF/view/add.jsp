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
$(function () {
	$.post("getZtype",function(arr){
		for (var i = 0; i < arr.length; i++) {
			$("[name=tid]").append("<option value='"+arr[i].tid+"'>"+arr[i].tname+"</option>");
		}
	},"json")
})
function add() {
	$.post("add",$("form").serialize(),function(flg){
		if(flg){
			alert("保存成功")
			location = "toList";
		}else{
			alert("保存失败")
		}
	},"json")
}
function back() {
	location = "toList"
}
</script>
</head>
<body>
<form>
<table>
	<tr>
		<td>植物名称</td>
		<td>
			<input type="text" name="zname">
		</td>
	</tr>
	<tr>
		<td>描述</td>
		<td>
			<textarea rows="2" cols="22" name="durle">
			</textarea>
		</td>
	</tr>
	<tr>
		<td>类别</td>
		<td>
			<select name="tid">
				<option>请选择</option>
			</select>
		</td>
	</tr>
	<tr>
		<td colspan="10">
			<input type="button" value="确定" onclick="add()">
			<input type="button" value="返回" onclick="back()">
		</td>
	</tr>
</table>
</form>
</body>
</html>