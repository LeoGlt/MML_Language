function GenerateCompiler() {
    var mymml = "";
  
    //datainput
    mymml += DataMML();
    
    //algorithms
    mymml += AlgoMML();

    //formula
    mymml += FormulaMML();
    
    //validation et metrics
    mymml += ValidationMML();

    console.log(mymml);
    return (mymml);
  };


function DataMML(){
    
    var SepValue = document.querySelector('input[name=Sep]:checked').value;
    var datamml = "datainput " + String(fileSent) + " separator " + SepValue + "\n";
  
    if (NB_algo == 0) {
      alert("You may choose an algorithm before compiling please.");
      return (0);
    }
    return(datamml)

};



function AlgoMML(){

    var algomml = "";

    for (let i = 1; i <= NB_algo; i++) {
  
        //framework
        var FrameworkValue = document.querySelector('input[name=implementation' + String(i) + ']:checked').value;
    
        algomml += "mlframework " + FrameworkValue + "\n";
    
        var PickedAlgo = document.querySelector('input[name=algorithm' + String(i) + ']:checked');
    
        //algorithm
        algomml += "algorithm ";
        if (PickedAlgo == null) {
          alert("You may choose an algorithm before compiling please.");
          return (0);
        }
        else if (PickedAlgo.value.substr(0, 2) == "DT") {
          var criterion = document.querySelector("input[name = DT_criterion" + String(i) + "]:checked").value
          var maxdepth = document.querySelector("textarea[name = DTmaxdepth" + String(i) + "]").value
    
          algomml += "DT max_depth=" + String(maxdepth) + " criterion=" + criterion;
        }
        else if (PickedAlgo.value.substr(0, 3) == "SVM") {
          var gamma = document.querySelector("input[name = gamma_svm" + String(i) + "]:checked").value
          var C = document.querySelector("input[name = C_float" + String(i) + "]").value
          var kernel = document.querySelector("input[name = kernel_svm" + String(i) + "]").value
    
          algomml += "SVM gamma=" + gamma + " C=" + C + " kernel=" + kernel;
        }
        else if (PickedAlgo.value.substr(0, 2) == "LR") {
          var penalty = document.querySelector("input[name = penalty_lr" + String(i) + "]:checked").value
          var C = document.querySelector("input[name = C_LR" + String(i) + "]").value
          var tol = document.querySelector("input[name = tol_LR" + String(i) + "]").value
    
          algomml += "LR penalty=" + penalty + " tol=" + String(tol) + " C=" + String(C);
        }
        else {
          var criterion = document.querySelector("input[name = RF_criterion" + String(i) + "]:checked").value
          var maxdepth = document.querySelector("textarea[name = RFmaxdepth" + String(i) + "]").value
          var n_estimators = document.querySelector("textarea[name = RFnestimators" + String(i) + "]").value
    
          algomml += "RF n_estimators=" + n_estimators + " max_depth=" + String(maxdepth) + " criterion=" + criterion;
        }
        ;
        algomml += "\n";
    };

    return(algomml)
};

function FormulaMML(){

  var formulamml = "";
  var selection = document.getElementById('variable_selection');
  var targetvariable = selection.options[selection.selectedIndex].value;

  formulamml += 'formula ' + targetvariable + ' ~ . \n';
  return(formulamml)

};

function ValidationMML(){

    var valmml = "";

    //validation
    var PickedValidation = document.querySelector('input[name=validation]:checked').value;
  
    if (PickedValidation == "crossval") {
        valmml += "CrossValidation { numRepetitionCross " + document.querySelector("textarea[name = folds]").value + " } \n"
    }
    else {
        valmml += "TrainingTest { percentageTraining " + document.querySelector("input[name = split_val]").value + " } \n"
    }
  
    //metrics
    
    if(document.getElementById("metrics").checked){

        var Metrics = document.getElementsByName("metric");
        for (var i = 0; i < Metrics.length; i++) {
            var met = Metrics[i];
            if (met.checked) {
                valmml += met.value + " "
            }
        }
        valmml += "\n"
    };
    return(valmml)
};


let COMP = document.getElementById("Compile");
COMP.addEventListener('click', GenerateCompiler);

