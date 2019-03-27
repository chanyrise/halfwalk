<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h3>
<% String url = request.getContextPath(); %>
<form action="<%=url %>/update.do" method="get">
입력 <br><br>
번호:<input type="text" name="no" value="${find.no }" /><br>
id : <input type="text" name="id" value='${find.id}' /><br>
pw : <input type="text" name="pw" value='${find.pw}' /><br>
닉네임: <input type="text" name="n_id" value='${find.n_id}' /><br>

<input type="submit" value="확인" />
<input type="reset" value="취소" />

</form>
</h3>
</body>
</html>