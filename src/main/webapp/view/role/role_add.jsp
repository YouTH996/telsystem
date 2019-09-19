<!-- 静态包含 -->
<%@include file="../include/header.jsp" %>
<%@include file="../include/nav.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title></title>
        <script type="text/javascript" src="${pageContext.request.contextPath }/assets/js/jquery-1.12.4.min.js"></script>
        <script type="text/javascript">
        	$(document).ready(function(){
        		$("#smit").click(function(){
	        		$("#roleform").submit();
	        	});
        		var msg='${msg}';
        		if(msg!=""){
        			showResult(msg);
        		}
        	});
        	
        </script>
        <script language="javascript" type="text/javascript">
            //保存成功的提示消息
            function showResult(msg) {
                showResultDiv(true, msg);
                window.setTimeout("showResultDiv(false,'');", 3000);
            }
            function showResultDiv(flag,msg) {
                var divResult = document.getElementById("save_result_info");
                if (flag){
                	$("#save_result_info").text(msg);
           			$("#save_result_info").css("display","block");
                }
                else
                	$("#save_result_info").css("display","none");
            }
        </script> 
    </head>
    <body>
        <!--主要区域开始-->
        <div id="main">            
            <!--保存操作后的提示信息：成功或者失败-->
            <div id="save_result_info" class="save_success" style="display:none;"></div><!--保存失败，角色名称重复！-->
            <form action="${pageContext.request.contextPath }/role/AddRoleAction.do" method="post" class="main_form" id="roleform" enctype="multipart/form-data">
                <div class="text_info clearfix"><span>角色名称：</span></div>
                <div class="input_info">
                    <input type="text" class="width200" name="rname"/>
                    <span class="required">*</span>
                    <div class="validate_msg_medium">不能为空，且为20长度的字母、数字和汉字的组合</div>
                </div>
                <div class="text_info clearfix"><span>角色图标：</span></div> 
                <div class="input_info">
                    <input type="file" class="width200" name="imgfile"/>
                    <span class="required">*</span>
                    <div class="validate_msg_medium">不能为空，且为20长度的字母、数字和汉字的组合</div>
                </div> xxxxxxx                   
                <div class="text_info clearfix"><span>设置权限：</span></div>
                <div class="input_info_high">
                    <div class="input_info_scroll">
                        <ul>
                        	<c:forEach items="${allPrivs }" var="list">
                        		<li><input type="checkbox"  name="priv"	value="${list.pid }"/>${list.pname }</li>
                        	</c:forEach>
                        </ul>
                    </div>
                    <span class="required">*</span>
                    <div class="validate_msg_tiny">至少选择一个权限</div>
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
