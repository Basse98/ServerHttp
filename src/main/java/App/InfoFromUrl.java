package App;

import java.util.HashMap;
import java.util.Map;

public class InfoFromUrl {


    public static Map<String,String> splitUrl(String url){

        String[] splitted = url.split("[?]");
        String string1 = "";
        String string2 = "";
        if(splitted.length == 2){
            string1 = splitted[0];
            string2 = splitted[1];
        }
        String[] params = string2.split("&");
        Map<String,String> map = new HashMap<String,String>();
        for(String param : params){
            String[] p = param.split("=");
            String name = p[0];
            if(p.length > 1){
                String value = p[1];
                map.put(name,value);
            }
        }
        return map;
    }

}