<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<s:if test="#request.allBookType==null">
	<c:redirect url="IndexAction.do"></c:redirect>
</s:if>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>优优图书</title>
<link rel="stylesheet" href="./css/global.css" />
<link rel="stylesheet" href="./css/index.css" />
</head>
<body>
	<%@include file="./share/header.jsp"%>
	<div class="content">

		<div class="content_left">
			<div class="all_div">
				<p class="all_title">所有分类</p>
				<div class="all_content">
					<s:iterator value="#request.allBookType">
						<h3>
							<s:property value="key" />
						</h3>
						<div class="category">
							<s:iterator value="value">
								<a href="javascript:;" class="search-type"><s:property /></a>
							</s:iterator>
						</div>
					</s:iterator>
				</div>
			</div>

			<div class="all_div">
				<p class="all_title">系统公告</p>
				<div class="all_content">
					<div class="reBooks" style="height: 140px; color: #e00">
						<MARQUEE onmouseover=this.stop() onmouseout=this.start()
							direction=up height=130 width=172 scrollAmount=3 border="0">
						${requestScope.nContent } </MARQUEE>
					</div>
				</div>
			</div>







		</div>
	</div>



	<script type="text/javascript" src="./js/jquery-1.8.3.js"></script>
	<script type="text/javascript" src="./js/jquery.bxslider2.min.js"></script>
	<script type="text/javascript" src="./js/jquery.hashchange.min.js"></script>
	<script type="text/javascript" src="./js/jquery.easytabs.min.js"></script>
	<script type="text/javascript" src="./js/global.js"></script>
	<script type="text/javascript" src="./js/index.js"></script>
	<script>
		
	</script>
</body>
</html>
