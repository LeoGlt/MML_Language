package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MmlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMmlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'datainput'", "'separator'", "'mlframework'", "'algorithm'", "'SVM'", "'gamma='", "'C='", "'kernel='", "'DT'", "'DecisionTree'", "'max_depth='", "'criterion='", "'RandomForest'", "'RF'", "'n_estimators='", "'LogisticRegression'", "'penalty='", "'tol='", "'.'", "'formula'", "'~'", "'+'", "'CrossValidation'", "'{'", "'numRepetitionCross'", "'}'", "'TrainingTest'", "'percentageTraining'", "','", "';'", "'scikit-learn'", "'R'", "'Weka'", "'xgboost'", "'rbf'", "'linear'", "'poly'", "'sigmoid'", "'gini'", "'entropy'", "'l2'", "'l1'", "'elasticnet'", "'none'", "'balanced_accuracy'", "'recall'", "'precision'", "'F1'", "'accuracy'", "'macro_recall'", "'macro_precision'", "'macro_F1'", "'macro_accuracy'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMmlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMmlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMmlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMml.g"; }



     	private MmlGrammarAccess grammarAccess;

        public InternalMmlParser(TokenStream input, MmlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MMLModel";
       	}

       	@Override
       	protected MmlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMMLModel"
    // InternalMml.g:65:1: entryRuleMMLModel returns [EObject current=null] : iv_ruleMMLModel= ruleMMLModel EOF ;
    public final EObject entryRuleMMLModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMMLModel = null;


        try {
            // InternalMml.g:65:49: (iv_ruleMMLModel= ruleMMLModel EOF )
            // InternalMml.g:66:2: iv_ruleMMLModel= ruleMMLModel EOF
            {
             newCompositeNode(grammarAccess.getMMLModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMMLModel=ruleMMLModel();

            state._fsp--;

             current =iv_ruleMMLModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMMLModel"


    // $ANTLR start "ruleMMLModel"
    // InternalMml.g:72:1: ruleMMLModel returns [EObject current=null] : ( ( (lv_input_0_0= ruleDataInput ) ) ( (lv_algorithms_1_0= ruleMLChoiceAlgorithm ) )+ ( (lv_formula_2_0= ruleRFormula ) )? ( (lv_validation_3_0= ruleValidation ) ) ) ;
    public final EObject ruleMMLModel() throws RecognitionException {
        EObject current = null;

        EObject lv_input_0_0 = null;

        EObject lv_algorithms_1_0 = null;

        EObject lv_formula_2_0 = null;

        EObject lv_validation_3_0 = null;



        	enterRule();

        try {
            // InternalMml.g:78:2: ( ( ( (lv_input_0_0= ruleDataInput ) ) ( (lv_algorithms_1_0= ruleMLChoiceAlgorithm ) )+ ( (lv_formula_2_0= ruleRFormula ) )? ( (lv_validation_3_0= ruleValidation ) ) ) )
            // InternalMml.g:79:2: ( ( (lv_input_0_0= ruleDataInput ) ) ( (lv_algorithms_1_0= ruleMLChoiceAlgorithm ) )+ ( (lv_formula_2_0= ruleRFormula ) )? ( (lv_validation_3_0= ruleValidation ) ) )
            {
            // InternalMml.g:79:2: ( ( (lv_input_0_0= ruleDataInput ) ) ( (lv_algorithms_1_0= ruleMLChoiceAlgorithm ) )+ ( (lv_formula_2_0= ruleRFormula ) )? ( (lv_validation_3_0= ruleValidation ) ) )
            // InternalMml.g:80:3: ( (lv_input_0_0= ruleDataInput ) ) ( (lv_algorithms_1_0= ruleMLChoiceAlgorithm ) )+ ( (lv_formula_2_0= ruleRFormula ) )? ( (lv_validation_3_0= ruleValidation ) )
            {
            // InternalMml.g:80:3: ( (lv_input_0_0= ruleDataInput ) )
            // InternalMml.g:81:4: (lv_input_0_0= ruleDataInput )
            {
            // InternalMml.g:81:4: (lv_input_0_0= ruleDataInput )
            // InternalMml.g:82:5: lv_input_0_0= ruleDataInput
            {

            					newCompositeNode(grammarAccess.getMMLModelAccess().getInputDataInputParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_input_0_0=ruleDataInput();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMMLModelRule());
            					}
            					set(
            						current,
            						"input",
            						lv_input_0_0,
            						"org.xtext.example.mydsl.Mml.DataInput");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMml.g:99:3: ( (lv_algorithms_1_0= ruleMLChoiceAlgorithm ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMml.g:100:4: (lv_algorithms_1_0= ruleMLChoiceAlgorithm )
            	    {
            	    // InternalMml.g:100:4: (lv_algorithms_1_0= ruleMLChoiceAlgorithm )
            	    // InternalMml.g:101:5: lv_algorithms_1_0= ruleMLChoiceAlgorithm
            	    {

            	    					newCompositeNode(grammarAccess.getMMLModelAccess().getAlgorithmsMLChoiceAlgorithmParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_algorithms_1_0=ruleMLChoiceAlgorithm();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMMLModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"algorithms",
            	    						lv_algorithms_1_0,
            	    						"org.xtext.example.mydsl.Mml.MLChoiceAlgorithm");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // InternalMml.g:118:3: ( (lv_formula_2_0= ruleRFormula ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==30) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMml.g:119:4: (lv_formula_2_0= ruleRFormula )
                    {
                    // InternalMml.g:119:4: (lv_formula_2_0= ruleRFormula )
                    // InternalMml.g:120:5: lv_formula_2_0= ruleRFormula
                    {

                    					newCompositeNode(grammarAccess.getMMLModelAccess().getFormulaRFormulaParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_formula_2_0=ruleRFormula();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMMLModelRule());
                    					}
                    					set(
                    						current,
                    						"formula",
                    						lv_formula_2_0,
                    						"org.xtext.example.mydsl.Mml.RFormula");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMml.g:137:3: ( (lv_validation_3_0= ruleValidation ) )
            // InternalMml.g:138:4: (lv_validation_3_0= ruleValidation )
            {
            // InternalMml.g:138:4: (lv_validation_3_0= ruleValidation )
            // InternalMml.g:139:5: lv_validation_3_0= ruleValidation
            {

            					newCompositeNode(grammarAccess.getMMLModelAccess().getValidationValidationParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_validation_3_0=ruleValidation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMMLModelRule());
            					}
            					set(
            						current,
            						"validation",
            						lv_validation_3_0,
            						"org.xtext.example.mydsl.Mml.Validation");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMMLModel"


    // $ANTLR start "entryRuleDataInput"
    // InternalMml.g:160:1: entryRuleDataInput returns [EObject current=null] : iv_ruleDataInput= ruleDataInput EOF ;
    public final EObject entryRuleDataInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataInput = null;


        try {
            // InternalMml.g:160:50: (iv_ruleDataInput= ruleDataInput EOF )
            // InternalMml.g:161:2: iv_ruleDataInput= ruleDataInput EOF
            {
             newCompositeNode(grammarAccess.getDataInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataInput=ruleDataInput();

            state._fsp--;

             current =iv_ruleDataInput; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataInput"


    // $ANTLR start "ruleDataInput"
    // InternalMml.g:167:1: ruleDataInput returns [EObject current=null] : (otherlv_0= 'datainput' ( (lv_filelocation_1_0= RULE_STRING ) ) ( (lv_parsingInstruction_2_0= ruleCSVParsingConfiguration ) )? ) ;
    public final EObject ruleDataInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_filelocation_1_0=null;
        EObject lv_parsingInstruction_2_0 = null;



        	enterRule();

        try {
            // InternalMml.g:173:2: ( (otherlv_0= 'datainput' ( (lv_filelocation_1_0= RULE_STRING ) ) ( (lv_parsingInstruction_2_0= ruleCSVParsingConfiguration ) )? ) )
            // InternalMml.g:174:2: (otherlv_0= 'datainput' ( (lv_filelocation_1_0= RULE_STRING ) ) ( (lv_parsingInstruction_2_0= ruleCSVParsingConfiguration ) )? )
            {
            // InternalMml.g:174:2: (otherlv_0= 'datainput' ( (lv_filelocation_1_0= RULE_STRING ) ) ( (lv_parsingInstruction_2_0= ruleCSVParsingConfiguration ) )? )
            // InternalMml.g:175:3: otherlv_0= 'datainput' ( (lv_filelocation_1_0= RULE_STRING ) ) ( (lv_parsingInstruction_2_0= ruleCSVParsingConfiguration ) )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDataInputAccess().getDatainputKeyword_0());
            		
            // InternalMml.g:179:3: ( (lv_filelocation_1_0= RULE_STRING ) )
            // InternalMml.g:180:4: (lv_filelocation_1_0= RULE_STRING )
            {
            // InternalMml.g:180:4: (lv_filelocation_1_0= RULE_STRING )
            // InternalMml.g:181:5: lv_filelocation_1_0= RULE_STRING
            {
            lv_filelocation_1_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_filelocation_1_0, grammarAccess.getDataInputAccess().getFilelocationSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataInputRule());
            					}
            					setWithLastConsumed(
            						current,
            						"filelocation",
            						lv_filelocation_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMml.g:197:3: ( (lv_parsingInstruction_2_0= ruleCSVParsingConfiguration ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMml.g:198:4: (lv_parsingInstruction_2_0= ruleCSVParsingConfiguration )
                    {
                    // InternalMml.g:198:4: (lv_parsingInstruction_2_0= ruleCSVParsingConfiguration )
                    // InternalMml.g:199:5: lv_parsingInstruction_2_0= ruleCSVParsingConfiguration
                    {

                    					newCompositeNode(grammarAccess.getDataInputAccess().getParsingInstructionCSVParsingConfigurationParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_parsingInstruction_2_0=ruleCSVParsingConfiguration();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDataInputRule());
                    					}
                    					set(
                    						current,
                    						"parsingInstruction",
                    						lv_parsingInstruction_2_0,
                    						"org.xtext.example.mydsl.Mml.CSVParsingConfiguration");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataInput"


    // $ANTLR start "entryRuleCSVParsingConfiguration"
    // InternalMml.g:220:1: entryRuleCSVParsingConfiguration returns [EObject current=null] : iv_ruleCSVParsingConfiguration= ruleCSVParsingConfiguration EOF ;
    public final EObject entryRuleCSVParsingConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSVParsingConfiguration = null;


        try {
            // InternalMml.g:220:64: (iv_ruleCSVParsingConfiguration= ruleCSVParsingConfiguration EOF )
            // InternalMml.g:221:2: iv_ruleCSVParsingConfiguration= ruleCSVParsingConfiguration EOF
            {
             newCompositeNode(grammarAccess.getCSVParsingConfigurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCSVParsingConfiguration=ruleCSVParsingConfiguration();

            state._fsp--;

             current =iv_ruleCSVParsingConfiguration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCSVParsingConfiguration"


    // $ANTLR start "ruleCSVParsingConfiguration"
    // InternalMml.g:227:1: ruleCSVParsingConfiguration returns [EObject current=null] : (otherlv_0= 'separator' ( (lv_sep_1_0= ruleCSVSeparator ) ) ) ;
    public final EObject ruleCSVParsingConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_sep_1_0 = null;



        	enterRule();

        try {
            // InternalMml.g:233:2: ( (otherlv_0= 'separator' ( (lv_sep_1_0= ruleCSVSeparator ) ) ) )
            // InternalMml.g:234:2: (otherlv_0= 'separator' ( (lv_sep_1_0= ruleCSVSeparator ) ) )
            {
            // InternalMml.g:234:2: (otherlv_0= 'separator' ( (lv_sep_1_0= ruleCSVSeparator ) ) )
            // InternalMml.g:235:3: otherlv_0= 'separator' ( (lv_sep_1_0= ruleCSVSeparator ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getCSVParsingConfigurationAccess().getSeparatorKeyword_0());
            		
            // InternalMml.g:239:3: ( (lv_sep_1_0= ruleCSVSeparator ) )
            // InternalMml.g:240:4: (lv_sep_1_0= ruleCSVSeparator )
            {
            // InternalMml.g:240:4: (lv_sep_1_0= ruleCSVSeparator )
            // InternalMml.g:241:5: lv_sep_1_0= ruleCSVSeparator
            {

            					newCompositeNode(grammarAccess.getCSVParsingConfigurationAccess().getSepCSVSeparatorEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_sep_1_0=ruleCSVSeparator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCSVParsingConfigurationRule());
            					}
            					set(
            						current,
            						"sep",
            						lv_sep_1_0,
            						"org.xtext.example.mydsl.Mml.CSVSeparator");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCSVParsingConfiguration"


    // $ANTLR start "entryRuleMLChoiceAlgorithm"
    // InternalMml.g:262:1: entryRuleMLChoiceAlgorithm returns [EObject current=null] : iv_ruleMLChoiceAlgorithm= ruleMLChoiceAlgorithm EOF ;
    public final EObject entryRuleMLChoiceAlgorithm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMLChoiceAlgorithm = null;


        try {
            // InternalMml.g:262:58: (iv_ruleMLChoiceAlgorithm= ruleMLChoiceAlgorithm EOF )
            // InternalMml.g:263:2: iv_ruleMLChoiceAlgorithm= ruleMLChoiceAlgorithm EOF
            {
             newCompositeNode(grammarAccess.getMLChoiceAlgorithmRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMLChoiceAlgorithm=ruleMLChoiceAlgorithm();

            state._fsp--;

             current =iv_ruleMLChoiceAlgorithm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMLChoiceAlgorithm"


    // $ANTLR start "ruleMLChoiceAlgorithm"
    // InternalMml.g:269:1: ruleMLChoiceAlgorithm returns [EObject current=null] : (otherlv_0= 'mlframework' ( (lv_framework_1_0= ruleFrameworkLang ) ) otherlv_2= 'algorithm' ( (lv_algorithm_3_0= ruleMLAlgorithm ) ) ) ;
    public final EObject ruleMLChoiceAlgorithm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Enumerator lv_framework_1_0 = null;

        EObject lv_algorithm_3_0 = null;



        	enterRule();

        try {
            // InternalMml.g:275:2: ( (otherlv_0= 'mlframework' ( (lv_framework_1_0= ruleFrameworkLang ) ) otherlv_2= 'algorithm' ( (lv_algorithm_3_0= ruleMLAlgorithm ) ) ) )
            // InternalMml.g:276:2: (otherlv_0= 'mlframework' ( (lv_framework_1_0= ruleFrameworkLang ) ) otherlv_2= 'algorithm' ( (lv_algorithm_3_0= ruleMLAlgorithm ) ) )
            {
            // InternalMml.g:276:2: (otherlv_0= 'mlframework' ( (lv_framework_1_0= ruleFrameworkLang ) ) otherlv_2= 'algorithm' ( (lv_algorithm_3_0= ruleMLAlgorithm ) ) )
            // InternalMml.g:277:3: otherlv_0= 'mlframework' ( (lv_framework_1_0= ruleFrameworkLang ) ) otherlv_2= 'algorithm' ( (lv_algorithm_3_0= ruleMLAlgorithm ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getMLChoiceAlgorithmAccess().getMlframeworkKeyword_0());
            		
            // InternalMml.g:281:3: ( (lv_framework_1_0= ruleFrameworkLang ) )
            // InternalMml.g:282:4: (lv_framework_1_0= ruleFrameworkLang )
            {
            // InternalMml.g:282:4: (lv_framework_1_0= ruleFrameworkLang )
            // InternalMml.g:283:5: lv_framework_1_0= ruleFrameworkLang
            {

            					newCompositeNode(grammarAccess.getMLChoiceAlgorithmAccess().getFrameworkFrameworkLangEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_framework_1_0=ruleFrameworkLang();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMLChoiceAlgorithmRule());
            					}
            					set(
            						current,
            						"framework",
            						lv_framework_1_0,
            						"org.xtext.example.mydsl.Mml.FrameworkLang");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getMLChoiceAlgorithmAccess().getAlgorithmKeyword_2());
            		
            // InternalMml.g:304:3: ( (lv_algorithm_3_0= ruleMLAlgorithm ) )
            // InternalMml.g:305:4: (lv_algorithm_3_0= ruleMLAlgorithm )
            {
            // InternalMml.g:305:4: (lv_algorithm_3_0= ruleMLAlgorithm )
            // InternalMml.g:306:5: lv_algorithm_3_0= ruleMLAlgorithm
            {

            					newCompositeNode(grammarAccess.getMLChoiceAlgorithmAccess().getAlgorithmMLAlgorithmParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_algorithm_3_0=ruleMLAlgorithm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMLChoiceAlgorithmRule());
            					}
            					set(
            						current,
            						"algorithm",
            						lv_algorithm_3_0,
            						"org.xtext.example.mydsl.Mml.MLAlgorithm");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMLChoiceAlgorithm"


    // $ANTLR start "entryRuleMLAlgorithm"
    // InternalMml.g:327:1: entryRuleMLAlgorithm returns [EObject current=null] : iv_ruleMLAlgorithm= ruleMLAlgorithm EOF ;
    public final EObject entryRuleMLAlgorithm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMLAlgorithm = null;


        try {
            // InternalMml.g:327:52: (iv_ruleMLAlgorithm= ruleMLAlgorithm EOF )
            // InternalMml.g:328:2: iv_ruleMLAlgorithm= ruleMLAlgorithm EOF
            {
             newCompositeNode(grammarAccess.getMLAlgorithmRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMLAlgorithm=ruleMLAlgorithm();

            state._fsp--;

             current =iv_ruleMLAlgorithm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMLAlgorithm"


    // $ANTLR start "ruleMLAlgorithm"
    // InternalMml.g:334:1: ruleMLAlgorithm returns [EObject current=null] : (this_SVM_0= ruleSVM | this_DT_1= ruleDT | this_RandomForest_2= ruleRandomForest | this_LogisticRegression_3= ruleLogisticRegression ) ;
    public final EObject ruleMLAlgorithm() throws RecognitionException {
        EObject current = null;

        EObject this_SVM_0 = null;

        EObject this_DT_1 = null;

        EObject this_RandomForest_2 = null;

        EObject this_LogisticRegression_3 = null;



        	enterRule();

        try {
            // InternalMml.g:340:2: ( (this_SVM_0= ruleSVM | this_DT_1= ruleDT | this_RandomForest_2= ruleRandomForest | this_LogisticRegression_3= ruleLogisticRegression ) )
            // InternalMml.g:341:2: (this_SVM_0= ruleSVM | this_DT_1= ruleDT | this_RandomForest_2= ruleRandomForest | this_LogisticRegression_3= ruleLogisticRegression )
            {
            // InternalMml.g:341:2: (this_SVM_0= ruleSVM | this_DT_1= ruleDT | this_RandomForest_2= ruleRandomForest | this_LogisticRegression_3= ruleLogisticRegression )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt4=1;
                }
                break;
            case 19:
            case 20:
                {
                alt4=2;
                }
                break;
            case 23:
            case 24:
                {
                alt4=3;
                }
                break;
            case 26:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMml.g:342:3: this_SVM_0= ruleSVM
                    {

                    			newCompositeNode(grammarAccess.getMLAlgorithmAccess().getSVMParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SVM_0=ruleSVM();

                    state._fsp--;


                    			current = this_SVM_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMml.g:351:3: this_DT_1= ruleDT
                    {

                    			newCompositeNode(grammarAccess.getMLAlgorithmAccess().getDTParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DT_1=ruleDT();

                    state._fsp--;


                    			current = this_DT_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMml.g:360:3: this_RandomForest_2= ruleRandomForest
                    {

                    			newCompositeNode(grammarAccess.getMLAlgorithmAccess().getRandomForestParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RandomForest_2=ruleRandomForest();

                    state._fsp--;


                    			current = this_RandomForest_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMml.g:369:3: this_LogisticRegression_3= ruleLogisticRegression
                    {

                    			newCompositeNode(grammarAccess.getMLAlgorithmAccess().getLogisticRegressionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogisticRegression_3=ruleLogisticRegression();

                    state._fsp--;


                    			current = this_LogisticRegression_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMLAlgorithm"


    // $ANTLR start "entryRuleSVM"
    // InternalMml.g:381:1: entryRuleSVM returns [EObject current=null] : iv_ruleSVM= ruleSVM EOF ;
    public final EObject entryRuleSVM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSVM = null;


        try {
            // InternalMml.g:381:44: (iv_ruleSVM= ruleSVM EOF )
            // InternalMml.g:382:2: iv_ruleSVM= ruleSVM EOF
            {
             newCompositeNode(grammarAccess.getSVMRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSVM=ruleSVM();

            state._fsp--;

             current =iv_ruleSVM; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSVM"


    // $ANTLR start "ruleSVM"
    // InternalMml.g:388:1: ruleSVM returns [EObject current=null] : ( () otherlv_1= 'SVM' ( ( (lv_gammaSpecified_2_0= 'gamma=' ) ) ( (lv_gamma_3_0= ruleFLOAT ) ) )? ( ( (lv_CSpecified_4_0= 'C=' ) ) ( (lv_C_5_0= ruleFLOAT ) ) )? ( ( (lv_kernelSpecified_6_0= 'kernel=' ) ) ( (lv_kernel_7_0= ruleSVMKernel ) ) )? ) ;
    public final EObject ruleSVM() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_gammaSpecified_2_0=null;
        Token lv_CSpecified_4_0=null;
        Token lv_kernelSpecified_6_0=null;
        AntlrDatatypeRuleToken lv_gamma_3_0 = null;

        AntlrDatatypeRuleToken lv_C_5_0 = null;

        Enumerator lv_kernel_7_0 = null;



        	enterRule();

        try {
            // InternalMml.g:394:2: ( ( () otherlv_1= 'SVM' ( ( (lv_gammaSpecified_2_0= 'gamma=' ) ) ( (lv_gamma_3_0= ruleFLOAT ) ) )? ( ( (lv_CSpecified_4_0= 'C=' ) ) ( (lv_C_5_0= ruleFLOAT ) ) )? ( ( (lv_kernelSpecified_6_0= 'kernel=' ) ) ( (lv_kernel_7_0= ruleSVMKernel ) ) )? ) )
            // InternalMml.g:395:2: ( () otherlv_1= 'SVM' ( ( (lv_gammaSpecified_2_0= 'gamma=' ) ) ( (lv_gamma_3_0= ruleFLOAT ) ) )? ( ( (lv_CSpecified_4_0= 'C=' ) ) ( (lv_C_5_0= ruleFLOAT ) ) )? ( ( (lv_kernelSpecified_6_0= 'kernel=' ) ) ( (lv_kernel_7_0= ruleSVMKernel ) ) )? )
            {
            // InternalMml.g:395:2: ( () otherlv_1= 'SVM' ( ( (lv_gammaSpecified_2_0= 'gamma=' ) ) ( (lv_gamma_3_0= ruleFLOAT ) ) )? ( ( (lv_CSpecified_4_0= 'C=' ) ) ( (lv_C_5_0= ruleFLOAT ) ) )? ( ( (lv_kernelSpecified_6_0= 'kernel=' ) ) ( (lv_kernel_7_0= ruleSVMKernel ) ) )? )
            // InternalMml.g:396:3: () otherlv_1= 'SVM' ( ( (lv_gammaSpecified_2_0= 'gamma=' ) ) ( (lv_gamma_3_0= ruleFLOAT ) ) )? ( ( (lv_CSpecified_4_0= 'C=' ) ) ( (lv_C_5_0= ruleFLOAT ) ) )? ( ( (lv_kernelSpecified_6_0= 'kernel=' ) ) ( (lv_kernel_7_0= ruleSVMKernel ) ) )?
            {
            // InternalMml.g:396:3: ()
            // InternalMml.g:397:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSVMAccess().getSVMAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getSVMAccess().getSVMKeyword_1());
            		
            // InternalMml.g:407:3: ( ( (lv_gammaSpecified_2_0= 'gamma=' ) ) ( (lv_gamma_3_0= ruleFLOAT ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMml.g:408:4: ( (lv_gammaSpecified_2_0= 'gamma=' ) ) ( (lv_gamma_3_0= ruleFLOAT ) )
                    {
                    // InternalMml.g:408:4: ( (lv_gammaSpecified_2_0= 'gamma=' ) )
                    // InternalMml.g:409:5: (lv_gammaSpecified_2_0= 'gamma=' )
                    {
                    // InternalMml.g:409:5: (lv_gammaSpecified_2_0= 'gamma=' )
                    // InternalMml.g:410:6: lv_gammaSpecified_2_0= 'gamma='
                    {
                    lv_gammaSpecified_2_0=(Token)match(input,16,FOLLOW_13); 

                    						newLeafNode(lv_gammaSpecified_2_0, grammarAccess.getSVMAccess().getGammaSpecifiedGammaKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSVMRule());
                    						}
                    						setWithLastConsumed(current, "gammaSpecified", true, "gamma=");
                    					

                    }


                    }

                    // InternalMml.g:422:4: ( (lv_gamma_3_0= ruleFLOAT ) )
                    // InternalMml.g:423:5: (lv_gamma_3_0= ruleFLOAT )
                    {
                    // InternalMml.g:423:5: (lv_gamma_3_0= ruleFLOAT )
                    // InternalMml.g:424:6: lv_gamma_3_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getSVMAccess().getGammaFLOATParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_gamma_3_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSVMRule());
                    						}
                    						set(
                    							current,
                    							"gamma",
                    							lv_gamma_3_0,
                    							"org.xtext.example.mydsl.Mml.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMml.g:442:3: ( ( (lv_CSpecified_4_0= 'C=' ) ) ( (lv_C_5_0= ruleFLOAT ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMml.g:443:4: ( (lv_CSpecified_4_0= 'C=' ) ) ( (lv_C_5_0= ruleFLOAT ) )
                    {
                    // InternalMml.g:443:4: ( (lv_CSpecified_4_0= 'C=' ) )
                    // InternalMml.g:444:5: (lv_CSpecified_4_0= 'C=' )
                    {
                    // InternalMml.g:444:5: (lv_CSpecified_4_0= 'C=' )
                    // InternalMml.g:445:6: lv_CSpecified_4_0= 'C='
                    {
                    lv_CSpecified_4_0=(Token)match(input,17,FOLLOW_13); 

                    						newLeafNode(lv_CSpecified_4_0, grammarAccess.getSVMAccess().getCSpecifiedCKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSVMRule());
                    						}
                    						setWithLastConsumed(current, "CSpecified", true, "C=");
                    					

                    }


                    }

                    // InternalMml.g:457:4: ( (lv_C_5_0= ruleFLOAT ) )
                    // InternalMml.g:458:5: (lv_C_5_0= ruleFLOAT )
                    {
                    // InternalMml.g:458:5: (lv_C_5_0= ruleFLOAT )
                    // InternalMml.g:459:6: lv_C_5_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getSVMAccess().getCFLOATParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_C_5_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSVMRule());
                    						}
                    						set(
                    							current,
                    							"C",
                    							lv_C_5_0,
                    							"org.xtext.example.mydsl.Mml.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMml.g:477:3: ( ( (lv_kernelSpecified_6_0= 'kernel=' ) ) ( (lv_kernel_7_0= ruleSVMKernel ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMml.g:478:4: ( (lv_kernelSpecified_6_0= 'kernel=' ) ) ( (lv_kernel_7_0= ruleSVMKernel ) )
                    {
                    // InternalMml.g:478:4: ( (lv_kernelSpecified_6_0= 'kernel=' ) )
                    // InternalMml.g:479:5: (lv_kernelSpecified_6_0= 'kernel=' )
                    {
                    // InternalMml.g:479:5: (lv_kernelSpecified_6_0= 'kernel=' )
                    // InternalMml.g:480:6: lv_kernelSpecified_6_0= 'kernel='
                    {
                    lv_kernelSpecified_6_0=(Token)match(input,18,FOLLOW_16); 

                    						newLeafNode(lv_kernelSpecified_6_0, grammarAccess.getSVMAccess().getKernelSpecifiedKernelKeyword_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSVMRule());
                    						}
                    						setWithLastConsumed(current, "kernelSpecified", true, "kernel=");
                    					

                    }


                    }

                    // InternalMml.g:492:4: ( (lv_kernel_7_0= ruleSVMKernel ) )
                    // InternalMml.g:493:5: (lv_kernel_7_0= ruleSVMKernel )
                    {
                    // InternalMml.g:493:5: (lv_kernel_7_0= ruleSVMKernel )
                    // InternalMml.g:494:6: lv_kernel_7_0= ruleSVMKernel
                    {

                    						newCompositeNode(grammarAccess.getSVMAccess().getKernelSVMKernelEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_kernel_7_0=ruleSVMKernel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSVMRule());
                    						}
                    						set(
                    							current,
                    							"kernel",
                    							lv_kernel_7_0,
                    							"org.xtext.example.mydsl.Mml.SVMKernel");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSVM"


    // $ANTLR start "entryRuleDT"
    // InternalMml.g:516:1: entryRuleDT returns [EObject current=null] : iv_ruleDT= ruleDT EOF ;
    public final EObject entryRuleDT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDT = null;


        try {
            // InternalMml.g:516:43: (iv_ruleDT= ruleDT EOF )
            // InternalMml.g:517:2: iv_ruleDT= ruleDT EOF
            {
             newCompositeNode(grammarAccess.getDTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDT=ruleDT();

            state._fsp--;

             current =iv_ruleDT; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDT"


    // $ANTLR start "ruleDT"
    // InternalMml.g:523:1: ruleDT returns [EObject current=null] : ( () (otherlv_1= 'DT' | otherlv_2= 'DecisionTree' ) ( ( (lv_maxdepthSpecified_3_0= 'max_depth=' ) ) ( (lv_max_depth_4_0= RULE_INT ) ) )? ( ( (lv_criterionSpecified_5_0= 'criterion=' ) ) ( (lv_criterion_6_0= ruleDTCriterion ) ) )? ) ;
    public final EObject ruleDT() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_maxdepthSpecified_3_0=null;
        Token lv_max_depth_4_0=null;
        Token lv_criterionSpecified_5_0=null;
        Enumerator lv_criterion_6_0 = null;



        	enterRule();

        try {
            // InternalMml.g:529:2: ( ( () (otherlv_1= 'DT' | otherlv_2= 'DecisionTree' ) ( ( (lv_maxdepthSpecified_3_0= 'max_depth=' ) ) ( (lv_max_depth_4_0= RULE_INT ) ) )? ( ( (lv_criterionSpecified_5_0= 'criterion=' ) ) ( (lv_criterion_6_0= ruleDTCriterion ) ) )? ) )
            // InternalMml.g:530:2: ( () (otherlv_1= 'DT' | otherlv_2= 'DecisionTree' ) ( ( (lv_maxdepthSpecified_3_0= 'max_depth=' ) ) ( (lv_max_depth_4_0= RULE_INT ) ) )? ( ( (lv_criterionSpecified_5_0= 'criterion=' ) ) ( (lv_criterion_6_0= ruleDTCriterion ) ) )? )
            {
            // InternalMml.g:530:2: ( () (otherlv_1= 'DT' | otherlv_2= 'DecisionTree' ) ( ( (lv_maxdepthSpecified_3_0= 'max_depth=' ) ) ( (lv_max_depth_4_0= RULE_INT ) ) )? ( ( (lv_criterionSpecified_5_0= 'criterion=' ) ) ( (lv_criterion_6_0= ruleDTCriterion ) ) )? )
            // InternalMml.g:531:3: () (otherlv_1= 'DT' | otherlv_2= 'DecisionTree' ) ( ( (lv_maxdepthSpecified_3_0= 'max_depth=' ) ) ( (lv_max_depth_4_0= RULE_INT ) ) )? ( ( (lv_criterionSpecified_5_0= 'criterion=' ) ) ( (lv_criterion_6_0= ruleDTCriterion ) ) )?
            {
            // InternalMml.g:531:3: ()
            // InternalMml.g:532:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDTAccess().getDTAction_0(),
            					current);
            			

            }

            // InternalMml.g:538:3: (otherlv_1= 'DT' | otherlv_2= 'DecisionTree' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            else if ( (LA8_0==20) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMml.g:539:4: otherlv_1= 'DT'
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_17); 

                    				newLeafNode(otherlv_1, grammarAccess.getDTAccess().getDTKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMml.g:544:4: otherlv_2= 'DecisionTree'
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getDTAccess().getDecisionTreeKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalMml.g:549:3: ( ( (lv_maxdepthSpecified_3_0= 'max_depth=' ) ) ( (lv_max_depth_4_0= RULE_INT ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMml.g:550:4: ( (lv_maxdepthSpecified_3_0= 'max_depth=' ) ) ( (lv_max_depth_4_0= RULE_INT ) )
                    {
                    // InternalMml.g:550:4: ( (lv_maxdepthSpecified_3_0= 'max_depth=' ) )
                    // InternalMml.g:551:5: (lv_maxdepthSpecified_3_0= 'max_depth=' )
                    {
                    // InternalMml.g:551:5: (lv_maxdepthSpecified_3_0= 'max_depth=' )
                    // InternalMml.g:552:6: lv_maxdepthSpecified_3_0= 'max_depth='
                    {
                    lv_maxdepthSpecified_3_0=(Token)match(input,21,FOLLOW_13); 

                    						newLeafNode(lv_maxdepthSpecified_3_0, grammarAccess.getDTAccess().getMaxdepthSpecifiedMax_depthKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDTRule());
                    						}
                    						setWithLastConsumed(current, "maxdepthSpecified", true, "max_depth=");
                    					

                    }


                    }

                    // InternalMml.g:564:4: ( (lv_max_depth_4_0= RULE_INT ) )
                    // InternalMml.g:565:5: (lv_max_depth_4_0= RULE_INT )
                    {
                    // InternalMml.g:565:5: (lv_max_depth_4_0= RULE_INT )
                    // InternalMml.g:566:6: lv_max_depth_4_0= RULE_INT
                    {
                    lv_max_depth_4_0=(Token)match(input,RULE_INT,FOLLOW_18); 

                    						newLeafNode(lv_max_depth_4_0, grammarAccess.getDTAccess().getMax_depthINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDTRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"max_depth",
                    							lv_max_depth_4_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMml.g:583:3: ( ( (lv_criterionSpecified_5_0= 'criterion=' ) ) ( (lv_criterion_6_0= ruleDTCriterion ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMml.g:584:4: ( (lv_criterionSpecified_5_0= 'criterion=' ) ) ( (lv_criterion_6_0= ruleDTCriterion ) )
                    {
                    // InternalMml.g:584:4: ( (lv_criterionSpecified_5_0= 'criterion=' ) )
                    // InternalMml.g:585:5: (lv_criterionSpecified_5_0= 'criterion=' )
                    {
                    // InternalMml.g:585:5: (lv_criterionSpecified_5_0= 'criterion=' )
                    // InternalMml.g:586:6: lv_criterionSpecified_5_0= 'criterion='
                    {
                    lv_criterionSpecified_5_0=(Token)match(input,22,FOLLOW_19); 

                    						newLeafNode(lv_criterionSpecified_5_0, grammarAccess.getDTAccess().getCriterionSpecifiedCriterionKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDTRule());
                    						}
                    						setWithLastConsumed(current, "criterionSpecified", true, "criterion=");
                    					

                    }


                    }

                    // InternalMml.g:598:4: ( (lv_criterion_6_0= ruleDTCriterion ) )
                    // InternalMml.g:599:5: (lv_criterion_6_0= ruleDTCriterion )
                    {
                    // InternalMml.g:599:5: (lv_criterion_6_0= ruleDTCriterion )
                    // InternalMml.g:600:6: lv_criterion_6_0= ruleDTCriterion
                    {

                    						newCompositeNode(grammarAccess.getDTAccess().getCriterionDTCriterionEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_criterion_6_0=ruleDTCriterion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDTRule());
                    						}
                    						set(
                    							current,
                    							"criterion",
                    							lv_criterion_6_0,
                    							"org.xtext.example.mydsl.Mml.DTCriterion");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDT"


    // $ANTLR start "entryRuleRandomForest"
    // InternalMml.g:622:1: entryRuleRandomForest returns [EObject current=null] : iv_ruleRandomForest= ruleRandomForest EOF ;
    public final EObject entryRuleRandomForest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRandomForest = null;


        try {
            // InternalMml.g:622:53: (iv_ruleRandomForest= ruleRandomForest EOF )
            // InternalMml.g:623:2: iv_ruleRandomForest= ruleRandomForest EOF
            {
             newCompositeNode(grammarAccess.getRandomForestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRandomForest=ruleRandomForest();

            state._fsp--;

             current =iv_ruleRandomForest; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRandomForest"


    // $ANTLR start "ruleRandomForest"
    // InternalMml.g:629:1: ruleRandomForest returns [EObject current=null] : ( () (otherlv_1= 'RandomForest' | otherlv_2= 'RF' ) ( ( (lv_nestimSpecified_3_0= 'n_estimators=' ) ) ( (lv_n_estimators_4_0= RULE_INT ) ) )? ( ( (lv_maxdepthSpecified_5_0= 'max_depth=' ) ) ( (lv_max_depth_6_0= RULE_INT ) ) )? ( ( (lv_criterionSpecified_7_0= 'criterion=' ) ) ( (lv_criterion_8_0= ruleDTCriterion ) ) )? ) ;
    public final EObject ruleRandomForest() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_nestimSpecified_3_0=null;
        Token lv_n_estimators_4_0=null;
        Token lv_maxdepthSpecified_5_0=null;
        Token lv_max_depth_6_0=null;
        Token lv_criterionSpecified_7_0=null;
        Enumerator lv_criterion_8_0 = null;



        	enterRule();

        try {
            // InternalMml.g:635:2: ( ( () (otherlv_1= 'RandomForest' | otherlv_2= 'RF' ) ( ( (lv_nestimSpecified_3_0= 'n_estimators=' ) ) ( (lv_n_estimators_4_0= RULE_INT ) ) )? ( ( (lv_maxdepthSpecified_5_0= 'max_depth=' ) ) ( (lv_max_depth_6_0= RULE_INT ) ) )? ( ( (lv_criterionSpecified_7_0= 'criterion=' ) ) ( (lv_criterion_8_0= ruleDTCriterion ) ) )? ) )
            // InternalMml.g:636:2: ( () (otherlv_1= 'RandomForest' | otherlv_2= 'RF' ) ( ( (lv_nestimSpecified_3_0= 'n_estimators=' ) ) ( (lv_n_estimators_4_0= RULE_INT ) ) )? ( ( (lv_maxdepthSpecified_5_0= 'max_depth=' ) ) ( (lv_max_depth_6_0= RULE_INT ) ) )? ( ( (lv_criterionSpecified_7_0= 'criterion=' ) ) ( (lv_criterion_8_0= ruleDTCriterion ) ) )? )
            {
            // InternalMml.g:636:2: ( () (otherlv_1= 'RandomForest' | otherlv_2= 'RF' ) ( ( (lv_nestimSpecified_3_0= 'n_estimators=' ) ) ( (lv_n_estimators_4_0= RULE_INT ) ) )? ( ( (lv_maxdepthSpecified_5_0= 'max_depth=' ) ) ( (lv_max_depth_6_0= RULE_INT ) ) )? ( ( (lv_criterionSpecified_7_0= 'criterion=' ) ) ( (lv_criterion_8_0= ruleDTCriterion ) ) )? )
            // InternalMml.g:637:3: () (otherlv_1= 'RandomForest' | otherlv_2= 'RF' ) ( ( (lv_nestimSpecified_3_0= 'n_estimators=' ) ) ( (lv_n_estimators_4_0= RULE_INT ) ) )? ( ( (lv_maxdepthSpecified_5_0= 'max_depth=' ) ) ( (lv_max_depth_6_0= RULE_INT ) ) )? ( ( (lv_criterionSpecified_7_0= 'criterion=' ) ) ( (lv_criterion_8_0= ruleDTCriterion ) ) )?
            {
            // InternalMml.g:637:3: ()
            // InternalMml.g:638:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRandomForestAccess().getRandomForestAction_0(),
            					current);
            			

            }

            // InternalMml.g:644:3: (otherlv_1= 'RandomForest' | otherlv_2= 'RF' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            else if ( (LA11_0==24) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMml.g:645:4: otherlv_1= 'RandomForest'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_20); 

                    				newLeafNode(otherlv_1, grammarAccess.getRandomForestAccess().getRandomForestKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMml.g:650:4: otherlv_2= 'RF'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_20); 

                    				newLeafNode(otherlv_2, grammarAccess.getRandomForestAccess().getRFKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalMml.g:655:3: ( ( (lv_nestimSpecified_3_0= 'n_estimators=' ) ) ( (lv_n_estimators_4_0= RULE_INT ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMml.g:656:4: ( (lv_nestimSpecified_3_0= 'n_estimators=' ) ) ( (lv_n_estimators_4_0= RULE_INT ) )
                    {
                    // InternalMml.g:656:4: ( (lv_nestimSpecified_3_0= 'n_estimators=' ) )
                    // InternalMml.g:657:5: (lv_nestimSpecified_3_0= 'n_estimators=' )
                    {
                    // InternalMml.g:657:5: (lv_nestimSpecified_3_0= 'n_estimators=' )
                    // InternalMml.g:658:6: lv_nestimSpecified_3_0= 'n_estimators='
                    {
                    lv_nestimSpecified_3_0=(Token)match(input,25,FOLLOW_13); 

                    						newLeafNode(lv_nestimSpecified_3_0, grammarAccess.getRandomForestAccess().getNestimSpecifiedN_estimatorsKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRandomForestRule());
                    						}
                    						setWithLastConsumed(current, "nestimSpecified", true, "n_estimators=");
                    					

                    }


                    }

                    // InternalMml.g:670:4: ( (lv_n_estimators_4_0= RULE_INT ) )
                    // InternalMml.g:671:5: (lv_n_estimators_4_0= RULE_INT )
                    {
                    // InternalMml.g:671:5: (lv_n_estimators_4_0= RULE_INT )
                    // InternalMml.g:672:6: lv_n_estimators_4_0= RULE_INT
                    {
                    lv_n_estimators_4_0=(Token)match(input,RULE_INT,FOLLOW_17); 

                    						newLeafNode(lv_n_estimators_4_0, grammarAccess.getRandomForestAccess().getN_estimatorsINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRandomForestRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"n_estimators",
                    							lv_n_estimators_4_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMml.g:689:3: ( ( (lv_maxdepthSpecified_5_0= 'max_depth=' ) ) ( (lv_max_depth_6_0= RULE_INT ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMml.g:690:4: ( (lv_maxdepthSpecified_5_0= 'max_depth=' ) ) ( (lv_max_depth_6_0= RULE_INT ) )
                    {
                    // InternalMml.g:690:4: ( (lv_maxdepthSpecified_5_0= 'max_depth=' ) )
                    // InternalMml.g:691:5: (lv_maxdepthSpecified_5_0= 'max_depth=' )
                    {
                    // InternalMml.g:691:5: (lv_maxdepthSpecified_5_0= 'max_depth=' )
                    // InternalMml.g:692:6: lv_maxdepthSpecified_5_0= 'max_depth='
                    {
                    lv_maxdepthSpecified_5_0=(Token)match(input,21,FOLLOW_13); 

                    						newLeafNode(lv_maxdepthSpecified_5_0, grammarAccess.getRandomForestAccess().getMaxdepthSpecifiedMax_depthKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRandomForestRule());
                    						}
                    						setWithLastConsumed(current, "maxdepthSpecified", true, "max_depth=");
                    					

                    }


                    }

                    // InternalMml.g:704:4: ( (lv_max_depth_6_0= RULE_INT ) )
                    // InternalMml.g:705:5: (lv_max_depth_6_0= RULE_INT )
                    {
                    // InternalMml.g:705:5: (lv_max_depth_6_0= RULE_INT )
                    // InternalMml.g:706:6: lv_max_depth_6_0= RULE_INT
                    {
                    lv_max_depth_6_0=(Token)match(input,RULE_INT,FOLLOW_18); 

                    						newLeafNode(lv_max_depth_6_0, grammarAccess.getRandomForestAccess().getMax_depthINTTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRandomForestRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"max_depth",
                    							lv_max_depth_6_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMml.g:723:3: ( ( (lv_criterionSpecified_7_0= 'criterion=' ) ) ( (lv_criterion_8_0= ruleDTCriterion ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMml.g:724:4: ( (lv_criterionSpecified_7_0= 'criterion=' ) ) ( (lv_criterion_8_0= ruleDTCriterion ) )
                    {
                    // InternalMml.g:724:4: ( (lv_criterionSpecified_7_0= 'criterion=' ) )
                    // InternalMml.g:725:5: (lv_criterionSpecified_7_0= 'criterion=' )
                    {
                    // InternalMml.g:725:5: (lv_criterionSpecified_7_0= 'criterion=' )
                    // InternalMml.g:726:6: lv_criterionSpecified_7_0= 'criterion='
                    {
                    lv_criterionSpecified_7_0=(Token)match(input,22,FOLLOW_19); 

                    						newLeafNode(lv_criterionSpecified_7_0, grammarAccess.getRandomForestAccess().getCriterionSpecifiedCriterionKeyword_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRandomForestRule());
                    						}
                    						setWithLastConsumed(current, "criterionSpecified", true, "criterion=");
                    					

                    }


                    }

                    // InternalMml.g:738:4: ( (lv_criterion_8_0= ruleDTCriterion ) )
                    // InternalMml.g:739:5: (lv_criterion_8_0= ruleDTCriterion )
                    {
                    // InternalMml.g:739:5: (lv_criterion_8_0= ruleDTCriterion )
                    // InternalMml.g:740:6: lv_criterion_8_0= ruleDTCriterion
                    {

                    						newCompositeNode(grammarAccess.getRandomForestAccess().getCriterionDTCriterionEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_criterion_8_0=ruleDTCriterion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRandomForestRule());
                    						}
                    						set(
                    							current,
                    							"criterion",
                    							lv_criterion_8_0,
                    							"org.xtext.example.mydsl.Mml.DTCriterion");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRandomForest"


    // $ANTLR start "entryRuleLogisticRegression"
    // InternalMml.g:762:1: entryRuleLogisticRegression returns [EObject current=null] : iv_ruleLogisticRegression= ruleLogisticRegression EOF ;
    public final EObject entryRuleLogisticRegression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogisticRegression = null;


        try {
            // InternalMml.g:762:59: (iv_ruleLogisticRegression= ruleLogisticRegression EOF )
            // InternalMml.g:763:2: iv_ruleLogisticRegression= ruleLogisticRegression EOF
            {
             newCompositeNode(grammarAccess.getLogisticRegressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogisticRegression=ruleLogisticRegression();

            state._fsp--;

             current =iv_ruleLogisticRegression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogisticRegression"


    // $ANTLR start "ruleLogisticRegression"
    // InternalMml.g:769:1: ruleLogisticRegression returns [EObject current=null] : ( () otherlv_1= 'LogisticRegression' ( ( (lv_penaltySpecified_2_0= 'penalty=' ) ) ( (lv_penalty_3_0= ruleregPenalty ) ) )? ( ( (lv_tolSpecified_4_0= 'tol=' ) ) ( (lv_tol_5_0= ruleFLOAT ) ) )? ( ( (lv_CSpecified_6_0= 'C=' ) ) ( (lv_C_7_0= ruleFLOAT ) ) )? ) ;
    public final EObject ruleLogisticRegression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_penaltySpecified_2_0=null;
        Token lv_tolSpecified_4_0=null;
        Token lv_CSpecified_6_0=null;
        Enumerator lv_penalty_3_0 = null;

        AntlrDatatypeRuleToken lv_tol_5_0 = null;

        AntlrDatatypeRuleToken lv_C_7_0 = null;



        	enterRule();

        try {
            // InternalMml.g:775:2: ( ( () otherlv_1= 'LogisticRegression' ( ( (lv_penaltySpecified_2_0= 'penalty=' ) ) ( (lv_penalty_3_0= ruleregPenalty ) ) )? ( ( (lv_tolSpecified_4_0= 'tol=' ) ) ( (lv_tol_5_0= ruleFLOAT ) ) )? ( ( (lv_CSpecified_6_0= 'C=' ) ) ( (lv_C_7_0= ruleFLOAT ) ) )? ) )
            // InternalMml.g:776:2: ( () otherlv_1= 'LogisticRegression' ( ( (lv_penaltySpecified_2_0= 'penalty=' ) ) ( (lv_penalty_3_0= ruleregPenalty ) ) )? ( ( (lv_tolSpecified_4_0= 'tol=' ) ) ( (lv_tol_5_0= ruleFLOAT ) ) )? ( ( (lv_CSpecified_6_0= 'C=' ) ) ( (lv_C_7_0= ruleFLOAT ) ) )? )
            {
            // InternalMml.g:776:2: ( () otherlv_1= 'LogisticRegression' ( ( (lv_penaltySpecified_2_0= 'penalty=' ) ) ( (lv_penalty_3_0= ruleregPenalty ) ) )? ( ( (lv_tolSpecified_4_0= 'tol=' ) ) ( (lv_tol_5_0= ruleFLOAT ) ) )? ( ( (lv_CSpecified_6_0= 'C=' ) ) ( (lv_C_7_0= ruleFLOAT ) ) )? )
            // InternalMml.g:777:3: () otherlv_1= 'LogisticRegression' ( ( (lv_penaltySpecified_2_0= 'penalty=' ) ) ( (lv_penalty_3_0= ruleregPenalty ) ) )? ( ( (lv_tolSpecified_4_0= 'tol=' ) ) ( (lv_tol_5_0= ruleFLOAT ) ) )? ( ( (lv_CSpecified_6_0= 'C=' ) ) ( (lv_C_7_0= ruleFLOAT ) ) )?
            {
            // InternalMml.g:777:3: ()
            // InternalMml.g:778:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLogisticRegressionAccess().getLogisticRegressionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getLogisticRegressionAccess().getLogisticRegressionKeyword_1());
            		
            // InternalMml.g:788:3: ( ( (lv_penaltySpecified_2_0= 'penalty=' ) ) ( (lv_penalty_3_0= ruleregPenalty ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMml.g:789:4: ( (lv_penaltySpecified_2_0= 'penalty=' ) ) ( (lv_penalty_3_0= ruleregPenalty ) )
                    {
                    // InternalMml.g:789:4: ( (lv_penaltySpecified_2_0= 'penalty=' ) )
                    // InternalMml.g:790:5: (lv_penaltySpecified_2_0= 'penalty=' )
                    {
                    // InternalMml.g:790:5: (lv_penaltySpecified_2_0= 'penalty=' )
                    // InternalMml.g:791:6: lv_penaltySpecified_2_0= 'penalty='
                    {
                    lv_penaltySpecified_2_0=(Token)match(input,27,FOLLOW_22); 

                    						newLeafNode(lv_penaltySpecified_2_0, grammarAccess.getLogisticRegressionAccess().getPenaltySpecifiedPenaltyKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogisticRegressionRule());
                    						}
                    						setWithLastConsumed(current, "penaltySpecified", true, "penalty=");
                    					

                    }


                    }

                    // InternalMml.g:803:4: ( (lv_penalty_3_0= ruleregPenalty ) )
                    // InternalMml.g:804:5: (lv_penalty_3_0= ruleregPenalty )
                    {
                    // InternalMml.g:804:5: (lv_penalty_3_0= ruleregPenalty )
                    // InternalMml.g:805:6: lv_penalty_3_0= ruleregPenalty
                    {

                    						newCompositeNode(grammarAccess.getLogisticRegressionAccess().getPenaltyRegPenaltyEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_penalty_3_0=ruleregPenalty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLogisticRegressionRule());
                    						}
                    						set(
                    							current,
                    							"penalty",
                    							lv_penalty_3_0,
                    							"org.xtext.example.mydsl.Mml.regPenalty");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMml.g:823:3: ( ( (lv_tolSpecified_4_0= 'tol=' ) ) ( (lv_tol_5_0= ruleFLOAT ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMml.g:824:4: ( (lv_tolSpecified_4_0= 'tol=' ) ) ( (lv_tol_5_0= ruleFLOAT ) )
                    {
                    // InternalMml.g:824:4: ( (lv_tolSpecified_4_0= 'tol=' ) )
                    // InternalMml.g:825:5: (lv_tolSpecified_4_0= 'tol=' )
                    {
                    // InternalMml.g:825:5: (lv_tolSpecified_4_0= 'tol=' )
                    // InternalMml.g:826:6: lv_tolSpecified_4_0= 'tol='
                    {
                    lv_tolSpecified_4_0=(Token)match(input,28,FOLLOW_13); 

                    						newLeafNode(lv_tolSpecified_4_0, grammarAccess.getLogisticRegressionAccess().getTolSpecifiedTolKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogisticRegressionRule());
                    						}
                    						setWithLastConsumed(current, "tolSpecified", true, "tol=");
                    					

                    }


                    }

                    // InternalMml.g:838:4: ( (lv_tol_5_0= ruleFLOAT ) )
                    // InternalMml.g:839:5: (lv_tol_5_0= ruleFLOAT )
                    {
                    // InternalMml.g:839:5: (lv_tol_5_0= ruleFLOAT )
                    // InternalMml.g:840:6: lv_tol_5_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getLogisticRegressionAccess().getTolFLOATParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_tol_5_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLogisticRegressionRule());
                    						}
                    						set(
                    							current,
                    							"tol",
                    							lv_tol_5_0,
                    							"org.xtext.example.mydsl.Mml.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMml.g:858:3: ( ( (lv_CSpecified_6_0= 'C=' ) ) ( (lv_C_7_0= ruleFLOAT ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==17) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMml.g:859:4: ( (lv_CSpecified_6_0= 'C=' ) ) ( (lv_C_7_0= ruleFLOAT ) )
                    {
                    // InternalMml.g:859:4: ( (lv_CSpecified_6_0= 'C=' ) )
                    // InternalMml.g:860:5: (lv_CSpecified_6_0= 'C=' )
                    {
                    // InternalMml.g:860:5: (lv_CSpecified_6_0= 'C=' )
                    // InternalMml.g:861:6: lv_CSpecified_6_0= 'C='
                    {
                    lv_CSpecified_6_0=(Token)match(input,17,FOLLOW_13); 

                    						newLeafNode(lv_CSpecified_6_0, grammarAccess.getLogisticRegressionAccess().getCSpecifiedCKeyword_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogisticRegressionRule());
                    						}
                    						setWithLastConsumed(current, "CSpecified", true, "C=");
                    					

                    }


                    }

                    // InternalMml.g:873:4: ( (lv_C_7_0= ruleFLOAT ) )
                    // InternalMml.g:874:5: (lv_C_7_0= ruleFLOAT )
                    {
                    // InternalMml.g:874:5: (lv_C_7_0= ruleFLOAT )
                    // InternalMml.g:875:6: lv_C_7_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getLogisticRegressionAccess().getCFLOATParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_C_7_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLogisticRegressionRule());
                    						}
                    						set(
                    							current,
                    							"C",
                    							lv_C_7_0,
                    							"org.xtext.example.mydsl.Mml.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogisticRegression"


    // $ANTLR start "entryRuleFLOAT"
    // InternalMml.g:897:1: entryRuleFLOAT returns [String current=null] : iv_ruleFLOAT= ruleFLOAT EOF ;
    public final String entryRuleFLOAT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFLOAT = null;


        try {
            // InternalMml.g:897:45: (iv_ruleFLOAT= ruleFLOAT EOF )
            // InternalMml.g:898:2: iv_ruleFLOAT= ruleFLOAT EOF
            {
             newCompositeNode(grammarAccess.getFLOATRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFLOAT=ruleFLOAT();

            state._fsp--;

             current =iv_ruleFLOAT.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFLOAT"


    // $ANTLR start "ruleFLOAT"
    // InternalMml.g:904:1: ruleFLOAT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleFLOAT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalMml.g:910:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalMml.g:911:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalMml.g:911:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalMml.g:912:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_25); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getFLOATAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,29,FOLLOW_13); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getFLOATAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getFLOATAccess().getINTTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFLOAT"


    // $ANTLR start "entryRuleRFormula"
    // InternalMml.g:935:1: entryRuleRFormula returns [EObject current=null] : iv_ruleRFormula= ruleRFormula EOF ;
    public final EObject entryRuleRFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRFormula = null;


        try {
            // InternalMml.g:935:49: (iv_ruleRFormula= ruleRFormula EOF )
            // InternalMml.g:936:2: iv_ruleRFormula= ruleRFormula EOF
            {
             newCompositeNode(grammarAccess.getRFormulaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRFormula=ruleRFormula();

            state._fsp--;

             current =iv_ruleRFormula; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRFormula"


    // $ANTLR start "ruleRFormula"
    // InternalMml.g:942:1: ruleRFormula returns [EObject current=null] : (otherlv_0= 'formula' ( ( (lv_predictive_1_0= ruleFormulaItem ) ) otherlv_2= '~' )? ( (lv_predictors_3_0= ruleXFormula ) ) ) ;
    public final EObject ruleRFormula() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_predictive_1_0 = null;

        EObject lv_predictors_3_0 = null;



        	enterRule();

        try {
            // InternalMml.g:948:2: ( (otherlv_0= 'formula' ( ( (lv_predictive_1_0= ruleFormulaItem ) ) otherlv_2= '~' )? ( (lv_predictors_3_0= ruleXFormula ) ) ) )
            // InternalMml.g:949:2: (otherlv_0= 'formula' ( ( (lv_predictive_1_0= ruleFormulaItem ) ) otherlv_2= '~' )? ( (lv_predictors_3_0= ruleXFormula ) ) )
            {
            // InternalMml.g:949:2: (otherlv_0= 'formula' ( ( (lv_predictive_1_0= ruleFormulaItem ) ) otherlv_2= '~' )? ( (lv_predictors_3_0= ruleXFormula ) ) )
            // InternalMml.g:950:3: otherlv_0= 'formula' ( ( (lv_predictive_1_0= ruleFormulaItem ) ) otherlv_2= '~' )? ( (lv_predictors_3_0= ruleXFormula ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getRFormulaAccess().getFormulaKeyword_0());
            		
            // InternalMml.g:954:3: ( ( (lv_predictive_1_0= ruleFormulaItem ) ) otherlv_2= '~' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_INT) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==31) ) {
                    alt18=1;
                }
            }
            else if ( (LA18_0==RULE_STRING) ) {
                int LA18_2 = input.LA(2);

                if ( (LA18_2==31) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // InternalMml.g:955:4: ( (lv_predictive_1_0= ruleFormulaItem ) ) otherlv_2= '~'
                    {
                    // InternalMml.g:955:4: ( (lv_predictive_1_0= ruleFormulaItem ) )
                    // InternalMml.g:956:5: (lv_predictive_1_0= ruleFormulaItem )
                    {
                    // InternalMml.g:956:5: (lv_predictive_1_0= ruleFormulaItem )
                    // InternalMml.g:957:6: lv_predictive_1_0= ruleFormulaItem
                    {

                    						newCompositeNode(grammarAccess.getRFormulaAccess().getPredictiveFormulaItemParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_predictive_1_0=ruleFormulaItem();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRFormulaRule());
                    						}
                    						set(
                    							current,
                    							"predictive",
                    							lv_predictive_1_0,
                    							"org.xtext.example.mydsl.Mml.FormulaItem");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,31,FOLLOW_26); 

                    				newLeafNode(otherlv_2, grammarAccess.getRFormulaAccess().getTildeKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalMml.g:979:3: ( (lv_predictors_3_0= ruleXFormula ) )
            // InternalMml.g:980:4: (lv_predictors_3_0= ruleXFormula )
            {
            // InternalMml.g:980:4: (lv_predictors_3_0= ruleXFormula )
            // InternalMml.g:981:5: lv_predictors_3_0= ruleXFormula
            {

            					newCompositeNode(grammarAccess.getRFormulaAccess().getPredictorsXFormulaParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_predictors_3_0=ruleXFormula();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRFormulaRule());
            					}
            					set(
            						current,
            						"predictors",
            						lv_predictors_3_0,
            						"org.xtext.example.mydsl.Mml.XFormula");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRFormula"


    // $ANTLR start "entryRuleXFormula"
    // InternalMml.g:1002:1: entryRuleXFormula returns [EObject current=null] : iv_ruleXFormula= ruleXFormula EOF ;
    public final EObject entryRuleXFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFormula = null;


        try {
            // InternalMml.g:1002:49: (iv_ruleXFormula= ruleXFormula EOF )
            // InternalMml.g:1003:2: iv_ruleXFormula= ruleXFormula EOF
            {
             newCompositeNode(grammarAccess.getXFormulaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXFormula=ruleXFormula();

            state._fsp--;

             current =iv_ruleXFormula; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXFormula"


    // $ANTLR start "ruleXFormula"
    // InternalMml.g:1009:1: ruleXFormula returns [EObject current=null] : (this_AllVariables_0= ruleAllVariables | this_PredictorVariables_1= rulePredictorVariables ) ;
    public final EObject ruleXFormula() throws RecognitionException {
        EObject current = null;

        EObject this_AllVariables_0 = null;

        EObject this_PredictorVariables_1 = null;



        	enterRule();

        try {
            // InternalMml.g:1015:2: ( (this_AllVariables_0= ruleAllVariables | this_PredictorVariables_1= rulePredictorVariables ) )
            // InternalMml.g:1016:2: (this_AllVariables_0= ruleAllVariables | this_PredictorVariables_1= rulePredictorVariables )
            {
            // InternalMml.g:1016:2: (this_AllVariables_0= ruleAllVariables | this_PredictorVariables_1= rulePredictorVariables )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            else if ( ((LA19_0>=RULE_STRING && LA19_0<=RULE_INT)) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalMml.g:1017:3: this_AllVariables_0= ruleAllVariables
                    {

                    			newCompositeNode(grammarAccess.getXFormulaAccess().getAllVariablesParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AllVariables_0=ruleAllVariables();

                    state._fsp--;


                    			current = this_AllVariables_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMml.g:1026:3: this_PredictorVariables_1= rulePredictorVariables
                    {

                    			newCompositeNode(grammarAccess.getXFormulaAccess().getPredictorVariablesParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PredictorVariables_1=rulePredictorVariables();

                    state._fsp--;


                    			current = this_PredictorVariables_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXFormula"


    // $ANTLR start "entryRuleAllVariables"
    // InternalMml.g:1038:1: entryRuleAllVariables returns [EObject current=null] : iv_ruleAllVariables= ruleAllVariables EOF ;
    public final EObject entryRuleAllVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllVariables = null;


        try {
            // InternalMml.g:1038:53: (iv_ruleAllVariables= ruleAllVariables EOF )
            // InternalMml.g:1039:2: iv_ruleAllVariables= ruleAllVariables EOF
            {
             newCompositeNode(grammarAccess.getAllVariablesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAllVariables=ruleAllVariables();

            state._fsp--;

             current =iv_ruleAllVariables; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAllVariables"


    // $ANTLR start "ruleAllVariables"
    // InternalMml.g:1045:1: ruleAllVariables returns [EObject current=null] : ( (lv_all_0_0= '.' ) ) ;
    public final EObject ruleAllVariables() throws RecognitionException {
        EObject current = null;

        Token lv_all_0_0=null;


        	enterRule();

        try {
            // InternalMml.g:1051:2: ( ( (lv_all_0_0= '.' ) ) )
            // InternalMml.g:1052:2: ( (lv_all_0_0= '.' ) )
            {
            // InternalMml.g:1052:2: ( (lv_all_0_0= '.' ) )
            // InternalMml.g:1053:3: (lv_all_0_0= '.' )
            {
            // InternalMml.g:1053:3: (lv_all_0_0= '.' )
            // InternalMml.g:1054:4: lv_all_0_0= '.'
            {
            lv_all_0_0=(Token)match(input,29,FOLLOW_2); 

            				newLeafNode(lv_all_0_0, grammarAccess.getAllVariablesAccess().getAllFullStopKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAllVariablesRule());
            				}
            				setWithLastConsumed(current, "all", lv_all_0_0, ".");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAllVariables"


    // $ANTLR start "entryRulePredictorVariables"
    // InternalMml.g:1069:1: entryRulePredictorVariables returns [EObject current=null] : iv_rulePredictorVariables= rulePredictorVariables EOF ;
    public final EObject entryRulePredictorVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredictorVariables = null;


        try {
            // InternalMml.g:1069:59: (iv_rulePredictorVariables= rulePredictorVariables EOF )
            // InternalMml.g:1070:2: iv_rulePredictorVariables= rulePredictorVariables EOF
            {
             newCompositeNode(grammarAccess.getPredictorVariablesRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePredictorVariables=rulePredictorVariables();

            state._fsp--;

             current =iv_rulePredictorVariables; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePredictorVariables"


    // $ANTLR start "rulePredictorVariables"
    // InternalMml.g:1076:1: rulePredictorVariables returns [EObject current=null] : ( ( (lv_vars_0_0= ruleFormulaItem ) ) (otherlv_1= '+' ( (lv_vars_2_0= ruleFormulaItem ) ) )* ) ;
    public final EObject rulePredictorVariables() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_vars_0_0 = null;

        EObject lv_vars_2_0 = null;



        	enterRule();

        try {
            // InternalMml.g:1082:2: ( ( ( (lv_vars_0_0= ruleFormulaItem ) ) (otherlv_1= '+' ( (lv_vars_2_0= ruleFormulaItem ) ) )* ) )
            // InternalMml.g:1083:2: ( ( (lv_vars_0_0= ruleFormulaItem ) ) (otherlv_1= '+' ( (lv_vars_2_0= ruleFormulaItem ) ) )* )
            {
            // InternalMml.g:1083:2: ( ( (lv_vars_0_0= ruleFormulaItem ) ) (otherlv_1= '+' ( (lv_vars_2_0= ruleFormulaItem ) ) )* )
            // InternalMml.g:1084:3: ( (lv_vars_0_0= ruleFormulaItem ) ) (otherlv_1= '+' ( (lv_vars_2_0= ruleFormulaItem ) ) )*
            {
            // InternalMml.g:1084:3: ( (lv_vars_0_0= ruleFormulaItem ) )
            // InternalMml.g:1085:4: (lv_vars_0_0= ruleFormulaItem )
            {
            // InternalMml.g:1085:4: (lv_vars_0_0= ruleFormulaItem )
            // InternalMml.g:1086:5: lv_vars_0_0= ruleFormulaItem
            {

            					newCompositeNode(grammarAccess.getPredictorVariablesAccess().getVarsFormulaItemParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_28);
            lv_vars_0_0=ruleFormulaItem();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPredictorVariablesRule());
            					}
            					add(
            						current,
            						"vars",
            						lv_vars_0_0,
            						"org.xtext.example.mydsl.Mml.FormulaItem");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMml.g:1103:3: (otherlv_1= '+' ( (lv_vars_2_0= ruleFormulaItem ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==32) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMml.g:1104:4: otherlv_1= '+' ( (lv_vars_2_0= ruleFormulaItem ) )
            	    {
            	    otherlv_1=(Token)match(input,32,FOLLOW_29); 

            	    				newLeafNode(otherlv_1, grammarAccess.getPredictorVariablesAccess().getPlusSignKeyword_1_0());
            	    			
            	    // InternalMml.g:1108:4: ( (lv_vars_2_0= ruleFormulaItem ) )
            	    // InternalMml.g:1109:5: (lv_vars_2_0= ruleFormulaItem )
            	    {
            	    // InternalMml.g:1109:5: (lv_vars_2_0= ruleFormulaItem )
            	    // InternalMml.g:1110:6: lv_vars_2_0= ruleFormulaItem
            	    {

            	    						newCompositeNode(grammarAccess.getPredictorVariablesAccess().getVarsFormulaItemParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    lv_vars_2_0=ruleFormulaItem();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPredictorVariablesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"vars",
            	    							lv_vars_2_0,
            	    							"org.xtext.example.mydsl.Mml.FormulaItem");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePredictorVariables"


    // $ANTLR start "entryRuleFormulaItem"
    // InternalMml.g:1132:1: entryRuleFormulaItem returns [EObject current=null] : iv_ruleFormulaItem= ruleFormulaItem EOF ;
    public final EObject entryRuleFormulaItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormulaItem = null;


        try {
            // InternalMml.g:1132:52: (iv_ruleFormulaItem= ruleFormulaItem EOF )
            // InternalMml.g:1133:2: iv_ruleFormulaItem= ruleFormulaItem EOF
            {
             newCompositeNode(grammarAccess.getFormulaItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFormulaItem=ruleFormulaItem();

            state._fsp--;

             current =iv_ruleFormulaItem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFormulaItem"


    // $ANTLR start "ruleFormulaItem"
    // InternalMml.g:1139:1: ruleFormulaItem returns [EObject current=null] : ( ( (lv_column_0_0= RULE_INT ) ) | ( (lv_colName_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleFormulaItem() throws RecognitionException {
        EObject current = null;

        Token lv_column_0_0=null;
        Token lv_colName_1_0=null;


        	enterRule();

        try {
            // InternalMml.g:1145:2: ( ( ( (lv_column_0_0= RULE_INT ) ) | ( (lv_colName_1_0= RULE_STRING ) ) ) )
            // InternalMml.g:1146:2: ( ( (lv_column_0_0= RULE_INT ) ) | ( (lv_colName_1_0= RULE_STRING ) ) )
            {
            // InternalMml.g:1146:2: ( ( (lv_column_0_0= RULE_INT ) ) | ( (lv_colName_1_0= RULE_STRING ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_INT) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_STRING) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalMml.g:1147:3: ( (lv_column_0_0= RULE_INT ) )
                    {
                    // InternalMml.g:1147:3: ( (lv_column_0_0= RULE_INT ) )
                    // InternalMml.g:1148:4: (lv_column_0_0= RULE_INT )
                    {
                    // InternalMml.g:1148:4: (lv_column_0_0= RULE_INT )
                    // InternalMml.g:1149:5: lv_column_0_0= RULE_INT
                    {
                    lv_column_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_column_0_0, grammarAccess.getFormulaItemAccess().getColumnINTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFormulaItemRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"column",
                    						lv_column_0_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:1166:3: ( (lv_colName_1_0= RULE_STRING ) )
                    {
                    // InternalMml.g:1166:3: ( (lv_colName_1_0= RULE_STRING ) )
                    // InternalMml.g:1167:4: (lv_colName_1_0= RULE_STRING )
                    {
                    // InternalMml.g:1167:4: (lv_colName_1_0= RULE_STRING )
                    // InternalMml.g:1168:5: lv_colName_1_0= RULE_STRING
                    {
                    lv_colName_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_colName_1_0, grammarAccess.getFormulaItemAccess().getColNameSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFormulaItemRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"colName",
                    						lv_colName_1_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFormulaItem"


    // $ANTLR start "entryRuleValidation"
    // InternalMml.g:1188:1: entryRuleValidation returns [EObject current=null] : iv_ruleValidation= ruleValidation EOF ;
    public final EObject entryRuleValidation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidation = null;


        try {
            // InternalMml.g:1188:51: (iv_ruleValidation= ruleValidation EOF )
            // InternalMml.g:1189:2: iv_ruleValidation= ruleValidation EOF
            {
             newCompositeNode(grammarAccess.getValidationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValidation=ruleValidation();

            state._fsp--;

             current =iv_ruleValidation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValidation"


    // $ANTLR start "ruleValidation"
    // InternalMml.g:1195:1: ruleValidation returns [EObject current=null] : ( ( (lv_stratification_0_0= ruleStratificationMethod ) ) ( (lv_metric_1_0= ruleValidationMetric ) )+ ) ;
    public final EObject ruleValidation() throws RecognitionException {
        EObject current = null;

        EObject lv_stratification_0_0 = null;

        Enumerator lv_metric_1_0 = null;



        	enterRule();

        try {
            // InternalMml.g:1201:2: ( ( ( (lv_stratification_0_0= ruleStratificationMethod ) ) ( (lv_metric_1_0= ruleValidationMetric ) )+ ) )
            // InternalMml.g:1202:2: ( ( (lv_stratification_0_0= ruleStratificationMethod ) ) ( (lv_metric_1_0= ruleValidationMetric ) )+ )
            {
            // InternalMml.g:1202:2: ( ( (lv_stratification_0_0= ruleStratificationMethod ) ) ( (lv_metric_1_0= ruleValidationMetric ) )+ )
            // InternalMml.g:1203:3: ( (lv_stratification_0_0= ruleStratificationMethod ) ) ( (lv_metric_1_0= ruleValidationMetric ) )+
            {
            // InternalMml.g:1203:3: ( (lv_stratification_0_0= ruleStratificationMethod ) )
            // InternalMml.g:1204:4: (lv_stratification_0_0= ruleStratificationMethod )
            {
            // InternalMml.g:1204:4: (lv_stratification_0_0= ruleStratificationMethod )
            // InternalMml.g:1205:5: lv_stratification_0_0= ruleStratificationMethod
            {

            					newCompositeNode(grammarAccess.getValidationAccess().getStratificationStratificationMethodParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_30);
            lv_stratification_0_0=ruleStratificationMethod();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getValidationRule());
            					}
            					set(
            						current,
            						"stratification",
            						lv_stratification_0_0,
            						"org.xtext.example.mydsl.Mml.StratificationMethod");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMml.g:1222:3: ( (lv_metric_1_0= ruleValidationMetric ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=55 && LA22_0<=63)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMml.g:1223:4: (lv_metric_1_0= ruleValidationMetric )
            	    {
            	    // InternalMml.g:1223:4: (lv_metric_1_0= ruleValidationMetric )
            	    // InternalMml.g:1224:5: lv_metric_1_0= ruleValidationMetric
            	    {

            	    					newCompositeNode(grammarAccess.getValidationAccess().getMetricValidationMetricEnumRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_31);
            	    lv_metric_1_0=ruleValidationMetric();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getValidationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"metric",
            	    						lv_metric_1_0,
            	    						"org.xtext.example.mydsl.Mml.ValidationMetric");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValidation"


    // $ANTLR start "entryRuleStratificationMethod"
    // InternalMml.g:1245:1: entryRuleStratificationMethod returns [EObject current=null] : iv_ruleStratificationMethod= ruleStratificationMethod EOF ;
    public final EObject entryRuleStratificationMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStratificationMethod = null;


        try {
            // InternalMml.g:1245:61: (iv_ruleStratificationMethod= ruleStratificationMethod EOF )
            // InternalMml.g:1246:2: iv_ruleStratificationMethod= ruleStratificationMethod EOF
            {
             newCompositeNode(grammarAccess.getStratificationMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStratificationMethod=ruleStratificationMethod();

            state._fsp--;

             current =iv_ruleStratificationMethod; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStratificationMethod"


    // $ANTLR start "ruleStratificationMethod"
    // InternalMml.g:1252:1: ruleStratificationMethod returns [EObject current=null] : (this_CrossValidation_0= ruleCrossValidation | this_TrainingTest_1= ruleTrainingTest ) ;
    public final EObject ruleStratificationMethod() throws RecognitionException {
        EObject current = null;

        EObject this_CrossValidation_0 = null;

        EObject this_TrainingTest_1 = null;



        	enterRule();

        try {
            // InternalMml.g:1258:2: ( (this_CrossValidation_0= ruleCrossValidation | this_TrainingTest_1= ruleTrainingTest ) )
            // InternalMml.g:1259:2: (this_CrossValidation_0= ruleCrossValidation | this_TrainingTest_1= ruleTrainingTest )
            {
            // InternalMml.g:1259:2: (this_CrossValidation_0= ruleCrossValidation | this_TrainingTest_1= ruleTrainingTest )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==33) ) {
                alt23=1;
            }
            else if ( (LA23_0==37) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalMml.g:1260:3: this_CrossValidation_0= ruleCrossValidation
                    {

                    			newCompositeNode(grammarAccess.getStratificationMethodAccess().getCrossValidationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CrossValidation_0=ruleCrossValidation();

                    state._fsp--;


                    			current = this_CrossValidation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMml.g:1269:3: this_TrainingTest_1= ruleTrainingTest
                    {

                    			newCompositeNode(grammarAccess.getStratificationMethodAccess().getTrainingTestParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TrainingTest_1=ruleTrainingTest();

                    state._fsp--;


                    			current = this_TrainingTest_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStratificationMethod"


    // $ANTLR start "entryRuleCrossValidation"
    // InternalMml.g:1281:1: entryRuleCrossValidation returns [EObject current=null] : iv_ruleCrossValidation= ruleCrossValidation EOF ;
    public final EObject entryRuleCrossValidation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCrossValidation = null;


        try {
            // InternalMml.g:1281:56: (iv_ruleCrossValidation= ruleCrossValidation EOF )
            // InternalMml.g:1282:2: iv_ruleCrossValidation= ruleCrossValidation EOF
            {
             newCompositeNode(grammarAccess.getCrossValidationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCrossValidation=ruleCrossValidation();

            state._fsp--;

             current =iv_ruleCrossValidation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCrossValidation"


    // $ANTLR start "ruleCrossValidation"
    // InternalMml.g:1288:1: ruleCrossValidation returns [EObject current=null] : (otherlv_0= 'CrossValidation' otherlv_1= '{' otherlv_2= 'numRepetitionCross' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= '}' ) ;
    public final EObject ruleCrossValidation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_number_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMml.g:1294:2: ( (otherlv_0= 'CrossValidation' otherlv_1= '{' otherlv_2= 'numRepetitionCross' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= '}' ) )
            // InternalMml.g:1295:2: (otherlv_0= 'CrossValidation' otherlv_1= '{' otherlv_2= 'numRepetitionCross' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= '}' )
            {
            // InternalMml.g:1295:2: (otherlv_0= 'CrossValidation' otherlv_1= '{' otherlv_2= 'numRepetitionCross' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= '}' )
            // InternalMml.g:1296:3: otherlv_0= 'CrossValidation' otherlv_1= '{' otherlv_2= 'numRepetitionCross' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getCrossValidationAccess().getCrossValidationKeyword_0());
            		
            otherlv_1=(Token)match(input,34,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getCrossValidationAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,35,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getCrossValidationAccess().getNumRepetitionCrossKeyword_2());
            		
            // InternalMml.g:1308:3: ( (lv_number_3_0= RULE_INT ) )
            // InternalMml.g:1309:4: (lv_number_3_0= RULE_INT )
            {
            // InternalMml.g:1309:4: (lv_number_3_0= RULE_INT )
            // InternalMml.g:1310:5: lv_number_3_0= RULE_INT
            {
            lv_number_3_0=(Token)match(input,RULE_INT,FOLLOW_34); 

            					newLeafNode(lv_number_3_0, grammarAccess.getCrossValidationAccess().getNumberINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCrossValidationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"number",
            						lv_number_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCrossValidationAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCrossValidation"


    // $ANTLR start "entryRuleTrainingTest"
    // InternalMml.g:1334:1: entryRuleTrainingTest returns [EObject current=null] : iv_ruleTrainingTest= ruleTrainingTest EOF ;
    public final EObject entryRuleTrainingTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrainingTest = null;


        try {
            // InternalMml.g:1334:53: (iv_ruleTrainingTest= ruleTrainingTest EOF )
            // InternalMml.g:1335:2: iv_ruleTrainingTest= ruleTrainingTest EOF
            {
             newCompositeNode(grammarAccess.getTrainingTestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrainingTest=ruleTrainingTest();

            state._fsp--;

             current =iv_ruleTrainingTest; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTrainingTest"


    // $ANTLR start "ruleTrainingTest"
    // InternalMml.g:1341:1: ruleTrainingTest returns [EObject current=null] : (otherlv_0= 'TrainingTest' otherlv_1= '{' otherlv_2= 'percentageTraining' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= '}' ) ;
    public final EObject ruleTrainingTest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_number_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMml.g:1347:2: ( (otherlv_0= 'TrainingTest' otherlv_1= '{' otherlv_2= 'percentageTraining' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= '}' ) )
            // InternalMml.g:1348:2: (otherlv_0= 'TrainingTest' otherlv_1= '{' otherlv_2= 'percentageTraining' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= '}' )
            {
            // InternalMml.g:1348:2: (otherlv_0= 'TrainingTest' otherlv_1= '{' otherlv_2= 'percentageTraining' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= '}' )
            // InternalMml.g:1349:3: otherlv_0= 'TrainingTest' otherlv_1= '{' otherlv_2= 'percentageTraining' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getTrainingTestAccess().getTrainingTestKeyword_0());
            		
            otherlv_1=(Token)match(input,34,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getTrainingTestAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,38,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getTrainingTestAccess().getPercentageTrainingKeyword_2());
            		
            // InternalMml.g:1361:3: ( (lv_number_3_0= RULE_INT ) )
            // InternalMml.g:1362:4: (lv_number_3_0= RULE_INT )
            {
            // InternalMml.g:1362:4: (lv_number_3_0= RULE_INT )
            // InternalMml.g:1363:5: lv_number_3_0= RULE_INT
            {
            lv_number_3_0=(Token)match(input,RULE_INT,FOLLOW_34); 

            					newLeafNode(lv_number_3_0, grammarAccess.getTrainingTestAccess().getNumberINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTrainingTestRule());
            					}
            					setWithLastConsumed(
            						current,
            						"number",
            						lv_number_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTrainingTestAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTrainingTest"


    // $ANTLR start "ruleCSVSeparator"
    // InternalMml.g:1387:1: ruleCSVSeparator returns [Enumerator current=null] : ( (enumLiteral_0= ',' ) | (enumLiteral_1= ';' ) ) ;
    public final Enumerator ruleCSVSeparator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMml.g:1393:2: ( ( (enumLiteral_0= ',' ) | (enumLiteral_1= ';' ) ) )
            // InternalMml.g:1394:2: ( (enumLiteral_0= ',' ) | (enumLiteral_1= ';' ) )
            {
            // InternalMml.g:1394:2: ( (enumLiteral_0= ',' ) | (enumLiteral_1= ';' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==39) ) {
                alt24=1;
            }
            else if ( (LA24_0==40) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalMml.g:1395:3: (enumLiteral_0= ',' )
                    {
                    // InternalMml.g:1395:3: (enumLiteral_0= ',' )
                    // InternalMml.g:1396:4: enumLiteral_0= ','
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getCSVSeparatorAccess().getCOMMAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCSVSeparatorAccess().getCOMMAEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:1403:3: (enumLiteral_1= ';' )
                    {
                    // InternalMml.g:1403:3: (enumLiteral_1= ';' )
                    // InternalMml.g:1404:4: enumLiteral_1= ';'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getCSVSeparatorAccess().getSEMI_COLONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCSVSeparatorAccess().getSEMI_COLONEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCSVSeparator"


    // $ANTLR start "ruleFrameworkLang"
    // InternalMml.g:1414:1: ruleFrameworkLang returns [Enumerator current=null] : ( (enumLiteral_0= 'scikit-learn' ) | (enumLiteral_1= 'R' ) | (enumLiteral_2= 'Weka' ) | (enumLiteral_3= 'xgboost' ) ) ;
    public final Enumerator ruleFrameworkLang() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMml.g:1420:2: ( ( (enumLiteral_0= 'scikit-learn' ) | (enumLiteral_1= 'R' ) | (enumLiteral_2= 'Weka' ) | (enumLiteral_3= 'xgboost' ) ) )
            // InternalMml.g:1421:2: ( (enumLiteral_0= 'scikit-learn' ) | (enumLiteral_1= 'R' ) | (enumLiteral_2= 'Weka' ) | (enumLiteral_3= 'xgboost' ) )
            {
            // InternalMml.g:1421:2: ( (enumLiteral_0= 'scikit-learn' ) | (enumLiteral_1= 'R' ) | (enumLiteral_2= 'Weka' ) | (enumLiteral_3= 'xgboost' ) )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt25=1;
                }
                break;
            case 42:
                {
                alt25=2;
                }
                break;
            case 43:
                {
                alt25=3;
                }
                break;
            case 44:
                {
                alt25=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalMml.g:1422:3: (enumLiteral_0= 'scikit-learn' )
                    {
                    // InternalMml.g:1422:3: (enumLiteral_0= 'scikit-learn' )
                    // InternalMml.g:1423:4: enumLiteral_0= 'scikit-learn'
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getFrameworkLangAccess().getSCIKITEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFrameworkLangAccess().getSCIKITEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:1430:3: (enumLiteral_1= 'R' )
                    {
                    // InternalMml.g:1430:3: (enumLiteral_1= 'R' )
                    // InternalMml.g:1431:4: enumLiteral_1= 'R'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getFrameworkLangAccess().getREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFrameworkLangAccess().getREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMml.g:1438:3: (enumLiteral_2= 'Weka' )
                    {
                    // InternalMml.g:1438:3: (enumLiteral_2= 'Weka' )
                    // InternalMml.g:1439:4: enumLiteral_2= 'Weka'
                    {
                    enumLiteral_2=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getFrameworkLangAccess().getJavaWekaEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getFrameworkLangAccess().getJavaWekaEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMml.g:1446:3: (enumLiteral_3= 'xgboost' )
                    {
                    // InternalMml.g:1446:3: (enumLiteral_3= 'xgboost' )
                    // InternalMml.g:1447:4: enumLiteral_3= 'xgboost'
                    {
                    enumLiteral_3=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getFrameworkLangAccess().getXGBoostEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getFrameworkLangAccess().getXGBoostEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFrameworkLang"


    // $ANTLR start "ruleSVMKernel"
    // InternalMml.g:1457:1: ruleSVMKernel returns [Enumerator current=null] : ( (enumLiteral_0= 'rbf' ) | (enumLiteral_1= 'linear' ) | (enumLiteral_2= 'poly' ) | (enumLiteral_3= 'sigmoid' ) ) ;
    public final Enumerator ruleSVMKernel() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMml.g:1463:2: ( ( (enumLiteral_0= 'rbf' ) | (enumLiteral_1= 'linear' ) | (enumLiteral_2= 'poly' ) | (enumLiteral_3= 'sigmoid' ) ) )
            // InternalMml.g:1464:2: ( (enumLiteral_0= 'rbf' ) | (enumLiteral_1= 'linear' ) | (enumLiteral_2= 'poly' ) | (enumLiteral_3= 'sigmoid' ) )
            {
            // InternalMml.g:1464:2: ( (enumLiteral_0= 'rbf' ) | (enumLiteral_1= 'linear' ) | (enumLiteral_2= 'poly' ) | (enumLiteral_3= 'sigmoid' ) )
            int alt26=4;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt26=1;
                }
                break;
            case 46:
                {
                alt26=2;
                }
                break;
            case 47:
                {
                alt26=3;
                }
                break;
            case 48:
                {
                alt26=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalMml.g:1465:3: (enumLiteral_0= 'rbf' )
                    {
                    // InternalMml.g:1465:3: (enumLiteral_0= 'rbf' )
                    // InternalMml.g:1466:4: enumLiteral_0= 'rbf'
                    {
                    enumLiteral_0=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getSVMKernelAccess().getRbfEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSVMKernelAccess().getRbfEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:1473:3: (enumLiteral_1= 'linear' )
                    {
                    // InternalMml.g:1473:3: (enumLiteral_1= 'linear' )
                    // InternalMml.g:1474:4: enumLiteral_1= 'linear'
                    {
                    enumLiteral_1=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getSVMKernelAccess().getLinearEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSVMKernelAccess().getLinearEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMml.g:1481:3: (enumLiteral_2= 'poly' )
                    {
                    // InternalMml.g:1481:3: (enumLiteral_2= 'poly' )
                    // InternalMml.g:1482:4: enumLiteral_2= 'poly'
                    {
                    enumLiteral_2=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getSVMKernelAccess().getPolyEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSVMKernelAccess().getPolyEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMml.g:1489:3: (enumLiteral_3= 'sigmoid' )
                    {
                    // InternalMml.g:1489:3: (enumLiteral_3= 'sigmoid' )
                    // InternalMml.g:1490:4: enumLiteral_3= 'sigmoid'
                    {
                    enumLiteral_3=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getSVMKernelAccess().getSigmoidEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSVMKernelAccess().getSigmoidEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSVMKernel"


    // $ANTLR start "ruleDTCriterion"
    // InternalMml.g:1500:1: ruleDTCriterion returns [Enumerator current=null] : ( (enumLiteral_0= 'gini' ) | (enumLiteral_1= 'entropy' ) ) ;
    public final Enumerator ruleDTCriterion() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMml.g:1506:2: ( ( (enumLiteral_0= 'gini' ) | (enumLiteral_1= 'entropy' ) ) )
            // InternalMml.g:1507:2: ( (enumLiteral_0= 'gini' ) | (enumLiteral_1= 'entropy' ) )
            {
            // InternalMml.g:1507:2: ( (enumLiteral_0= 'gini' ) | (enumLiteral_1= 'entropy' ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==49) ) {
                alt27=1;
            }
            else if ( (LA27_0==50) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalMml.g:1508:3: (enumLiteral_0= 'gini' )
                    {
                    // InternalMml.g:1508:3: (enumLiteral_0= 'gini' )
                    // InternalMml.g:1509:4: enumLiteral_0= 'gini'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getDTCriterionAccess().getGiniEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDTCriterionAccess().getGiniEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:1516:3: (enumLiteral_1= 'entropy' )
                    {
                    // InternalMml.g:1516:3: (enumLiteral_1= 'entropy' )
                    // InternalMml.g:1517:4: enumLiteral_1= 'entropy'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getDTCriterionAccess().getEntropyEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDTCriterionAccess().getEntropyEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDTCriterion"


    // $ANTLR start "ruleregPenalty"
    // InternalMml.g:1527:1: ruleregPenalty returns [Enumerator current=null] : ( (enumLiteral_0= 'l2' ) | (enumLiteral_1= 'l1' ) | (enumLiteral_2= 'elasticnet' ) | (enumLiteral_3= 'none' ) ) ;
    public final Enumerator ruleregPenalty() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMml.g:1533:2: ( ( (enumLiteral_0= 'l2' ) | (enumLiteral_1= 'l1' ) | (enumLiteral_2= 'elasticnet' ) | (enumLiteral_3= 'none' ) ) )
            // InternalMml.g:1534:2: ( (enumLiteral_0= 'l2' ) | (enumLiteral_1= 'l1' ) | (enumLiteral_2= 'elasticnet' ) | (enumLiteral_3= 'none' ) )
            {
            // InternalMml.g:1534:2: ( (enumLiteral_0= 'l2' ) | (enumLiteral_1= 'l1' ) | (enumLiteral_2= 'elasticnet' ) | (enumLiteral_3= 'none' ) )
            int alt28=4;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt28=1;
                }
                break;
            case 52:
                {
                alt28=2;
                }
                break;
            case 53:
                {
                alt28=3;
                }
                break;
            case 54:
                {
                alt28=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalMml.g:1535:3: (enumLiteral_0= 'l2' )
                    {
                    // InternalMml.g:1535:3: (enumLiteral_0= 'l2' )
                    // InternalMml.g:1536:4: enumLiteral_0= 'l2'
                    {
                    enumLiteral_0=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getRegPenaltyAccess().getL2EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRegPenaltyAccess().getL2EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:1543:3: (enumLiteral_1= 'l1' )
                    {
                    // InternalMml.g:1543:3: (enumLiteral_1= 'l1' )
                    // InternalMml.g:1544:4: enumLiteral_1= 'l1'
                    {
                    enumLiteral_1=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getRegPenaltyAccess().getL1EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRegPenaltyAccess().getL1EnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMml.g:1551:3: (enumLiteral_2= 'elasticnet' )
                    {
                    // InternalMml.g:1551:3: (enumLiteral_2= 'elasticnet' )
                    // InternalMml.g:1552:4: enumLiteral_2= 'elasticnet'
                    {
                    enumLiteral_2=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getRegPenaltyAccess().getElasticnetEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRegPenaltyAccess().getElasticnetEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMml.g:1559:3: (enumLiteral_3= 'none' )
                    {
                    // InternalMml.g:1559:3: (enumLiteral_3= 'none' )
                    // InternalMml.g:1560:4: enumLiteral_3= 'none'
                    {
                    enumLiteral_3=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getRegPenaltyAccess().getNoneEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getRegPenaltyAccess().getNoneEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleregPenalty"


    // $ANTLR start "ruleValidationMetric"
    // InternalMml.g:1570:1: ruleValidationMetric returns [Enumerator current=null] : ( (enumLiteral_0= 'balanced_accuracy' ) | (enumLiteral_1= 'recall' ) | (enumLiteral_2= 'precision' ) | (enumLiteral_3= 'F1' ) | (enumLiteral_4= 'accuracy' ) | (enumLiteral_5= 'macro_recall' ) | (enumLiteral_6= 'macro_precision' ) | (enumLiteral_7= 'macro_F1' ) | (enumLiteral_8= 'macro_accuracy' ) ) ;
    public final Enumerator ruleValidationMetric() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;


        	enterRule();

        try {
            // InternalMml.g:1576:2: ( ( (enumLiteral_0= 'balanced_accuracy' ) | (enumLiteral_1= 'recall' ) | (enumLiteral_2= 'precision' ) | (enumLiteral_3= 'F1' ) | (enumLiteral_4= 'accuracy' ) | (enumLiteral_5= 'macro_recall' ) | (enumLiteral_6= 'macro_precision' ) | (enumLiteral_7= 'macro_F1' ) | (enumLiteral_8= 'macro_accuracy' ) ) )
            // InternalMml.g:1577:2: ( (enumLiteral_0= 'balanced_accuracy' ) | (enumLiteral_1= 'recall' ) | (enumLiteral_2= 'precision' ) | (enumLiteral_3= 'F1' ) | (enumLiteral_4= 'accuracy' ) | (enumLiteral_5= 'macro_recall' ) | (enumLiteral_6= 'macro_precision' ) | (enumLiteral_7= 'macro_F1' ) | (enumLiteral_8= 'macro_accuracy' ) )
            {
            // InternalMml.g:1577:2: ( (enumLiteral_0= 'balanced_accuracy' ) | (enumLiteral_1= 'recall' ) | (enumLiteral_2= 'precision' ) | (enumLiteral_3= 'F1' ) | (enumLiteral_4= 'accuracy' ) | (enumLiteral_5= 'macro_recall' ) | (enumLiteral_6= 'macro_precision' ) | (enumLiteral_7= 'macro_F1' ) | (enumLiteral_8= 'macro_accuracy' ) )
            int alt29=9;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt29=1;
                }
                break;
            case 56:
                {
                alt29=2;
                }
                break;
            case 57:
                {
                alt29=3;
                }
                break;
            case 58:
                {
                alt29=4;
                }
                break;
            case 59:
                {
                alt29=5;
                }
                break;
            case 60:
                {
                alt29=6;
                }
                break;
            case 61:
                {
                alt29=7;
                }
                break;
            case 62:
                {
                alt29=8;
                }
                break;
            case 63:
                {
                alt29=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalMml.g:1578:3: (enumLiteral_0= 'balanced_accuracy' )
                    {
                    // InternalMml.g:1578:3: (enumLiteral_0= 'balanced_accuracy' )
                    // InternalMml.g:1579:4: enumLiteral_0= 'balanced_accuracy'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getValidationMetricAccess().getBALANCED_ACCURACYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getValidationMetricAccess().getBALANCED_ACCURACYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:1586:3: (enumLiteral_1= 'recall' )
                    {
                    // InternalMml.g:1586:3: (enumLiteral_1= 'recall' )
                    // InternalMml.g:1587:4: enumLiteral_1= 'recall'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getValidationMetricAccess().getRECALLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getValidationMetricAccess().getRECALLEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMml.g:1594:3: (enumLiteral_2= 'precision' )
                    {
                    // InternalMml.g:1594:3: (enumLiteral_2= 'precision' )
                    // InternalMml.g:1595:4: enumLiteral_2= 'precision'
                    {
                    enumLiteral_2=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getValidationMetricAccess().getPRECISIONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getValidationMetricAccess().getPRECISIONEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMml.g:1602:3: (enumLiteral_3= 'F1' )
                    {
                    // InternalMml.g:1602:3: (enumLiteral_3= 'F1' )
                    // InternalMml.g:1603:4: enumLiteral_3= 'F1'
                    {
                    enumLiteral_3=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getValidationMetricAccess().getF1EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getValidationMetricAccess().getF1EnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMml.g:1610:3: (enumLiteral_4= 'accuracy' )
                    {
                    // InternalMml.g:1610:3: (enumLiteral_4= 'accuracy' )
                    // InternalMml.g:1611:4: enumLiteral_4= 'accuracy'
                    {
                    enumLiteral_4=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getValidationMetricAccess().getACCURACYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getValidationMetricAccess().getACCURACYEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMml.g:1618:3: (enumLiteral_5= 'macro_recall' )
                    {
                    // InternalMml.g:1618:3: (enumLiteral_5= 'macro_recall' )
                    // InternalMml.g:1619:4: enumLiteral_5= 'macro_recall'
                    {
                    enumLiteral_5=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getValidationMetricAccess().getMACRO_RECALLEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getValidationMetricAccess().getMACRO_RECALLEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMml.g:1626:3: (enumLiteral_6= 'macro_precision' )
                    {
                    // InternalMml.g:1626:3: (enumLiteral_6= 'macro_precision' )
                    // InternalMml.g:1627:4: enumLiteral_6= 'macro_precision'
                    {
                    enumLiteral_6=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getValidationMetricAccess().getMACRO_PRECISIONEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getValidationMetricAccess().getMACRO_PRECISIONEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalMml.g:1634:3: (enumLiteral_7= 'macro_F1' )
                    {
                    // InternalMml.g:1634:3: (enumLiteral_7= 'macro_F1' )
                    // InternalMml.g:1635:4: enumLiteral_7= 'macro_F1'
                    {
                    enumLiteral_7=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getValidationMetricAccess().getMACRO_F1EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getValidationMetricAccess().getMACRO_F1EnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalMml.g:1642:3: (enumLiteral_8= 'macro_accuracy' )
                    {
                    // InternalMml.g:1642:3: (enumLiteral_8= 'macro_accuracy' )
                    // InternalMml.g:1643:4: enumLiteral_8= 'macro_accuracy'
                    {
                    enumLiteral_8=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getValidationMetricAccess().getMACRO_ACCURACYEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getValidationMetricAccess().getMACRO_ACCURACYEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValidationMetric"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000002240002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000002240000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00001E0000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000005988000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000070002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0001E00000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002600002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000018020002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0078000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010020002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000030L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0xFF80000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0xFF80000000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000004000000000L});

}