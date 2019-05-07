<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">
			var time = 4;
	        function returnUrlByTime() {  
	            window.setTimeout('returnUrlByTime()', 1000);  
	            time = time - 1;  
	            if(time<=0){
	            	time = 0;
	         window.setTimeout("location.href='${pageContext.request.contextPath}/index.jsp';", 0); 
	            }
	            document.getElementById("layer").innerHTML = time;  
	        }  
		</script>
<body onload="returnUrlByTime()">
 <div >
<a href="javascript:void(0)" onclick="window.location.href='${pageContext.request.contextPath}/index.jsp' " ><font size="5px" >注册成功，<b><span id="layer">3</span></b>秒后会自动跳转，如果没有跳转，请点这里......</font></a></div>


</body>
</html>