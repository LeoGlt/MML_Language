//Les algos

//DT
let DT = document.getElementById("DT"),
    DT_param = document.getElementById("DT_param");

//SVM
let SVM = document.getElementById("SVM"),
    SVM_param = document.getElementById("SVM_param");

let LR = document.getElementById("LR"),
    RF = document.getElementById("RF");




//Pour masquer la division :

DT_param.style.display = "none";
SVM_param.style.display = "none";

/*function checkedAlgo(){
  var radios = document.getElementsByName('algorithm');
  var valeur;
  for(var i = 0; i < radios.length; i++){
    if(radios[i].checked){
      id = boutons[i].id;
      console.log(id);
      return document.getElementById(id);
    };
    };
  };*/

function undisplayAll(){
  DT_param.style.display = "none";
  SVM_param.style.display = "none";
};
  
//Pour afficher la division :
//document.getElementById(identifiant_de_ma_div).style.display = block;

function chooseAlgo(algo){
  
  undisplayAll();
  console.log(algo.id);
  if(algo.id == "DT"){
    DT_param.style.display = "block";
  }
  else if(algo.id == "SVM"){
    SVM_param.style.display = "block";
  };
  
};



//listeners

//DT.on("change",chooseAlgo);
//SVM.onChange(chooseAlgo);

//document.getElementById("Algorithme").onClick(ChooseAlgo)
  
  
var sizePicker = document.querySelector('input[type="range"]');

sizePicker.oninput = function() {
  output.textContent = sizePicker.value;
};

var output = document.querySelector('.output');