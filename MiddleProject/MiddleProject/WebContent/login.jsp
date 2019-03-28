<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<form role="form">
					<div class="form-group">

						<label for="exampleInputEmail1"> Email address </label> <input
							class="form-control" id="exampleInputEmail1" type="email" />
					</div>
					<div class="form-group">

						<label for="exampleInputPassword1"> Password </label> <input
							class="form-control" id="exampleInputPassword1" type="password" />
					</div>
					<div class="form-group">

						<label for="exampleInputFile"> File input </label> <input
							class="form-control-file" id="exampleInputFile" type="file" />
						<p class="help-block">Example block-level help text here.</p>
					</div>
					<div class="checkbox">

						<label> <input type="checkbox" /> Check me out
						</label>
					</div>
					<button class="btn btn-primary" type="submit">Submit</button>
				</form>
			</div>
		</div>
	</div>


	<%
		String messageContent = null;
		if (session.getAttribute("messageContent") != null) {
			messageContent = (String) session.getAttribute("messageContent");
		}
		String messageType = null;
		if (session.getAttribute("messageType") != null) {
			messageType = (String) session.getAttribute("messageType");
		}
		if (messageContent != null) {
	%>
	<div class="modal fade" id="messageModal" tabindex="-1" role="dialog"
		aria-hidden="true">
		<div class="vertical-aligment-helper">
			<div class="modal-dialog"vertical-align-center">
				<div class="modal-content
					<%if (messageType.equals("���� �޽���"))
					out.println("panel-warning");
				else
					out.println("panel-success");%>">
					<div class="moda-header panel-heading">
						<button type="button" class="close" data-dismiss="modal">
							<span aria-hidden="true">&times;</span> <span class="sr-only">Close</span>
						</button>
						<h4 class="modal-title">
							<%=messageType%>
						</h4>
					</div>
					<div class="modal-body">
						<%=messageContent%>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-primary" data-dismiss="modal">Ȯ��</button>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script>
		$('#messageModal').modal("show");
	</script>

	<%
		session.removeAttribute("messageContent");
			session.removeAttribute("messageType");
		}
	%>
	<!-- �ߺ�Ȯ�� : DAO�۾��ڴ� if(rs.next() || userID.equals("") ������� ���� 0�� ����ϰ� �������-->
	
<div class="modal fade" id="checkmodal" tabindex="-1" role="dialog"
		aria-hidden="true">
		<div class="vertical-aligment-helper">
			<div class="modal-dialog"vertical-align-center">
				<div class="modal-content panel-info
					%>">
					<div class="moda-header panel-heading">
						<button type="button" class="close" data-dismiss="modal">
							<span aria-hidden="true">&times;</span> <span class="sr-only">Close</span>
						</button>
						<h4 class="modal-title">Ȯ�θ޽���
						</h4>
					</div>
					<div class="modal-body" id="checkMessasge">
						
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-primary" data-dismiss="modal">Ȯ��</button>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>