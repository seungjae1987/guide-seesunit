/*페이지를 시작 했을때 실행하는 함수 */
window.onload = function(){
	console.log("3");
	retruveData();
}
/*
function fnBodyOnload(){
	console.log("2");
}*/

/*
	데이터 검색 함수 
	async = true : 동기 , false : 비동기 (처리가 끝나야 다음 함수가 실행됨)
 */
function retruveData() {
	$.ajax({
		type: "POST",
		url: "retruveData.do",
		//data : _jsonDate , /* 데이터가 있는경우 넘겨주기 */
		dataType: "json",
		async: true,
		success: function(_data) {
			/*데이터 처리 부분*/
			console.log(_data);
			/*$(target).append(source)
			retruveData*/
			var str = "";
			/*결과처리*/
			for( var i =0 ; i < _data.length; i++ ){
				str += "<div> 시군구코드  : "+ _data[i].sig_cd  + "</div>";
				str += "<div> 시군구명칭  : "+ _data[i].sig_kor_nm  + "</div>";
			}
			$("#retruveData").html(str);
		}
	});
}

/**
	초기화함수 
 */
function cleanData(){
	$("#retruveData").html("");
}

/**
	조건검색
 */
function retruveDataKey(){
	console.log($( "#f_serchKey" ).serializeArray());
	
	$.ajax({
		type: "POST",
		url: "retruveDataKey.do",
		/**
			처리방법 1: 데이터 넘기기  data {  a: $( "#" + divId ).text();   }
			처리 방법 2: jqeury serializeArray 사용   $( "#" + _formId ).serializeArray();
			이유 : 몇개 없을경우는 데이터를 넘기는것이 좋지 만 
			많은양을 넘길경우는 serializeArray 사용한다.
		 */
		/*data : {
			key : $( "#search_key" ).val()
		} , /* 데이터가 있는경우 넘겨주기 */
		/*serializeArray*/
		data :  $( "#f_serchKey" ).serializeArray(),
		dataType: "json",
		async: true,
		success: function(_data) {
			/*데이터 처리 부분*/
			console.log(_data);
			/*$(target).append(source)
			retruveData*/
			var str = "";
			/*결과처리*/
			for( var i =0 ; i < _data.length; i++ ){
				str += "<div> 시군구코드  : "+ _data[i].sig_cd  + "</div>";
				str += "<div> 시군구명칭  : "+ _data[i].sig_kor_nm  + "</div>";
			}
			$("#retruveData").html(str);
			
			
		}
	});
}
