import org.junit.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class SuperHeroesTest {
    @Test
    public void getInstance_shouldBeInstance_true() throws Exception{
        Map<String, Object> model = new HashMap<String, Object>();
        ArrayList<String> features = new ArrayList<String>();
        features.add("healer");
        features.add("care giver");
        model.put("group", "science");
        model.put("features",features);
        SuperHeroes superHeroes = new SuperHeroes(model);
        assertEquals(true, superHeroes instanceof SuperHeroes);
    }
}