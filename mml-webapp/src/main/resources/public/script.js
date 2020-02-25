//bouton add
let ADD = document.getElementById("Add_algo");

let NB_algo = 0;

function GenerateAlgoHTML(){
  
  let algo_div = document.getElementById("Algo");
  let new_algo = document.createElement('div');
  NB_algo += 1;
  ADD.value = 'Add another one';
  
  console.log(NB_algo);
  
  let head_html = '<div id = "Algo' + String(NB_algo) + '"> <h3>Algorithm n°' + String(NB_algo) + '</h3> <p>Choose an algorithm</p>';
  let DT_html = MakeDThtml(NB_algo);
  let SVM_html = MakeSVMhtml(NB_algo);
  let LR_html = MakeLRhtml(NB_algo);
  let RF_html = MakeRFhtml(NB_algo);
  let framework_html = MakeFrameworkhtml(NB_algo);
  let end_html = '</div> <br></br>';
  
  new_algo.innerHTML += head_html + DT_html + SVM_html + LR_html + RF_html + framework_html + end_html;
  algo_div.insertBefore(new_algo,document.getElementById("Add_algo_button"));
  undisplayAll(NB_algo)
};


function MakeDThtml(nb_algo){
  let t = '<div> <input type="radio" id="DT' + String(nb_algo) + '" name="algorithm' + String(nb_algo) + '" value="DT' + String(nb_algo) + '" onclick="chooseAlgo(this);">';
  t += '<label for="DT' + String(nb_algo) + '">Decision Tree</label> <div id ="DT_param' + String(nb_algo) + '">';

  t += '<div id="Criterion' + String(nb_algo) + '" style="margin-left : 40px;">Criterion :';
  t += '<input type="radio" id="gini' + String(nb_algo) + '" name="criterion' + String(nb_algo) + '" value="gini" checked> <label for="gini' + String(nb_algo) + '">Gini</label>';
  t += '<input type="radio" id="entropy' + String(nb_algo) + '" name="criterion' + String(nb_algo) + '" value="entropy"> <label for="etropy' + String(nb_algo) + '">Entropy</label> </div>'; 

  t += '<div id ="max_depth' + String(nb_algo) + '" style="margin-left : 40px;">Max depth :';
  t += '<form name="maxdepth' + String(nb_algo) + '" id="DT_maxdepth' + String(nb_algo) + '"> <textarea name="DT_maxdepht' + String(nb_algo) + '" rows="1" cols="10"></textarea> </form> </div>'
  
  t += ' </div>';
  return(t)
};


function MakeSVMhtml(nb_algo){
  let t = '<div> <input type="radio" id="SVM' + String(nb_algo) + '" name="algorithm' + String(nb_algo) + '" value="SVM' + String(nb_algo) + '" onclick="chooseAlgo(this);">';
  t += '<label for="SVM' + String(nb_algo) + '">SVM</label>';
  t +=  '<div id="SVM_param' + String(nb_algo) + '">'
  
  t += '<div id="SVM_kernel' + String(nb_algo) + '" style = "margin-left:40px;"> Kernel :';
  t += '<input type="radio" id="linear' + String(nb_algo) + '"  name="kernel_svm' + String(nb_algo) + '" value="linear"> <label for="linear' + String(nb_algo) + '">linear</label>';
  t += '<input type="radio" id="radial' + String(nb_algo) + '" name="kernel_svm' + String(nb_algo) + '" value="radial" checked> <label for="radial' + String(nb_algo) + '">radial</label> </div>';
  
  t += '<div id="SVM_gamma' + String(nb_algo) + '" style = "margin-left:40px;"> Gamma : ';
  t += '<input type="radio" id="auto' + String(nb_algo) + '" name="gamma_svm' + String(nb_algo) + '" value="linear" checked> <label for="auto' + String(nb_algo) + '">auto</label>';
  t += '<input type="radio" id="scale' + String(nb_algo) + '" name="gamma_svm' + String(nb_algo) + '" value="scale"> <label for="scale' + String(nb_algo) + '">scale</label> </div>';

  t += '<div id="SVM_C' + String(nb_algo) + '" style = "margin-left:40px;"> C : ';
  t += '<input type="number" id="C_float' + String(nb_algo) + '" name="C_float' + String(nb_algo) + '" min="0" max="100.0" step="0.1">';
  t += '<label for="C_float' + String(nb_algo) + '">Pourcentage retenu : <span class="output">50 </div>';
  t += '</div> </div>';

  return(t)

}


function MakeLRhtml(nb_algo){
  let t = '<div> <input type="radio" id="LR' + String(nb_algo) + '" name="algorithm' + String(nb_algo) + '" value="LR' + String(nb_algo) + '" onclick="chooseAlgo(this);"> ';
  t += '<label for="LR' + String(nb_algo) + '">Logistic Regression</label> '
  t += '</div>';

  return(t)
}

function MakeRFhtml(nb_algo){
  let t = '<div> <input type="radio" id="RF' + String(nb_algo) + '" name="algorithm' + String(nb_algo) + '" value="RF' + String(nb_algo) + '" onclick="chooseAlgo(this);">';
  t += '<label for="RF' + String(nb_algo) + '">Random Forest</label>';
  t += '</div>';

  return(t)
}

function MakeFrameworkhtml(nb_algo){
  let t = '<div> <h4>Framework</h4> <p>Choose a framework to implement your algorithm</p>';
  t += '<div> <input type="radio" id="sklearn' + String(nb_algo) + '" name="implementation' + String(nb_algo) + '" value="sklearn" checked> <label for="sklearn' + String(nb_algo) + '">scikit-learn</label>'
  t += '<input type="radio" id="R' + String(nb_algo) + '" name="implementation' + String(nb_algo) + '" value="R"> <label for="R' + String(nb_algo) + '">R</label> </div>';
  t += '</div>'
  return(t)
};


ADD.addEventListener('click', GenerateAlgoHTML);

//Les algos

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

function undisplayAll(nb){
  document.getElementById("DT_param"+nb).style.display = "none";
  document.getElementById("SVM_param"+nb).style.display = "none";
};

function chooseAlgo(algo){
  
  let nb = algo.id.charAt(algo.id.length-1);
  undisplayAll(nb);
  console.log(algo.id);
  if(algo.id.substr(0,2) == "DT"){
    
    document.getElementById("DT_param"+nb).style.display = "block";
  }
  else if(algo.id.substr(0,3) == "SVM"){
    document.getElementById("SVM_param"+nb).style.display = "block";
  };
  
};



  
  
var sizePicker = document.querySelector('input[type="range"]');

sizePicker.oninput = function() {
  output.textContent = sizePicker.value;
};

var output = document.querySelector('.output');