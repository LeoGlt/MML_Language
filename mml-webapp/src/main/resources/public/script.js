//Les algos
var DT = document.getElementById("DT"),
    SVM = document.getElementById("SVM"),
    LR = document.getElementById("LR"),
    RF = document.getElementById("RF");

var DT_dmaxepth = document.getElementById("DT_maxdepth");

var sizePicker = document.querySelector('input[type="range"]');

sizePicker.oninput = function() {
  output.textContent = sizePicker.value;
}

var output = document.querySelector('.output');


//Pour masquer la division :

//DT.style.display = none;
//SVM.style.display = none;

///Pour afficher la division :
//document.getElementById(identifiant_de_ma_div).style.display = block;