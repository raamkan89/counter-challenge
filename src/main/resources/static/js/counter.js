var makeAjaxCall = function(urlValue,input){
	var counter ={};
	counter["count"] = input;
	var result ;
	result = $.ajax({
		type: "post",
		contentType : "application/json",
		url : urlValue,
		data :JSON.stringify(counter),
		dataType: 'json',
		cache : false,
		timeout: 6000
	});
	return result;
};

$(document).ready(function(){
	getCounterValue();
	$('#adding').on('click', function(){
		var boovalue = $(this).val();
		var result = makeAjaxCall("/increment", boovalue);
			result.done(function(){
			console.log("Success");
			getCounterValue();
		});
	});
	
	$('#subtracting').on('click', function(){
		var boovalue = $(this).val();
		var result = makeAjaxCall("/decrement", boovalue);
			result.done(function(){
				console.log("Success");
				getCounterValue();
		});
	});
	
function getCounterValue(){
	$.ajax({
		type: "get",
		contentType: "application/json",
		url: "/getCounterValue",
		cache: false,
		timeout : 6000,	
	}).done(function(response){
		 var result = response;
         $('#counter-value').text(result);
		});
	}
});

	

