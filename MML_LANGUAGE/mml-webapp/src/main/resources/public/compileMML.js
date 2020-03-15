function GenerateCompiler() {
    var mymml = "";
  
    //datainput
    let datamml = DataMML();
    if(datamml[0] != "error"){
      mymml += datamml;
    } else { 
      document.getElementById('mmlcode').value = datamml[1];
      document.body.scrollTop = 0;
      return(datamml[1])
    };
    
    
    //algorithms
    let algomml = AlgoMML();
    if(algomml[0] != "error"){
      mymml += algomml;
    } else { 
      document.getElementById('mmlcode').value = algomml[1];
      document.body.scrollTop = 0;
      return(algomml[1])
    };

    //formula
    mymml += FormulaMML();
    
    //validation et metrics

    let valmml = ValidationMML();
    if(valmml[0] != "error"){
      mymml += valmml;
    } else { 
      document.getElementById('mmlcode').value = valmml[1];
      document.body.scrollTop = 0;
      return(valmml[1])
    };

    console.log(mymml);
    document.getElementById('mmlcode').value = mymml;
    
    document.body.scrollTop = 0;
    return (mymml);
  };


function DataMML(){

    if (fileSent == null){
      return (["error","You may upload a dataset before compiling please."]);
    }

    if (NB_algo == 0) {
      return (["error","You may choose an algorithm before compiling please."]);
    }

    var SepValue = document.querySelector('input[name=Sep]:checked').value;
    var datamml = 'datainput "' + String(fileSent.value).substr(12) + '" separator ' + SepValue + '\n';
  
    
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
          return (["error","You may choose an algorithm before compiling please."]);
        }
        else if (PickedAlgo.value.substr(0, 2) == "DT") {
          var criterion = document.querySelector("input[name = DT_criterion" + String(i) + "]:checked").value
          var maxdepth = Number.parseFloat(document.querySelector("input[name = DTmaxdepth" + String(i) + "]").value);

          if(maxdepth <= 0 | !Number.isInteger(maxdepth)){
            return(["error","Max depth argument for Decisition Tree should be a stricly positive integer"])
          } else{
            algomml += "DT max_depth=" + String(maxdepth) + " criterion=" + criterion;
          }
    
          
        }
        else if (PickedAlgo.value.substr(0, 3) == "SVM") {
          var gamma = document.querySelector("input[name = gamma_svm" + String(i) + "]:checked").value;
          var C = Number.parseFloat(document.querySelector("input[name = C_float" + String(i) + "]").value);
          var kernel = document.querySelector("input[name = kernel_svm" + String(i) + "]:checked").value;

          if(C <= 0 | Number.isNaN(C)){
            return(["error","C argument for SVM should be a stricly positive float number"])
          } else{
            algomml += "SVM gamma=" + gamma + " C=" + String(C) + " kernel=" + kernel;
          }    
          
        }
        else if (PickedAlgo.value.substr(0, 2) == "LR") {
          var penalty = document.querySelector("input[name = penalty_lr" + String(i) + "]:checked").value;
          var C = Number.parseFloat(document.querySelector("input[name = C_LR" + String(i) + "]").value);
          var tol = Number.parseFloat(document.querySelector("input[name = tol_LR" + String(i) + "]").value);

          if(C <= 0 | Number.isNaN(C)){
            return(["error","C argument for SVM should be a stricly positive float number"])
          } else if(tol <= 0 | Number.isNaN(tol)){
            return(["error","tol argument for SVM should be a stricly positive float number"])
          } else { 
            algomml += "LR penalty=" + penalty + " tol=" + String(tol) + " C=" + String(C);
          }  
        }
        else {
          var criterion = document.querySelector("input[name = RF_criterion" + String(i) + "]:checked").value;
          var maxdepth = document.querySelector("input[name = RFmaxdepth" + String(i) + "]").value;
          var n_estimators = Number.parseFloat(document.querySelector("input[name = RFnestimators" + String(i) + "]").value);
          
          if(maxdepth != ""){
            maxdepth = Number.parseFloat(maxdepth)
            if(maxdepth <= 0 | !Number.isInteger(maxdepth)){
              return(["error","Max depth argument for Random Forest should either be a strictly positive integer or nothing (to allow maximum depth possible)"])
            }
            
          }
          else if(n_estimators <= 0 | !Number.isInteger(n_estimators)){
            return(["error","Number of trees argument for Random Forest should be a strictly positive integer"])
          }
          else{
            if(maxdepth == ""){
              algomml += "RF n_estimators=" + n_estimators + " criterion=" + criterion;
            }
            else{
              algomml += "RF n_estimators=" + n_estimators + " max_depth=" + String(maxdepth) + " criterion=" + criterion;
            };
            
          };

          
        };
        algomml += "\n";
    };

    return(algomml)
};

function FormulaMML(){

  var formulamml = "";
  var selection = document.getElementById('variable_selection');
  var targetvariable = selection.options[selection.selectedIndex].value;

  formulamml += 'formula "' + targetvariable + '" ~ ';

  var predictive_variables = document.getElementsByName('predict_variables');
  var all = true;
  var predictors = '';

  for(var i = 0; i < predictive_variables.length;i++){    
    var v = predictive_variables[i];
    if(v.checked && v.value != targetvariable){
      if(i > 0 && predictors != ''){
        predictors += ' + '
      };
      predictors += '"'+v.value+'"';
    }
    else if(v.value != targetvariable){
      var all = false;
    };
  };
  
  if(all){
    formulamml += " . \n"
  }
  else{
    formulamml += predictors + " \n"
  }
   
  return(formulamml)

};

function ValidationMML(){

    var valmml = "";

    //validation
    var PickedValidation = document.querySelector('input[name=validation]:checked').value;
  
    if (PickedValidation == "crossval") {
      var folds = Number.parseFloat(document.querySelector("input[name = folds_val]").value);
      
      if(folds <= 0 | !Number.isInteger(folds)){
        return(["error","Number of folds for cross validation should be a strictly positive integer"]);
      } else {
        valmml += "CrossValidation { numRepetitionCross " + folds + " } \n";
      };

        
    }
    else {
        valmml += "TrainingTest { percentageTraining " + document.querySelector("input[name = split_val]").value + " } \n";
    };
  
    //metrics
    
    var Metrics = document.getElementsByName("metric");

    var NB_met = 0;
    for (var i = 0; i < Metrics.length; i++) {
        var met = Metrics[i];
        if (met.checked) {
            valmml += met.value + " "
            NB_met += 1
        }
    };
    if(NB_met == 0){
      return(["error","You may choose at least one output metric before compiling please"]);
    };


    valmml += "\n";

    return(valmml)
};


let COMP = document.getElementById("Compile");
COMP.addEventListener('click', GenerateCompiler);

