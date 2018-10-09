function convertDate(){ 
  var dateEmp = document.getElementById("dateInteg").value;
  var dateTab = dateEmp.split("-");
   var dateFinal =dateTab[1]+"/"+dateTab[2]+"/"+dateTab[0];
  document.getElementById("dateHidden").value = dateFinal;
}

function convertDateProjet(){ 
	  var dateD = document.getElementById("dateD").value;	 
	  var dateTabD = dateD.split("-");
	   var dateFinalD = dateTabD[1]+"/"+dateTabD[2]+"/"+dateTabD[0]; 
	  document.getElementById("dateHiddenD").value = dateFinalD;
	  
	  var dateF = document.getElementById("dateF").value;	 
	  var dateTabF = dateF.split("-");
	   var dateFinalF = dateTabF[1]+"/"+dateTabF[2]+"/"+dateTabF[0];	  
	  document.getElementById("dateHiddenF").value = dateFinalF;
	}

$(document).ready(function(){
	$("#myInput").on("keyup",function(){
		var value = $(this).val().toLowerCase();
		$("tr:has(td)").filter(function(){
			$(this).toggle($(this).text().toLowerCase().indexOf(value) > -1);
		});
	});
});