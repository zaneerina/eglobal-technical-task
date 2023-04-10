package com.google.utils;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SearchQueries {

    public static String[] loadSearchQueries() {
        String content = null;

        // Read the contents of the JSON file into a string
        try {
            content = new String(Files.readAllBytes(Paths.get("searchQueries.json")));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Parse the JSON string into a JsonNode
        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode = null;
        try {
            rootNode = mapper.readTree(content);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Extract the search queries from the JSON file
        JsonNode queriesNode = rootNode.path("searchQueries");
        String[] queries = new String[queriesNode.size()];
        for (int i = 0; i < queriesNode.size(); i++) {
            queries[i] = queriesNode.get(i).asText();
        }

        return queries;
    }
}
