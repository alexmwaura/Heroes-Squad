import java.util.ArrayList;
import java.util.Map;

public class SuperHeroes {
    private Map<String,Object> model;
    private static ArrayList<SuperHeroes> instances = new ArrayList<SuperHeroes>();
    private int id;
    public SuperHeroes(Map<String,Object> heroObject){
       this.model = heroObject;
        instances.add(this);
        this.id = instances.size();
        model.put("id",id);
    }
    public Object getModel(){
        return model;
    }
    public static ArrayList<SuperHeroes> getAll(){
        return instances;
    }
}
