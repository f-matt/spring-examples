$(document).ready(function(){

});

function sendJson() {
	console.log("sendind Json...");
	
	var x = {"first":"abc","second":"def"};
		
	$.ajax({
		type: 'POST',
		url: 'main/test-json',
		contentType: 'application/json',
		dataType: 'json', 
		data: JSON.stringify(x),
		success: function(response) {
			console.log("success!");
			console.log(response);
		},
		error: function(e) {
			console.log("fail!");
		}
	});
}

function sendJsonArray() {
	console.log("sendind Json object array...");
	
	var x = [{"first":"aaa","second":"bbb"}, {"first":"ccc","second":"ddd"}];
		
	$.ajax({
		type: 'POST',
		url: 'main/test-json-array',
		contentType: 'application/json',
		dataType: 'json', 
		data: JSON.stringify(x),
		success: function(response) {
			console.log("success!");
			console.log(response);
		},
		error: function(e) {
			console.log("fail!");
		}
	});
}