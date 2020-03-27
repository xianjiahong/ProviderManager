<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/static/css/bootstrap.css">
<!-- 引入js文件 -->
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-3.4.1.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/bootstrap.js"></script>
</head>
<body>
	<div class="container">
		<table class="table table-hover">
			<tr>
				<th>供应商编号</th>
				<th>供应商名称</th>
				<th>供应商描述</th>
				<th>供应商联系人</th>
				<th>联系电话</th>
				<th>地址</th>
				<th>传真</th>
				<th>创建者</th>
				<th>创建时间</th>
				<th>更新时间</th>
				<th>更新者</th>
			</tr>
			<c:forEach items="${list }" var="p">
				<tr class="">
					<td>${p.proCode}</td>
					<td>${p.proName}</td>
					<td>${p.proDesc}</td>
					<td>${p.proContact}</td>
					<td>${p.proPhone}</td>
					<td>${p.proAddress}</td>
					<td>${p.proFax}</td>
					<td>${p.createdBy}</td>
					<td><fmt:formatDate value="${p.creationDate }" pattern="YYYY-MM-dd HH:mm:ss"/></td>
					<td><fmt:formatDate value="${p.modifyDate}" pattern="YYYY-MM-dd HH:mm:ss"/></td>
					<!--
					<td>${p.creationDate }</td>
					<td>${p.modifyDate }</td>
					-->
					<td>${p.modifyBy }</td>
					  
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>