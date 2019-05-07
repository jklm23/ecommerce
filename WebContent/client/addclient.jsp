<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<title>注册新用户</title>
<style type="text/css">
	.form-signin{
		max-width: 500px;
		padding: 15px;
		margin: 0 auto;
	}
	input{
		margin-bottom: 5px;
	}
	select {
		margin-bottom: 5px;
	}
</style>
</head>
<!-- 密码输入校验 -->
<script type="text/javascript">
 function checkpwd(){
  var p1=document.register.cpassword.value;//获取密码框的值
  var p2=document.register.cpassword_check.value;//获取重新输入的密码值
  
  if(p1!=p2){//判断两次输入的值是否一致，不一致则显示错误信息
   document.getElementById("msg").innerHTML="两次输入密码不一致，请重新输入";//在div显示错误信息
   return false;
  }else{
	  document.getElementById("msg").innerHTML=""
  }
 }
</script>


<body style="background-color: #F5FFFA">
	<div class="container" style="margin-top: 7%;width: 550px;">
		<form action="/ecommerce/user/addclient" method="post" class="form-signin" role="form" name="register">
			<div class="alert alert-info" role="alert"><h3 align="center">新用户注册</h3></div>
			<% if(request.getAttribute("key")!=null) out.print("<h4 class='text-danger'>"+request.getAttribute("key")+"</h4>");%>
			<input type="text" class="form-control" placeholder="用户名" required autofocus name="cname">
			<input type="password" class="form-control"  placeholder="用户密码" required name="cpassword">
			<input type="password" class="form-control"  placeholder="确认密码" required name="cpassword_check" onchange="checkpwd()"> 
			<h4 class='text-danger' id="msg"></h4>
			<select class="form-control" name="csex">
				<option value="男">男
				<option value="女">女
			</select>
			<input type="text" class="form-control" placeholder="年龄" required autofocus name="cage">
			<input type="text" class="form-control" placeholder="电话" required autofocus name="cphone">
			<input type="text" class="form-control" placeholder="收货地址" required autofocus name="caddress">
			<input type="submit" value="注册" class="btn btn-primary container" >
			<button type="button" class="btn btn-danger container" onclick="window.history.back()">返回上一级</button>
		</form>
	 </div>

	
	
	
 <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
 <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
 <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
	
</body>
</html>