//bouton add
let ADD = document.getElementById("Add_algo");
let REM = document.getElementById("Remove_algo");

let NB_algo = 0;

function GenerateAlgoHTML() {

  let algo_div = document.getElementById("Algo");
  let new_algo = document.createElement('div');
  NB_algo += 1;
  ADD.value = 'Add another one';
  if (REM.style.display == "none") {
    REM.style.display = "block"
  }

  console.log(NB_algo);

  let head_html = '<div id = "Algo' + String(NB_algo) + '"> <h3>Algorithm n&#176;' + String(NB_algo) + '</h3> <p>Choose an algorithm</p>';
  let DT_html = MakeDThtml(NB_algo);
  let SVM_html = MakeSVMhtml(NB_algo);
  let LR_html = MakeLRhtml(NB_algo);
  let RF_html = MakeRFhtml(NB_algo);
  let framework_html = MakeFrameworkhtml(NB_algo);
  let end_html = '</div> <br></br>';

  new_algo.innerHTML += head_html + DT_html + SVM_html + LR_html + RF_html + framework_html + end_html;
  algo_div.insertBefore(new_algo, document.getElementById("Add_algo_button"));
  undisplayAlgos(NB_algo)
};


function MakeDThtml(nb_algo) {
  let t = '<div> <input type="radio" id="DT' + String(nb_algo) + '" name="algorithm' + String(nb_algo) + '" value="DT' + String(nb_algo) + '" onclick="chooseAlgo(this);">';
  t += '<label for="DT' + String(nb_algo) + '">Decision Tree</label> <div id ="DT_param' + String(nb_algo) + '">';

  t += '<div id="DT_Criterion' + String(nb_algo) + '" style="margin-left : 1em;">Criterion :';
  t += '<input type="radio" id="DT_gini' + String(nb_algo) + '" name="DT_criterion' + String(nb_algo) + '" value="gini" checked> <label for="DT_gini' + String(nb_algo) + '">Gini</label>';
  t += '<input type="radio" id="DT_entropy' + String(nb_algo) + '" name="DT_criterion' + String(nb_algo) + '" value="entropy"> <label for="DT_etropy' + String(nb_algo) + '">Entropy</label> </div>';

  t += '<div id ="DT_max_depth' + String(nb_algo) + '" style="margin-left : 1em;">Max depth :';
  t += '<form name="DT_maxdepth' + String(nb_algo) + '" id="DT_maxdepth' + String(nb_algo) + '"> <textarea name="DTmaxdepth' + String(nb_algo) + '" rows="1" cols="10"></textarea> </form> </div>'

  t += ' </div>';
  return (t)
};


function MakeSVMhtml(nb_algo) {
  let t = '<div> <input type="radio" id="SVM' + String(nb_algo) + '" name="algorithm' + String(nb_algo) + '" value="SVM' + String(nb_algo) + '" onclick="chooseAlgo(this);">';
  t += '<label for="SVM' + String(nb_algo) + '">SVM</label>';
  t += '<div id="SVM_param' + String(nb_algo) + '">'

  t += '<div id="SVM_kernel' + String(nb_algo) + '" style = "margin-left:1em;"> Kernel :';
  t += '<input type="radio" id="linear' + String(nb_algo) + '"  name="kernel_svm' + String(nb_algo) + '" value="linear"> <label for="linear' + String(nb_algo) + '">linear</label>';
  t += '<input type="radio" id="rbf' + String(nb_algo) + '" name="kernel_svm' + String(nb_algo) + '" value="rbf" checked> <label for="rbf' + String(nb_algo) + '">rbf</label>';
  t += '<input type="radio" id="polynomial' + String(nb_algo) + '" name="kernel_svm' + String(nb_algo) + '" value="poly"> <label for="polynomial' + String(nb_algo) + '">polynomial</label>';
  t += '<input type="radio" id="sigmoid' + String(nb_algo) + '" name="kernel_svm' + String(nb_algo) + '" value="sigmoid"> <label for="sigmoid' + String(nb_algo) + '">sigmoid</label> </div>';


  t += '<div id="SVM_gamma' + String(nb_algo) + '" style = "margin-left:1em;"> Gamma : ';
  t += '<input type="radio" id="auto' + String(nb_algo) + '" name="gamma_svm' + String(nb_algo) + '" value="auto" checked> <label for="auto' + String(nb_algo) + '">auto</label>';
  t += '<input type="radio" id="scale' + String(nb_algo) + '" name="gamma_svm' + String(nb_algo) + '" value="scale"> <label for="scale' + String(nb_algo) + '">scale</label> </div>';

  t += '<div id="SVM_C' + String(nb_algo) + '" style = "margin-left:1em;"> C : ';
  t += '<input type="number" id="C_float' + String(nb_algo) + '" name="C_float' + String(nb_algo) + '" min="0" max="100.0" step="0.1" value="1.0"></div>';

  t += '</div> </div>';

  return (t)

}


