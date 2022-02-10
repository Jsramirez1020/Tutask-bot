package pages;

import java.sql.Struct;

public class TareaPqrPages extends BasePages {
    private final String nuevaTarea = "/html/body/section/header/nav/div[1]";
    private final String nuevaPqr = "//*[@id='header-tutask']/nav/div[1]/ul/li[3]";
    private final String iframeN = "//*[@id='form-create-task']/text[2]/iframe";
    private final String cnvButton = "/html/body/div/text/nav/li[2]";
    private final String iframe2 = "//*[@id='form-create-task']/text[2]/iframe";
    private final String categoryDropdown= "/html/body/div[1]/section/form/ul/li[1]/div[1]/select";
    private final String canalDropdown = "/html/body/div[1]/section/form/ul/li[1]/div[2]/select";
    private final String Eletronico = "/html/body/div[1]/section/form/ul/li[1]/div[2]/select/option[4]";
    private final String Accion = "/html/body/div[1]/section/form/ul/li[1]/div[2]/select/option[2]";
    private final String canalOficina = "/html/body/div[1]/section/form/ul/li[1]/div[2]/select/option[5]";
    private final String encargoTextField = "/html/body/div/section/form/ul/li[1]/div[3]/input";
    private final String codigoNegocioTextField = "/html/body/div/section/form/ul/li[2]/div/input";
    private final String campoNombreText = "/html/body/div/section/form/ul/li[4]/input";
    private final String campoApellidoText = "/html/body/div/section/form/ul/li[5]/input";
    private final String tipoIdDropdown = "/html/body/div/section/form/ul/li[6]/div[1]/select";
    private final String negocio = "/html/body/div[1]/section/form/ul/li[2]/div[2]/input";
    private final String listNego = "/html/body/div[1]/section/form/ul/li[2]/div[2]/ul[2]/li[1]/div";
    private final String camponumberText = "/html/body/div/section/form/ul/li[6]/div[2]/input";
    private final String campoEmail = "/html/body/div[1]/section/form/ul/li[7]/div[1]/input";
    private final String campoTel =  "/html/body/div[1]/section/form/ul/li[7]/div[2]/input";
    private final String campoCelular = "/html/body/div[1]/section/form/ul/li[7]/div[3]/input";
    private final String peticion = "//*[@id='No']";
    private final String Motivo = "/html/body/div[1]/section/form/ul/li[10]/div[1]/select";
    private final String producto = "/html/body/div[1]/section/form/ul/li[10]/div[2]/select";
    private final String description = "/html/body/div[1]/section/form/ul/li[11]/textarea";
    private final String Enviar = "//*[@id='dv-create-task']/input";
    private final String Icono = "/html/body/section/header/nav/ul/li[1]/div[1]/div";
    private final String Cerrar = "//*[@id='dv-info-user']/a[2]";

    
    public TareaPqrPages(){
        super(driver);
    }
    /*
    public void homeTutask2(){
        recargarHome2("http://192.168.10.2:8184/#/Tareas");
    }
    */

    public void clicNuevaTareaPqr(){
        clickElementJS(nuevaTarea);
    }


    public void clicNuevaPqr(){
        clickElementJS(nuevaPqr);
    }
    public void clicLis(String Category){
        switchToiFrame(iframeN);
        clickElement(cnvButton);
        selectOficina(categoryDropdown, Category);
        //switchToParentFrame();
        //switchToiFrame(iframe2);

    }

    

    public void CampoText(String numeroE, String codNegocio,  String nombreR,  String apellidoR, String canal){
        write(encargoTextField, numeroE);
        write(codigoNegocioTextField, codNegocio);
        write(campoNombreText, nombreR);
        write(campoApellidoText, apellidoR);
        selectOficina(canalDropdown, canal);


    }
    public void campoNegText(String negocios){
        write(negocio, negocios);
        clickElement(listNego);
    }

    public void tipoIdentificacion(String Category1){
        selectOficina(tipoIdDropdown, Category1);
    }

    public void campoText2(String id, String state){
        write(camponumberText, id);
        write(campoEmail, state);
       
    }

    public void campoText3(String telefono, String celular){
        write(campoTel, telefono);
        write(campoCelular, celular);

    }

    public void derechoPeticion(String Category, String Category1){
        clickElement(peticion);
        selectOficina(Motivo, Category);
        selectOficina(producto, Category1);

    }
    public void descrition(String descripcion){
        write(description, descripcion);
        switchToParentFrame();
        
    }

    public void clicEnviar(){
        clickElement(Enviar);
    }

    public void cilcIcono(){
        clickElementJS(Icono);
    }
    public void clicCerrara(){
        clickElementJS(Cerrar);
    }
    
}
