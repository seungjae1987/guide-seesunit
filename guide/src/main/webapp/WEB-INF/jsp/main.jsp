<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/taglib/taglib.jsp"%> <!-- jstl 정의문 import -->   
<jsp:useBean id="today" class="java.util.Date" />  <!-- jstl 문법으로 날짜 정의 -->  
<fmt:formatDate value="${today}" pattern="yyyyMMddHHmmss" var="nowDate"/> <!-- 날짜 포멧 정의-->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- 스크립트 정의하는 부분 -->
<!-- 자바스크립트에 version을 정의하는 이유: 브라우저 캐시가 발생되는 것을 방지 하기 위해서 스크립트 로딩시 버전을 올려준다 .
	ex) A.js?version=1 -> A.js?version=2 로 호출됨
	ctx는 프로젝트 주소를 나타낸다.
 -->
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.min.js?version=${nowDate}"></script> <!-- jquery 최신버전 -->
<!-- 사용자 정의 스크립트 -->
<script type="text/javascript" src="${ctx}/js/search.js?version=${nowDate}"></script>

<script type="text/javascript">
$( document ).ready(function() {
	console.log("1");   
});
</script>



</head>
<!-- <body onload="fnBodyOnload();"> -->
<body>
가이드 페이지입니다. 

<br> 1.데이터 조회
<br> <button id="btnSelect" name="btnSelect" onclick="retruveData();"> 데이터 조회  </button> 
<br> 데이처 처리 부분
<br> <button id="btnClean" name="btnClean" onclick="cleanData();"> 초기화  </button> 

<br> 2.데이터 조회 조건 검색(시군구로 검색: 샘플은 김해시청 키값 넣기 48250)
<br> 
<form action="#" id="f_serchKey" name="f_serchKey" method="post">
	<input type="text" id="search_key" name="search_key"/>
</form>
<button id="btnSelect" name="btnSelect" onclick="retruveDataKey();"> 데이터 조회  </button> 

<div id="retruveData" name="retruveData"></div>

</body>
</html>