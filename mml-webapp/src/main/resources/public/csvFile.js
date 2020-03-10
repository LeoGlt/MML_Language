var fileSent = document.getElementById("fileSelect");
fileSent.addEventListener('change', GetFile);



function GetFile() {
    
    var csvfile = this.files[0]

    Papa.parse(csvfile, {
        header: true,
        complete: function(results) {
            console.log("Fields",results.meta.fields);
            CompleteVariableSelectMenu(results.meta.fields);
            CompletePredictorsCheckbox(results.meta.fields)
        }
      });
    
    ViewFileName();
       
    
    return (this.files[0]);

};

function ViewFileName(){

    var var_div = document.getElementById("data");

    if(document.getElementById("file_name")==null){
        let file_name = document.createElement('div');
        file_name.id = 'file_name';
        file_name.innerHTML = "<br> Uploaded file : <u>" + String(fileSent.value).substr(12) + "</u>";
        var_div.insertBefore(file_name, document.getElementById("separator"));
    }
    else{
        var_div.removeChild(document.getElementById('file_name'));
        ViewFileName();
    }

}

function CompleteVariableSelectMenu(fields){

    let var_div = document.getElementById("data");

    if(document.getElementById('variable_cible') == null){
        let var_choice = document.createElement('div');
        var_choice.id = 'variable_cible'

        var start = "<p>Choose the variable to predict :</p>  <select name='variable_cible' id='variable_selection'>";
        var opt = "";
        for(var i=0; i < fields.length; i++){
            opt += GenerateFieldHTML(fields[i], toselect = (i == (fields.length - 1)), call = "target");

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

function CompletePredictorsCheckbox(fields){

    let var_div = document.getElementById("data");

    if(document.getElementById('predictive_variables') == null){
        let var_choice = document.createElement('div');
        var_choice.id = 'predictive_variables'
        var_choice.name = 'predict_variables'

        var start = "<p>Choose the predictive variables :</p>";
        var opt = "";
        opt += "<div class = cb_expl_style1>"

        for(var i=0; i < fields.length/2; i++){
              
            opt += GenerateFieldHTML(fields[i], toselect = (i == (fields.length - 1)), call = "predictive");
        
        };

        opt += "</div>"
        opt += "<div class = cb_expl_style2>"

        for(var i=Math.ceil(fields.length/2); i < fields.length; i++){
            opt += GenerateFieldHTML(fields[i], toselect = (i == (fields.length - 1)), call = "predictive");
        
        };

        opt+= "</div> <br> <br> <br>";
        var end = "</select>";
        var_choice.innerHTML = start + opt + end;
        var_div.insertBefore(var_choice, document.getElementById("zone_insert"));
    }
    else{
        var_div.removeChild(document.getElementById('predictive_variables'));
        CompletePredictorsCheckbox(fields);
    };

    targ_var = document.getElementById('variable_selection');
    targ_var.addEventListener("change",SwitchPredictiveDisplay)

}

function GenerateFieldHTML(variable,toselect = false,call = "target"){

    if(call == "target"){
        var t = "";
        if(toselect){
            t+= "<option id = select_" + variable + " value=" + variable + " selected>" + variable + "</option>";
        }
        else{
            t+= "<option id = select_" + variable + " value=" + variable + ">" + variable + "</option>";
        }
    }
    else{
        var t = "";
        if(!toselect){
            t+= "<div id = cb_expl" + variable + " style='display:block'> <input type='checkbox' id= pred_" + variable + "  name = 'predict_variables' value=" + variable + " checked style = 'display:inline-block'>";
            t+= "<label for=pred_" + variable + ">" + variable + "</label> </div>";
            }
        else{
            t+= "<div id = cb_expl" + variable + " style='display:none'> <input type='checkbox' id= pred_" + variable + "  name = 'predict_variables' value=" + variable + " checked style = 'display:inline-block'>";
            t+= "<label for=pred_" + variable + ">" + variable + "</label> </div>";
        }
    }
    
    return(t)
}

function SwitchPredictiveDisplay(){

    var vars = document.getElementsByName("predict_variables");
    for (var i = 0; i < vars.length; i++) {
        var v = vars[i];
        var div_v = document.getElementById("cb_expl"+v.value)
        if ( div_v.style.display == 'none') {
            div_v.style.display = 'block'
        }
        if (v.value == this.options[this.selectedIndex].value) {
            div_v.style.display = 'none'
        }
    }

}

var targ_var;
