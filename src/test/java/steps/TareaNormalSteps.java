package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.TareaNormalPages;

public class TareaNormalSteps {

    TareaNormalPages Tarea = new TareaNormalPages();

    @Given ("^Seleccionar el desplegable de nueva tarea$")
    public void desplegable(){
        //Tarea.homeTutask();
        Tarea.clicNuevaTarea();
        
        
    }

    @When ("^Seleccionar la opcion Tarea normal$")
    public void opTareaNormal(){
        Tarea.clicTareaNormal();
    }
    
    @And ("^Se llenan los  3 primeros campos de (.+) asunto, (.+) etiqueta y descripcion$")
    public void llenarCampos(String asuntos, String etiquetas){
        Tarea.campoTextto(asuntos, etiquetas);
    }
    @And ("^Se llenan los 2 ultimos campos (.+) invitados, (.+) Nedocios$")
    public void llenarCampos2(String invitados, String negocios){
        Tarea.campoInvitado(invitados);
        Tarea.campoNegocio(negocios);
    }
    @When ("^Seleccionar fecha viable$")
    public void Fechavigente(){
        Tarea.cilcFecha();
    }
    @Then ("^realizar clic en Enviar$")
    public void Enviar(){
        Tarea.clicEnviar();
    }

}
