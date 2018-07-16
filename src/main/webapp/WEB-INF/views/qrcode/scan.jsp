<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="/base.jsp" %>  
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta content="width=device-width,user-scalable=no" name="viewport">
<style type="text/css">


	button{
		margin-top: 20px;
		width: 120px;
		height: 50px;
		text-align: center;
	}
	p{
		padding-top: 20px;
	}


</style>
<title>jsxwsl</title>
</head>
<body>
	<c:if test="${ state == -3 }">
		<div align="center">
			<p id="msg">二维码失效</p>
		</div>
	</c:if>

	<c:if test="${ state == 1}">
		<div id="div_1">
			<div align="center">
				<p id="msg"></p>
			</div>
			<div align="center" id="div_btn">
				<div> <button onclick="login('2')" >确认登录</button> </div>
				<div> <button onclick="login('-2')">取消登录</button> </div>
			</div>
		</div>
	</c:if>

</body>
<c:if test="${state == 1}">
<script type="text/javascript" src="${ctx}/static/jquery-1.12.4.min.js"></script>
<script type="text/javascript">

	function login(type){
		
		// 登录
		$.ajax({
			url:"${ctx}/login/do",
			method: "post",
			data:{
				uuid:"${uuid}",
				type:type
			},
			success:function(res){
				$("#div_btn").remove();
				if(res.state == 2){
					$("#msg").html('');
					$("#msg").append("登录成功");
					// todo 
					// ...
				}
				else if(res.state == -2){
					$("#msg").html('');
					$("#msg").append("取消登录");
					// todo 
					// ...
				}
				else if(res.state == -3){
					$("#msg").html('');
					$("#msg").append("二维码失效");
					// todo 
					// ...
				}
			}
		});
	}
</script>
</c:if>
</html>