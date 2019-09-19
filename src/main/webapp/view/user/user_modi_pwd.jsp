<%@include file="../include/header.jsp" %>
<%@include file="../include/nav.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title></title>
        <script type="text/javascript">
        	$(document).ready(function(){
        		$("#smit").click(function(){
        			$("#loginfrom").submit();
        		});
        	});
        </script>        
    </head>
    <body>
        
        <div id="main">      
            <!--保存操作后的提示信息：成功或者失败-->
            <c:if test="${upMsg!=null }">
            		<div id="save_result_info" class="save_fail" style="display:block">${upMsg }</div><!--保存失败，旧密码错误！-->
            </c:if>   
            <form action="${pageContext.request.contextPath }/updateApwd" method="post" class="main_form" id="loginfrom">
                <div class="text_info clearfix"><span>旧密码：</span></div>
                <div class="input_info">
                    <input type="password" class="width200"  name="oldApwd"/><span class="required">*</span>
                    <div class="validate_msg_medium" style="display: none;">30长度以内的字母、数字和下划线的组合</div>
                </div>
                <div class="text_info clearfix"><span>新密码：</span></div>
                <div class="input_info">
                    <input type="password"  class="width200" /><span class="required">*</span>
                    <div class="validate_msg_medium" style="display: none;">30长度以内的字母、数字和下划线的组合</div>
                </div>
                <div class="text_info clearfix"><span>重复新密码：</span></div>
                <div class="input_info">
                    <input type="password" class="width200" name="newApwd" /><span class="required">*</span>
                    <div class="validate_msg_medium"></div>
                </div>
                <div class="button_info clearfix">
                    <input type="button" value="保存" class="btn_save" id="smit" />
                    <input type="button" value="取消" class="btn_save" />
                </div>
            </form>  
        </div>
        <!--主要区域结束-->
        <div id="footer">
           
        </div>
    </body>
</html>
