var button_Py = document.getElementById("DisplayPy")
var button_R = document.getElementById("DisplayR")



function Display_Py(){

    var scriptpy = document.getElementById("Code_Python");
    var script = document.getElementById("script");
    var textpy = document.getElementById("pyscript");
    var iframe = document.getElementById("iframe_script").contentDocument;

    if(this.value == "Display Python script"){
        
        scriptpy.style.display = 'block';
        this.value = "Undisplay";
        script.style.height = "592px";
        
        txt = iframe.getElementById("script_py").textContent
        if(txt != "null"){
            textpy.value = txt;
        }
        
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
    var iframe = document.getElementById("iframe_script").contentDocument;

    if(this.value == "Display R script"){
        scriptr.style.display = 'block';
        this.value = "Undisplay";
        txt = iframe.getElementById("script_R").textContent;
        if(txt != "null"){
            textr.value = txt;
        }
    }
    else{
        scriptr.style.display = 'none';
        this.value = "Display R script";
    };

}


button_Py.addEventListener("click",Display_Py);
button_R.addEventListener("click",Display_R)