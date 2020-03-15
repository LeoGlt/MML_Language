import java.util.List;

import org.xtext.example.mydsl.generator.MMLCompiler;
import org.xtext.example.mydsl.mml.MMLModel;

import io.javalin.Javalin;
import io.javalin.core.util.FileUtil;

public class Main {

  
    public static void main(String[] args) {

        Javalin app = Javalin.create(config -> {
            config.addStaticFiles("/public");
        }).start(8080);

        app.post("/generate", ctx -> {
        	
        	List<String> code_output = processMML(ctx.formParam("mml"));
        	
        	String html = "<div id = 'script_py'>" + code_output.get(0) + "</div>";
        	html += "<div id = 'results_pyton'>" + code_output.get(2) + "</div>";
        	html += "<div id = 'script_R'>" + code_output.get(1) + "</div>";
        	html += "<div id = 'results_R'>" + code_output.get(3) + "</div>";
            html += "<div id = 'errors_python'>" + code_output.get(4) + "</div>";
            html += "<div id = 'errors_R'>" + code_output.get(5) + "</div>";
            ctx.html(html);

        });
        
        app.post("/compute", ctx -> {
            ctx.html("Your MML " + processMML(ctx.formParam("mml")) + " will be processed");
        });

        app.post("/upload", ctx -> {
            ctx.uploadedFiles("files").forEach(file -> {
                FileUtil.streamToFile(file.getContent(), "upload/" + file.getFilename());
            });
            ctx.html("Upload successful");
            ctx.redirect("/"); 
        });
    }

	private static List<String> processMML(String mmlContent) {
		MMLLoader mmlLoader = new MMLLoader();	    
		MMLModel mml = mmlLoader.loadModel(mmlContent);
		MMLCompiler mmlCompiler = new MMLCompiler(mml);
		return mmlCompiler.generate_code();
	}

}