function MakeLRhtml(nb_algo) {
  let t = '<div> <input type="radio" id="LR' + String(nb_algo) + '" name="algorithm' + String(nb_algo) + '" value="LR' + String(nb_algo) + '" onclick="chooseAlgo(this);"> ';
  t += '<label for="LR' + String(nb_algo) + '">Logistic Regression</label> ';
  t += '<div id="LR_param' + String(nb_algo) + '">';

  t += '<div id="LR_penalty' + String(nb_algo) + '" style = "margin-left:1em;"> Penalty :';
  t += '<input type="radio" id="l2' + String(nb_algo) + '"  name="penalty_lr' + String(nb_algo) + '" value="l2" checked> <label for="l2' + String(nb_algo) + '">L2</label>';
  t += '<input type="radio" id="l1' + String(nb_algo) + '" name="penalty_lr' + String(nb_algo) + '" value="l1"> <label for="l1' + String(nb_algo) + '">L1</label>';
  t += '<input type="radio" id="elasticnet' + String(nb_algo) + '"  name="penalty_lr' + String(nb_algo) + '" value="elasticnet"> <label for="elasticnet' + String(nb_algo) + '">elasticnet</label>';
  t += '<input type="radio" id="none' + String(nb_algo) + '" name="penalty_lr' + String(nb_algo) + '" value="none"> <label for="none' + String(nb_algo) + '">none</label> </div>';

  t += '<div id="LR_C' + String(nb_algo) + '" style = "margin-left:1em;"> C : ';
  t += '<input type="number" id="C_LR' + String(nb_algo) + '" name="C_LR' + String(nb_algo) + '" min="0" max="100.0" step="0.1" value="1.0"> </div>';

  t += '<div id="LR_tol' + String(nb_algo) + '" style = "margin-left:1em;"> Tolerance : ';
  t += '<input type="number" id="tol_LR' + String(nb_algo) + '" name="tol_LR' + String(nb_algo) + '" min="0" max="10" step="0.0001" value="0.0001"> </div>';

  t += '</div>';

  return (t)
}

function MakeRFhtml(nb_algo) {
  let t = '<div> <input type="radio" id="RF' + String(nb_algo) + '" name="algorithm' + String(nb_algo) + '" value="RF' + String(nb_algo) + '" onclick="chooseAlgo(this);">';
  t += '<label for="RF' + String(nb_algo) + '">Random Forest</label>';
  t += '<div id="RF_param' + String(nb_algo) + '">'

  t += '<div id ="RF_nestimators' + String(nb_algo) + '" style="margin-left : 1em;">Number of trees :';
  t += '<form name="RF_n_estimators' + String(nb_algo) + '" id="RF_n_estimators' + String(nb_algo) + '"> <textarea name="RFnestimators' + String(nb_algo) + '" rows="1" cols="10"></textarea> </form> </div>'


  t += '<div id="RF_Criterion' + String(nb_algo) + '" style="margin-left : 1em;">Criterion :';
  t += '<input type="radio" id="RF_gini' + String(nb_algo) + '" name="RF_criterion' + String(nb_algo) + '" value="gini" checked> <label for="gini' + String(nb_algo) + '">Gini</label>';
  t += '<input type="radio" id="RF_entropy' + String(nb_algo) + '" name="RF_criterion' + String(nb_algo) + '" value="entropy"> <label for="etropy' + String(nb_algo) + '">Entropy</label> </div>';

  t += '<div id ="RF_max_depth' + String(nb_algo) + '" style="margin-left : 1em;">Max depth :';
  t += '<form name="RF_maxdepth' + String(nb_algo) + '" id="RF_maxdepth' + String(nb_algo) + '"> <textarea name="RFmaxdepth' + String(nb_algo) + '" rows="1" cols="10"></textarea> </form> </div>'

  t += '</div>';

  return (t)
}

function MakeFrameworkhtml(nb_algo) {
  let t = '<div> <h4>Framework</h4> <p>Choose a framework to implement your algorithm</p>';
  t += '<div> <input type="radio" id="sklearn' + String(nb_algo) + '" name="implementation' + String(nb_algo) + '" value="sklearn" checked> <label for="sklearn' + String(nb_algo) + '">scikit-learn</label>'
  t += '<input type="radio" id="R' + String(nb_algo) + '" name="implementation' + String(nb_algo) + '" value="R"> <label for="R' + String(nb_algo) + '">R</label> </div>';
  t += '</div>'
  return (t)
};

function RemoveAlgo() {
  algo = document.getElementById("Algo" + String(NB_algo))
  algo.parentNode.removeChild(algo)
  NB_algo -= 1
  if (NB_algo == 0) {
    ADD.value = 'Add';
    REM.style.display = "none"
  }
}

ADD.addEventListener('click', GenerateAlgoHTML);
REM.addEventListener('click', RemoveAlgo);
//Les algos

function undisplayAlgos(nb) {
  document.getElementById("DT_param" + nb).style.display = "none";
  document.getElementById("SVM_param" + nb).style.display = "none";
  document.getElementById("LR_param" + nb).style.display = "none";
  document.getElementById("RF_param" + nb).style.display = "none";
};

function chooseAlgo(algo) {

  let nb = algo.id.charAt(algo.id.length - 1);
  undisplayAlgos(nb);
  console.log(algo.id);
  if (algo.id.substr(0, 2) == "DT") {

    document.getElementById("DT_param" + nb).style.display = "block";
  }
  else if (algo.id.substr(0, 3) == "SVM") {
    document.getElementById("SVM_param" + nb).style.display = "block";
  }
  else if (algo.id.substr(0, 2) == "LR") {
    document.getElementById("LR_param" + nb).style.display = "block";
  }
  else {
    document.getElementById("RF_param" + nb).style.display = "block";
  };

};

function chooseValidation(method) {

  if (method.value == "crossval") {
    document.getElementById("Split_val").style.display = "none";
    document.getElementById("Cross_val").style.display = "block";
  }
  else {
    document.getElementById("Split_val").style.display = "block";
    document.getElementById("Cross_val").style.display = "none";
  }

}

function chooseMetric(metrics) {

  var met = document.getElementById("metric_choice");

  if (met.style.display == "block") {
    met.style.display = "none";
  }
  else {
    met.style.display = "block";
  };

}

var SplitValidationSlider = document.querySelector('input[name="split_val"]');
SplitValidationSlider.oninput = function () {
  output.textContent = SplitValidationSlider.value;
};

var output = document.querySelector('.output');


