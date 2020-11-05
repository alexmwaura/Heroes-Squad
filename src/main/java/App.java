import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");
        get("/", (req,res)-> {
            Map<String, Object> model = new HashMap<String,Object >();
            return new ModelAndView(model,"index.hbs");
        }, new HandlebarsTemplateEngine());
        get("/heroes", (req,res)-> {
            Map<String, Object> model = new HashMap<String,Object >();
            return new ModelAndView(model,"heroes.hbs");
        }, new HandlebarsTemplateEngine());
        get("/new-hero",(req,res)-> {
            Map<String, Object> model = new HashMap<String,Object >();
            return new ModelAndView(model,"new-hero.hbs");
        }, new HandlebarsTemplateEngine());
        post("/add_squad",(req,res)-> {
            String squad = req.queryParams("squadName");
            Map<String,Object> model = new HashMap<>();
            model.put("squad", squad);
            req.session().attribute("superhero",model);
            return new ModelAndView(model, "new-hero.hbs");
        },new HandlebarsTemplateEngine());
    }

}
