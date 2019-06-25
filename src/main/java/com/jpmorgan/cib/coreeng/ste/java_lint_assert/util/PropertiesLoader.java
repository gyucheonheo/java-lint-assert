package com.jpmorgan.cib.coreeng.ste.java_lint_assert.util;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public final class PropertiesLoader {

    public static Object load(String pathToPropertiesFile) throws IOException, ParseException {
        InputStream reader = PropertiesLoader.class.getResourceAsStream(pathToPropertiesFile);
        JSONParser jsonParser = new JSONParser();
        return jsonParser.parse(new InputStreamReader(reader));
    }

}