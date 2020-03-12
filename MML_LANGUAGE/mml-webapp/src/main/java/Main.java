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
            ctx.html("<div id = 'script_py'>" + processMML(ctx.formParam("mml")) + "</div>");
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

	private static String processMML(String mmlContent) {
		MMLLoader mmlLoader = new MMLLoader();	    
		MMLModel mml = mmlLoader.loadModel(mmlContent);
		MMLCompiler mmlCompiler = new MMLCompiler(mml);
		return mmlCompiler.generate_code();
	}

}


