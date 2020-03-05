var fileSent = document.getElementById("fileSelect");

fileSent.addEventListener('change', GetFile);


function GetFile() {
    //GetVariables(this.files[0])
    var csvfile = this.files[0]

    Papa.parse(csvfile, {
        delimiter: ";",
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

        var start = "<p>Choose the variable to predict :</p>  <select name='variable_cible'>";
        var opt = "";
        for(var i=0; i < fields.length; i++){
            opt += GenerateFieldHTML(fields[i],i);
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

function GenerateFieldHTML(variable,i){

    var t = "";
    t+= "<option id =" + String(i) + " value=" + variable + ">" + variable + "</option>";
    return(t)

}


