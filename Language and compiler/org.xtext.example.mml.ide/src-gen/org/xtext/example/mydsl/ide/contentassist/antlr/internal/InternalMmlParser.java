package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MmlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMmlParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DT'", "'DecisionTree'", "'RandomForest'", "'RF'", "','", "';'", "'scikit-learn'", "'R'", "'Weka'", "'xgboost'", "'linear'", "'polynomial'", "'radial'", "'C-classification'", "'nu-classification'", "'one-classification'", "'balanced_accuracy'", "'recall'", "'precision'", "'F1'", "'accuracy'", "'macro_recall'", "'macro_precision'", "'macro_F1'", "'macro_accuracy'", "'datainput'", "'separator'", "'mlframework'", "'algorithm'", "'SVM'", "'gamma='", "'C='", "'LogisticRegression'", "'.'", "'formula'", "'~'", "'+'", "'CrossValidation'", "'{'", "'numRepetitionCross'", "'}'", "'TrainingTest'", "'percentageTraining'", "'kernel='", "'classification'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
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

    	public void setGrammarAccess(MmlGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleMMLModel"
    // InternalMml.g:53:1: entryRuleMMLModel : ruleMMLModel EOF ;
    public final void entryRuleMMLModel() throws RecognitionException {
        try {
            // InternalMml.g:54:1: ( ruleMMLModel EOF )
            // InternalMml.g:55:1: ruleMMLModel EOF
            {
             before(grammarAccess.getMMLModelRule()); 
            pushFollow(FOLLOW_1);
            ruleMMLModel();

            state._fsp--;

             after(grammarAccess.getMMLModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMMLModel"


    // $ANTLR start "ruleMMLModel"
    // InternalMml.g:62:1: ruleMMLModel : ( ( rule__MMLModel__Group__0 ) ) ;
    public final void ruleMMLModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:66:2: ( ( ( rule__MMLModel__Group__0 ) ) )
            // InternalMml.g:67:2: ( ( rule__MMLModel__Group__0 ) )
            {
            // InternalMml.g:67:2: ( ( rule__MMLModel__Group__0 ) )
            // InternalMml.g:68:3: ( rule__MMLModel__Group__0 )
            {
             before(grammarAccess.getMMLModelAccess().getGroup()); 
            // InternalMml.g:69:3: ( rule__MMLModel__Group__0 )
            // InternalMml.g:69:4: rule__MMLModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MMLModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMMLModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMMLModel"


    // $ANTLR start "entryRuleDataInput"
    // InternalMml.g:78:1: entryRuleDataInput : ruleDataInput EOF ;
    public final void entryRuleDataInput() throws RecognitionException {
        try {
            // InternalMml.g:79:1: ( ruleDataInput EOF )
            // InternalMml.g:80:1: ruleDataInput EOF
            {
             before(grammarAccess.getDataInputRule()); 
            pushFollow(FOLLOW_1);
            ruleDataInput();

            state._fsp--;

             after(grammarAccess.getDataInputRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataInput"


    // $ANTLR start "ruleDataInput"
    // InternalMml.g:87:1: ruleDataInput : ( ( rule__DataInput__Group__0 ) ) ;
    public final void ruleDataInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:91:2: ( ( ( rule__DataInput__Group__0 ) ) )
            // InternalMml.g:92:2: ( ( rule__DataInput__Group__0 ) )
            {
            // InternalMml.g:92:2: ( ( rule__DataInput__Group__0 ) )
            // InternalMml.g:93:3: ( rule__DataInput__Group__0 )
            {
             before(grammarAccess.getDataInputAccess().getGroup()); 
            // InternalMml.g:94:3: ( rule__DataInput__Group__0 )
            // InternalMml.g:94:4: rule__DataInput__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataInput__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataInputAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataInput"


    // $ANTLR start "entryRuleCSVParsingConfiguration"
    // InternalMml.g:103:1: entryRuleCSVParsingConfiguration : ruleCSVParsingConfiguration EOF ;
    public final void entryRuleCSVParsingConfiguration() throws RecognitionException {
        try {
            // InternalMml.g:104:1: ( ruleCSVParsingConfiguration EOF )
            // InternalMml.g:105:1: ruleCSVParsingConfiguration EOF
            {
             before(grammarAccess.getCSVParsingConfigurationRule()); 
            pushFollow(FOLLOW_1);
            ruleCSVParsingConfiguration();

            state._fsp--;

             after(grammarAccess.getCSVParsingConfigurationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCSVParsingConfiguration"


    // $ANTLR start "ruleCSVParsingConfiguration"
    // InternalMml.g:112:1: ruleCSVParsingConfiguration : ( ( rule__CSVParsingConfiguration__Group__0 ) ) ;
    public final void ruleCSVParsingConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:116:2: ( ( ( rule__CSVParsingConfiguration__Group__0 ) ) )
            // InternalMml.g:117:2: ( ( rule__CSVParsingConfiguration__Group__0 ) )
            {
            // InternalMml.g:117:2: ( ( rule__CSVParsingConfiguration__Group__0 ) )
            // InternalMml.g:118:3: ( rule__CSVParsingConfiguration__Group__0 )
            {
             before(grammarAccess.getCSVParsingConfigurationAccess().getGroup()); 
            // InternalMml.g:119:3: ( rule__CSVParsingConfiguration__Group__0 )
            // InternalMml.g:119:4: rule__CSVParsingConfiguration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CSVParsingConfiguration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCSVParsingConfigurationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCSVParsingConfiguration"


    // $ANTLR start "entryRuleMLChoiceAlgorithm"
    // InternalMml.g:128:1: entryRuleMLChoiceAlgorithm : ruleMLChoiceAlgorithm EOF ;
    public final void entryRuleMLChoiceAlgorithm() throws RecognitionException {
        try {
            // InternalMml.g:129:1: ( ruleMLChoiceAlgorithm EOF )
            // InternalMml.g:130:1: ruleMLChoiceAlgorithm EOF
            {
             before(grammarAccess.getMLChoiceAlgorithmRule()); 
            pushFollow(FOLLOW_1);
            ruleMLChoiceAlgorithm();

            state._fsp--;

             after(grammarAccess.getMLChoiceAlgorithmRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMLChoiceAlgorithm"


    // $ANTLR start "ruleMLChoiceAlgorithm"
    // InternalMml.g:137:1: ruleMLChoiceAlgorithm : ( ( rule__MLChoiceAlgorithm__Group__0 ) ) ;
    public final void ruleMLChoiceAlgorithm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:141:2: ( ( ( rule__MLChoiceAlgorithm__Group__0 ) ) )
            // InternalMml.g:142:2: ( ( rule__MLChoiceAlgorithm__Group__0 ) )
            {
            // InternalMml.g:142:2: ( ( rule__MLChoiceAlgorithm__Group__0 ) )
            // InternalMml.g:143:3: ( rule__MLChoiceAlgorithm__Group__0 )
            {
             before(grammarAccess.getMLChoiceAlgorithmAccess().getGroup()); 
            // InternalMml.g:144:3: ( rule__MLChoiceAlgorithm__Group__0 )
            // InternalMml.g:144:4: rule__MLChoiceAlgorithm__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MLChoiceAlgorithm__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMLChoiceAlgorithmAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMLChoiceAlgorithm"


    // $ANTLR start "entryRuleMLAlgorithm"
    // InternalMml.g:153:1: entryRuleMLAlgorithm : ruleMLAlgorithm EOF ;
    public final void entryRuleMLAlgorithm() throws RecognitionException {
        try {
            // InternalMml.g:154:1: ( ruleMLAlgorithm EOF )
            // InternalMml.g:155:1: ruleMLAlgorithm EOF
            {
             before(grammarAccess.getMLAlgorithmRule()); 
            pushFollow(FOLLOW_1);
            ruleMLAlgorithm();

            state._fsp--;

             after(grammarAccess.getMLAlgorithmRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMLAlgorithm"


    // $ANTLR start "ruleMLAlgorithm"
    // InternalMml.g:162:1: ruleMLAlgorithm : ( ( rule__MLAlgorithm__Alternatives ) ) ;
    public final void ruleMLAlgorithm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:166:2: ( ( ( rule__MLAlgorithm__Alternatives ) ) )
            // InternalMml.g:167:2: ( ( rule__MLAlgorithm__Alternatives ) )
            {
            // InternalMml.g:167:2: ( ( rule__MLAlgorithm__Alternatives ) )
            // InternalMml.g:168:3: ( rule__MLAlgorithm__Alternatives )
            {
             before(grammarAccess.getMLAlgorithmAccess().getAlternatives()); 
            // InternalMml.g:169:3: ( rule__MLAlgorithm__Alternatives )
            // InternalMml.g:169:4: rule__MLAlgorithm__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MLAlgorithm__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMLAlgorithmAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMLAlgorithm"


    // $ANTLR start "entryRuleSVM"
    // InternalMml.g:178:1: entryRuleSVM : ruleSVM EOF ;
    public final void entryRuleSVM() throws RecognitionException {
        try {
            // InternalMml.g:179:1: ( ruleSVM EOF )
            // InternalMml.g:180:1: ruleSVM EOF
            {
             before(grammarAccess.getSVMRule()); 
            pushFollow(FOLLOW_1);
            ruleSVM();

            state._fsp--;

             after(grammarAccess.getSVMRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSVM"


    // $ANTLR start "ruleSVM"
    // InternalMml.g:187:1: ruleSVM : ( ( rule__SVM__Group__0 ) ) ;
    public final void ruleSVM() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:191:2: ( ( ( rule__SVM__Group__0 ) ) )
            // InternalMml.g:192:2: ( ( rule__SVM__Group__0 ) )
            {
            // InternalMml.g:192:2: ( ( rule__SVM__Group__0 ) )
            // InternalMml.g:193:3: ( rule__SVM__Group__0 )
            {
             before(grammarAccess.getSVMAccess().getGroup()); 
            // InternalMml.g:194:3: ( rule__SVM__Group__0 )
            // InternalMml.g:194:4: rule__SVM__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SVM__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSVMAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSVM"


    // $ANTLR start "entryRuleDT"
    // InternalMml.g:203:1: entryRuleDT : ruleDT EOF ;
    public final void entryRuleDT() throws RecognitionException {
        try {
            // InternalMml.g:204:1: ( ruleDT EOF )
            // InternalMml.g:205:1: ruleDT EOF
            {
             before(grammarAccess.getDTRule()); 
            pushFollow(FOLLOW_1);
            ruleDT();

            state._fsp--;

             after(grammarAccess.getDTRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDT"


    // $ANTLR start "ruleDT"
    // InternalMml.g:212:1: ruleDT : ( ( rule__DT__Group__0 ) ) ;
    public final void ruleDT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:216:2: ( ( ( rule__DT__Group__0 ) ) )
            // InternalMml.g:217:2: ( ( rule__DT__Group__0 ) )
            {
            // InternalMml.g:217:2: ( ( rule__DT__Group__0 ) )
            // InternalMml.g:218:3: ( rule__DT__Group__0 )
            {
             before(grammarAccess.getDTAccess().getGroup()); 
            // InternalMml.g:219:3: ( rule__DT__Group__0 )
            // InternalMml.g:219:4: rule__DT__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDTAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDT"


    // $ANTLR start "entryRuleRandomForest"
    // InternalMml.g:228:1: entryRuleRandomForest : ruleRandomForest EOF ;
    public final void entryRuleRandomForest() throws RecognitionException {
        try {
            // InternalMml.g:229:1: ( ruleRandomForest EOF )
            // InternalMml.g:230:1: ruleRandomForest EOF
            {
             before(grammarAccess.getRandomForestRule()); 
            pushFollow(FOLLOW_1);
            ruleRandomForest();

            state._fsp--;

             after(grammarAccess.getRandomForestRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRandomForest"


    // $ANTLR start "ruleRandomForest"
    // InternalMml.g:237:1: ruleRandomForest : ( ( rule__RandomForest__Group__0 ) ) ;
    public final void ruleRandomForest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:241:2: ( ( ( rule__RandomForest__Group__0 ) ) )
            // InternalMml.g:242:2: ( ( rule__RandomForest__Group__0 ) )
            {
            // InternalMml.g:242:2: ( ( rule__RandomForest__Group__0 ) )
            // InternalMml.g:243:3: ( rule__RandomForest__Group__0 )
            {
             before(grammarAccess.getRandomForestAccess().getGroup()); 
            // InternalMml.g:244:3: ( rule__RandomForest__Group__0 )
            // InternalMml.g:244:4: rule__RandomForest__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RandomForest__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRandomForestAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRandomForest"


    // $ANTLR start "entryRuleLogisticRegression"
    // InternalMml.g:253:1: entryRuleLogisticRegression : ruleLogisticRegression EOF ;
    public final void entryRuleLogisticRegression() throws RecognitionException {
        try {
            // InternalMml.g:254:1: ( ruleLogisticRegression EOF )
            // InternalMml.g:255:1: ruleLogisticRegression EOF
            {
             before(grammarAccess.getLogisticRegressionRule()); 
            pushFollow(FOLLOW_1);
            ruleLogisticRegression();

            state._fsp--;

             after(grammarAccess.getLogisticRegressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLogisticRegression"


    // $ANTLR start "ruleLogisticRegression"
    // InternalMml.g:262:1: ruleLogisticRegression : ( ( rule__LogisticRegression__Group__0 ) ) ;
    public final void ruleLogisticRegression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:266:2: ( ( ( rule__LogisticRegression__Group__0 ) ) )
            // InternalMml.g:267:2: ( ( rule__LogisticRegression__Group__0 ) )
            {
            // InternalMml.g:267:2: ( ( rule__LogisticRegression__Group__0 ) )
            // InternalMml.g:268:3: ( rule__LogisticRegression__Group__0 )
            {
             before(grammarAccess.getLogisticRegressionAccess().getGroup()); 
            // InternalMml.g:269:3: ( rule__LogisticRegression__Group__0 )
            // InternalMml.g:269:4: rule__LogisticRegression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LogisticRegression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLogisticRegressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogisticRegression"


    // $ANTLR start "entryRuleFLOAT"
    // InternalMml.g:278:1: entryRuleFLOAT : ruleFLOAT EOF ;
    public final void entryRuleFLOAT() throws RecognitionException {
        try {
            // InternalMml.g:279:1: ( ruleFLOAT EOF )
            // InternalMml.g:280:1: ruleFLOAT EOF
            {
             before(grammarAccess.getFLOATRule()); 
            pushFollow(FOLLOW_1);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getFLOATRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFLOAT"


    // $ANTLR start "ruleFLOAT"
    // InternalMml.g:287:1: ruleFLOAT : ( ( rule__FLOAT__Group__0 ) ) ;
    public final void ruleFLOAT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:291:2: ( ( ( rule__FLOAT__Group__0 ) ) )
            // InternalMml.g:292:2: ( ( rule__FLOAT__Group__0 ) )
            {
            // InternalMml.g:292:2: ( ( rule__FLOAT__Group__0 ) )
            // InternalMml.g:293:3: ( rule__FLOAT__Group__0 )
            {
             before(grammarAccess.getFLOATAccess().getGroup()); 
            // InternalMml.g:294:3: ( rule__FLOAT__Group__0 )
            // InternalMml.g:294:4: rule__FLOAT__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FLOAT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFLOATAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFLOAT"


    // $ANTLR start "entryRuleRFormula"
    // InternalMml.g:303:1: entryRuleRFormula : ruleRFormula EOF ;
    public final void entryRuleRFormula() throws RecognitionException {
        try {
            // InternalMml.g:304:1: ( ruleRFormula EOF )
            // InternalMml.g:305:1: ruleRFormula EOF
            {
             before(grammarAccess.getRFormulaRule()); 
            pushFollow(FOLLOW_1);
            ruleRFormula();

            state._fsp--;

             after(grammarAccess.getRFormulaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRFormula"


    // $ANTLR start "ruleRFormula"
    // InternalMml.g:312:1: ruleRFormula : ( ( rule__RFormula__Group__0 ) ) ;
    public final void ruleRFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:316:2: ( ( ( rule__RFormula__Group__0 ) ) )
            // InternalMml.g:317:2: ( ( rule__RFormula__Group__0 ) )
            {
            // InternalMml.g:317:2: ( ( rule__RFormula__Group__0 ) )
            // InternalMml.g:318:3: ( rule__RFormula__Group__0 )
            {
             before(grammarAccess.getRFormulaAccess().getGroup()); 
            // InternalMml.g:319:3: ( rule__RFormula__Group__0 )
            // InternalMml.g:319:4: rule__RFormula__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RFormula__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRFormulaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRFormula"


    // $ANTLR start "entryRuleXFormula"
    // InternalMml.g:328:1: entryRuleXFormula : ruleXFormula EOF ;
    public final void entryRuleXFormula() throws RecognitionException {
        try {
            // InternalMml.g:329:1: ( ruleXFormula EOF )
            // InternalMml.g:330:1: ruleXFormula EOF
            {
             before(grammarAccess.getXFormulaRule()); 
            pushFollow(FOLLOW_1);
            ruleXFormula();

            state._fsp--;

             after(grammarAccess.getXFormulaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXFormula"


    // $ANTLR start "ruleXFormula"
    // InternalMml.g:337:1: ruleXFormula : ( ( rule__XFormula__Alternatives ) ) ;
    public final void ruleXFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:341:2: ( ( ( rule__XFormula__Alternatives ) ) )
            // InternalMml.g:342:2: ( ( rule__XFormula__Alternatives ) )
            {
            // InternalMml.g:342:2: ( ( rule__XFormula__Alternatives ) )
            // InternalMml.g:343:3: ( rule__XFormula__Alternatives )
            {
             before(grammarAccess.getXFormulaAccess().getAlternatives()); 
            // InternalMml.g:344:3: ( rule__XFormula__Alternatives )
            // InternalMml.g:344:4: rule__XFormula__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__XFormula__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getXFormulaAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXFormula"


    // $ANTLR start "entryRuleAllVariables"
    // InternalMml.g:353:1: entryRuleAllVariables : ruleAllVariables EOF ;
    public final void entryRuleAllVariables() throws RecognitionException {
        try {
            // InternalMml.g:354:1: ( ruleAllVariables EOF )
            // InternalMml.g:355:1: ruleAllVariables EOF
            {
             before(grammarAccess.getAllVariablesRule()); 
            pushFollow(FOLLOW_1);
            ruleAllVariables();

            state._fsp--;

             after(grammarAccess.getAllVariablesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAllVariables"


    // $ANTLR start "ruleAllVariables"
    // InternalMml.g:362:1: ruleAllVariables : ( ( rule__AllVariables__AllAssignment ) ) ;
    public final void ruleAllVariables() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:366:2: ( ( ( rule__AllVariables__AllAssignment ) ) )
            // InternalMml.g:367:2: ( ( rule__AllVariables__AllAssignment ) )
            {
            // InternalMml.g:367:2: ( ( rule__AllVariables__AllAssignment ) )
            // InternalMml.g:368:3: ( rule__AllVariables__AllAssignment )
            {
             before(grammarAccess.getAllVariablesAccess().getAllAssignment()); 
            // InternalMml.g:369:3: ( rule__AllVariables__AllAssignment )
            // InternalMml.g:369:4: rule__AllVariables__AllAssignment
            {
            pushFollow(FOLLOW_2);
            rule__AllVariables__AllAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAllVariablesAccess().getAllAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAllVariables"


    // $ANTLR start "entryRulePredictorVariables"
    // InternalMml.g:378:1: entryRulePredictorVariables : rulePredictorVariables EOF ;
    public final void entryRulePredictorVariables() throws RecognitionException {
        try {
            // InternalMml.g:379:1: ( rulePredictorVariables EOF )
            // InternalMml.g:380:1: rulePredictorVariables EOF
            {
             before(grammarAccess.getPredictorVariablesRule()); 
            pushFollow(FOLLOW_1);
            rulePredictorVariables();

            state._fsp--;

             after(grammarAccess.getPredictorVariablesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePredictorVariables"


    // $ANTLR start "rulePredictorVariables"
    // InternalMml.g:387:1: rulePredictorVariables : ( ( rule__PredictorVariables__Group__0 ) ) ;
    public final void rulePredictorVariables() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:391:2: ( ( ( rule__PredictorVariables__Group__0 ) ) )
            // InternalMml.g:392:2: ( ( rule__PredictorVariables__Group__0 ) )
            {
            // InternalMml.g:392:2: ( ( rule__PredictorVariables__Group__0 ) )
            // InternalMml.g:393:3: ( rule__PredictorVariables__Group__0 )
            {
             before(grammarAccess.getPredictorVariablesAccess().getGroup()); 
            // InternalMml.g:394:3: ( rule__PredictorVariables__Group__0 )
            // InternalMml.g:394:4: rule__PredictorVariables__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PredictorVariables__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPredictorVariablesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePredictorVariables"


    // $ANTLR start "entryRuleFormulaItem"
    // InternalMml.g:403:1: entryRuleFormulaItem : ruleFormulaItem EOF ;
    public final void entryRuleFormulaItem() throws RecognitionException {
        try {
            // InternalMml.g:404:1: ( ruleFormulaItem EOF )
            // InternalMml.g:405:1: ruleFormulaItem EOF
            {
             before(grammarAccess.getFormulaItemRule()); 
            pushFollow(FOLLOW_1);
            ruleFormulaItem();

            state._fsp--;

             after(grammarAccess.getFormulaItemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFormulaItem"


    // $ANTLR start "ruleFormulaItem"
    // InternalMml.g:412:1: ruleFormulaItem : ( ( rule__FormulaItem__Alternatives ) ) ;
    public final void ruleFormulaItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:416:2: ( ( ( rule__FormulaItem__Alternatives ) ) )
            // InternalMml.g:417:2: ( ( rule__FormulaItem__Alternatives ) )
            {
            // InternalMml.g:417:2: ( ( rule__FormulaItem__Alternatives ) )
            // InternalMml.g:418:3: ( rule__FormulaItem__Alternatives )
            {
             before(grammarAccess.getFormulaItemAccess().getAlternatives()); 
            // InternalMml.g:419:3: ( rule__FormulaItem__Alternatives )
            // InternalMml.g:419:4: rule__FormulaItem__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FormulaItem__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFormulaItemAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFormulaItem"


    // $ANTLR start "entryRuleValidation"
    // InternalMml.g:428:1: entryRuleValidation : ruleValidation EOF ;
    public final void entryRuleValidation() throws RecognitionException {
        try {
            // InternalMml.g:429:1: ( ruleValidation EOF )
            // InternalMml.g:430:1: ruleValidation EOF
            {
             before(grammarAccess.getValidationRule()); 
            pushFollow(FOLLOW_1);
            ruleValidation();

            state._fsp--;

             after(grammarAccess.getValidationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValidation"


    // $ANTLR start "ruleValidation"
    // InternalMml.g:437:1: ruleValidation : ( ( rule__Validation__Group__0 ) ) ;
    public final void ruleValidation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:441:2: ( ( ( rule__Validation__Group__0 ) ) )
            // InternalMml.g:442:2: ( ( rule__Validation__Group__0 ) )
            {
            // InternalMml.g:442:2: ( ( rule__Validation__Group__0 ) )
            // InternalMml.g:443:3: ( rule__Validation__Group__0 )
            {
             before(grammarAccess.getValidationAccess().getGroup()); 
            // InternalMml.g:444:3: ( rule__Validation__Group__0 )
            // InternalMml.g:444:4: rule__Validation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Validation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getValidationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValidation"


    // $ANTLR start "entryRuleStratificationMethod"
    // InternalMml.g:453:1: entryRuleStratificationMethod : ruleStratificationMethod EOF ;
    public final void entryRuleStratificationMethod() throws RecognitionException {
        try {
            // InternalMml.g:454:1: ( ruleStratificationMethod EOF )
            // InternalMml.g:455:1: ruleStratificationMethod EOF
            {
             before(grammarAccess.getStratificationMethodRule()); 
            pushFollow(FOLLOW_1);
            ruleStratificationMethod();

            state._fsp--;

             after(grammarAccess.getStratificationMethodRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStratificationMethod"


    // $ANTLR start "ruleStratificationMethod"
    // InternalMml.g:462:1: ruleStratificationMethod : ( ( rule__StratificationMethod__Alternatives ) ) ;
    public final void ruleStratificationMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:466:2: ( ( ( rule__StratificationMethod__Alternatives ) ) )
            // InternalMml.g:467:2: ( ( rule__StratificationMethod__Alternatives ) )
            {
            // InternalMml.g:467:2: ( ( rule__StratificationMethod__Alternatives ) )
            // InternalMml.g:468:3: ( rule__StratificationMethod__Alternatives )
            {
             before(grammarAccess.getStratificationMethodAccess().getAlternatives()); 
            // InternalMml.g:469:3: ( rule__StratificationMethod__Alternatives )
            // InternalMml.g:469:4: rule__StratificationMethod__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__StratificationMethod__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStratificationMethodAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStratificationMethod"


    // $ANTLR start "entryRuleCrossValidation"
    // InternalMml.g:478:1: entryRuleCrossValidation : ruleCrossValidation EOF ;
    public final void entryRuleCrossValidation() throws RecognitionException {
        try {
            // InternalMml.g:479:1: ( ruleCrossValidation EOF )
            // InternalMml.g:480:1: ruleCrossValidation EOF
            {
             before(grammarAccess.getCrossValidationRule()); 
            pushFollow(FOLLOW_1);
            ruleCrossValidation();

            state._fsp--;

             after(grammarAccess.getCrossValidationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCrossValidation"


    // $ANTLR start "ruleCrossValidation"
    // InternalMml.g:487:1: ruleCrossValidation : ( ( rule__CrossValidation__Group__0 ) ) ;
    public final void ruleCrossValidation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:491:2: ( ( ( rule__CrossValidation__Group__0 ) ) )
            // InternalMml.g:492:2: ( ( rule__CrossValidation__Group__0 ) )
            {
            // InternalMml.g:492:2: ( ( rule__CrossValidation__Group__0 ) )
            // InternalMml.g:493:3: ( rule__CrossValidation__Group__0 )
            {
             before(grammarAccess.getCrossValidationAccess().getGroup()); 
            // InternalMml.g:494:3: ( rule__CrossValidation__Group__0 )
            // InternalMml.g:494:4: rule__CrossValidation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CrossValidation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCrossValidationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCrossValidation"


    // $ANTLR start "entryRuleTrainingTest"
    // InternalMml.g:503:1: entryRuleTrainingTest : ruleTrainingTest EOF ;
    public final void entryRuleTrainingTest() throws RecognitionException {
        try {
            // InternalMml.g:504:1: ( ruleTrainingTest EOF )
            // InternalMml.g:505:1: ruleTrainingTest EOF
            {
             before(grammarAccess.getTrainingTestRule()); 
            pushFollow(FOLLOW_1);
            ruleTrainingTest();

            state._fsp--;

             after(grammarAccess.getTrainingTestRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTrainingTest"


    // $ANTLR start "ruleTrainingTest"
    // InternalMml.g:512:1: ruleTrainingTest : ( ( rule__TrainingTest__Group__0 ) ) ;
    public final void ruleTrainingTest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:516:2: ( ( ( rule__TrainingTest__Group__0 ) ) )
            // InternalMml.g:517:2: ( ( rule__TrainingTest__Group__0 ) )
            {
            // InternalMml.g:517:2: ( ( rule__TrainingTest__Group__0 ) )
            // InternalMml.g:518:3: ( rule__TrainingTest__Group__0 )
            {
             before(grammarAccess.getTrainingTestAccess().getGroup()); 
            // InternalMml.g:519:3: ( rule__TrainingTest__Group__0 )
            // InternalMml.g:519:4: rule__TrainingTest__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TrainingTest__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTrainingTestAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTrainingTest"


    // $ANTLR start "ruleCSVSeparator"
    // InternalMml.g:528:1: ruleCSVSeparator : ( ( rule__CSVSeparator__Alternatives ) ) ;
    public final void ruleCSVSeparator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:532:1: ( ( ( rule__CSVSeparator__Alternatives ) ) )
            // InternalMml.g:533:2: ( ( rule__CSVSeparator__Alternatives ) )
            {
            // InternalMml.g:533:2: ( ( rule__CSVSeparator__Alternatives ) )
            // InternalMml.g:534:3: ( rule__CSVSeparator__Alternatives )
            {
             before(grammarAccess.getCSVSeparatorAccess().getAlternatives()); 
            // InternalMml.g:535:3: ( rule__CSVSeparator__Alternatives )
            // InternalMml.g:535:4: rule__CSVSeparator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CSVSeparator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCSVSeparatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCSVSeparator"


    // $ANTLR start "ruleFrameworkLang"
    // InternalMml.g:544:1: ruleFrameworkLang : ( ( rule__FrameworkLang__Alternatives ) ) ;
    public final void ruleFrameworkLang() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:548:1: ( ( ( rule__FrameworkLang__Alternatives ) ) )
            // InternalMml.g:549:2: ( ( rule__FrameworkLang__Alternatives ) )
            {
            // InternalMml.g:549:2: ( ( rule__FrameworkLang__Alternatives ) )
            // InternalMml.g:550:3: ( rule__FrameworkLang__Alternatives )
            {
             before(grammarAccess.getFrameworkLangAccess().getAlternatives()); 
            // InternalMml.g:551:3: ( rule__FrameworkLang__Alternatives )
            // InternalMml.g:551:4: rule__FrameworkLang__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FrameworkLang__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFrameworkLangAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFrameworkLang"


    // $ANTLR start "ruleSVMKernel"
    // InternalMml.g:560:1: ruleSVMKernel : ( ( rule__SVMKernel__Alternatives ) ) ;
    public final void ruleSVMKernel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:564:1: ( ( ( rule__SVMKernel__Alternatives ) ) )
            // InternalMml.g:565:2: ( ( rule__SVMKernel__Alternatives ) )
            {
            // InternalMml.g:565:2: ( ( rule__SVMKernel__Alternatives ) )
            // InternalMml.g:566:3: ( rule__SVMKernel__Alternatives )
            {
             before(grammarAccess.getSVMKernelAccess().getAlternatives()); 
            // InternalMml.g:567:3: ( rule__SVMKernel__Alternatives )
            // InternalMml.g:567:4: rule__SVMKernel__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SVMKernel__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSVMKernelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSVMKernel"


    // $ANTLR start "ruleSVMClassification"
    // InternalMml.g:576:1: ruleSVMClassification : ( ( rule__SVMClassification__Alternatives ) ) ;
    public final void ruleSVMClassification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:580:1: ( ( ( rule__SVMClassification__Alternatives ) ) )
            // InternalMml.g:581:2: ( ( rule__SVMClassification__Alternatives ) )
            {
            // InternalMml.g:581:2: ( ( rule__SVMClassification__Alternatives ) )
            // InternalMml.g:582:3: ( rule__SVMClassification__Alternatives )
            {
             before(grammarAccess.getSVMClassificationAccess().getAlternatives()); 
            // InternalMml.g:583:3: ( rule__SVMClassification__Alternatives )
            // InternalMml.g:583:4: rule__SVMClassification__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SVMClassification__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSVMClassificationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSVMClassification"


    // $ANTLR start "ruleValidationMetric"
    // InternalMml.g:592:1: ruleValidationMetric : ( ( rule__ValidationMetric__Alternatives ) ) ;
    public final void ruleValidationMetric() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:596:1: ( ( ( rule__ValidationMetric__Alternatives ) ) )
            // InternalMml.g:597:2: ( ( rule__ValidationMetric__Alternatives ) )
            {
            // InternalMml.g:597:2: ( ( rule__ValidationMetric__Alternatives ) )
            // InternalMml.g:598:3: ( rule__ValidationMetric__Alternatives )
            {
             before(grammarAccess.getValidationMetricAccess().getAlternatives()); 
            // InternalMml.g:599:3: ( rule__ValidationMetric__Alternatives )
            // InternalMml.g:599:4: rule__ValidationMetric__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ValidationMetric__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValidationMetricAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValidationMetric"


    // $ANTLR start "rule__MLAlgorithm__Alternatives"
    // InternalMml.g:607:1: rule__MLAlgorithm__Alternatives : ( ( ruleSVM ) | ( ruleDT ) | ( ruleRandomForest ) | ( ruleLogisticRegression ) );
    public final void rule__MLAlgorithm__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:611:1: ( ( ruleSVM ) | ( ruleDT ) | ( ruleRandomForest ) | ( ruleLogisticRegression ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt1=1;
                }
                break;
            case 11:
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
            case 14:
                {
                alt1=3;
                }
                break;
            case 43:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMml.g:612:2: ( ruleSVM )
                    {
                    // InternalMml.g:612:2: ( ruleSVM )
                    // InternalMml.g:613:3: ruleSVM
                    {
                     before(grammarAccess.getMLAlgorithmAccess().getSVMParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSVM();

                    state._fsp--;

                     after(grammarAccess.getMLAlgorithmAccess().getSVMParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:618:2: ( ruleDT )
                    {
                    // InternalMml.g:618:2: ( ruleDT )
                    // InternalMml.g:619:3: ruleDT
                    {
                     before(grammarAccess.getMLAlgorithmAccess().getDTParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDT();

                    state._fsp--;

                     after(grammarAccess.getMLAlgorithmAccess().getDTParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMml.g:624:2: ( ruleRandomForest )
                    {
                    // InternalMml.g:624:2: ( ruleRandomForest )
                    // InternalMml.g:625:3: ruleRandomForest
                    {
                     before(grammarAccess.getMLAlgorithmAccess().getRandomForestParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRandomForest();

                    state._fsp--;

                     after(grammarAccess.getMLAlgorithmAccess().getRandomForestParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMml.g:630:2: ( ruleLogisticRegression )
                    {
                    // InternalMml.g:630:2: ( ruleLogisticRegression )
                    // InternalMml.g:631:3: ruleLogisticRegression
                    {
                     before(grammarAccess.getMLAlgorithmAccess().getLogisticRegressionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleLogisticRegression();

                    state._fsp--;

                     after(grammarAccess.getMLAlgorithmAccess().getLogisticRegressionParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLAlgorithm__Alternatives"


    // $ANTLR start "rule__DT__Alternatives_1"
    // InternalMml.g:640:1: rule__DT__Alternatives_1 : ( ( 'DT' ) | ( 'DecisionTree' ) );
    public final void rule__DT__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:644:1: ( ( 'DT' ) | ( 'DecisionTree' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMml.g:645:2: ( 'DT' )
                    {
                    // InternalMml.g:645:2: ( 'DT' )
                    // InternalMml.g:646:3: 'DT'
                    {
                     before(grammarAccess.getDTAccess().getDTKeyword_1_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getDTAccess().getDTKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:651:2: ( 'DecisionTree' )
                    {
                    // InternalMml.g:651:2: ( 'DecisionTree' )
                    // InternalMml.g:652:3: 'DecisionTree'
                    {
                     before(grammarAccess.getDTAccess().getDecisionTreeKeyword_1_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getDTAccess().getDecisionTreeKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DT__Alternatives_1"


    // $ANTLR start "rule__RandomForest__Alternatives_1"
    // InternalMml.g:661:1: rule__RandomForest__Alternatives_1 : ( ( 'RandomForest' ) | ( 'RF' ) );
    public final void rule__RandomForest__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:665:1: ( ( 'RandomForest' ) | ( 'RF' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMml.g:666:2: ( 'RandomForest' )
                    {
                    // InternalMml.g:666:2: ( 'RandomForest' )
                    // InternalMml.g:667:3: 'RandomForest'
                    {
                     before(grammarAccess.getRandomForestAccess().getRandomForestKeyword_1_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getRandomForestAccess().getRandomForestKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:672:2: ( 'RF' )
                    {
                    // InternalMml.g:672:2: ( 'RF' )
                    // InternalMml.g:673:3: 'RF'
                    {
                     before(grammarAccess.getRandomForestAccess().getRFKeyword_1_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getRandomForestAccess().getRFKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RandomForest__Alternatives_1"


    // $ANTLR start "rule__XFormula__Alternatives"
    // InternalMml.g:682:1: rule__XFormula__Alternatives : ( ( ruleAllVariables ) | ( rulePredictorVariables ) );
    public final void rule__XFormula__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:686:1: ( ( ruleAllVariables ) | ( rulePredictorVariables ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==44) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=RULE_INT && LA4_0<=RULE_STRING)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMml.g:687:2: ( ruleAllVariables )
                    {
                    // InternalMml.g:687:2: ( ruleAllVariables )
                    // InternalMml.g:688:3: ruleAllVariables
                    {
                     before(grammarAccess.getXFormulaAccess().getAllVariablesParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAllVariables();

                    state._fsp--;

                     after(grammarAccess.getXFormulaAccess().getAllVariablesParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:693:2: ( rulePredictorVariables )
                    {
                    // InternalMml.g:693:2: ( rulePredictorVariables )
                    // InternalMml.g:694:3: rulePredictorVariables
                    {
                     before(grammarAccess.getXFormulaAccess().getPredictorVariablesParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePredictorVariables();

                    state._fsp--;

                     after(grammarAccess.getXFormulaAccess().getPredictorVariablesParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XFormula__Alternatives"


    // $ANTLR start "rule__FormulaItem__Alternatives"
    // InternalMml.g:703:1: rule__FormulaItem__Alternatives : ( ( ( rule__FormulaItem__ColumnAssignment_0 ) ) | ( ( rule__FormulaItem__ColNameAssignment_1 ) ) );
    public final void rule__FormulaItem__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:707:1: ( ( ( rule__FormulaItem__ColumnAssignment_0 ) ) | ( ( rule__FormulaItem__ColNameAssignment_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_STRING) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMml.g:708:2: ( ( rule__FormulaItem__ColumnAssignment_0 ) )
                    {
                    // InternalMml.g:708:2: ( ( rule__FormulaItem__ColumnAssignment_0 ) )
                    // InternalMml.g:709:3: ( rule__FormulaItem__ColumnAssignment_0 )
                    {
                     before(grammarAccess.getFormulaItemAccess().getColumnAssignment_0()); 
                    // InternalMml.g:710:3: ( rule__FormulaItem__ColumnAssignment_0 )
                    // InternalMml.g:710:4: rule__FormulaItem__ColumnAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FormulaItem__ColumnAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormulaItemAccess().getColumnAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:714:2: ( ( rule__FormulaItem__ColNameAssignment_1 ) )
                    {
                    // InternalMml.g:714:2: ( ( rule__FormulaItem__ColNameAssignment_1 ) )
                    // InternalMml.g:715:3: ( rule__FormulaItem__ColNameAssignment_1 )
                    {
                     before(grammarAccess.getFormulaItemAccess().getColNameAssignment_1()); 
                    // InternalMml.g:716:3: ( rule__FormulaItem__ColNameAssignment_1 )
                    // InternalMml.g:716:4: rule__FormulaItem__ColNameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__FormulaItem__ColNameAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormulaItemAccess().getColNameAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormulaItem__Alternatives"


    // $ANTLR start "rule__StratificationMethod__Alternatives"
    // InternalMml.g:724:1: rule__StratificationMethod__Alternatives : ( ( ruleCrossValidation ) | ( ruleTrainingTest ) );
    public final void rule__StratificationMethod__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:728:1: ( ( ruleCrossValidation ) | ( ruleTrainingTest ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==48) ) {
                alt6=1;
            }
            else if ( (LA6_0==52) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMml.g:729:2: ( ruleCrossValidation )
                    {
                    // InternalMml.g:729:2: ( ruleCrossValidation )
                    // InternalMml.g:730:3: ruleCrossValidation
                    {
                     before(grammarAccess.getStratificationMethodAccess().getCrossValidationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCrossValidation();

                    state._fsp--;

                     after(grammarAccess.getStratificationMethodAccess().getCrossValidationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:735:2: ( ruleTrainingTest )
                    {
                    // InternalMml.g:735:2: ( ruleTrainingTest )
                    // InternalMml.g:736:3: ruleTrainingTest
                    {
                     before(grammarAccess.getStratificationMethodAccess().getTrainingTestParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTrainingTest();

                    state._fsp--;

                     after(grammarAccess.getStratificationMethodAccess().getTrainingTestParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StratificationMethod__Alternatives"


    // $ANTLR start "rule__CSVSeparator__Alternatives"
    // InternalMml.g:745:1: rule__CSVSeparator__Alternatives : ( ( ( ',' ) ) | ( ( ';' ) ) );
    public final void rule__CSVSeparator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:749:1: ( ( ( ',' ) ) | ( ( ';' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            else if ( (LA7_0==16) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMml.g:750:2: ( ( ',' ) )
                    {
                    // InternalMml.g:750:2: ( ( ',' ) )
                    // InternalMml.g:751:3: ( ',' )
                    {
                     before(grammarAccess.getCSVSeparatorAccess().getCOMMAEnumLiteralDeclaration_0()); 
                    // InternalMml.g:752:3: ( ',' )
                    // InternalMml.g:752:4: ','
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getCSVSeparatorAccess().getCOMMAEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:756:2: ( ( ';' ) )
                    {
                    // InternalMml.g:756:2: ( ( ';' ) )
                    // InternalMml.g:757:3: ( ';' )
                    {
                     before(grammarAccess.getCSVSeparatorAccess().getSEMI_COLONEnumLiteralDeclaration_1()); 
                    // InternalMml.g:758:3: ( ';' )
                    // InternalMml.g:758:4: ';'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getCSVSeparatorAccess().getSEMI_COLONEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSVSeparator__Alternatives"


    // $ANTLR start "rule__FrameworkLang__Alternatives"
    // InternalMml.g:766:1: rule__FrameworkLang__Alternatives : ( ( ( 'scikit-learn' ) ) | ( ( 'R' ) ) | ( ( 'Weka' ) ) | ( ( 'xgboost' ) ) );
    public final void rule__FrameworkLang__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:770:1: ( ( ( 'scikit-learn' ) ) | ( ( 'R' ) ) | ( ( 'Weka' ) ) | ( ( 'xgboost' ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt8=1;
                }
                break;
            case 18:
                {
                alt8=2;
                }
                break;
            case 19:
                {
                alt8=3;
                }
                break;
            case 20:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMml.g:771:2: ( ( 'scikit-learn' ) )
                    {
                    // InternalMml.g:771:2: ( ( 'scikit-learn' ) )
                    // InternalMml.g:772:3: ( 'scikit-learn' )
                    {
                     before(grammarAccess.getFrameworkLangAccess().getSCIKITEnumLiteralDeclaration_0()); 
                    // InternalMml.g:773:3: ( 'scikit-learn' )
                    // InternalMml.g:773:4: 'scikit-learn'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getFrameworkLangAccess().getSCIKITEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:777:2: ( ( 'R' ) )
                    {
                    // InternalMml.g:777:2: ( ( 'R' ) )
                    // InternalMml.g:778:3: ( 'R' )
                    {
                     before(grammarAccess.getFrameworkLangAccess().getREnumLiteralDeclaration_1()); 
                    // InternalMml.g:779:3: ( 'R' )
                    // InternalMml.g:779:4: 'R'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getFrameworkLangAccess().getREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMml.g:783:2: ( ( 'Weka' ) )
                    {
                    // InternalMml.g:783:2: ( ( 'Weka' ) )
                    // InternalMml.g:784:3: ( 'Weka' )
                    {
                     before(grammarAccess.getFrameworkLangAccess().getJavaWekaEnumLiteralDeclaration_2()); 
                    // InternalMml.g:785:3: ( 'Weka' )
                    // InternalMml.g:785:4: 'Weka'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getFrameworkLangAccess().getJavaWekaEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMml.g:789:2: ( ( 'xgboost' ) )
                    {
                    // InternalMml.g:789:2: ( ( 'xgboost' ) )
                    // InternalMml.g:790:3: ( 'xgboost' )
                    {
                     before(grammarAccess.getFrameworkLangAccess().getXGBoostEnumLiteralDeclaration_3()); 
                    // InternalMml.g:791:3: ( 'xgboost' )
                    // InternalMml.g:791:4: 'xgboost'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getFrameworkLangAccess().getXGBoostEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FrameworkLang__Alternatives"


    // $ANTLR start "rule__SVMKernel__Alternatives"
    // InternalMml.g:799:1: rule__SVMKernel__Alternatives : ( ( ( 'linear' ) ) | ( ( 'polynomial' ) ) | ( ( 'radial' ) ) );
    public final void rule__SVMKernel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:803:1: ( ( ( 'linear' ) ) | ( ( 'polynomial' ) ) | ( ( 'radial' ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt9=1;
                }
                break;
            case 22:
                {
                alt9=2;
                }
                break;
            case 23:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMml.g:804:2: ( ( 'linear' ) )
                    {
                    // InternalMml.g:804:2: ( ( 'linear' ) )
                    // InternalMml.g:805:3: ( 'linear' )
                    {
                     before(grammarAccess.getSVMKernelAccess().getLinearEnumLiteralDeclaration_0()); 
                    // InternalMml.g:806:3: ( 'linear' )
                    // InternalMml.g:806:4: 'linear'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getSVMKernelAccess().getLinearEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:810:2: ( ( 'polynomial' ) )
                    {
                    // InternalMml.g:810:2: ( ( 'polynomial' ) )
                    // InternalMml.g:811:3: ( 'polynomial' )
                    {
                     before(grammarAccess.getSVMKernelAccess().getPolyEnumLiteralDeclaration_1()); 
                    // InternalMml.g:812:3: ( 'polynomial' )
                    // InternalMml.g:812:4: 'polynomial'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getSVMKernelAccess().getPolyEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMml.g:816:2: ( ( 'radial' ) )
                    {
                    // InternalMml.g:816:2: ( ( 'radial' ) )
                    // InternalMml.g:817:3: ( 'radial' )
                    {
                     before(grammarAccess.getSVMKernelAccess().getRadialEnumLiteralDeclaration_2()); 
                    // InternalMml.g:818:3: ( 'radial' )
                    // InternalMml.g:818:4: 'radial'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getSVMKernelAccess().getRadialEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVMKernel__Alternatives"


    // $ANTLR start "rule__SVMClassification__Alternatives"
    // InternalMml.g:826:1: rule__SVMClassification__Alternatives : ( ( ( 'C-classification' ) ) | ( ( 'nu-classification' ) ) | ( ( 'one-classification' ) ) );
    public final void rule__SVMClassification__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:830:1: ( ( ( 'C-classification' ) ) | ( ( 'nu-classification' ) ) | ( ( 'one-classification' ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt10=1;
                }
                break;
            case 25:
                {
                alt10=2;
                }
                break;
            case 26:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalMml.g:831:2: ( ( 'C-classification' ) )
                    {
                    // InternalMml.g:831:2: ( ( 'C-classification' ) )
                    // InternalMml.g:832:3: ( 'C-classification' )
                    {
                     before(grammarAccess.getSVMClassificationAccess().getCClassEnumLiteralDeclaration_0()); 
                    // InternalMml.g:833:3: ( 'C-classification' )
                    // InternalMml.g:833:4: 'C-classification'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getSVMClassificationAccess().getCClassEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:837:2: ( ( 'nu-classification' ) )
                    {
                    // InternalMml.g:837:2: ( ( 'nu-classification' ) )
                    // InternalMml.g:838:3: ( 'nu-classification' )
                    {
                     before(grammarAccess.getSVMClassificationAccess().getNuClassEnumLiteralDeclaration_1()); 
                    // InternalMml.g:839:3: ( 'nu-classification' )
                    // InternalMml.g:839:4: 'nu-classification'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getSVMClassificationAccess().getNuClassEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMml.g:843:2: ( ( 'one-classification' ) )
                    {
                    // InternalMml.g:843:2: ( ( 'one-classification' ) )
                    // InternalMml.g:844:3: ( 'one-classification' )
                    {
                     before(grammarAccess.getSVMClassificationAccess().getOneClassEnumLiteralDeclaration_2()); 
                    // InternalMml.g:845:3: ( 'one-classification' )
                    // InternalMml.g:845:4: 'one-classification'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getSVMClassificationAccess().getOneClassEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVMClassification__Alternatives"


    // $ANTLR start "rule__ValidationMetric__Alternatives"
    // InternalMml.g:853:1: rule__ValidationMetric__Alternatives : ( ( ( 'balanced_accuracy' ) ) | ( ( 'recall' ) ) | ( ( 'precision' ) ) | ( ( 'F1' ) ) | ( ( 'accuracy' ) ) | ( ( 'macro_recall' ) ) | ( ( 'macro_precision' ) ) | ( ( 'macro_F1' ) ) | ( ( 'macro_accuracy' ) ) );
    public final void rule__ValidationMetric__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:857:1: ( ( ( 'balanced_accuracy' ) ) | ( ( 'recall' ) ) | ( ( 'precision' ) ) | ( ( 'F1' ) ) | ( ( 'accuracy' ) ) | ( ( 'macro_recall' ) ) | ( ( 'macro_precision' ) ) | ( ( 'macro_F1' ) ) | ( ( 'macro_accuracy' ) ) )
            int alt11=9;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt11=1;
                }
                break;
            case 28:
                {
                alt11=2;
                }
                break;
            case 29:
                {
                alt11=3;
                }
                break;
            case 30:
                {
                alt11=4;
                }
                break;
            case 31:
                {
                alt11=5;
                }
                break;
            case 32:
                {
                alt11=6;
                }
                break;
            case 33:
                {
                alt11=7;
                }
                break;
            case 34:
                {
                alt11=8;
                }
                break;
            case 35:
                {
                alt11=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMml.g:858:2: ( ( 'balanced_accuracy' ) )
                    {
                    // InternalMml.g:858:2: ( ( 'balanced_accuracy' ) )
                    // InternalMml.g:859:3: ( 'balanced_accuracy' )
                    {
                     before(grammarAccess.getValidationMetricAccess().getBALANCED_ACCURACYEnumLiteralDeclaration_0()); 
                    // InternalMml.g:860:3: ( 'balanced_accuracy' )
                    // InternalMml.g:860:4: 'balanced_accuracy'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getValidationMetricAccess().getBALANCED_ACCURACYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:864:2: ( ( 'recall' ) )
                    {
                    // InternalMml.g:864:2: ( ( 'recall' ) )
                    // InternalMml.g:865:3: ( 'recall' )
                    {
                     before(grammarAccess.getValidationMetricAccess().getRECALLEnumLiteralDeclaration_1()); 
                    // InternalMml.g:866:3: ( 'recall' )
                    // InternalMml.g:866:4: 'recall'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getValidationMetricAccess().getRECALLEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMml.g:870:2: ( ( 'precision' ) )
                    {
                    // InternalMml.g:870:2: ( ( 'precision' ) )
                    // InternalMml.g:871:3: ( 'precision' )
                    {
                     before(grammarAccess.getValidationMetricAccess().getPRECISIONEnumLiteralDeclaration_2()); 
                    // InternalMml.g:872:3: ( 'precision' )
                    // InternalMml.g:872:4: 'precision'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getValidationMetricAccess().getPRECISIONEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMml.g:876:2: ( ( 'F1' ) )
                    {
                    // InternalMml.g:876:2: ( ( 'F1' ) )
                    // InternalMml.g:877:3: ( 'F1' )
                    {
                     before(grammarAccess.getValidationMetricAccess().getF1EnumLiteralDeclaration_3()); 
                    // InternalMml.g:878:3: ( 'F1' )
                    // InternalMml.g:878:4: 'F1'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getValidationMetricAccess().getF1EnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMml.g:882:2: ( ( 'accuracy' ) )
                    {
                    // InternalMml.g:882:2: ( ( 'accuracy' ) )
                    // InternalMml.g:883:3: ( 'accuracy' )
                    {
                     before(grammarAccess.getValidationMetricAccess().getACCURACYEnumLiteralDeclaration_4()); 
                    // InternalMml.g:884:3: ( 'accuracy' )
                    // InternalMml.g:884:4: 'accuracy'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getValidationMetricAccess().getACCURACYEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMml.g:888:2: ( ( 'macro_recall' ) )
                    {
                    // InternalMml.g:888:2: ( ( 'macro_recall' ) )
                    // InternalMml.g:889:3: ( 'macro_recall' )
                    {
                     before(grammarAccess.getValidationMetricAccess().getMACRO_RECALLEnumLiteralDeclaration_5()); 
                    // InternalMml.g:890:3: ( 'macro_recall' )
                    // InternalMml.g:890:4: 'macro_recall'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getValidationMetricAccess().getMACRO_RECALLEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMml.g:894:2: ( ( 'macro_precision' ) )
                    {
                    // InternalMml.g:894:2: ( ( 'macro_precision' ) )
                    // InternalMml.g:895:3: ( 'macro_precision' )
                    {
                     before(grammarAccess.getValidationMetricAccess().getMACRO_PRECISIONEnumLiteralDeclaration_6()); 
                    // InternalMml.g:896:3: ( 'macro_precision' )
                    // InternalMml.g:896:4: 'macro_precision'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getValidationMetricAccess().getMACRO_PRECISIONEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMml.g:900:2: ( ( 'macro_F1' ) )
                    {
                    // InternalMml.g:900:2: ( ( 'macro_F1' ) )
                    // InternalMml.g:901:3: ( 'macro_F1' )
                    {
                     before(grammarAccess.getValidationMetricAccess().getMACRO_F1EnumLiteralDeclaration_7()); 
                    // InternalMml.g:902:3: ( 'macro_F1' )
                    // InternalMml.g:902:4: 'macro_F1'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getValidationMetricAccess().getMACRO_F1EnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMml.g:906:2: ( ( 'macro_accuracy' ) )
                    {
                    // InternalMml.g:906:2: ( ( 'macro_accuracy' ) )
                    // InternalMml.g:907:3: ( 'macro_accuracy' )
                    {
                     before(grammarAccess.getValidationMetricAccess().getMACRO_ACCURACYEnumLiteralDeclaration_8()); 
                    // InternalMml.g:908:3: ( 'macro_accuracy' )
                    // InternalMml.g:908:4: 'macro_accuracy'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getValidationMetricAccess().getMACRO_ACCURACYEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidationMetric__Alternatives"


    // $ANTLR start "rule__MMLModel__Group__0"
    // InternalMml.g:916:1: rule__MMLModel__Group__0 : rule__MMLModel__Group__0__Impl rule__MMLModel__Group__1 ;
    public final void rule__MMLModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:920:1: ( rule__MMLModel__Group__0__Impl rule__MMLModel__Group__1 )
            // InternalMml.g:921:2: rule__MMLModel__Group__0__Impl rule__MMLModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MMLModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MMLModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMLModel__Group__0"


    // $ANTLR start "rule__MMLModel__Group__0__Impl"
    // InternalMml.g:928:1: rule__MMLModel__Group__0__Impl : ( ( rule__MMLModel__InputAssignment_0 ) ) ;
    public final void rule__MMLModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:932:1: ( ( ( rule__MMLModel__InputAssignment_0 ) ) )
            // InternalMml.g:933:1: ( ( rule__MMLModel__InputAssignment_0 ) )
            {
            // InternalMml.g:933:1: ( ( rule__MMLModel__InputAssignment_0 ) )
            // InternalMml.g:934:2: ( rule__MMLModel__InputAssignment_0 )
            {
             before(grammarAccess.getMMLModelAccess().getInputAssignment_0()); 
            // InternalMml.g:935:2: ( rule__MMLModel__InputAssignment_0 )
            // InternalMml.g:935:3: rule__MMLModel__InputAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MMLModel__InputAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMMLModelAccess().getInputAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMLModel__Group__0__Impl"


    // $ANTLR start "rule__MMLModel__Group__1"
    // InternalMml.g:943:1: rule__MMLModel__Group__1 : rule__MMLModel__Group__1__Impl rule__MMLModel__Group__2 ;
    public final void rule__MMLModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:947:1: ( rule__MMLModel__Group__1__Impl rule__MMLModel__Group__2 )
            // InternalMml.g:948:2: rule__MMLModel__Group__1__Impl rule__MMLModel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__MMLModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MMLModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMLModel__Group__1"


    // $ANTLR start "rule__MMLModel__Group__1__Impl"
    // InternalMml.g:955:1: rule__MMLModel__Group__1__Impl : ( ( ( rule__MMLModel__AlgorithmsAssignment_1 ) ) ( ( rule__MMLModel__AlgorithmsAssignment_1 )* ) ) ;
    public final void rule__MMLModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:959:1: ( ( ( ( rule__MMLModel__AlgorithmsAssignment_1 ) ) ( ( rule__MMLModel__AlgorithmsAssignment_1 )* ) ) )
            // InternalMml.g:960:1: ( ( ( rule__MMLModel__AlgorithmsAssignment_1 ) ) ( ( rule__MMLModel__AlgorithmsAssignment_1 )* ) )
            {
            // InternalMml.g:960:1: ( ( ( rule__MMLModel__AlgorithmsAssignment_1 ) ) ( ( rule__MMLModel__AlgorithmsAssignment_1 )* ) )
            // InternalMml.g:961:2: ( ( rule__MMLModel__AlgorithmsAssignment_1 ) ) ( ( rule__MMLModel__AlgorithmsAssignment_1 )* )
            {
            // InternalMml.g:961:2: ( ( rule__MMLModel__AlgorithmsAssignment_1 ) )
            // InternalMml.g:962:3: ( rule__MMLModel__AlgorithmsAssignment_1 )
            {
             before(grammarAccess.getMMLModelAccess().getAlgorithmsAssignment_1()); 
            // InternalMml.g:963:3: ( rule__MMLModel__AlgorithmsAssignment_1 )
            // InternalMml.g:963:4: rule__MMLModel__AlgorithmsAssignment_1
            {
            pushFollow(FOLLOW_5);
            rule__MMLModel__AlgorithmsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMMLModelAccess().getAlgorithmsAssignment_1()); 

            }

            // InternalMml.g:966:2: ( ( rule__MMLModel__AlgorithmsAssignment_1 )* )
            // InternalMml.g:967:3: ( rule__MMLModel__AlgorithmsAssignment_1 )*
            {
             before(grammarAccess.getMMLModelAccess().getAlgorithmsAssignment_1()); 
            // InternalMml.g:968:3: ( rule__MMLModel__AlgorithmsAssignment_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==38) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMml.g:968:4: rule__MMLModel__AlgorithmsAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__MMLModel__AlgorithmsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getMMLModelAccess().getAlgorithmsAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMLModel__Group__1__Impl"


    // $ANTLR start "rule__MMLModel__Group__2"
    // InternalMml.g:977:1: rule__MMLModel__Group__2 : rule__MMLModel__Group__2__Impl rule__MMLModel__Group__3 ;
    public final void rule__MMLModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:981:1: ( rule__MMLModel__Group__2__Impl rule__MMLModel__Group__3 )
            // InternalMml.g:982:2: rule__MMLModel__Group__2__Impl rule__MMLModel__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__MMLModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MMLModel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMLModel__Group__2"


    // $ANTLR start "rule__MMLModel__Group__2__Impl"
    // InternalMml.g:989:1: rule__MMLModel__Group__2__Impl : ( ( rule__MMLModel__FormulaAssignment_2 )? ) ;
    public final void rule__MMLModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:993:1: ( ( ( rule__MMLModel__FormulaAssignment_2 )? ) )
            // InternalMml.g:994:1: ( ( rule__MMLModel__FormulaAssignment_2 )? )
            {
            // InternalMml.g:994:1: ( ( rule__MMLModel__FormulaAssignment_2 )? )
            // InternalMml.g:995:2: ( rule__MMLModel__FormulaAssignment_2 )?
            {
             before(grammarAccess.getMMLModelAccess().getFormulaAssignment_2()); 
            // InternalMml.g:996:2: ( rule__MMLModel__FormulaAssignment_2 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==45) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMml.g:996:3: rule__MMLModel__FormulaAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__MMLModel__FormulaAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMMLModelAccess().getFormulaAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMLModel__Group__2__Impl"


    // $ANTLR start "rule__MMLModel__Group__3"
    // InternalMml.g:1004:1: rule__MMLModel__Group__3 : rule__MMLModel__Group__3__Impl ;
    public final void rule__MMLModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1008:1: ( rule__MMLModel__Group__3__Impl )
            // InternalMml.g:1009:2: rule__MMLModel__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MMLModel__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMLModel__Group__3"


    // $ANTLR start "rule__MMLModel__Group__3__Impl"
    // InternalMml.g:1015:1: rule__MMLModel__Group__3__Impl : ( ( rule__MMLModel__ValidationAssignment_3 ) ) ;
    public final void rule__MMLModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1019:1: ( ( ( rule__MMLModel__ValidationAssignment_3 ) ) )
            // InternalMml.g:1020:1: ( ( rule__MMLModel__ValidationAssignment_3 ) )
            {
            // InternalMml.g:1020:1: ( ( rule__MMLModel__ValidationAssignment_3 ) )
            // InternalMml.g:1021:2: ( rule__MMLModel__ValidationAssignment_3 )
            {
             before(grammarAccess.getMMLModelAccess().getValidationAssignment_3()); 
            // InternalMml.g:1022:2: ( rule__MMLModel__ValidationAssignment_3 )
            // InternalMml.g:1022:3: rule__MMLModel__ValidationAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MMLModel__ValidationAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMMLModelAccess().getValidationAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMLModel__Group__3__Impl"


    // $ANTLR start "rule__DataInput__Group__0"
    // InternalMml.g:1031:1: rule__DataInput__Group__0 : rule__DataInput__Group__0__Impl rule__DataInput__Group__1 ;
    public final void rule__DataInput__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1035:1: ( rule__DataInput__Group__0__Impl rule__DataInput__Group__1 )
            // InternalMml.g:1036:2: rule__DataInput__Group__0__Impl rule__DataInput__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__DataInput__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataInput__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataInput__Group__0"


    // $ANTLR start "rule__DataInput__Group__0__Impl"
    // InternalMml.g:1043:1: rule__DataInput__Group__0__Impl : ( 'datainput' ) ;
    public final void rule__DataInput__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1047:1: ( ( 'datainput' ) )
            // InternalMml.g:1048:1: ( 'datainput' )
            {
            // InternalMml.g:1048:1: ( 'datainput' )
            // InternalMml.g:1049:2: 'datainput'
            {
             before(grammarAccess.getDataInputAccess().getDatainputKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getDataInputAccess().getDatainputKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataInput__Group__0__Impl"


    // $ANTLR start "rule__DataInput__Group__1"
    // InternalMml.g:1058:1: rule__DataInput__Group__1 : rule__DataInput__Group__1__Impl rule__DataInput__Group__2 ;
    public final void rule__DataInput__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1062:1: ( rule__DataInput__Group__1__Impl rule__DataInput__Group__2 )
            // InternalMml.g:1063:2: rule__DataInput__Group__1__Impl rule__DataInput__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__DataInput__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataInput__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataInput__Group__1"


    // $ANTLR start "rule__DataInput__Group__1__Impl"
    // InternalMml.g:1070:1: rule__DataInput__Group__1__Impl : ( ( rule__DataInput__FilelocationAssignment_1 ) ) ;
    public final void rule__DataInput__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1074:1: ( ( ( rule__DataInput__FilelocationAssignment_1 ) ) )
            // InternalMml.g:1075:1: ( ( rule__DataInput__FilelocationAssignment_1 ) )
            {
            // InternalMml.g:1075:1: ( ( rule__DataInput__FilelocationAssignment_1 ) )
            // InternalMml.g:1076:2: ( rule__DataInput__FilelocationAssignment_1 )
            {
             before(grammarAccess.getDataInputAccess().getFilelocationAssignment_1()); 
            // InternalMml.g:1077:2: ( rule__DataInput__FilelocationAssignment_1 )
            // InternalMml.g:1077:3: rule__DataInput__FilelocationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DataInput__FilelocationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataInputAccess().getFilelocationAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataInput__Group__1__Impl"


    // $ANTLR start "rule__DataInput__Group__2"
    // InternalMml.g:1085:1: rule__DataInput__Group__2 : rule__DataInput__Group__2__Impl ;
    public final void rule__DataInput__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1089:1: ( rule__DataInput__Group__2__Impl )
            // InternalMml.g:1090:2: rule__DataInput__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataInput__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataInput__Group__2"


    // $ANTLR start "rule__DataInput__Group__2__Impl"
    // InternalMml.g:1096:1: rule__DataInput__Group__2__Impl : ( ( rule__DataInput__ParsingInstructionAssignment_2 )? ) ;
    public final void rule__DataInput__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1100:1: ( ( ( rule__DataInput__ParsingInstructionAssignment_2 )? ) )
            // InternalMml.g:1101:1: ( ( rule__DataInput__ParsingInstructionAssignment_2 )? )
            {
            // InternalMml.g:1101:1: ( ( rule__DataInput__ParsingInstructionAssignment_2 )? )
            // InternalMml.g:1102:2: ( rule__DataInput__ParsingInstructionAssignment_2 )?
            {
             before(grammarAccess.getDataInputAccess().getParsingInstructionAssignment_2()); 
            // InternalMml.g:1103:2: ( rule__DataInput__ParsingInstructionAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==37) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMml.g:1103:3: rule__DataInput__ParsingInstructionAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataInput__ParsingInstructionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataInputAccess().getParsingInstructionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataInput__Group__2__Impl"


    // $ANTLR start "rule__CSVParsingConfiguration__Group__0"
    // InternalMml.g:1112:1: rule__CSVParsingConfiguration__Group__0 : rule__CSVParsingConfiguration__Group__0__Impl rule__CSVParsingConfiguration__Group__1 ;
    public final void rule__CSVParsingConfiguration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1116:1: ( rule__CSVParsingConfiguration__Group__0__Impl rule__CSVParsingConfiguration__Group__1 )
            // InternalMml.g:1117:2: rule__CSVParsingConfiguration__Group__0__Impl rule__CSVParsingConfiguration__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__CSVParsingConfiguration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CSVParsingConfiguration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSVParsingConfiguration__Group__0"


    // $ANTLR start "rule__CSVParsingConfiguration__Group__0__Impl"
    // InternalMml.g:1124:1: rule__CSVParsingConfiguration__Group__0__Impl : ( 'separator' ) ;
    public final void rule__CSVParsingConfiguration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1128:1: ( ( 'separator' ) )
            // InternalMml.g:1129:1: ( 'separator' )
            {
            // InternalMml.g:1129:1: ( 'separator' )
            // InternalMml.g:1130:2: 'separator'
            {
             before(grammarAccess.getCSVParsingConfigurationAccess().getSeparatorKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getCSVParsingConfigurationAccess().getSeparatorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSVParsingConfiguration__Group__0__Impl"


    // $ANTLR start "rule__CSVParsingConfiguration__Group__1"
    // InternalMml.g:1139:1: rule__CSVParsingConfiguration__Group__1 : rule__CSVParsingConfiguration__Group__1__Impl ;
    public final void rule__CSVParsingConfiguration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1143:1: ( rule__CSVParsingConfiguration__Group__1__Impl )
            // InternalMml.g:1144:2: rule__CSVParsingConfiguration__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSVParsingConfiguration__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSVParsingConfiguration__Group__1"


    // $ANTLR start "rule__CSVParsingConfiguration__Group__1__Impl"
    // InternalMml.g:1150:1: rule__CSVParsingConfiguration__Group__1__Impl : ( ( rule__CSVParsingConfiguration__SepAssignment_1 ) ) ;
    public final void rule__CSVParsingConfiguration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1154:1: ( ( ( rule__CSVParsingConfiguration__SepAssignment_1 ) ) )
            // InternalMml.g:1155:1: ( ( rule__CSVParsingConfiguration__SepAssignment_1 ) )
            {
            // InternalMml.g:1155:1: ( ( rule__CSVParsingConfiguration__SepAssignment_1 ) )
            // InternalMml.g:1156:2: ( rule__CSVParsingConfiguration__SepAssignment_1 )
            {
             before(grammarAccess.getCSVParsingConfigurationAccess().getSepAssignment_1()); 
            // InternalMml.g:1157:2: ( rule__CSVParsingConfiguration__SepAssignment_1 )
            // InternalMml.g:1157:3: rule__CSVParsingConfiguration__SepAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CSVParsingConfiguration__SepAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCSVParsingConfigurationAccess().getSepAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSVParsingConfiguration__Group__1__Impl"


    // $ANTLR start "rule__MLChoiceAlgorithm__Group__0"
    // InternalMml.g:1166:1: rule__MLChoiceAlgorithm__Group__0 : rule__MLChoiceAlgorithm__Group__0__Impl rule__MLChoiceAlgorithm__Group__1 ;
    public final void rule__MLChoiceAlgorithm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1170:1: ( rule__MLChoiceAlgorithm__Group__0__Impl rule__MLChoiceAlgorithm__Group__1 )
            // InternalMml.g:1171:2: rule__MLChoiceAlgorithm__Group__0__Impl rule__MLChoiceAlgorithm__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__MLChoiceAlgorithm__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLChoiceAlgorithm__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLChoiceAlgorithm__Group__0"


    // $ANTLR start "rule__MLChoiceAlgorithm__Group__0__Impl"
    // InternalMml.g:1178:1: rule__MLChoiceAlgorithm__Group__0__Impl : ( 'mlframework' ) ;
    public final void rule__MLChoiceAlgorithm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1182:1: ( ( 'mlframework' ) )
            // InternalMml.g:1183:1: ( 'mlframework' )
            {
            // InternalMml.g:1183:1: ( 'mlframework' )
            // InternalMml.g:1184:2: 'mlframework'
            {
             before(grammarAccess.getMLChoiceAlgorithmAccess().getMlframeworkKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getMLChoiceAlgorithmAccess().getMlframeworkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLChoiceAlgorithm__Group__0__Impl"


    // $ANTLR start "rule__MLChoiceAlgorithm__Group__1"
    // InternalMml.g:1193:1: rule__MLChoiceAlgorithm__Group__1 : rule__MLChoiceAlgorithm__Group__1__Impl rule__MLChoiceAlgorithm__Group__2 ;
    public final void rule__MLChoiceAlgorithm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1197:1: ( rule__MLChoiceAlgorithm__Group__1__Impl rule__MLChoiceAlgorithm__Group__2 )
            // InternalMml.g:1198:2: rule__MLChoiceAlgorithm__Group__1__Impl rule__MLChoiceAlgorithm__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__MLChoiceAlgorithm__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLChoiceAlgorithm__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLChoiceAlgorithm__Group__1"


    // $ANTLR start "rule__MLChoiceAlgorithm__Group__1__Impl"
    // InternalMml.g:1205:1: rule__MLChoiceAlgorithm__Group__1__Impl : ( ( rule__MLChoiceAlgorithm__FrameworkAssignment_1 ) ) ;
    public final void rule__MLChoiceAlgorithm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1209:1: ( ( ( rule__MLChoiceAlgorithm__FrameworkAssignment_1 ) ) )
            // InternalMml.g:1210:1: ( ( rule__MLChoiceAlgorithm__FrameworkAssignment_1 ) )
            {
            // InternalMml.g:1210:1: ( ( rule__MLChoiceAlgorithm__FrameworkAssignment_1 ) )
            // InternalMml.g:1211:2: ( rule__MLChoiceAlgorithm__FrameworkAssignment_1 )
            {
             before(grammarAccess.getMLChoiceAlgorithmAccess().getFrameworkAssignment_1()); 
            // InternalMml.g:1212:2: ( rule__MLChoiceAlgorithm__FrameworkAssignment_1 )
            // InternalMml.g:1212:3: rule__MLChoiceAlgorithm__FrameworkAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MLChoiceAlgorithm__FrameworkAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMLChoiceAlgorithmAccess().getFrameworkAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLChoiceAlgorithm__Group__1__Impl"


    // $ANTLR start "rule__MLChoiceAlgorithm__Group__2"
    // InternalMml.g:1220:1: rule__MLChoiceAlgorithm__Group__2 : rule__MLChoiceAlgorithm__Group__2__Impl rule__MLChoiceAlgorithm__Group__3 ;
    public final void rule__MLChoiceAlgorithm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1224:1: ( rule__MLChoiceAlgorithm__Group__2__Impl rule__MLChoiceAlgorithm__Group__3 )
            // InternalMml.g:1225:2: rule__MLChoiceAlgorithm__Group__2__Impl rule__MLChoiceAlgorithm__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__MLChoiceAlgorithm__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLChoiceAlgorithm__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLChoiceAlgorithm__Group__2"


    // $ANTLR start "rule__MLChoiceAlgorithm__Group__2__Impl"
    // InternalMml.g:1232:1: rule__MLChoiceAlgorithm__Group__2__Impl : ( 'algorithm' ) ;
    public final void rule__MLChoiceAlgorithm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1236:1: ( ( 'algorithm' ) )
            // InternalMml.g:1237:1: ( 'algorithm' )
            {
            // InternalMml.g:1237:1: ( 'algorithm' )
            // InternalMml.g:1238:2: 'algorithm'
            {
             before(grammarAccess.getMLChoiceAlgorithmAccess().getAlgorithmKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getMLChoiceAlgorithmAccess().getAlgorithmKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLChoiceAlgorithm__Group__2__Impl"


    // $ANTLR start "rule__MLChoiceAlgorithm__Group__3"
    // InternalMml.g:1247:1: rule__MLChoiceAlgorithm__Group__3 : rule__MLChoiceAlgorithm__Group__3__Impl ;
    public final void rule__MLChoiceAlgorithm__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1251:1: ( rule__MLChoiceAlgorithm__Group__3__Impl )
            // InternalMml.g:1252:2: rule__MLChoiceAlgorithm__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MLChoiceAlgorithm__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLChoiceAlgorithm__Group__3"


    // $ANTLR start "rule__MLChoiceAlgorithm__Group__3__Impl"
    // InternalMml.g:1258:1: rule__MLChoiceAlgorithm__Group__3__Impl : ( ( rule__MLChoiceAlgorithm__AlgorithmAssignment_3 ) ) ;
    public final void rule__MLChoiceAlgorithm__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1262:1: ( ( ( rule__MLChoiceAlgorithm__AlgorithmAssignment_3 ) ) )
            // InternalMml.g:1263:1: ( ( rule__MLChoiceAlgorithm__AlgorithmAssignment_3 ) )
            {
            // InternalMml.g:1263:1: ( ( rule__MLChoiceAlgorithm__AlgorithmAssignment_3 ) )
            // InternalMml.g:1264:2: ( rule__MLChoiceAlgorithm__AlgorithmAssignment_3 )
            {
             before(grammarAccess.getMLChoiceAlgorithmAccess().getAlgorithmAssignment_3()); 
            // InternalMml.g:1265:2: ( rule__MLChoiceAlgorithm__AlgorithmAssignment_3 )
            // InternalMml.g:1265:3: rule__MLChoiceAlgorithm__AlgorithmAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MLChoiceAlgorithm__AlgorithmAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMLChoiceAlgorithmAccess().getAlgorithmAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLChoiceAlgorithm__Group__3__Impl"


    // $ANTLR start "rule__SVM__Group__0"
    // InternalMml.g:1274:1: rule__SVM__Group__0 : rule__SVM__Group__0__Impl rule__SVM__Group__1 ;
    public final void rule__SVM__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1278:1: ( rule__SVM__Group__0__Impl rule__SVM__Group__1 )
            // InternalMml.g:1279:2: rule__SVM__Group__0__Impl rule__SVM__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__SVM__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVM__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVM__Group__0"


    // $ANTLR start "rule__SVM__Group__0__Impl"
    // InternalMml.g:1286:1: rule__SVM__Group__0__Impl : ( () ) ;
    public final void rule__SVM__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1290:1: ( ( () ) )
            // InternalMml.g:1291:1: ( () )
            {
            // InternalMml.g:1291:1: ( () )
            // InternalMml.g:1292:2: ()
            {
             before(grammarAccess.getSVMAccess().getSVMAction_0()); 
            // InternalMml.g:1293:2: ()
            // InternalMml.g:1293:3: 
            {
            }

             after(grammarAccess.getSVMAccess().getSVMAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVM__Group__0__Impl"


    // $ANTLR start "rule__SVM__Group__1"
    // InternalMml.g:1301:1: rule__SVM__Group__1 : rule__SVM__Group__1__Impl rule__SVM__Group__2 ;
    public final void rule__SVM__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1305:1: ( rule__SVM__Group__1__Impl rule__SVM__Group__2 )
            // InternalMml.g:1306:2: rule__SVM__Group__1__Impl rule__SVM__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__SVM__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVM__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVM__Group__1"


    // $ANTLR start "rule__SVM__Group__1__Impl"
    // InternalMml.g:1313:1: rule__SVM__Group__1__Impl : ( 'SVM' ) ;
    public final void rule__SVM__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1317:1: ( ( 'SVM' ) )
            // InternalMml.g:1318:1: ( 'SVM' )
            {
            // InternalMml.g:1318:1: ( 'SVM' )
            // InternalMml.g:1319:2: 'SVM'
            {
             before(grammarAccess.getSVMAccess().getSVMKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSVMAccess().getSVMKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVM__Group__1__Impl"


    // $ANTLR start "rule__SVM__Group__2"
    // InternalMml.g:1328:1: rule__SVM__Group__2 : rule__SVM__Group__2__Impl rule__SVM__Group__3 ;
    public final void rule__SVM__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1332:1: ( rule__SVM__Group__2__Impl rule__SVM__Group__3 )
            // InternalMml.g:1333:2: rule__SVM__Group__2__Impl rule__SVM__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__SVM__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVM__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVM__Group__2"


    // $ANTLR start "rule__SVM__Group__2__Impl"
    // InternalMml.g:1340:1: rule__SVM__Group__2__Impl : ( ( rule__SVM__Group_2__0 )? ) ;
    public final void rule__SVM__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1344:1: ( ( ( rule__SVM__Group_2__0 )? ) )
            // InternalMml.g:1345:1: ( ( rule__SVM__Group_2__0 )? )
            {
            // InternalMml.g:1345:1: ( ( rule__SVM__Group_2__0 )? )
            // InternalMml.g:1346:2: ( rule__SVM__Group_2__0 )?
            {
             before(grammarAccess.getSVMAccess().getGroup_2()); 
            // InternalMml.g:1347:2: ( rule__SVM__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==41) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMml.g:1347:3: rule__SVM__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SVM__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSVMAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVM__Group__2__Impl"


    // $ANTLR start "rule__SVM__Group__3"
    // InternalMml.g:1355:1: rule__SVM__Group__3 : rule__SVM__Group__3__Impl rule__SVM__Group__4 ;
    public final void rule__SVM__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1359:1: ( rule__SVM__Group__3__Impl rule__SVM__Group__4 )
            // InternalMml.g:1360:2: rule__SVM__Group__3__Impl rule__SVM__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__SVM__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVM__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVM__Group__3"


    // $ANTLR start "rule__SVM__Group__3__Impl"
    // InternalMml.g:1367:1: rule__SVM__Group__3__Impl : ( ( rule__SVM__Group_3__0 )? ) ;
    public final void rule__SVM__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1371:1: ( ( ( rule__SVM__Group_3__0 )? ) )
            // InternalMml.g:1372:1: ( ( rule__SVM__Group_3__0 )? )
            {
            // InternalMml.g:1372:1: ( ( rule__SVM__Group_3__0 )? )
            // InternalMml.g:1373:2: ( rule__SVM__Group_3__0 )?
            {
             before(grammarAccess.getSVMAccess().getGroup_3()); 
            // InternalMml.g:1374:2: ( rule__SVM__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==42) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMml.g:1374:3: rule__SVM__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SVM__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSVMAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVM__Group__3__Impl"


    // $ANTLR start "rule__SVM__Group__4"
    // InternalMml.g:1382:1: rule__SVM__Group__4 : rule__SVM__Group__4__Impl rule__SVM__Group__5 ;
    public final void rule__SVM__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1386:1: ( rule__SVM__Group__4__Impl rule__SVM__Group__5 )
            // InternalMml.g:1387:2: rule__SVM__Group__4__Impl rule__SVM__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__SVM__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVM__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVM__Group__4"


    // $ANTLR start "rule__SVM__Group__4__Impl"
    // InternalMml.g:1394:1: rule__SVM__Group__4__Impl : ( ( rule__SVM__Group_4__0 )? ) ;
    public final void rule__SVM__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1398:1: ( ( ( rule__SVM__Group_4__0 )? ) )
            // InternalMml.g:1399:1: ( ( rule__SVM__Group_4__0 )? )
            {
            // InternalMml.g:1399:1: ( ( rule__SVM__Group_4__0 )? )
            // InternalMml.g:1400:2: ( rule__SVM__Group_4__0 )?
            {
             before(grammarAccess.getSVMAccess().getGroup_4()); 
            // InternalMml.g:1401:2: ( rule__SVM__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==54) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMml.g:1401:3: rule__SVM__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SVM__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSVMAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVM__Group__4__Impl"


    // $ANTLR start "rule__SVM__Group__5"
    // InternalMml.g:1409:1: rule__SVM__Group__5 : rule__SVM__Group__5__Impl ;
    public final void rule__SVM__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1413:1: ( rule__SVM__Group__5__Impl )
            // InternalMml.g:1414:2: rule__SVM__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SVM__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVM__Group__5"


    // $ANTLR start "rule__SVM__Group__5__Impl"
    // InternalMml.g:1420:1: rule__SVM__Group__5__Impl : ( ( rule__SVM__Group_5__0 )? ) ;
    public final void rule__SVM__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1424:1: ( ( ( rule__SVM__Group_5__0 )? ) )
            // InternalMml.g:1425:1: ( ( rule__SVM__Group_5__0 )? )
            {
            // InternalMml.g:1425:1: ( ( rule__SVM__Group_5__0 )? )
            // InternalMml.g:1426:2: ( rule__SVM__Group_5__0 )?
            {
             before(grammarAccess.getSVMAccess().getGroup_5()); 
            // InternalMml.g:1427:2: ( rule__SVM__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==55) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMml.g:1427:3: rule__SVM__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SVM__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSVMAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVM__Group__5__Impl"


    // $ANTLR start "rule__SVM__Group_2__0"
    // InternalMml.g:1436:1: rule__SVM__Group_2__0 : rule__SVM__Group_2__0__Impl rule__SVM__Group_2__1 ;
    public final void rule__SVM__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1440:1: ( rule__SVM__Group_2__0__Impl rule__SVM__Group_2__1 )
            // InternalMml.g:1441:2: rule__SVM__Group_2__0__Impl rule__SVM__Group_2__1
            {
            pushFollow(FOLLOW_14);
            rule__SVM__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVM__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVM__Group_2__0"


    // $ANTLR start "rule__SVM__Group_2__0__Impl"
    // InternalMml.g:1448:1: rule__SVM__Group_2__0__Impl : ( 'gamma=' ) ;
    public final void rule__SVM__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1452:1: ( ( 'gamma=' ) )
            // InternalMml.g:1453:1: ( 'gamma=' )
            {
            // InternalMml.g:1453:1: ( 'gamma=' )
            // InternalMml.g:1454:2: 'gamma='
            {
             before(grammarAccess.getSVMAccess().getGammaKeyword_2_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getSVMAccess().getGammaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVM__Group_2__0__Impl"


    // $ANTLR start "rule__SVM__Group_2__1"
    // InternalMml.g:1463:1: rule__SVM__Group_2__1 : rule__SVM__Group_2__1__Impl ;
    public final void rule__SVM__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1467:1: ( rule__SVM__Group_2__1__Impl )
            // InternalMml.g:1468:2: rule__SVM__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SVM__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVM__Group_2__1"


    // $ANTLR start "rule__SVM__Group_2__1__Impl"
    // InternalMml.g:1474:1: rule__SVM__Group_2__1__Impl : ( ( rule__SVM__GammaAssignment_2_1 ) ) ;
    public final void rule__SVM__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1478:1: ( ( ( rule__SVM__GammaAssignment_2_1 ) ) )
            // InternalMml.g:1479:1: ( ( rule__SVM__GammaAssignment_2_1 ) )
            {
            // InternalMml.g:1479:1: ( ( rule__SVM__GammaAssignment_2_1 ) )
            // InternalMml.g:1480:2: ( rule__SVM__GammaAssignment_2_1 )
            {
             before(grammarAccess.getSVMAccess().getGammaAssignment_2_1()); 
            // InternalMml.g:1481:2: ( rule__SVM__GammaAssignment_2_1 )
            // InternalMml.g:1481:3: rule__SVM__GammaAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SVM__GammaAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSVMAccess().getGammaAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVM__Group_2__1__Impl"


    // $ANTLR start "rule__SVM__Group_3__0"
    // InternalMml.g:1490:1: rule__SVM__Group_3__0 : rule__SVM__Group_3__0__Impl rule__SVM__Group_3__1 ;
    public final void rule__SVM__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1494:1: ( rule__SVM__Group_3__0__Impl rule__SVM__Group_3__1 )
            // InternalMml.g:1495:2: rule__SVM__Group_3__0__Impl rule__SVM__Group_3__1
            {
            pushFollow(FOLLOW_14);
            rule__SVM__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVM__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVM__Group_3__0"


    // $ANTLR start "rule__SVM__Group_3__0__Impl"
    // InternalMml.g:1502:1: rule__SVM__Group_3__0__Impl : ( 'C=' ) ;
    public final void rule__SVM__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1506:1: ( ( 'C=' ) )
            // InternalMml.g:1507:1: ( 'C=' )
            {
            // InternalMml.g:1507:1: ( 'C=' )
            // InternalMml.g:1508:2: 'C='
            {
             before(grammarAccess.getSVMAccess().getCKeyword_3_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getSVMAccess().getCKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVM__Group_3__0__Impl"


    // $ANTLR start "rule__SVM__Group_3__1"
    // InternalMml.g:1517:1: rule__SVM__Group_3__1 : rule__SVM__Group_3__1__Impl ;
    public final void rule__SVM__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1521:1: ( rule__SVM__Group_3__1__Impl )
            // InternalMml.g:1522:2: rule__SVM__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SVM__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVM__Group_3__1"


    // $ANTLR start "rule__SVM__Group_3__1__Impl"
    // InternalMml.g:1528:1: rule__SVM__Group_3__1__Impl : ( ( rule__SVM__CAssignment_3_1 ) ) ;
    public final void rule__SVM__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1532:1: ( ( ( rule__SVM__CAssignment_3_1 ) ) )
            // InternalMml.g:1533:1: ( ( rule__SVM__CAssignment_3_1 ) )
            {
            // InternalMml.g:1533:1: ( ( rule__SVM__CAssignment_3_1 ) )
            // InternalMml.g:1534:2: ( rule__SVM__CAssignment_3_1 )
            {
             before(grammarAccess.getSVMAccess().getCAssignment_3_1()); 
            // InternalMml.g:1535:2: ( rule__SVM__CAssignment_3_1 )
            // InternalMml.g:1535:3: rule__SVM__CAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SVM__CAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSVMAccess().getCAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVM__Group_3__1__Impl"


    // $ANTLR start "rule__SVM__Group_4__0"
    // InternalMml.g:1544:1: rule__SVM__Group_4__0 : rule__SVM__Group_4__0__Impl rule__SVM__Group_4__1 ;
    public final void rule__SVM__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1548:1: ( rule__SVM__Group_4__0__Impl rule__SVM__Group_4__1 )
            // InternalMml.g:1549:2: rule__SVM__Group_4__0__Impl rule__SVM__Group_4__1
            {
            pushFollow(FOLLOW_15);
            rule__SVM__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVM__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVM__Group_4__0"


    // $ANTLR start "rule__SVM__Group_4__0__Impl"
    // InternalMml.g:1556:1: rule__SVM__Group_4__0__Impl : ( ( rule__SVM__KernelSpecifiedAssignment_4_0 ) ) ;
    public final void rule__SVM__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1560:1: ( ( ( rule__SVM__KernelSpecifiedAssignment_4_0 ) ) )
            // InternalMml.g:1561:1: ( ( rule__SVM__KernelSpecifiedAssignment_4_0 ) )
            {
            // InternalMml.g:1561:1: ( ( rule__SVM__KernelSpecifiedAssignment_4_0 ) )
            // InternalMml.g:1562:2: ( rule__SVM__KernelSpecifiedAssignment_4_0 )
            {
             before(grammarAccess.getSVMAccess().getKernelSpecifiedAssignment_4_0()); 
            // InternalMml.g:1563:2: ( rule__SVM__KernelSpecifiedAssignment_4_0 )
            // InternalMml.g:1563:3: rule__SVM__KernelSpecifiedAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__SVM__KernelSpecifiedAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getSVMAccess().getKernelSpecifiedAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVM__Group_4__0__Impl"


    // $ANTLR start "rule__SVM__Group_4__1"
    // InternalMml.g:1571:1: rule__SVM__Group_4__1 : rule__SVM__Group_4__1__Impl ;
    public final void rule__SVM__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1575:1: ( rule__SVM__Group_4__1__Impl )
            // InternalMml.g:1576:2: rule__SVM__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SVM__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVM__Group_4__1"


    // $ANTLR start "rule__SVM__Group_4__1__Impl"
    // InternalMml.g:1582:1: rule__SVM__Group_4__1__Impl : ( ( rule__SVM__KernelAssignment_4_1 ) ) ;
    public final void rule__SVM__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1586:1: ( ( ( rule__SVM__KernelAssignment_4_1 ) ) )
            // InternalMml.g:1587:1: ( ( rule__SVM__KernelAssignment_4_1 ) )
            {
            // InternalMml.g:1587:1: ( ( rule__SVM__KernelAssignment_4_1 ) )
            // InternalMml.g:1588:2: ( rule__SVM__KernelAssignment_4_1 )
            {
             before(grammarAccess.getSVMAccess().getKernelAssignment_4_1()); 
            // InternalMml.g:1589:2: ( rule__SVM__KernelAssignment_4_1 )
            // InternalMml.g:1589:3: rule__SVM__KernelAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__SVM__KernelAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSVMAccess().getKernelAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVM__Group_4__1__Impl"


    // $ANTLR start "rule__SVM__Group_5__0"
    // InternalMml.g:1598:1: rule__SVM__Group_5__0 : rule__SVM__Group_5__0__Impl rule__SVM__Group_5__1 ;
    public final void rule__SVM__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1602:1: ( rule__SVM__Group_5__0__Impl rule__SVM__Group_5__1 )
            // InternalMml.g:1603:2: rule__SVM__Group_5__0__Impl rule__SVM__Group_5__1
            {
            pushFollow(FOLLOW_16);
            rule__SVM__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVM__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVM__Group_5__0"


    // $ANTLR start "rule__SVM__Group_5__0__Impl"
    // InternalMml.g:1610:1: rule__SVM__Group_5__0__Impl : ( ( rule__SVM__ClassificationSpecifiedAssignment_5_0 ) ) ;
    public final void rule__SVM__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1614:1: ( ( ( rule__SVM__ClassificationSpecifiedAssignment_5_0 ) ) )
            // InternalMml.g:1615:1: ( ( rule__SVM__ClassificationSpecifiedAssignment_5_0 ) )
            {
            // InternalMml.g:1615:1: ( ( rule__SVM__ClassificationSpecifiedAssignment_5_0 ) )
            // InternalMml.g:1616:2: ( rule__SVM__ClassificationSpecifiedAssignment_5_0 )
            {
             before(grammarAccess.getSVMAccess().getClassificationSpecifiedAssignment_5_0()); 
            // InternalMml.g:1617:2: ( rule__SVM__ClassificationSpecifiedAssignment_5_0 )
            // InternalMml.g:1617:3: rule__SVM__ClassificationSpecifiedAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__SVM__ClassificationSpecifiedAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getSVMAccess().getClassificationSpecifiedAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVM__Group_5__0__Impl"


    // $ANTLR start "rule__SVM__Group_5__1"
    // InternalMml.g:1625:1: rule__SVM__Group_5__1 : rule__SVM__Group_5__1__Impl ;
    public final void rule__SVM__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1629:1: ( rule__SVM__Group_5__1__Impl )
            // InternalMml.g:1630:2: rule__SVM__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SVM__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVM__Group_5__1"


    // $ANTLR start "rule__SVM__Group_5__1__Impl"
    // InternalMml.g:1636:1: rule__SVM__Group_5__1__Impl : ( ( rule__SVM__SvmclassificationAssignment_5_1 ) ) ;
    public final void rule__SVM__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1640:1: ( ( ( rule__SVM__SvmclassificationAssignment_5_1 ) ) )
            // InternalMml.g:1641:1: ( ( rule__SVM__SvmclassificationAssignment_5_1 ) )
            {
            // InternalMml.g:1641:1: ( ( rule__SVM__SvmclassificationAssignment_5_1 ) )
            // InternalMml.g:1642:2: ( rule__SVM__SvmclassificationAssignment_5_1 )
            {
             before(grammarAccess.getSVMAccess().getSvmclassificationAssignment_5_1()); 
            // InternalMml.g:1643:2: ( rule__SVM__SvmclassificationAssignment_5_1 )
            // InternalMml.g:1643:3: rule__SVM__SvmclassificationAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__SVM__SvmclassificationAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSVMAccess().getSvmclassificationAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVM__Group_5__1__Impl"


    // $ANTLR start "rule__DT__Group__0"
    // InternalMml.g:1652:1: rule__DT__Group__0 : rule__DT__Group__0__Impl rule__DT__Group__1 ;
    public final void rule__DT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1656:1: ( rule__DT__Group__0__Impl rule__DT__Group__1 )
            // InternalMml.g:1657:2: rule__DT__Group__0__Impl rule__DT__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__DT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DT__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DT__Group__0"


    // $ANTLR start "rule__DT__Group__0__Impl"
    // InternalMml.g:1664:1: rule__DT__Group__0__Impl : ( () ) ;
    public final void rule__DT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1668:1: ( ( () ) )
            // InternalMml.g:1669:1: ( () )
            {
            // InternalMml.g:1669:1: ( () )
            // InternalMml.g:1670:2: ()
            {
             before(grammarAccess.getDTAccess().getDTAction_0()); 
            // InternalMml.g:1671:2: ()
            // InternalMml.g:1671:3: 
            {
            }

             after(grammarAccess.getDTAccess().getDTAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DT__Group__0__Impl"


    // $ANTLR start "rule__DT__Group__1"
    // InternalMml.g:1679:1: rule__DT__Group__1 : rule__DT__Group__1__Impl rule__DT__Group__2 ;
    public final void rule__DT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1683:1: ( rule__DT__Group__1__Impl rule__DT__Group__2 )
            // InternalMml.g:1684:2: rule__DT__Group__1__Impl rule__DT__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__DT__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DT__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DT__Group__1"


    // $ANTLR start "rule__DT__Group__1__Impl"
    // InternalMml.g:1691:1: rule__DT__Group__1__Impl : ( ( rule__DT__Alternatives_1 ) ) ;
    public final void rule__DT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1695:1: ( ( ( rule__DT__Alternatives_1 ) ) )
            // InternalMml.g:1696:1: ( ( rule__DT__Alternatives_1 ) )
            {
            // InternalMml.g:1696:1: ( ( rule__DT__Alternatives_1 ) )
            // InternalMml.g:1697:2: ( rule__DT__Alternatives_1 )
            {
             before(grammarAccess.getDTAccess().getAlternatives_1()); 
            // InternalMml.g:1698:2: ( rule__DT__Alternatives_1 )
            // InternalMml.g:1698:3: rule__DT__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__DT__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getDTAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DT__Group__1__Impl"


    // $ANTLR start "rule__DT__Group__2"
    // InternalMml.g:1706:1: rule__DT__Group__2 : rule__DT__Group__2__Impl ;
    public final void rule__DT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1710:1: ( rule__DT__Group__2__Impl )
            // InternalMml.g:1711:2: rule__DT__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DT__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DT__Group__2"


    // $ANTLR start "rule__DT__Group__2__Impl"
    // InternalMml.g:1717:1: rule__DT__Group__2__Impl : ( ( rule__DT__Max_depthAssignment_2 )? ) ;
    public final void rule__DT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1721:1: ( ( ( rule__DT__Max_depthAssignment_2 )? ) )
            // InternalMml.g:1722:1: ( ( rule__DT__Max_depthAssignment_2 )? )
            {
            // InternalMml.g:1722:1: ( ( rule__DT__Max_depthAssignment_2 )? )
            // InternalMml.g:1723:2: ( rule__DT__Max_depthAssignment_2 )?
            {
             before(grammarAccess.getDTAccess().getMax_depthAssignment_2()); 
            // InternalMml.g:1724:2: ( rule__DT__Max_depthAssignment_2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_INT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMml.g:1724:3: rule__DT__Max_depthAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__DT__Max_depthAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDTAccess().getMax_depthAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DT__Group__2__Impl"


    // $ANTLR start "rule__RandomForest__Group__0"
    // InternalMml.g:1733:1: rule__RandomForest__Group__0 : rule__RandomForest__Group__0__Impl rule__RandomForest__Group__1 ;
    public final void rule__RandomForest__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1737:1: ( rule__RandomForest__Group__0__Impl rule__RandomForest__Group__1 )
            // InternalMml.g:1738:2: rule__RandomForest__Group__0__Impl rule__RandomForest__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__RandomForest__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RandomForest__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RandomForest__Group__0"


    // $ANTLR start "rule__RandomForest__Group__0__Impl"
    // InternalMml.g:1745:1: rule__RandomForest__Group__0__Impl : ( () ) ;
    public final void rule__RandomForest__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1749:1: ( ( () ) )
            // InternalMml.g:1750:1: ( () )
            {
            // InternalMml.g:1750:1: ( () )
            // InternalMml.g:1751:2: ()
            {
             before(grammarAccess.getRandomForestAccess().getRandomForestAction_0()); 
            // InternalMml.g:1752:2: ()
            // InternalMml.g:1752:3: 
            {
            }

             after(grammarAccess.getRandomForestAccess().getRandomForestAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RandomForest__Group__0__Impl"


    // $ANTLR start "rule__RandomForest__Group__1"
    // InternalMml.g:1760:1: rule__RandomForest__Group__1 : rule__RandomForest__Group__1__Impl ;
    public final void rule__RandomForest__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1764:1: ( rule__RandomForest__Group__1__Impl )
            // InternalMml.g:1765:2: rule__RandomForest__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RandomForest__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RandomForest__Group__1"


    // $ANTLR start "rule__RandomForest__Group__1__Impl"
    // InternalMml.g:1771:1: rule__RandomForest__Group__1__Impl : ( ( rule__RandomForest__Alternatives_1 ) ) ;
    public final void rule__RandomForest__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1775:1: ( ( ( rule__RandomForest__Alternatives_1 ) ) )
            // InternalMml.g:1776:1: ( ( rule__RandomForest__Alternatives_1 ) )
            {
            // InternalMml.g:1776:1: ( ( rule__RandomForest__Alternatives_1 ) )
            // InternalMml.g:1777:2: ( rule__RandomForest__Alternatives_1 )
            {
             before(grammarAccess.getRandomForestAccess().getAlternatives_1()); 
            // InternalMml.g:1778:2: ( rule__RandomForest__Alternatives_1 )
            // InternalMml.g:1778:3: rule__RandomForest__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__RandomForest__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getRandomForestAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RandomForest__Group__1__Impl"


    // $ANTLR start "rule__LogisticRegression__Group__0"
    // InternalMml.g:1787:1: rule__LogisticRegression__Group__0 : rule__LogisticRegression__Group__0__Impl rule__LogisticRegression__Group__1 ;
    public final void rule__LogisticRegression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1791:1: ( rule__LogisticRegression__Group__0__Impl rule__LogisticRegression__Group__1 )
            // InternalMml.g:1792:2: rule__LogisticRegression__Group__0__Impl rule__LogisticRegression__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__LogisticRegression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogisticRegression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogisticRegression__Group__0"


    // $ANTLR start "rule__LogisticRegression__Group__0__Impl"
    // InternalMml.g:1799:1: rule__LogisticRegression__Group__0__Impl : ( () ) ;
    public final void rule__LogisticRegression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1803:1: ( ( () ) )
            // InternalMml.g:1804:1: ( () )
            {
            // InternalMml.g:1804:1: ( () )
            // InternalMml.g:1805:2: ()
            {
             before(grammarAccess.getLogisticRegressionAccess().getLogisticRegressionAction_0()); 
            // InternalMml.g:1806:2: ()
            // InternalMml.g:1806:3: 
            {
            }

             after(grammarAccess.getLogisticRegressionAccess().getLogisticRegressionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogisticRegression__Group__0__Impl"


    // $ANTLR start "rule__LogisticRegression__Group__1"
    // InternalMml.g:1814:1: rule__LogisticRegression__Group__1 : rule__LogisticRegression__Group__1__Impl ;
    public final void rule__LogisticRegression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1818:1: ( rule__LogisticRegression__Group__1__Impl )
            // InternalMml.g:1819:2: rule__LogisticRegression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogisticRegression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogisticRegression__Group__1"


    // $ANTLR start "rule__LogisticRegression__Group__1__Impl"
    // InternalMml.g:1825:1: rule__LogisticRegression__Group__1__Impl : ( 'LogisticRegression' ) ;
    public final void rule__LogisticRegression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1829:1: ( ( 'LogisticRegression' ) )
            // InternalMml.g:1830:1: ( 'LogisticRegression' )
            {
            // InternalMml.g:1830:1: ( 'LogisticRegression' )
            // InternalMml.g:1831:2: 'LogisticRegression'
            {
             before(grammarAccess.getLogisticRegressionAccess().getLogisticRegressionKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getLogisticRegressionAccess().getLogisticRegressionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogisticRegression__Group__1__Impl"


    // $ANTLR start "rule__FLOAT__Group__0"
    // InternalMml.g:1841:1: rule__FLOAT__Group__0 : rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1 ;
    public final void rule__FLOAT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1845:1: ( rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1 )
            // InternalMml.g:1846:2: rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__FLOAT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FLOAT__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__0"


    // $ANTLR start "rule__FLOAT__Group__0__Impl"
    // InternalMml.g:1853:1: rule__FLOAT__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__FLOAT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1857:1: ( ( RULE_INT ) )
            // InternalMml.g:1858:1: ( RULE_INT )
            {
            // InternalMml.g:1858:1: ( RULE_INT )
            // InternalMml.g:1859:2: RULE_INT
            {
             before(grammarAccess.getFLOATAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFLOATAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__0__Impl"


    // $ANTLR start "rule__FLOAT__Group__1"
    // InternalMml.g:1868:1: rule__FLOAT__Group__1 : rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2 ;
    public final void rule__FLOAT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1872:1: ( rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2 )
            // InternalMml.g:1873:2: rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__FLOAT__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FLOAT__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__1"


    // $ANTLR start "rule__FLOAT__Group__1__Impl"
    // InternalMml.g:1880:1: rule__FLOAT__Group__1__Impl : ( '.' ) ;
    public final void rule__FLOAT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1884:1: ( ( '.' ) )
            // InternalMml.g:1885:1: ( '.' )
            {
            // InternalMml.g:1885:1: ( '.' )
            // InternalMml.g:1886:2: '.'
            {
             before(grammarAccess.getFLOATAccess().getFullStopKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getFLOATAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__1__Impl"


    // $ANTLR start "rule__FLOAT__Group__2"
    // InternalMml.g:1895:1: rule__FLOAT__Group__2 : rule__FLOAT__Group__2__Impl ;
    public final void rule__FLOAT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1899:1: ( rule__FLOAT__Group__2__Impl )
            // InternalMml.g:1900:2: rule__FLOAT__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FLOAT__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__2"


    // $ANTLR start "rule__FLOAT__Group__2__Impl"
    // InternalMml.g:1906:1: rule__FLOAT__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__FLOAT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1910:1: ( ( RULE_INT ) )
            // InternalMml.g:1911:1: ( RULE_INT )
            {
            // InternalMml.g:1911:1: ( RULE_INT )
            // InternalMml.g:1912:2: RULE_INT
            {
             before(grammarAccess.getFLOATAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFLOATAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__2__Impl"


    // $ANTLR start "rule__RFormula__Group__0"
    // InternalMml.g:1922:1: rule__RFormula__Group__0 : rule__RFormula__Group__0__Impl rule__RFormula__Group__1 ;
    public final void rule__RFormula__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1926:1: ( rule__RFormula__Group__0__Impl rule__RFormula__Group__1 )
            // InternalMml.g:1927:2: rule__RFormula__Group__0__Impl rule__RFormula__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__RFormula__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RFormula__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RFormula__Group__0"


    // $ANTLR start "rule__RFormula__Group__0__Impl"
    // InternalMml.g:1934:1: rule__RFormula__Group__0__Impl : ( 'formula' ) ;
    public final void rule__RFormula__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1938:1: ( ( 'formula' ) )
            // InternalMml.g:1939:1: ( 'formula' )
            {
            // InternalMml.g:1939:1: ( 'formula' )
            // InternalMml.g:1940:2: 'formula'
            {
             before(grammarAccess.getRFormulaAccess().getFormulaKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getRFormulaAccess().getFormulaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RFormula__Group__0__Impl"


    // $ANTLR start "rule__RFormula__Group__1"
    // InternalMml.g:1949:1: rule__RFormula__Group__1 : rule__RFormula__Group__1__Impl rule__RFormula__Group__2 ;
    public final void rule__RFormula__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1953:1: ( rule__RFormula__Group__1__Impl rule__RFormula__Group__2 )
            // InternalMml.g:1954:2: rule__RFormula__Group__1__Impl rule__RFormula__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__RFormula__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RFormula__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RFormula__Group__1"


    // $ANTLR start "rule__RFormula__Group__1__Impl"
    // InternalMml.g:1961:1: rule__RFormula__Group__1__Impl : ( ( rule__RFormula__Group_1__0 )? ) ;
    public final void rule__RFormula__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1965:1: ( ( ( rule__RFormula__Group_1__0 )? ) )
            // InternalMml.g:1966:1: ( ( rule__RFormula__Group_1__0 )? )
            {
            // InternalMml.g:1966:1: ( ( rule__RFormula__Group_1__0 )? )
            // InternalMml.g:1967:2: ( rule__RFormula__Group_1__0 )?
            {
             before(grammarAccess.getRFormulaAccess().getGroup_1()); 
            // InternalMml.g:1968:2: ( rule__RFormula__Group_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_INT) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==46) ) {
                    alt20=1;
                }
            }
            else if ( (LA20_0==RULE_STRING) ) {
                int LA20_2 = input.LA(2);

                if ( (LA20_2==46) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // InternalMml.g:1968:3: rule__RFormula__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RFormula__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRFormulaAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RFormula__Group__1__Impl"


    // $ANTLR start "rule__RFormula__Group__2"
    // InternalMml.g:1976:1: rule__RFormula__Group__2 : rule__RFormula__Group__2__Impl ;
    public final void rule__RFormula__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1980:1: ( rule__RFormula__Group__2__Impl )
            // InternalMml.g:1981:2: rule__RFormula__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RFormula__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RFormula__Group__2"


    // $ANTLR start "rule__RFormula__Group__2__Impl"
    // InternalMml.g:1987:1: rule__RFormula__Group__2__Impl : ( ( rule__RFormula__PredictorsAssignment_2 ) ) ;
    public final void rule__RFormula__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1991:1: ( ( ( rule__RFormula__PredictorsAssignment_2 ) ) )
            // InternalMml.g:1992:1: ( ( rule__RFormula__PredictorsAssignment_2 ) )
            {
            // InternalMml.g:1992:1: ( ( rule__RFormula__PredictorsAssignment_2 ) )
            // InternalMml.g:1993:2: ( rule__RFormula__PredictorsAssignment_2 )
            {
             before(grammarAccess.getRFormulaAccess().getPredictorsAssignment_2()); 
            // InternalMml.g:1994:2: ( rule__RFormula__PredictorsAssignment_2 )
            // InternalMml.g:1994:3: rule__RFormula__PredictorsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RFormula__PredictorsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRFormulaAccess().getPredictorsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RFormula__Group__2__Impl"


    // $ANTLR start "rule__RFormula__Group_1__0"
    // InternalMml.g:2003:1: rule__RFormula__Group_1__0 : rule__RFormula__Group_1__0__Impl rule__RFormula__Group_1__1 ;
    public final void rule__RFormula__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2007:1: ( rule__RFormula__Group_1__0__Impl rule__RFormula__Group_1__1 )
            // InternalMml.g:2008:2: rule__RFormula__Group_1__0__Impl rule__RFormula__Group_1__1
            {
            pushFollow(FOLLOW_21);
            rule__RFormula__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RFormula__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RFormula__Group_1__0"


    // $ANTLR start "rule__RFormula__Group_1__0__Impl"
    // InternalMml.g:2015:1: rule__RFormula__Group_1__0__Impl : ( ( rule__RFormula__PredictiveAssignment_1_0 ) ) ;
    public final void rule__RFormula__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2019:1: ( ( ( rule__RFormula__PredictiveAssignment_1_0 ) ) )
            // InternalMml.g:2020:1: ( ( rule__RFormula__PredictiveAssignment_1_0 ) )
            {
            // InternalMml.g:2020:1: ( ( rule__RFormula__PredictiveAssignment_1_0 ) )
            // InternalMml.g:2021:2: ( rule__RFormula__PredictiveAssignment_1_0 )
            {
             before(grammarAccess.getRFormulaAccess().getPredictiveAssignment_1_0()); 
            // InternalMml.g:2022:2: ( rule__RFormula__PredictiveAssignment_1_0 )
            // InternalMml.g:2022:3: rule__RFormula__PredictiveAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__RFormula__PredictiveAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getRFormulaAccess().getPredictiveAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RFormula__Group_1__0__Impl"


    // $ANTLR start "rule__RFormula__Group_1__1"
    // InternalMml.g:2030:1: rule__RFormula__Group_1__1 : rule__RFormula__Group_1__1__Impl ;
    public final void rule__RFormula__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2034:1: ( rule__RFormula__Group_1__1__Impl )
            // InternalMml.g:2035:2: rule__RFormula__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RFormula__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RFormula__Group_1__1"


    // $ANTLR start "rule__RFormula__Group_1__1__Impl"
    // InternalMml.g:2041:1: rule__RFormula__Group_1__1__Impl : ( '~' ) ;
    public final void rule__RFormula__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2045:1: ( ( '~' ) )
            // InternalMml.g:2046:1: ( '~' )
            {
            // InternalMml.g:2046:1: ( '~' )
            // InternalMml.g:2047:2: '~'
            {
             before(grammarAccess.getRFormulaAccess().getTildeKeyword_1_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getRFormulaAccess().getTildeKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RFormula__Group_1__1__Impl"


    // $ANTLR start "rule__PredictorVariables__Group__0"
    // InternalMml.g:2057:1: rule__PredictorVariables__Group__0 : rule__PredictorVariables__Group__0__Impl rule__PredictorVariables__Group__1 ;
    public final void rule__PredictorVariables__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2061:1: ( rule__PredictorVariables__Group__0__Impl rule__PredictorVariables__Group__1 )
            // InternalMml.g:2062:2: rule__PredictorVariables__Group__0__Impl rule__PredictorVariables__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__PredictorVariables__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredictorVariables__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictorVariables__Group__0"


    // $ANTLR start "rule__PredictorVariables__Group__0__Impl"
    // InternalMml.g:2069:1: rule__PredictorVariables__Group__0__Impl : ( ( rule__PredictorVariables__VarsAssignment_0 ) ) ;
    public final void rule__PredictorVariables__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2073:1: ( ( ( rule__PredictorVariables__VarsAssignment_0 ) ) )
            // InternalMml.g:2074:1: ( ( rule__PredictorVariables__VarsAssignment_0 ) )
            {
            // InternalMml.g:2074:1: ( ( rule__PredictorVariables__VarsAssignment_0 ) )
            // InternalMml.g:2075:2: ( rule__PredictorVariables__VarsAssignment_0 )
            {
             before(grammarAccess.getPredictorVariablesAccess().getVarsAssignment_0()); 
            // InternalMml.g:2076:2: ( rule__PredictorVariables__VarsAssignment_0 )
            // InternalMml.g:2076:3: rule__PredictorVariables__VarsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PredictorVariables__VarsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPredictorVariablesAccess().getVarsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictorVariables__Group__0__Impl"


    // $ANTLR start "rule__PredictorVariables__Group__1"
    // InternalMml.g:2084:1: rule__PredictorVariables__Group__1 : rule__PredictorVariables__Group__1__Impl ;
    public final void rule__PredictorVariables__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2088:1: ( rule__PredictorVariables__Group__1__Impl )
            // InternalMml.g:2089:2: rule__PredictorVariables__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PredictorVariables__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictorVariables__Group__1"


    // $ANTLR start "rule__PredictorVariables__Group__1__Impl"
    // InternalMml.g:2095:1: rule__PredictorVariables__Group__1__Impl : ( ( rule__PredictorVariables__Group_1__0 )* ) ;
    public final void rule__PredictorVariables__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2099:1: ( ( ( rule__PredictorVariables__Group_1__0 )* ) )
            // InternalMml.g:2100:1: ( ( rule__PredictorVariables__Group_1__0 )* )
            {
            // InternalMml.g:2100:1: ( ( rule__PredictorVariables__Group_1__0 )* )
            // InternalMml.g:2101:2: ( rule__PredictorVariables__Group_1__0 )*
            {
             before(grammarAccess.getPredictorVariablesAccess().getGroup_1()); 
            // InternalMml.g:2102:2: ( rule__PredictorVariables__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==47) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMml.g:2102:3: rule__PredictorVariables__Group_1__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__PredictorVariables__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getPredictorVariablesAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictorVariables__Group__1__Impl"


    // $ANTLR start "rule__PredictorVariables__Group_1__0"
    // InternalMml.g:2111:1: rule__PredictorVariables__Group_1__0 : rule__PredictorVariables__Group_1__0__Impl rule__PredictorVariables__Group_1__1 ;
    public final void rule__PredictorVariables__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2115:1: ( rule__PredictorVariables__Group_1__0__Impl rule__PredictorVariables__Group_1__1 )
            // InternalMml.g:2116:2: rule__PredictorVariables__Group_1__0__Impl rule__PredictorVariables__Group_1__1
            {
            pushFollow(FOLLOW_24);
            rule__PredictorVariables__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredictorVariables__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictorVariables__Group_1__0"


    // $ANTLR start "rule__PredictorVariables__Group_1__0__Impl"
    // InternalMml.g:2123:1: rule__PredictorVariables__Group_1__0__Impl : ( '+' ) ;
    public final void rule__PredictorVariables__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2127:1: ( ( '+' ) )
            // InternalMml.g:2128:1: ( '+' )
            {
            // InternalMml.g:2128:1: ( '+' )
            // InternalMml.g:2129:2: '+'
            {
             before(grammarAccess.getPredictorVariablesAccess().getPlusSignKeyword_1_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getPredictorVariablesAccess().getPlusSignKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictorVariables__Group_1__0__Impl"


    // $ANTLR start "rule__PredictorVariables__Group_1__1"
    // InternalMml.g:2138:1: rule__PredictorVariables__Group_1__1 : rule__PredictorVariables__Group_1__1__Impl ;
    public final void rule__PredictorVariables__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2142:1: ( rule__PredictorVariables__Group_1__1__Impl )
            // InternalMml.g:2143:2: rule__PredictorVariables__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PredictorVariables__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictorVariables__Group_1__1"


    // $ANTLR start "rule__PredictorVariables__Group_1__1__Impl"
    // InternalMml.g:2149:1: rule__PredictorVariables__Group_1__1__Impl : ( ( rule__PredictorVariables__VarsAssignment_1_1 ) ) ;
    public final void rule__PredictorVariables__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2153:1: ( ( ( rule__PredictorVariables__VarsAssignment_1_1 ) ) )
            // InternalMml.g:2154:1: ( ( rule__PredictorVariables__VarsAssignment_1_1 ) )
            {
            // InternalMml.g:2154:1: ( ( rule__PredictorVariables__VarsAssignment_1_1 ) )
            // InternalMml.g:2155:2: ( rule__PredictorVariables__VarsAssignment_1_1 )
            {
             before(grammarAccess.getPredictorVariablesAccess().getVarsAssignment_1_1()); 
            // InternalMml.g:2156:2: ( rule__PredictorVariables__VarsAssignment_1_1 )
            // InternalMml.g:2156:3: rule__PredictorVariables__VarsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PredictorVariables__VarsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPredictorVariablesAccess().getVarsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictorVariables__Group_1__1__Impl"


    // $ANTLR start "rule__Validation__Group__0"
    // InternalMml.g:2165:1: rule__Validation__Group__0 : rule__Validation__Group__0__Impl rule__Validation__Group__1 ;
    public final void rule__Validation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2169:1: ( rule__Validation__Group__0__Impl rule__Validation__Group__1 )
            // InternalMml.g:2170:2: rule__Validation__Group__0__Impl rule__Validation__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Validation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Validation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Validation__Group__0"


    // $ANTLR start "rule__Validation__Group__0__Impl"
    // InternalMml.g:2177:1: rule__Validation__Group__0__Impl : ( ( rule__Validation__StratificationAssignment_0 ) ) ;
    public final void rule__Validation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2181:1: ( ( ( rule__Validation__StratificationAssignment_0 ) ) )
            // InternalMml.g:2182:1: ( ( rule__Validation__StratificationAssignment_0 ) )
            {
            // InternalMml.g:2182:1: ( ( rule__Validation__StratificationAssignment_0 ) )
            // InternalMml.g:2183:2: ( rule__Validation__StratificationAssignment_0 )
            {
             before(grammarAccess.getValidationAccess().getStratificationAssignment_0()); 
            // InternalMml.g:2184:2: ( rule__Validation__StratificationAssignment_0 )
            // InternalMml.g:2184:3: rule__Validation__StratificationAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Validation__StratificationAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getValidationAccess().getStratificationAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Validation__Group__0__Impl"


    // $ANTLR start "rule__Validation__Group__1"
    // InternalMml.g:2192:1: rule__Validation__Group__1 : rule__Validation__Group__1__Impl ;
    public final void rule__Validation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2196:1: ( rule__Validation__Group__1__Impl )
            // InternalMml.g:2197:2: rule__Validation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Validation__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Validation__Group__1"


    // $ANTLR start "rule__Validation__Group__1__Impl"
    // InternalMml.g:2203:1: rule__Validation__Group__1__Impl : ( ( ( rule__Validation__MetricAssignment_1 ) ) ( ( rule__Validation__MetricAssignment_1 )* ) ) ;
    public final void rule__Validation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2207:1: ( ( ( ( rule__Validation__MetricAssignment_1 ) ) ( ( rule__Validation__MetricAssignment_1 )* ) ) )
            // InternalMml.g:2208:1: ( ( ( rule__Validation__MetricAssignment_1 ) ) ( ( rule__Validation__MetricAssignment_1 )* ) )
            {
            // InternalMml.g:2208:1: ( ( ( rule__Validation__MetricAssignment_1 ) ) ( ( rule__Validation__MetricAssignment_1 )* ) )
            // InternalMml.g:2209:2: ( ( rule__Validation__MetricAssignment_1 ) ) ( ( rule__Validation__MetricAssignment_1 )* )
            {
            // InternalMml.g:2209:2: ( ( rule__Validation__MetricAssignment_1 ) )
            // InternalMml.g:2210:3: ( rule__Validation__MetricAssignment_1 )
            {
             before(grammarAccess.getValidationAccess().getMetricAssignment_1()); 
            // InternalMml.g:2211:3: ( rule__Validation__MetricAssignment_1 )
            // InternalMml.g:2211:4: rule__Validation__MetricAssignment_1
            {
            pushFollow(FOLLOW_26);
            rule__Validation__MetricAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getValidationAccess().getMetricAssignment_1()); 

            }

            // InternalMml.g:2214:2: ( ( rule__Validation__MetricAssignment_1 )* )
            // InternalMml.g:2215:3: ( rule__Validation__MetricAssignment_1 )*
            {
             before(grammarAccess.getValidationAccess().getMetricAssignment_1()); 
            // InternalMml.g:2216:3: ( rule__Validation__MetricAssignment_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=27 && LA22_0<=35)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMml.g:2216:4: rule__Validation__MetricAssignment_1
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Validation__MetricAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getValidationAccess().getMetricAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Validation__Group__1__Impl"


    // $ANTLR start "rule__CrossValidation__Group__0"
    // InternalMml.g:2226:1: rule__CrossValidation__Group__0 : rule__CrossValidation__Group__0__Impl rule__CrossValidation__Group__1 ;
    public final void rule__CrossValidation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2230:1: ( rule__CrossValidation__Group__0__Impl rule__CrossValidation__Group__1 )
            // InternalMml.g:2231:2: rule__CrossValidation__Group__0__Impl rule__CrossValidation__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__CrossValidation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CrossValidation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossValidation__Group__0"


    // $ANTLR start "rule__CrossValidation__Group__0__Impl"
    // InternalMml.g:2238:1: rule__CrossValidation__Group__0__Impl : ( 'CrossValidation' ) ;
    public final void rule__CrossValidation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2242:1: ( ( 'CrossValidation' ) )
            // InternalMml.g:2243:1: ( 'CrossValidation' )
            {
            // InternalMml.g:2243:1: ( 'CrossValidation' )
            // InternalMml.g:2244:2: 'CrossValidation'
            {
             before(grammarAccess.getCrossValidationAccess().getCrossValidationKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getCrossValidationAccess().getCrossValidationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossValidation__Group__0__Impl"


    // $ANTLR start "rule__CrossValidation__Group__1"
    // InternalMml.g:2253:1: rule__CrossValidation__Group__1 : rule__CrossValidation__Group__1__Impl rule__CrossValidation__Group__2 ;
    public final void rule__CrossValidation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2257:1: ( rule__CrossValidation__Group__1__Impl rule__CrossValidation__Group__2 )
            // InternalMml.g:2258:2: rule__CrossValidation__Group__1__Impl rule__CrossValidation__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__CrossValidation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CrossValidation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossValidation__Group__1"


    // $ANTLR start "rule__CrossValidation__Group__1__Impl"
    // InternalMml.g:2265:1: rule__CrossValidation__Group__1__Impl : ( '{' ) ;
    public final void rule__CrossValidation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2269:1: ( ( '{' ) )
            // InternalMml.g:2270:1: ( '{' )
            {
            // InternalMml.g:2270:1: ( '{' )
            // InternalMml.g:2271:2: '{'
            {
             before(grammarAccess.getCrossValidationAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getCrossValidationAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossValidation__Group__1__Impl"


    // $ANTLR start "rule__CrossValidation__Group__2"
    // InternalMml.g:2280:1: rule__CrossValidation__Group__2 : rule__CrossValidation__Group__2__Impl rule__CrossValidation__Group__3 ;
    public final void rule__CrossValidation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2284:1: ( rule__CrossValidation__Group__2__Impl rule__CrossValidation__Group__3 )
            // InternalMml.g:2285:2: rule__CrossValidation__Group__2__Impl rule__CrossValidation__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__CrossValidation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CrossValidation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossValidation__Group__2"


    // $ANTLR start "rule__CrossValidation__Group__2__Impl"
    // InternalMml.g:2292:1: rule__CrossValidation__Group__2__Impl : ( 'numRepetitionCross' ) ;
    public final void rule__CrossValidation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2296:1: ( ( 'numRepetitionCross' ) )
            // InternalMml.g:2297:1: ( 'numRepetitionCross' )
            {
            // InternalMml.g:2297:1: ( 'numRepetitionCross' )
            // InternalMml.g:2298:2: 'numRepetitionCross'
            {
             before(grammarAccess.getCrossValidationAccess().getNumRepetitionCrossKeyword_2()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getCrossValidationAccess().getNumRepetitionCrossKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossValidation__Group__2__Impl"


    // $ANTLR start "rule__CrossValidation__Group__3"
    // InternalMml.g:2307:1: rule__CrossValidation__Group__3 : rule__CrossValidation__Group__3__Impl rule__CrossValidation__Group__4 ;
    public final void rule__CrossValidation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2311:1: ( rule__CrossValidation__Group__3__Impl rule__CrossValidation__Group__4 )
            // InternalMml.g:2312:2: rule__CrossValidation__Group__3__Impl rule__CrossValidation__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__CrossValidation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CrossValidation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossValidation__Group__3"


    // $ANTLR start "rule__CrossValidation__Group__3__Impl"
    // InternalMml.g:2319:1: rule__CrossValidation__Group__3__Impl : ( ( rule__CrossValidation__NumberAssignment_3 ) ) ;
    public final void rule__CrossValidation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2323:1: ( ( ( rule__CrossValidation__NumberAssignment_3 ) ) )
            // InternalMml.g:2324:1: ( ( rule__CrossValidation__NumberAssignment_3 ) )
            {
            // InternalMml.g:2324:1: ( ( rule__CrossValidation__NumberAssignment_3 ) )
            // InternalMml.g:2325:2: ( rule__CrossValidation__NumberAssignment_3 )
            {
             before(grammarAccess.getCrossValidationAccess().getNumberAssignment_3()); 
            // InternalMml.g:2326:2: ( rule__CrossValidation__NumberAssignment_3 )
            // InternalMml.g:2326:3: rule__CrossValidation__NumberAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CrossValidation__NumberAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCrossValidationAccess().getNumberAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossValidation__Group__3__Impl"


    // $ANTLR start "rule__CrossValidation__Group__4"
    // InternalMml.g:2334:1: rule__CrossValidation__Group__4 : rule__CrossValidation__Group__4__Impl ;
    public final void rule__CrossValidation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2338:1: ( rule__CrossValidation__Group__4__Impl )
            // InternalMml.g:2339:2: rule__CrossValidation__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CrossValidation__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossValidation__Group__4"


    // $ANTLR start "rule__CrossValidation__Group__4__Impl"
    // InternalMml.g:2345:1: rule__CrossValidation__Group__4__Impl : ( '}' ) ;
    public final void rule__CrossValidation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2349:1: ( ( '}' ) )
            // InternalMml.g:2350:1: ( '}' )
            {
            // InternalMml.g:2350:1: ( '}' )
            // InternalMml.g:2351:2: '}'
            {
             before(grammarAccess.getCrossValidationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getCrossValidationAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossValidation__Group__4__Impl"


    // $ANTLR start "rule__TrainingTest__Group__0"
    // InternalMml.g:2361:1: rule__TrainingTest__Group__0 : rule__TrainingTest__Group__0__Impl rule__TrainingTest__Group__1 ;
    public final void rule__TrainingTest__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2365:1: ( rule__TrainingTest__Group__0__Impl rule__TrainingTest__Group__1 )
            // InternalMml.g:2366:2: rule__TrainingTest__Group__0__Impl rule__TrainingTest__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__TrainingTest__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrainingTest__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingTest__Group__0"


    // $ANTLR start "rule__TrainingTest__Group__0__Impl"
    // InternalMml.g:2373:1: rule__TrainingTest__Group__0__Impl : ( 'TrainingTest' ) ;
    public final void rule__TrainingTest__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2377:1: ( ( 'TrainingTest' ) )
            // InternalMml.g:2378:1: ( 'TrainingTest' )
            {
            // InternalMml.g:2378:1: ( 'TrainingTest' )
            // InternalMml.g:2379:2: 'TrainingTest'
            {
             before(grammarAccess.getTrainingTestAccess().getTrainingTestKeyword_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getTrainingTestAccess().getTrainingTestKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingTest__Group__0__Impl"


    // $ANTLR start "rule__TrainingTest__Group__1"
    // InternalMml.g:2388:1: rule__TrainingTest__Group__1 : rule__TrainingTest__Group__1__Impl rule__TrainingTest__Group__2 ;
    public final void rule__TrainingTest__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2392:1: ( rule__TrainingTest__Group__1__Impl rule__TrainingTest__Group__2 )
            // InternalMml.g:2393:2: rule__TrainingTest__Group__1__Impl rule__TrainingTest__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__TrainingTest__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrainingTest__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingTest__Group__1"


    // $ANTLR start "rule__TrainingTest__Group__1__Impl"
    // InternalMml.g:2400:1: rule__TrainingTest__Group__1__Impl : ( '{' ) ;
    public final void rule__TrainingTest__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2404:1: ( ( '{' ) )
            // InternalMml.g:2405:1: ( '{' )
            {
            // InternalMml.g:2405:1: ( '{' )
            // InternalMml.g:2406:2: '{'
            {
             before(grammarAccess.getTrainingTestAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getTrainingTestAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingTest__Group__1__Impl"


    // $ANTLR start "rule__TrainingTest__Group__2"
    // InternalMml.g:2415:1: rule__TrainingTest__Group__2 : rule__TrainingTest__Group__2__Impl rule__TrainingTest__Group__3 ;
    public final void rule__TrainingTest__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2419:1: ( rule__TrainingTest__Group__2__Impl rule__TrainingTest__Group__3 )
            // InternalMml.g:2420:2: rule__TrainingTest__Group__2__Impl rule__TrainingTest__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__TrainingTest__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrainingTest__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingTest__Group__2"


    // $ANTLR start "rule__TrainingTest__Group__2__Impl"
    // InternalMml.g:2427:1: rule__TrainingTest__Group__2__Impl : ( 'percentageTraining' ) ;
    public final void rule__TrainingTest__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2431:1: ( ( 'percentageTraining' ) )
            // InternalMml.g:2432:1: ( 'percentageTraining' )
            {
            // InternalMml.g:2432:1: ( 'percentageTraining' )
            // InternalMml.g:2433:2: 'percentageTraining'
            {
             before(grammarAccess.getTrainingTestAccess().getPercentageTrainingKeyword_2()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getTrainingTestAccess().getPercentageTrainingKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingTest__Group__2__Impl"


    // $ANTLR start "rule__TrainingTest__Group__3"
    // InternalMml.g:2442:1: rule__TrainingTest__Group__3 : rule__TrainingTest__Group__3__Impl rule__TrainingTest__Group__4 ;
    public final void rule__TrainingTest__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2446:1: ( rule__TrainingTest__Group__3__Impl rule__TrainingTest__Group__4 )
            // InternalMml.g:2447:2: rule__TrainingTest__Group__3__Impl rule__TrainingTest__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__TrainingTest__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrainingTest__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingTest__Group__3"


    // $ANTLR start "rule__TrainingTest__Group__3__Impl"
    // InternalMml.g:2454:1: rule__TrainingTest__Group__3__Impl : ( ( rule__TrainingTest__NumberAssignment_3 ) ) ;
    public final void rule__TrainingTest__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2458:1: ( ( ( rule__TrainingTest__NumberAssignment_3 ) ) )
            // InternalMml.g:2459:1: ( ( rule__TrainingTest__NumberAssignment_3 ) )
            {
            // InternalMml.g:2459:1: ( ( rule__TrainingTest__NumberAssignment_3 ) )
            // InternalMml.g:2460:2: ( rule__TrainingTest__NumberAssignment_3 )
            {
             before(grammarAccess.getTrainingTestAccess().getNumberAssignment_3()); 
            // InternalMml.g:2461:2: ( rule__TrainingTest__NumberAssignment_3 )
            // InternalMml.g:2461:3: rule__TrainingTest__NumberAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TrainingTest__NumberAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTrainingTestAccess().getNumberAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingTest__Group__3__Impl"


    // $ANTLR start "rule__TrainingTest__Group__4"
    // InternalMml.g:2469:1: rule__TrainingTest__Group__4 : rule__TrainingTest__Group__4__Impl ;
    public final void rule__TrainingTest__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2473:1: ( rule__TrainingTest__Group__4__Impl )
            // InternalMml.g:2474:2: rule__TrainingTest__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TrainingTest__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingTest__Group__4"


    // $ANTLR start "rule__TrainingTest__Group__4__Impl"
    // InternalMml.g:2480:1: rule__TrainingTest__Group__4__Impl : ( '}' ) ;
    public final void rule__TrainingTest__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2484:1: ( ( '}' ) )
            // InternalMml.g:2485:1: ( '}' )
            {
            // InternalMml.g:2485:1: ( '}' )
            // InternalMml.g:2486:2: '}'
            {
             before(grammarAccess.getTrainingTestAccess().getRightCurlyBracketKeyword_4()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getTrainingTestAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingTest__Group__4__Impl"


    // $ANTLR start "rule__MMLModel__InputAssignment_0"
    // InternalMml.g:2496:1: rule__MMLModel__InputAssignment_0 : ( ruleDataInput ) ;
    public final void rule__MMLModel__InputAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2500:1: ( ( ruleDataInput ) )
            // InternalMml.g:2501:2: ( ruleDataInput )
            {
            // InternalMml.g:2501:2: ( ruleDataInput )
            // InternalMml.g:2502:3: ruleDataInput
            {
             before(grammarAccess.getMMLModelAccess().getInputDataInputParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDataInput();

            state._fsp--;

             after(grammarAccess.getMMLModelAccess().getInputDataInputParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMLModel__InputAssignment_0"


    // $ANTLR start "rule__MMLModel__AlgorithmsAssignment_1"
    // InternalMml.g:2511:1: rule__MMLModel__AlgorithmsAssignment_1 : ( ruleMLChoiceAlgorithm ) ;
    public final void rule__MMLModel__AlgorithmsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2515:1: ( ( ruleMLChoiceAlgorithm ) )
            // InternalMml.g:2516:2: ( ruleMLChoiceAlgorithm )
            {
            // InternalMml.g:2516:2: ( ruleMLChoiceAlgorithm )
            // InternalMml.g:2517:3: ruleMLChoiceAlgorithm
            {
             before(grammarAccess.getMMLModelAccess().getAlgorithmsMLChoiceAlgorithmParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMLChoiceAlgorithm();

            state._fsp--;

             after(grammarAccess.getMMLModelAccess().getAlgorithmsMLChoiceAlgorithmParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMLModel__AlgorithmsAssignment_1"


    // $ANTLR start "rule__MMLModel__FormulaAssignment_2"
    // InternalMml.g:2526:1: rule__MMLModel__FormulaAssignment_2 : ( ruleRFormula ) ;
    public final void rule__MMLModel__FormulaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2530:1: ( ( ruleRFormula ) )
            // InternalMml.g:2531:2: ( ruleRFormula )
            {
            // InternalMml.g:2531:2: ( ruleRFormula )
            // InternalMml.g:2532:3: ruleRFormula
            {
             before(grammarAccess.getMMLModelAccess().getFormulaRFormulaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRFormula();

            state._fsp--;

             after(grammarAccess.getMMLModelAccess().getFormulaRFormulaParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMLModel__FormulaAssignment_2"


    // $ANTLR start "rule__MMLModel__ValidationAssignment_3"
    // InternalMml.g:2541:1: rule__MMLModel__ValidationAssignment_3 : ( ruleValidation ) ;
    public final void rule__MMLModel__ValidationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2545:1: ( ( ruleValidation ) )
            // InternalMml.g:2546:2: ( ruleValidation )
            {
            // InternalMml.g:2546:2: ( ruleValidation )
            // InternalMml.g:2547:3: ruleValidation
            {
             before(grammarAccess.getMMLModelAccess().getValidationValidationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleValidation();

            state._fsp--;

             after(grammarAccess.getMMLModelAccess().getValidationValidationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMLModel__ValidationAssignment_3"


    // $ANTLR start "rule__DataInput__FilelocationAssignment_1"
    // InternalMml.g:2556:1: rule__DataInput__FilelocationAssignment_1 : ( RULE_STRING ) ;
    public final void rule__DataInput__FilelocationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2560:1: ( ( RULE_STRING ) )
            // InternalMml.g:2561:2: ( RULE_STRING )
            {
            // InternalMml.g:2561:2: ( RULE_STRING )
            // InternalMml.g:2562:3: RULE_STRING
            {
             before(grammarAccess.getDataInputAccess().getFilelocationSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDataInputAccess().getFilelocationSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataInput__FilelocationAssignment_1"


    // $ANTLR start "rule__DataInput__ParsingInstructionAssignment_2"
    // InternalMml.g:2571:1: rule__DataInput__ParsingInstructionAssignment_2 : ( ruleCSVParsingConfiguration ) ;
    public final void rule__DataInput__ParsingInstructionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2575:1: ( ( ruleCSVParsingConfiguration ) )
            // InternalMml.g:2576:2: ( ruleCSVParsingConfiguration )
            {
            // InternalMml.g:2576:2: ( ruleCSVParsingConfiguration )
            // InternalMml.g:2577:3: ruleCSVParsingConfiguration
            {
             before(grammarAccess.getDataInputAccess().getParsingInstructionCSVParsingConfigurationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCSVParsingConfiguration();

            state._fsp--;

             after(grammarAccess.getDataInputAccess().getParsingInstructionCSVParsingConfigurationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataInput__ParsingInstructionAssignment_2"


    // $ANTLR start "rule__CSVParsingConfiguration__SepAssignment_1"
    // InternalMml.g:2586:1: rule__CSVParsingConfiguration__SepAssignment_1 : ( ruleCSVSeparator ) ;
    public final void rule__CSVParsingConfiguration__SepAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2590:1: ( ( ruleCSVSeparator ) )
            // InternalMml.g:2591:2: ( ruleCSVSeparator )
            {
            // InternalMml.g:2591:2: ( ruleCSVSeparator )
            // InternalMml.g:2592:3: ruleCSVSeparator
            {
             before(grammarAccess.getCSVParsingConfigurationAccess().getSepCSVSeparatorEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCSVSeparator();

            state._fsp--;

             after(grammarAccess.getCSVParsingConfigurationAccess().getSepCSVSeparatorEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSVParsingConfiguration__SepAssignment_1"


    // $ANTLR start "rule__MLChoiceAlgorithm__FrameworkAssignment_1"
    // InternalMml.g:2601:1: rule__MLChoiceAlgorithm__FrameworkAssignment_1 : ( ruleFrameworkLang ) ;
    public final void rule__MLChoiceAlgorithm__FrameworkAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2605:1: ( ( ruleFrameworkLang ) )
            // InternalMml.g:2606:2: ( ruleFrameworkLang )
            {
            // InternalMml.g:2606:2: ( ruleFrameworkLang )
            // InternalMml.g:2607:3: ruleFrameworkLang
            {
             before(grammarAccess.getMLChoiceAlgorithmAccess().getFrameworkFrameworkLangEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFrameworkLang();

            state._fsp--;

             after(grammarAccess.getMLChoiceAlgorithmAccess().getFrameworkFrameworkLangEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLChoiceAlgorithm__FrameworkAssignment_1"


    // $ANTLR start "rule__MLChoiceAlgorithm__AlgorithmAssignment_3"
    // InternalMml.g:2616:1: rule__MLChoiceAlgorithm__AlgorithmAssignment_3 : ( ruleMLAlgorithm ) ;
    public final void rule__MLChoiceAlgorithm__AlgorithmAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2620:1: ( ( ruleMLAlgorithm ) )
            // InternalMml.g:2621:2: ( ruleMLAlgorithm )
            {
            // InternalMml.g:2621:2: ( ruleMLAlgorithm )
            // InternalMml.g:2622:3: ruleMLAlgorithm
            {
             before(grammarAccess.getMLChoiceAlgorithmAccess().getAlgorithmMLAlgorithmParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMLAlgorithm();

            state._fsp--;

             after(grammarAccess.getMLChoiceAlgorithmAccess().getAlgorithmMLAlgorithmParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLChoiceAlgorithm__AlgorithmAssignment_3"


    // $ANTLR start "rule__SVM__GammaAssignment_2_1"
    // InternalMml.g:2631:1: rule__SVM__GammaAssignment_2_1 : ( ruleFLOAT ) ;
    public final void rule__SVM__GammaAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2635:1: ( ( ruleFLOAT ) )
            // InternalMml.g:2636:2: ( ruleFLOAT )
            {
            // InternalMml.g:2636:2: ( ruleFLOAT )
            // InternalMml.g:2637:3: ruleFLOAT
            {
             before(grammarAccess.getSVMAccess().getGammaFLOATParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getSVMAccess().getGammaFLOATParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVM__GammaAssignment_2_1"


    // $ANTLR start "rule__SVM__CAssignment_3_1"
    // InternalMml.g:2646:1: rule__SVM__CAssignment_3_1 : ( ruleFLOAT ) ;
    public final void rule__SVM__CAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2650:1: ( ( ruleFLOAT ) )
            // InternalMml.g:2651:2: ( ruleFLOAT )
            {
            // InternalMml.g:2651:2: ( ruleFLOAT )
            // InternalMml.g:2652:3: ruleFLOAT
            {
             before(grammarAccess.getSVMAccess().getCFLOATParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getSVMAccess().getCFLOATParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVM__CAssignment_3_1"


    // $ANTLR start "rule__SVM__KernelSpecifiedAssignment_4_0"
    // InternalMml.g:2661:1: rule__SVM__KernelSpecifiedAssignment_4_0 : ( ( 'kernel=' ) ) ;
    public final void rule__SVM__KernelSpecifiedAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2665:1: ( ( ( 'kernel=' ) ) )
            // InternalMml.g:2666:2: ( ( 'kernel=' ) )
            {
            // InternalMml.g:2666:2: ( ( 'kernel=' ) )
            // InternalMml.g:2667:3: ( 'kernel=' )
            {
             before(grammarAccess.getSVMAccess().getKernelSpecifiedKernelKeyword_4_0_0()); 
            // InternalMml.g:2668:3: ( 'kernel=' )
            // InternalMml.g:2669:4: 'kernel='
            {
             before(grammarAccess.getSVMAccess().getKernelSpecifiedKernelKeyword_4_0_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getSVMAccess().getKernelSpecifiedKernelKeyword_4_0_0()); 

            }

             after(grammarAccess.getSVMAccess().getKernelSpecifiedKernelKeyword_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVM__KernelSpecifiedAssignment_4_0"


    // $ANTLR start "rule__SVM__KernelAssignment_4_1"
    // InternalMml.g:2680:1: rule__SVM__KernelAssignment_4_1 : ( ruleSVMKernel ) ;
    public final void rule__SVM__KernelAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2684:1: ( ( ruleSVMKernel ) )
            // InternalMml.g:2685:2: ( ruleSVMKernel )
            {
            // InternalMml.g:2685:2: ( ruleSVMKernel )
            // InternalMml.g:2686:3: ruleSVMKernel
            {
             before(grammarAccess.getSVMAccess().getKernelSVMKernelEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSVMKernel();

            state._fsp--;

             after(grammarAccess.getSVMAccess().getKernelSVMKernelEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVM__KernelAssignment_4_1"


    // $ANTLR start "rule__SVM__ClassificationSpecifiedAssignment_5_0"
    // InternalMml.g:2695:1: rule__SVM__ClassificationSpecifiedAssignment_5_0 : ( ( 'classification' ) ) ;
    public final void rule__SVM__ClassificationSpecifiedAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2699:1: ( ( ( 'classification' ) ) )
            // InternalMml.g:2700:2: ( ( 'classification' ) )
            {
            // InternalMml.g:2700:2: ( ( 'classification' ) )
            // InternalMml.g:2701:3: ( 'classification' )
            {
             before(grammarAccess.getSVMAccess().getClassificationSpecifiedClassificationKeyword_5_0_0()); 
            // InternalMml.g:2702:3: ( 'classification' )
            // InternalMml.g:2703:4: 'classification'
            {
             before(grammarAccess.getSVMAccess().getClassificationSpecifiedClassificationKeyword_5_0_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getSVMAccess().getClassificationSpecifiedClassificationKeyword_5_0_0()); 

            }

             after(grammarAccess.getSVMAccess().getClassificationSpecifiedClassificationKeyword_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVM__ClassificationSpecifiedAssignment_5_0"


    // $ANTLR start "rule__SVM__SvmclassificationAssignment_5_1"
    // InternalMml.g:2714:1: rule__SVM__SvmclassificationAssignment_5_1 : ( ruleSVMClassification ) ;
    public final void rule__SVM__SvmclassificationAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2718:1: ( ( ruleSVMClassification ) )
            // InternalMml.g:2719:2: ( ruleSVMClassification )
            {
            // InternalMml.g:2719:2: ( ruleSVMClassification )
            // InternalMml.g:2720:3: ruleSVMClassification
            {
             before(grammarAccess.getSVMAccess().getSvmclassificationSVMClassificationEnumRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSVMClassification();

            state._fsp--;

             after(grammarAccess.getSVMAccess().getSvmclassificationSVMClassificationEnumRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVM__SvmclassificationAssignment_5_1"


    // $ANTLR start "rule__DT__Max_depthAssignment_2"
    // InternalMml.g:2729:1: rule__DT__Max_depthAssignment_2 : ( RULE_INT ) ;
    public final void rule__DT__Max_depthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2733:1: ( ( RULE_INT ) )
            // InternalMml.g:2734:2: ( RULE_INT )
            {
            // InternalMml.g:2734:2: ( RULE_INT )
            // InternalMml.g:2735:3: RULE_INT
            {
             before(grammarAccess.getDTAccess().getMax_depthINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDTAccess().getMax_depthINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DT__Max_depthAssignment_2"


    // $ANTLR start "rule__RFormula__PredictiveAssignment_1_0"
    // InternalMml.g:2744:1: rule__RFormula__PredictiveAssignment_1_0 : ( ruleFormulaItem ) ;
    public final void rule__RFormula__PredictiveAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2748:1: ( ( ruleFormulaItem ) )
            // InternalMml.g:2749:2: ( ruleFormulaItem )
            {
            // InternalMml.g:2749:2: ( ruleFormulaItem )
            // InternalMml.g:2750:3: ruleFormulaItem
            {
             before(grammarAccess.getRFormulaAccess().getPredictiveFormulaItemParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFormulaItem();

            state._fsp--;

             after(grammarAccess.getRFormulaAccess().getPredictiveFormulaItemParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RFormula__PredictiveAssignment_1_0"


    // $ANTLR start "rule__RFormula__PredictorsAssignment_2"
    // InternalMml.g:2759:1: rule__RFormula__PredictorsAssignment_2 : ( ruleXFormula ) ;
    public final void rule__RFormula__PredictorsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2763:1: ( ( ruleXFormula ) )
            // InternalMml.g:2764:2: ( ruleXFormula )
            {
            // InternalMml.g:2764:2: ( ruleXFormula )
            // InternalMml.g:2765:3: ruleXFormula
            {
             before(grammarAccess.getRFormulaAccess().getPredictorsXFormulaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleXFormula();

            state._fsp--;

             after(grammarAccess.getRFormulaAccess().getPredictorsXFormulaParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RFormula__PredictorsAssignment_2"


    // $ANTLR start "rule__AllVariables__AllAssignment"
    // InternalMml.g:2774:1: rule__AllVariables__AllAssignment : ( ( '.' ) ) ;
    public final void rule__AllVariables__AllAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2778:1: ( ( ( '.' ) ) )
            // InternalMml.g:2779:2: ( ( '.' ) )
            {
            // InternalMml.g:2779:2: ( ( '.' ) )
            // InternalMml.g:2780:3: ( '.' )
            {
             before(grammarAccess.getAllVariablesAccess().getAllFullStopKeyword_0()); 
            // InternalMml.g:2781:3: ( '.' )
            // InternalMml.g:2782:4: '.'
            {
             before(grammarAccess.getAllVariablesAccess().getAllFullStopKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getAllVariablesAccess().getAllFullStopKeyword_0()); 

            }

             after(grammarAccess.getAllVariablesAccess().getAllFullStopKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllVariables__AllAssignment"


    // $ANTLR start "rule__PredictorVariables__VarsAssignment_0"
    // InternalMml.g:2793:1: rule__PredictorVariables__VarsAssignment_0 : ( ruleFormulaItem ) ;
    public final void rule__PredictorVariables__VarsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2797:1: ( ( ruleFormulaItem ) )
            // InternalMml.g:2798:2: ( ruleFormulaItem )
            {
            // InternalMml.g:2798:2: ( ruleFormulaItem )
            // InternalMml.g:2799:3: ruleFormulaItem
            {
             before(grammarAccess.getPredictorVariablesAccess().getVarsFormulaItemParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFormulaItem();

            state._fsp--;

             after(grammarAccess.getPredictorVariablesAccess().getVarsFormulaItemParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictorVariables__VarsAssignment_0"


    // $ANTLR start "rule__PredictorVariables__VarsAssignment_1_1"
    // InternalMml.g:2808:1: rule__PredictorVariables__VarsAssignment_1_1 : ( ruleFormulaItem ) ;
    public final void rule__PredictorVariables__VarsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2812:1: ( ( ruleFormulaItem ) )
            // InternalMml.g:2813:2: ( ruleFormulaItem )
            {
            // InternalMml.g:2813:2: ( ruleFormulaItem )
            // InternalMml.g:2814:3: ruleFormulaItem
            {
             before(grammarAccess.getPredictorVariablesAccess().getVarsFormulaItemParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFormulaItem();

            state._fsp--;

             after(grammarAccess.getPredictorVariablesAccess().getVarsFormulaItemParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictorVariables__VarsAssignment_1_1"


    // $ANTLR start "rule__FormulaItem__ColumnAssignment_0"
    // InternalMml.g:2823:1: rule__FormulaItem__ColumnAssignment_0 : ( RULE_INT ) ;
    public final void rule__FormulaItem__ColumnAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2827:1: ( ( RULE_INT ) )
            // InternalMml.g:2828:2: ( RULE_INT )
            {
            // InternalMml.g:2828:2: ( RULE_INT )
            // InternalMml.g:2829:3: RULE_INT
            {
             before(grammarAccess.getFormulaItemAccess().getColumnINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFormulaItemAccess().getColumnINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormulaItem__ColumnAssignment_0"


    // $ANTLR start "rule__FormulaItem__ColNameAssignment_1"
    // InternalMml.g:2838:1: rule__FormulaItem__ColNameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__FormulaItem__ColNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2842:1: ( ( RULE_STRING ) )
            // InternalMml.g:2843:2: ( RULE_STRING )
            {
            // InternalMml.g:2843:2: ( RULE_STRING )
            // InternalMml.g:2844:3: RULE_STRING
            {
             before(grammarAccess.getFormulaItemAccess().getColNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFormulaItemAccess().getColNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormulaItem__ColNameAssignment_1"


    // $ANTLR start "rule__Validation__StratificationAssignment_0"
    // InternalMml.g:2853:1: rule__Validation__StratificationAssignment_0 : ( ruleStratificationMethod ) ;
    public final void rule__Validation__StratificationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2857:1: ( ( ruleStratificationMethod ) )
            // InternalMml.g:2858:2: ( ruleStratificationMethod )
            {
            // InternalMml.g:2858:2: ( ruleStratificationMethod )
            // InternalMml.g:2859:3: ruleStratificationMethod
            {
             before(grammarAccess.getValidationAccess().getStratificationStratificationMethodParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStratificationMethod();

            state._fsp--;

             after(grammarAccess.getValidationAccess().getStratificationStratificationMethodParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Validation__StratificationAssignment_0"


    // $ANTLR start "rule__Validation__MetricAssignment_1"
    // InternalMml.g:2868:1: rule__Validation__MetricAssignment_1 : ( ruleValidationMetric ) ;
    public final void rule__Validation__MetricAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2872:1: ( ( ruleValidationMetric ) )
            // InternalMml.g:2873:2: ( ruleValidationMetric )
            {
            // InternalMml.g:2873:2: ( ruleValidationMetric )
            // InternalMml.g:2874:3: ruleValidationMetric
            {
             before(grammarAccess.getValidationAccess().getMetricValidationMetricEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValidationMetric();

            state._fsp--;

             after(grammarAccess.getValidationAccess().getMetricValidationMetricEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Validation__MetricAssignment_1"


    // $ANTLR start "rule__CrossValidation__NumberAssignment_3"
    // InternalMml.g:2883:1: rule__CrossValidation__NumberAssignment_3 : ( RULE_INT ) ;
    public final void rule__CrossValidation__NumberAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2887:1: ( ( RULE_INT ) )
            // InternalMml.g:2888:2: ( RULE_INT )
            {
            // InternalMml.g:2888:2: ( RULE_INT )
            // InternalMml.g:2889:3: RULE_INT
            {
             before(grammarAccess.getCrossValidationAccess().getNumberINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCrossValidationAccess().getNumberINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossValidation__NumberAssignment_3"


    // $ANTLR start "rule__TrainingTest__NumberAssignment_3"
    // InternalMml.g:2898:1: rule__TrainingTest__NumberAssignment_3 : ( RULE_INT ) ;
    public final void rule__TrainingTest__NumberAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2902:1: ( ( RULE_INT ) )
            // InternalMml.g:2903:2: ( RULE_INT )
            {
            // InternalMml.g:2903:2: ( RULE_INT )
            // InternalMml.g:2904:3: RULE_INT
            {
             before(grammarAccess.getTrainingTestAccess().getNumberINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTrainingTestAccess().getNumberINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingTest__NumberAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0011200000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000001E0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000090000007800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00C0060000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000100000000030L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000FF8000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000FF8000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0020000000000000L});

}