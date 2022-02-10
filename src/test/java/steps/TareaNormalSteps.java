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
    @And("^Hacer clic en la opcion todas$")
    public void Todas(){
        Tarea.clicEnOpcionToda();
    }
    @When("^hacer clic en tarea$")
    public void Tarea(){
        Tarea.clicTarea();
    }
    @And("^hacer clic en MAS y en editar tarea$")
    public void MasEditar(){
        Tarea.clicMas();
    }
    @And("^Se llenan los  3 primeros campos de (.+) asunto nuevo, (.+) etiqueta nueva y descripcion$")
    public  void llenarNuevosCampos(String asuntosCampo, String etiquetasCampo ){
        Tarea.campoTextto(asuntosCampo, etiquetasCampo);
    }
    @When("^Quitar invitado$")
    public void quitarInvitado(){
        Tarea.quitarInvitado();
    }
    @And("^Se llenan los 2 ultimos campos (.+) invitados nuevos, (.+) Nedocios nuevos$")
    public void llenarCampoNuevo3(String invitadosCampo, String negociosCampo){
        Tarea.campoTextto2(invitadosCampo);
        //Tarea.campoNegocio(negociosCampo);
    }
    @When("^Seleccionar fecha viable2$")
    public void fecha(){
        Tarea.cilcFecha();
    }
    @Then("^realizar clic en guardar$")
    public void Guardar(){
        Tarea.clicGuardar();
    }
    @When("^Cerrar la edicion$")
    public void cerrarEdicion(){
        Tarea.clicCerrarEdicion();
    }
    @And("^Hacer clic en tarea2$")
    public void clicTarea(){
        Tarea.clicTarea2();
    }
    @And("^Hacer clic en finalizar$")
    public void Finalizar(){
        Tarea.clicFinalizar();
    }
    @When("^Seleccionar la  calificacion$")
    public void Calificacion(){
        Tarea.clikCalificacion();
    }
    @When("^Cerrar la edicion2$")
    public void cerrarEdicion2(){
        Tarea.clicCerrarEdicion();
    }
    @And("^Hacer clic en la opcion Finalizada$")
    public void OpcionFinalizar(){
        Tarea.clicEnOpcionFinalizar();
    }
    @When("^Hacer clic en la tarea finalizada$")
    public void clicDetalleFinalizadas(){
        Tarea.DetalleFInalizar();
    }
    @Then("^Hacer clic en mas y reactivar2$")
    public void clicMasFinalizar(){
        Tarea.SeleccionarMasFinalizar();
    }



}
