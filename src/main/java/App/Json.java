package App;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.HashMap;
import java.util.Map;

public class Json {

    private static final Gson gson = new GsonBuilder().create();

    public static String mapStringStringToJson(Map<String, String> map) {
        if (map == null)
            map = new HashMap<String, String>();
        return gson.toJson(map);
    }

}
