package utils;

import org.json.JSONObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class JSONManager {
    private static String jsonPath = "C:\\Users\\Fitideas\\Documents\\TutaskTest-main\\src\\test\\resources\\input\\";
    public static JSONObject readJSON(String path) {
        try {
            Scanner scanner = new Scanner(new File(JSONManager.jsonPath + path));
            String s = "";
            while (scanner.hasNext()) {
                s = s + scanner.nextLine();
            }
            return new JSONObject(s);
        }catch(FileNotFoundException e) {
            System.err.println("No se pudo leer el archivo: " + e.getMessage());
            return null;
        }
    }
}
