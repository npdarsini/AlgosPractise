package com.company;

import jdk.nashorn.internal.parser.JSONParser;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

public class StringToJson {

    public static void main(String args[]) throws JSONException {

        String stringToParse = "{phonetype: N95 ,cat: WP}";
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(stringToParse);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        System.out.println(jsonObj.get("cat"));

    }
}
