$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8080/list"
    }).then(function(data) {
    	
    	var number_of_rows = data.length;
    	
        var k = 0;
        var table_body = '<table border="1" id="example"><thead><tr><th>Category</th><th>Recipes</th></tr></thead><tbody>';
       
        for(x in data){
              table_body+='<tr>';
              table_body +='<td>';
              table_body +=data[x].name;
              table_body +='</td>';
              var inner_list='';
             
              $.each(data[x].recipes,function( index, value ){
            	  
            	  inner_list+='<ul>';
            	  inner_list +='<li>';
            	  inner_list +='<a href  id='+value.description+'>'+value.name+'</href>';
            	  inner_list +='</li>';
            	  inner_list+='</ul>';
              })
              
	              table_body +='<td>';
	              table_body +=inner_list;
	              table_body +='</td>';
             
              table_body+='</tr>';
        }
      
          table_body+='</tbody></table>';
         $('#tableDiv').html(table_body);
         
       $('.tableDiv').append(data);
    });
    
    $( "a" ).click(function( event ) {
    	alert(event);
    });
  
});
