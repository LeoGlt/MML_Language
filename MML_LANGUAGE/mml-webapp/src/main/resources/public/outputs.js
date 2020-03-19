function DisplayOutputs(){
    
    var results_py = document.getElementById("results_python").textContent;
    var results_R = document.getElementById("results_R").textContent;
    var errors_py = document.getElementById("errors_python").textContent;
    var errors_R = document.getElementById("errors_R").textContent;
    DisplayPyOut(results_py);
    DisplayROut(results_R);
    DisplayErrors(errors_py,errors_R);

}


function DisplayPyOut(results_py){

    if(parent.document.getElementById("py_out_div") == null){
        if(results_py != "null" & results_py != ""){
            parsedresults = JSON.parse(results_py)
            var pydiv = parent.document.createElement("div")
            pydiv.setAttribute("class","pyoutputs") 
            pydiv.setAttribute("id","py_out_div")
            pydiv.innerHTML += "<h4> Algorithms with scikit framework outputs </h4>"
            
            for(var i=0;i < parsedresults.length;i++){

                pydiv.innerHTML += "<div> <h5>" + parsedresults[i].model + "</h5>" 
                
                for(var j=0;j < parsedresults[i].output.length;j++){
                    pydiv.innerHTML += "<div>" + parsedresults[i].output[j].metric + " : " + parsedresults[i].output[j].value
                }

                pydiv.innerHTML += "</div>"
            }
            parent.document.getElementById("outputs").insertBefore(pydiv,parent.document.getElementById("errors"))
        } 
    }

    else{
        parent.document.getElementById("outputs").removeChild(parent.document.getElementById("py_out_div"))
        DisplayPyOut(results_py)
    }
    

}

function DisplayROut(results_R){

    if(parent.document.getElementById("R_out_div") == null){
        if(results_R != "null" & results_R != ""){
            parsedresults = JSON.parse(results_R)
            var Rdiv = parent.document.createElement("div")
            Rdiv.setAttribute("class","Routputs") 
            Rdiv.setAttribute("id","R_out_div")
            Rdiv.innerHTML += "<h4> Algorithms with R framework outputs </h4>"
            
            for(var i=0;i < parsedresults.length;i++){

                Rdiv.innerHTML += "<div> <h5>" + parsedresults[i].model + "</h5>" 
                
                for(var j=0;j < parsedresults[i].output.length;j++){
                    Rdiv.innerHTML += "<div>" + parsedresults[i].output[j].metric + " : " + parsedresults[i].output[j].value
                }

                Rdiv.innerHTML += "</div>"
            }
            parent.document.getElementById("outputs").insertBefore(Rdiv,parent.document.getElementById("errors"))
        } 
    }

    else{
        parent.document.getElementById("outputs").removeChild(parent.document.getElementById("R_out_div"))
        DisplayROut(results_R)
    }
    

}


function DisplayErrors(errors_py,errors_R){

    var errdiv = parent.document.getElementById("errors")
    if(errdiv.style.display == "block"){
        errdiv.style.display = "none"
        if(parent.document.getElementById("pyerr") != null){parent.document.getElementById("errors").removeChild(parent.document.getElementById("pyerr"))}
        if(parent.document.getElementById("Rerr") != null){parent.document.getElementById("errors").removeChild(parent.document.getElementById("Rerr"))}
        
        DisplayErrors(errors_py,errors_R)
    }
    else{
    	console.log(errors_py)
        if(errors_py != "null" & errors_py != ""){
            errdiv.style.display = 'block'
            errdiv.innerHTML += "<div class=error id='pyerr'> <h5>Python errors : </h5> " + errors_py + "</div>"
        };

        if(errors_R != "null" & errors_R != ""){
            errdiv.style.display = 'block'
            errdiv.innerHTML += "<div class=error id='Rerr'> <h5>R errors : </h5> " + errors_R + "</div>"
        };
    };
    
    
}