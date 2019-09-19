<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<!--Logo区域开始-->
        <div id="header">
        	<span>${admin.aname}</span>
            <img src="${pageContext.request.contextPath }/assets/images/logo.png" alt="logo" class="left"/>
            <a href="${pageContext.request.contextPath }/exit">[退出]</a>
        </div>
        <!--Logo区域结束-->
<!--导航区域开始-->
<div id="navi">
	<ul id="menu">
		<c:forEach items="${admin.list }" var="priv">
			<li><a href="${pageContext.request.contextPath }${priv.purl }"
				class="${priv.pclass }"></a></li>
		</c:forEach>
	</ul>
</div>