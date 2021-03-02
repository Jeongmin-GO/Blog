<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ include file="/WEB-INF/views/layout/header.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Board</title>
<script>
	//목록이동
	$(document).on('click', '#btnList', function(){
		location.href="${pageContext.request.contextPath}/board/selectBoardList";
	});
	
	//수정버튼 클릭 이벤트
	$(document).on('click', '#btnUpdate', function(){
		var url="${pageContext.request.contextPath}/board/editForm";
		url = url+ "?bno=" + ${boardDetail.bno} + "&mode=edit";
		
		location.href=url;
	});
	
	//삭제 버튼 클릭 이벤트
	$(document).on('click', '#btnDelete', function(){
		var url="${pageContext.request.contextPath}/board/deleteBoard";
		url = url + "?bno=" + "${boardDetail.bno}";
		location.href=url;
	});
</script>
</head>
<body>
	<article>
		<div class="container" role="main">
			<h2>board Content</h2>
			<div class="bg-white rounded shadow-sm">
				<div class="board_title"><c:out value="${boardDetail.title}"/></div>
				<div class="board_info_box">
					<span class="board_author"><c:out value="${boardDetail.reg_id}"/>,</span>
					<span class="board_date"><c:out value="${boardDetail.reg_date}"/></span>
					<span class="board_viewcnt">조회수 : <c:out value="${boardDetail.view_cnt}"/></span>
				</div>
				<div class="board_content">${boardDetail.content}</div>
				<c:choose>
					<c:when test="${empty boardDetail.tag}"><br></c:when>
					<c:when test="${!empty boardDetail.tag}">
						<div class="board_tag">TAG : <c:out value="${boardDetail.tag}"/></div>
					</c:when>
				</c:choose>
			</div>

			<div style="margin-top : 20px">
				<button type="button" class="btn btn-sm btn-primary" id="btnUpdate">수정</button>
				<button type="button" class="btn btn-sm btn-primary" id="btnDelete">삭제</button>
				<button type="button" class="btn btn-sm btn-primary" id="btnList">목록</button>
			</div>
		</div>

	</article>

</body>
</html>