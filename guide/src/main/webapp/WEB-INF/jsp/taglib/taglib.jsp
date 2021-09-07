<!-- jstl 정의 부분 -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="tags" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!-- 현제 페이지 주소 가져오는 JSTL 문법 -->
<c:set var="ctx" value="${pageContext.request.contextPath}"/>  
<%pageContext.setAttribute("crlf", "\r\n"); %>