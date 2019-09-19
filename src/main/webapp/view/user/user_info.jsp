<!-- 静态包含 -->
<%@include file="../include/header.jsp" %>
<%@include file="../include/nav.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title></title>
         
        <script language="javascript" type="text/javascript">
            //保存成功的提示信息
            function showResult(msg) {
            	var m;
            	if("ok"==(msg)){
            		m="修改成功！"
            	}else{
            		m="修改失败！"
            	}
            	$("#save_result_info").text(m);
                showResultDiv(true);
                window.setTimeout("showResultDiv(false);", 3000);
            }
            function showResultDiv(flag) {
                if (flag)
                    $("#save_result_info").css("display","block");
                else
                	$("#save_result_info").css("display","none");
            }
        </script>
        <script type="text/javascript">
        $(document).ready(function(){
        	$("#btn_save").click(function(){
    			$.post({
    				url:'${pageContext.request.contextPath }/updateMsg',
    				data:$("#main_form").serialize(),
    				success:function(result){
    					if("ok"==(result)){
    						showResult(result);
    					}
    				}
    			});
    		});
    	});
        </script>
    </head>
    <body>
        <!--主要区域开始-->
        <div id="main">            
            <!--保存操作后的提示信息：成功或者失败-->
            	<div id="save_result_info" class="save_success" style="display:none;"></div>
           		<form action="${pageContext.request.contextPath }/updateMsg" method="post" class="main_form" id="main_form">
                <div class="text_info clearfix"><span>管理员账号：</span></div>
                <div class="input_info"><input type="text" readonly="readonly" class="readonly" value="${admin.acname }" /></div>
                <div class="text_info clearfix"><span>角色：</span></div>
                <div class="input_info">
                    <input type="text" readonly="readonly" class="readonly width400" value="${admin.lrString }" />
                </div>
                <div class="text_info clearfix"><span>姓名：</span></div>
                <div class="input_info">
                    <input type="text" value="${admin.aname }" name="aname"/>
                    <span class="required">*</span>
                    <div class="validate_msg_long error_msg" style="display: none;">20长度以内的汉字、字母的组合</div>
                </div>
                <div class="text_info clearfix"><span>电话：</span></div>
                <div class="input_info">
                    <input type="text" class="width200" value="${admin.atel }" name="atel"/>
                    <div class="validate_msg_medium" style="display: none;">电话号码格式：手机或固话</div>
                </div>
                <div class="text_info clearfix"><span>Email：</span></div>
                <div class="input_info">
                    <input type="text" class="width200" value="${admin.aemail }" name="aemail"/>
                    <div class="validate_msg_medium" style="display: none;">50长度以内，符合 email 格式</div>
                </div>
                <div class="text_info clearfix"><span>创建时间：</span></div>
                <div class="input_info"><input type="text" readonly="readonly" class="readonly" value="${admin.createdate }"/></div>
                <div class="button_info clearfix">
                    <input type="button" value="保存" class="btn_save" id="btn_save" />
                    <input type="button" value="取消" class="btn_save" />
                </div>
            </form>  
        </div>
        <!--主要区域结束-->
        <div id="footer">
          
        </div>
    </body>
</html>
