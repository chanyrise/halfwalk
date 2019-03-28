<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>JSP AJAX로 회원가입 만들기</title>
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/signup.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="js/bootstrap.js"></script>
<script type="text/javascript">
	function registerCheckFunction(){
		var userID = $('#userID').val();
		$.ajax({
			type: 'POST',
			url: './UserRegisterCheckServlet',
			data:{userID : userID},
			success: function(result){
				if(result==1){
					$('#checkMessage').html('사용할 수 있는 ID입니다.')
					$('#checkType').attr('class', 'modal-content panel-success');

				}
				else{
					$('#checkMessage').html('사용할 수 없는 ID입니다.')
					$('#checkType').attr('class', 'modal-content panel-warning');
				}
				$('#checkModal').modal("show");
			}
		})
	}

	function passwordCheckFunction(){
		var pw1 = $('#pw1').val();
		var pw2 = $('#pw2').val();
		if(pw1 != pw2){
			$('#passwordCheckMessage').html('비밀번호가 서로 일치하지 않습니다.');
		} else{
			$('#passwordCheckMessage').html('');
		}
	}
	<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
	<script>
	    //본 예제에서는 도로명 주소 표기 방식에 대한 법령에 따라, 내려오는 데이터를 조합하여 올바른 주소를 구성하는 방법을 설명합니다.
	    function sample4_execDaumPostcode() {
	        new daum.Postcode({
	            oncomplete: function(data) {
	                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

	                // 도로명 주소의 노출 규칙에 따라 주소를 표시한다.
	                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
	                var roadAddr = data.roadAddress; // 도로명 주소 변수
	                var extraRoadAddr = ''; // 참고 항목 변수

	                // 법정동명이 있을 경우 추가한다. (법정리는 제외)
	                // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
	                if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
	                    extraRoadAddr += data.bname;
	                }
	                // 건물명이 있고, 공동주택일 경우 추가한다.
	                if(data.buildingName !== '' && data.apartment === 'Y'){
	                   extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);
	                }
	                // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
	                if(extraRoadAddr !== ''){
	                    extraRoadAddr = ' (' + extraRoadAddr + ')';
	                }

	                // 우편번호와 주소 정보를 해당 필드에 넣는다.
	                document.getElementById('sample4_postcode').value = data.zonecode;
	                document.getElementById("sample4_roadAddress").value = roadAddr;
	                document.getElementById("sample4_jibunAddress").value = data.jibunAddress;
	                
	                // 참고항목 문자열이 있을 경우 해당 필드에 넣는다.
	                if(roadAddr !== ''){
	                    document.getElementById("sample4_extraAddress").value = extraRoadAddr;
	                } else {
	                    document.getElementById("sample4_extraAddress").value = '';
	                }

	                var guideTextBox = document.getElementById("guide");
	                // 사용자가 '선택 안함'을 클릭한 경우, 예상 주소라는 표시를 해준다.
	                if(data.autoRoadAddress) {
	                    var expRoadAddr = data.autoRoadAddress + extraRoadAddr;
	                    guideTextBox.innerHTML = '(예상 도로명 주소 : ' + expRoadAddr + ')';
	                    guideTextBox.style.display = 'block';

	                } else if(data.autoJibunAddress) {
	                    var expJibunAddr = data.autoJibunAddress;
	                    guideTextBox.innerHTML = '(예상 지번 주소 : ' + expJibunAddr + ')';
	                    guideTextBox.style.display = 'block';
	                } else {
	                    guideTextBox.innerHTML = '';
	                    guideTextBox.style.display = 'none';
	                }
	            }
	        }).open();
	    }
	</script>
	
</head>
<body>
<ol class="breadcrumb">
  <li class="breadcrumb-item"><a href="#">Home</a></li>
  <li class="breadcrumb-item"><a href="#">게시판</a></li>
  <li class="breadcrumb-item active">로그인</li>
