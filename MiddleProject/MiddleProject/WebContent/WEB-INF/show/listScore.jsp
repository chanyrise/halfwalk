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
				<th>��ȣ</th>
				<th>���̵�</th>
				<th>���</th>
				<th>�г���</th>
				<th>����ó</th>
				<th>�õ�</th>
				<th>�ñ���</th>
				<th>���θ��ּ�</th>
				
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

					<td><a href="delete.do?del_name=${se.id}">����</a></td>
					<td><a href="find.do?find_name=${se.id}">����</a></td>
				</tr>
			</c:forEach>
		</tbody>

	</table>
	<font style="font-size: 2em;"> <% String url = request.getContextPath(); %>
		<a href='<%=url %>/view/member.do'>ȸ���߰�</a></font>

</body>
</html>