var button_Py = document.getElementById("DisplayPy")
var button_R = document.getElementById("DisplayR")



function Display_Py(){

    var scriptpy = document.getElementById("Code_Python");
    var script = document.getElementById("script");
    var textpy = document.getElementById("pyscript");

    if(this.value == "Display Python script"){
        scriptpy.style.display = 'block';
        this.value = "Undisplay";
        script.style.height = "592px";

        textpy.value = iframe.body.getElementById("script_py");



    }
    else{
        scriptpy.style.display = 'none';
        this.value = "Display Python script";
        script.style.height = "";
    };

    
    
        

}

function Display_R(){

    var scriptr = document.getElementById("Code_R");
    var textr = document.getElementById("Rscript");

    if(this.value == "Display R script"){
        scriptr.style.display = 'block';
        this.value = "Undisplay";

    }
    else{
        scriptr.style.display = 'none';
        this.value = "Display R script";
        textpy.value = iframe.body.getElementById("script_R");
    };

}


button_Py.addEventListener("click",Display_Py)
button_R.addEventListener("click",Display_R)


var iframe = document.getElementById("iframe_script").contentDocument;

