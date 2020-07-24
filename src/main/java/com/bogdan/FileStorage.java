package com.bogdan;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileStorage {

    public void write(List<User> users) {

        ObjectMapper mapperWrite = new ObjectMapper();
        try {
            String json = mapperWrite.writerWithDefaultPrettyPrinter().writeValueAsString(users);
            FileWriter file = new FileWriter("UserData.txt");
            file.write(json);
            file.flush();
            file.close();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public List<User> read() {

        StringBuilder contentBuilder = new StringBuilder();
        ObjectMapper mapperRead = new ObjectMapper();
        try {
            BufferedReader br = new BufferedReader(new FileReader("UserData.txt"));
            String currentLine;
            while ((currentLine = br.readLine()) != null) {
                contentBuilder.append(currentLine).append("\n");
            }
            br.close();
            return mapperRead.readValue(contentBuilder.toString(), new TypeReference<List<User>>(){});
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
