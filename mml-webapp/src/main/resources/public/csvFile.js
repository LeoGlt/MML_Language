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
        for(var i=0; i < fields.length; i++){
            opt += GenerateFieldHTML(fields[i], toselect = (i == (fields.length - 1)), call = "predictive");

        };

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
    //checkboxes pour les variables prédictives
    //doit changer dynamiquement quand la variable à prédire change
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
            t+= "<input type='checkbox' id= pred_" + variable + "  name = 'predict_variables' value=" + variable + " checked style = 'display:inline-block'>" + variable + "</input>";
        }
        else{
            t+= "<input type='checkbox' id= pred_" + variable + "  name = 'predict_variables' value=" + variable + " checked style = 'display:none'>" + variable + "</input>";
        }
    }
    
    return(t)
}

function SwitchPredictiveDisplay(){

    var vars = document.getElementsByName("predict_variables");
    console.log(this)
    for (var i = 0; i < vars.length; i++) {
        var v = vars[i];
            
        if (v.style.display == 'none') {
            v.style.display = 'inline-block'
        }
        if (v.value == this.options[this.selectedIndex].value) {
            v.style.display = 'none'
        }
    }

}

var targ_var;

//creer le listener dans une fonction en modifiant une var globale vide au début
