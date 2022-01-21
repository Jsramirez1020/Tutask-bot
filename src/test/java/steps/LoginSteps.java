package steps;

import cucumber.api.java.en.*;
import org.json.JSONArray;
import org.json.JSONObject;
import pages.TutaskPages;
import utils.JSONManager;
//import org.apache.log4j.Logger;

public class LoginSteps {
    //org.slf4j.Logger log = Logger.getLogger("Logger de Ejemplo");
    TutaskPages tutask = new TutaskPages(); 

    @Given ("^Ingresar a la URL tutask en Google$")
    public void navegarTutask(){



       tutask.navegarTutask(); 
       //log.info("Se encontro la pagina");
    }
    @When ("^Ingresar el (.+) correo$")
    public void ingresarCorreo(String state){
    /*
        JSONObject json = JSONManager.readJSON("credenciales.json");
        JSONArray credentials = json.getJSONArray("credenciales");
        for(int i = 0; i < credentials.length(); i++){
            JSONObject user = credentials.getJSONObject(i);
            System.out.println("CORREO: " + user.getString("correo"));
            System.out.println("CONTRASEÑA: " + user.getString("contraseña"));
            System.out.println();
        }

     */
        tutask.enterEntrarCriteria(state);
        
    }
    @And("^Ingresar el (.+) password$")
    public void ingresarPassword(String password){
        /*
        JSONObject json = JSONManager.readJSON("credenciales.json");
        JSONArray credentials = json.getJSONArray("credenciales");
        for(int i = 0; i < credentials.length(); i++){
            JSONObject user = credentials.getJSONObject(i);
            System.out.println("CONTRASEÑA: " + user.getString("contraseña"));
            System.out.println();
        }*/
        tutask.enterPasswordCriterial(password);
    }

    @And ("^Realizar clic en Entrar$")
    public void clickBotonEntrar(){
        tutask.clicEntrada();
        //tutask.clicNuevaTarea();       
    }
    @Then ("^Obtener ingreso al Home$")
    public void validarResultado(){
        

        //System.out.println(".1");
        //tutask.clicCentroNegocios();
        //ystem.out.println(".2");
        
       //tutask.category("Centro de Negocios");
        
    }
    
}
