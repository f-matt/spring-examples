$(document).ready(function(){

});

// Imprime o protocolo de transferencia de prontuários
function sendJson() {
	console.log("sendJson");
	
	/*
	console.log("imprimeProtocolo");
	console.log($("#movimentacoes").val());
	
	if ($('#movimentacoes').val().length < 1) {
		var html = '<div id="error" title="Erro">É necessário informar um número de prontuário.</div>';
	    var dialog = $(html).dialog();
	} else {
		var x = [{"prontuario":"1495274","nomePaciente":"CREUSA MARIA OLIVEIRA","nomeMae":"LUZIA LUIZA OLIVEIRA","tipoProntuario":"PG","volume":"1"}];
		
		$.ajax({
			type: 'POST',
			url: 'imprime-protocolo',
			contentType: 'application/json',
			dataType: 'json', 
			data: JSON.stringify($('#movimentacoes').val()),
			//data: $('#movimentacoes').val(),
			//data: JSON.stringify(x),
			success: function(response) {
				console.log("success!");
			},
			error: function(e) {
				console.log("fail!");
			}
		});
	}
	*/
}