</ol>
	<div class="container">
		<div class="row main">
			
			<div class="main-login main-center">
				<form>
					<fieldset>
						<legend>회원가입</legend>

						<div class="form-group">
							<label for="userID">ID</label>
							<td><input class="form-control" id="userID"
								aria-describedby="userID" type="text" placeholder="ID 입력"></td>
							<td style="width: 310px;"><button class="btn btn-primary"
									oneclick="registerCheckfuntion();" type="button">중복확인</button></td>
							<small class="form-text text-muted" id="userID">중복확인을
								눌러주세요</small>
						</div>
						<div class="form-group">
							<label for="pw1">비밀번호</label> <input
								class="form-control" id="pw1" type="password" 
								onkeyup="passwordCheckFunction();" placeholder="비밀번호 입력">
						</div>
						<div class="form-group">

							<input class="form-control" id="pw2" type="password"
								onkeyup="passwordCheckFunction();" placeholder="비밀번호 확인">
								<div id="passwordCheckMessage"></div>
						</div>
						<div class="form-group">
							<label for="name">이름</label> <input class="form-control"
								id="name" type="text" placeholder="이름">
						</div>
						<div class="form-group">
							<label>생일</label> <input type="text" id="u_birthday"
								class="form-control" placeholder="선택하세요">
						</div>


						<div class="form-group">
							<label for="u_sex">성별</label>
							<div class="form-group" style="margin: 0 auto;">
								<div class="btn-group" data-toggle="buttons">
									<label class="btn btn-primary "> <input type="radio"
										name="u_sex" autocomplite="off" value="남자" checked>남자
									</label> <label class="btn btn-primary"> <input type="radio"
										name="u_sex" autocomplite="off" value="여자">여자
									
									</label>
								</div>
							</div>
						</div>
						<div class="form-group">
							<label for="address">주소</label><br>
<input type="text" id="sample4_postcode" placeholder="우편번호">
<input type="button" onclick="sample4_execDaumPostcode()" value="우편번호 찾기"><br>
<input type="text" id="sample4_roadAddress" placeholder="도로명주소">
<input type="text" id="sample4_jibunAddress" placeholder="지번주소">
<span id="guide" style="color:#999;display:none"></span>
<input type="text" id="sample4_detailAddress" placeholder="상세주소">
<input type="text" id="sample4_extraAddress" placeholder="참고항목">
						</div>

						<div class="form-group">
							<label for="email">e-Mail</label> <input class="form-control"
								id="email" type="email" placeholder="e-Mail 입력">
						</div>
						<div class="form-group">
							<label for="tel">전화번호</label> <input class="form-control"
								id="tel" type="text" placeholder="ex)010-0000-0000" />
						</div>


						<div class="form-group">
							<label for="petnum">반려견 수</label> <select class="form-control"
								id="petnum">
								<option>0</option>
								<option>1</option>
								<option>2</option>
								<option>3</option>
								<option>4</option>
								<option>5 이상</option>
							</select>
						</div>

						<h5 style="color: red;" id="passwordCheckMessage"></h5>
						<button class="btn btn-primary pull-right" type="submit">가입</button>
						<button class="btn btn-default pull-right" type="reset" onclick="myFunction()">취소</button>
					</fieldset>

				</form>

				<script type="text/javascript" src="assets/js/bootstrap.js"></script>
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
					<%if (messageType.equals("오류 메시지"))
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
						<button type="button" class="btn btn-primary" data-dismiss="modal">확인</button>
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
	<!-- 중복확인 : DAO작업자는 if(rs.next() || userID.equals("") 비어있을 때도 0을 출력하게 해줘야함-->
	
<div class="modal fade" id="checkmodal" tabindex="-1" role="dialog"
		aria-hidden="true">
		<div class="vertical-aligment-helper">
			<div class="modal-dialog"vertical-align-center">
				<div id="checkType" class="modal-content panel-info
					">
					<div class="moda-header panel-heading">
						<button type="button" class="close" data-dismiss="modal">
							<span aria-hidden="true">&times;</span> <span class="sr-only">Close</span>
						</button>
						<h4 class="modal-title">확인메시지
						</h4>
					</div>
					<div class="modal-body" id="checkMessasge">
						
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-primary" data-dismiss="modal">확인</button>
					</div>
				</div>
			</div>
		</div>
	</div>
	</div>
	
</body>
</html>