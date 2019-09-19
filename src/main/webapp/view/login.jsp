<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title></title>
        <link type="text/css" rel="stylesheet" media="all" href="${pageContext.request.contextPath }/assets/css/global.css" />
        <link type="text/css" rel="stylesheet" media="all" href="${pageContext.request.contextPath }/assets/css/global_color.css" />
        <script type="text/javascript" src="${pageContext.request.contextPath }/assets/js/jquery-1.12.4.min.js"></script>
        <script type="text/javascript">
        	$(document).ready(function(){
        		$("#smit").click(function(){
        			if(($("#apwd").val())==""||($("#acname").val())==""){
        				$("#text").text("请输入账号或者密码");
        			}else{
        				$("#slideBar").css("display","block");
        			}
        		});
        	});
        </script>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
   		<link rel="stylesheet" href="${pageContext.request.contextPath }/assets/css/style.css">
   		<script type="text/javascript" src="${pageContext.request.contextPath }/assets/js/style.js"></script>
    </head>
    <body class="index">


        <div class="login_box" >
        <form action="${pageContext.request.contextPath }/login" method="post" id="loginfrom">
        <span id="text" style="color:red;padding-left: 30%;">${error }</span>
        	 <table>
                <tr>
                    <td class="login_info">账号：</td>
                    <td colspan="2"><input name="acname" type="text" class="width150" id="acname"/></td>
                   <!--  <td class="login_error_info"><span class="required">30长度的字母、数字和下划线</span></td> -->
                </tr>
                <tr>
                    <td class="login_info">密码：</td>
                    <td colspan="2"><input name="apwd" type="password" class="width150"  id="apwd"/></td>
                  <!--   <td><span class="required">30长度的字母、数字和下划线</span></td> -->
                </tr>
                <tr>
                    <td></td>
                    <td class="login_button" colspan="2">
                        <a id="smit"><img src="${pageContext.request.contextPath }/assets/images/login_btn.png" /></a>
                    </td>    
                </tr>
                <tr>
                	<td><span id="span"></span></td>
                </tr>
            </table>
            	<div id="slideBar"  style="display:none; position: absolute; top: 23%;left: 43%;" id="slideBar"></div>
					<script type="text/javascript" >
						var dataList = [ "0", "1" ];
						var options = {
							dataList : dataList,
							success : function() {
								console.log("show");
								$("#loginfrom").submit();
							},
							fail : function() {
								console.log("fail");
							}
						};
						SliderBar("slideBar", options);
					</script>
            </div>
            
        </form>
           
        
</body>
</html>
