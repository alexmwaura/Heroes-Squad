import java.util.ArrayList;
import java.util.Map;

public class SuperHeroes {
    private Map<String,Object> model;
    private static ArrayList instances = new ArrayList();
    public SuperHeroes(Map<String,Object> heroObject){
       this.model = heroObject;
        instances.add(this);
    }
}
