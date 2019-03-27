<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ page import="java.util.* , vo.*" %>
    <%
    List<Member> all = 
    (List<Member>) request.getAttribute("all");
    %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table class="t1">

		<thead>
			<tr>
				<th>번호</th>
				<th>아이드</th>
				<th>비번</th>
				<th>닉네임</th>
				<th>연락처</th>
				<th>시도</th>
				<th>시군구</th>
				<th>도로명주소</th>
				
			</tr>
		</thead>

		<tbody>
			<c:forEach var="se" items="${all}">
				<tr class="odd">
					<td>${se.id }</td>
					<td>${se.pw }</td>
					<td>${se.n_id }</td>
					<td>${se.tel }</td>
					<td>${se.sido }</td>
					<td>${se.gu }</td>

					<td><a href="delete.do?del_name=${se.id}">삭제</a></td>
					<td><a href="find.do?find_name=${se.id}">수정</a></td>
				</tr>
			</c:forEach>
		</tbody>

	</table>
	<font style="font-size: 2em;"> <% String url = request.getContextPath(); %>
		<a href='<%=url %>/view/member.do'>회원추가</a></font>

</body>
</html>