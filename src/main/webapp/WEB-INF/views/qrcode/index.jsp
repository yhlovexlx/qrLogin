<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="/base.jsp" %>  
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>jsxwsl</title>
</head>
<body>
	<div align="center" style="margin-top: 30px">
		<img alt="" src="${ctx}/login/code/${uuid}">	
	</div>
	<div align="center">
		<p id="msg">请用手机扫描</p>
	</div>
</body>


<script type="text/javascript" src="${ctx}/static/jquery-1.12.4.min.js"></script>
<script type="text/javascript">
	$(function(){
		// 向服务器发起开启轮询验证通知， 第一波验证二维码被扫状态
		$.ajax({
			url:"${ctx}/login/validate",
			method: "post",
			data:{
				uuid:"${uuid}",
			},
			success:function(res){
				var state = res.state;
				$("#msg").html('');
				if( state == -3){
					$("#msg").append("二维码已经失效");
				}
				else if(state == 1){
					$("#msg").append("请在手机上确认登录");
					
					// 第二波验证登录状态
					$.ajax({
						url:"${ctx}/login/validate",
						method: "post",
						data:{
							uuid:"${uuid}",
						},
						success:function(res){
							var state = res.state;
							$("#msg").html('');
							if( state == -3){
								$("#msg").append("二维码已经失效");
							}
							if(state == 2){
								$("#msg").append("登录成功，正在跳转。。。");
								// todo 
								// ...
								setInterval(function(){
									window.location.href ="${ctx}/user/6.html";
								}, 1*1000)
							}
							else if(state == -2){
								$("#msg").append("取消登录");
							}
						}
					});
				}
			}
		});
	});

</script>
</html>