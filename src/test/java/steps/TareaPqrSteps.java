package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.TareaPqrPages;

public class TareaPqrSteps {

    TareaPqrPages pqr = new TareaPqrPages();

    @Given ("^Seleccionar el desplegable de nueva PQR$")
    public void desplegablePqr(){
        //pqr.homeTutask2();
        pqr.clicNuevaTareaPqr();
        
    }

    @When ("^Seleccione la opcion PQR$")
    public void clicPqr(){
        pqr.clicNuevaPqr();
    }

    @And ("^Ingresar al ifram, seleccionar el tipo de PQR y seleccionar oficina$")
    public void ingresarIframe(){
        pqr.clicLis("object:15");
    }

    @When ("^Se llena los campos de canal, (.+) numero encargo, (.+) codigo negocio, (.+) nombre y (.+) apellido$")
    public void llecarCampos1(String numeroE, String codNegocio, String nombreR, String apellidoR){
        pqr.CampoText(numeroE, codNegocio, nombreR, apellidoR, "object:18");
       
    }

    @When ("^Se llena el campo (.+) Negocios$")
    public void campoNegocio(String negocios){
        pqr.campoNegText(negocios);
    }

    @And ("^Seleccionar el tipo de identificador$")
    public void tipoIdentificador(){
        pqr.tipoIdentificacion("object:28");
    }

    @And ("^Ingresar el (.+) correo y el (.+) numero de identificacion$")
    public void campoDocEmail(String state, String id){
        pqr.campoText2(id, state);
    }

    @And ("^Ingresar el (.+) telefono fijo y (.+) celular$")
    public void campoTelCel(String telefono, String celular){
        pqr.campoText3(telefono, celular);
    }

    @When ("^Seleccionar el derecho de peticion, motivo interno y el producto af$")
    public void ultiCampos(){
        pqr.derechoPeticion("object:44","object:90");
    }

    @And ("^Se escribe una (.+) descripcion$")
    public void descripcionPqr(String descripcion){
        pqr.descrition(descripcion);
    }

    @Then ("^Se hace clic en el boton Enviar$")
    public void Enviar(){
        pqr.clicEnviar();
    }

    @When("^Icono sesion$")
    public void IconoCerrar(){
        pqr.cilcIcono();

    }
    @Then("^cerrar sesion$")
    public void CerrarSesion(){
        pqr.clicCerrara();
    }

    //falta
}
