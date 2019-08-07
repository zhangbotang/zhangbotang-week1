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
			<input type="text" name="zname" value="${one.zname }">
		</td>
	</tr>
	<tr>
		<td>描述</td>
		<td>
			<textarea rows="2" cols="22" name="durle">
			${one.durle }
			</textarea>
		</td>
	</tr>
	<tr>
		<td>类别</td>
		<td>
			${one.tname }
		</td>
	</tr>
	<tr>
		<td colspan="10">
			<input type="button" value="返回" onclick="back()">
		</td>
	</tr>
</table>
</form>
</body>
</html>