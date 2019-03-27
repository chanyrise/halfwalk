<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body style="font-size: 2.5em;margin: 200px 200px;">

<% String url = request.getContextPath(); %>
<form action="<%=url%>/insert.do" method="get">
	no : <input type="text" name = "no" value="${member.no}"/><br/>
	id : <input type="text" name = "id" value="${member.id}"/> <br/>
	pw : <input type="text" name = "pw" value="${member.pw}"/> <br/>
	n_id : <input type="text" name = "n_id" value="${member.n_id}"/> <br/>
	tel : <input type="text" name = "tel" value="${member.tel}"/> <br/>
	sido : <input type="text" name = "sido" value="${member.sido}"/> <br/>
	gu : <input type="text" name = "gu" value="${member.gu}"/> <br/>
	
	<input type="submit" value="확인"/>
	<input type="reset" value="취소"/>
</form>

</body>
</html>