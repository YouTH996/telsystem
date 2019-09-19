<!-- 静态包含 -->
<%@include file="../include/header.jsp" %>
<%@include file="../include/nav.jsp" %>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title></title>
 
        <script language="javascript" type="text/javascript">
            function deleteRole() {
                var r = window.confirm("确定要删除此角色吗？");
                document.getElementById("operate_result_info").style.display = "block";
            }
        </script>
    </head>
    <body>
        
        <!--主要区域开始-->
        <div id="main">
            <form action="" method="">
                <!--查询-->
                <div class="search_add">
                    <input type="button" value="增加" class="btn_add" onclick="location.href='${pageContext.request.contextPath}/role/listPriv';" />
                </div>  
                <!--删除的操作提示-->
                <div id="operate_result_info" class="operate_success">
                    <img src="../images/close.png" onclick="this.parentNode.style.display='none';" />
                    删除成功！
                </div> <!--删除错误！该角色被使用，不能删除。-->
                <!--数据区域：用表格展示数据-->     
                <div id="data">                      
                    <table id="datalist">
                        <tr>                            
                            <th>角色 ID</th>
                            <th>角色名称</th>
                            <th >角色图标</th>
                            <th class="width600">拥有的权限</th>
                            <th class="td_modi"></th>
                        </tr>                      
                        <tr>
                        <c:forEach items="${rolelist }" var="role">
                        	<tr>
	                        	<td>${role.rid }</td>
	                            <td>${role.rname }</td>
	                            <td>${pageContext.request.contextPath}${role.by001 }</td>
	                            <td>${role.privs }</td>
	                            <td>
	                                <input type="button" value="修改" class="btn_modify" onclick="location.href='role_modi.jsp';"/>
	                                <input type="button" value="删除" class="btn_delete" onclick="deleteRole('${role.rid}');" />
	                            </td>
	                    	</tr>
                        </c:forEach>
                    </table>
                </div> 
                <!--分页-->
                <div id="pages">
        	        <a href="#">上一页</a>
                    <a href="#" class="current_page">1</a>
                    <a href="#">2</a>
                    <a href="#">3</a>
                    <a href="#">4</a>
                    <a href="#">5</a>
                    <a href="#">下一页</a>
                </div>
            </form>
        </div>
        <!--主要区域结束-->
        <div id="footer">
           
        </div>
    </body>
</html>
