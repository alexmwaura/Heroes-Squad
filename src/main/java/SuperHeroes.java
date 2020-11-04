import java.util.ArrayList;
import java.util.Map;

public class SuperHeroes {
    private Map<String,Object> model;
    private static ArrayList<SuperHeroes> instances = new ArrayList<SuperHeroes>();
    public SuperHeroes(Map<String,Object> heroObject){
       this.model = heroObject;
        instances.add(this);
        model.put("id",instances.size());
    }
    public Object getModel(){
        return model;
    }
    public static ArrayList<SuperHeroes> getAll(){
        return instances;
    }
}
