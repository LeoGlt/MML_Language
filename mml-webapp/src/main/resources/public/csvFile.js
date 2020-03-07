var fileSent = document.getElementById("fileSelect");

fileSent.addEventListener('change', GetFile);


function GetFile() {
    
    var csvfile = this.files[0]

    Papa.parse(csvfile, {
        header: true,
        complete: function(results) {
            console.log("Fields",results.meta.fields)
            CompleteVariableSelectMenu(results.meta.fields)
        }
      });
    
    return (this.files[0]);

};


function CompleteVariableSelectMenu(fields){

    let var_div = document.getElementById("data");

    if(document.getElementById('variable_cible') == null){
        let var_choice = document.createElement('div');
        var_choice.id = 'variable_cible'

        var start = "<p>Choose the variable to predict :</p>  <select name='variable_cible' id='variable_selection'>";
        var opt = "";
        for(var i=0; i < fields.length; i++){
            opt += GenerateFieldHTML(fields[i],i, toselect = (i == (fields.length - 1)));

        };

        var end = "</select>";
        var_choice.innerHTML = start + opt + end;
        var_div.insertBefore(var_choice, document.getElementById("zone_insert"));
    }
    else{
        var_div.removeChild(document.getElementById('variable_cible'));
        CompleteVariableSelectMenu(fields);
    };
    
};

function GenerateFieldHTML(variable,i,toselect = false){

    var t = "";
    if(toselect){
        t+= "<option id =" + String(i) + " value=" + variable + " selected>" + variable + "</option>";
    }
    else{
        t+= "<option id =" + String(i) + " value=" + variable + ">" + variable + "</option>";
    }
    
    return(t)

}


