package pages;

public class TareaNormalPages extends BasePages{

    private final String DesplegableTarea = "//*[@id='header-tutask']/nav/div[1]";
    private final String nuevaTarea = "//*[@id='header-tutask']/nav/div[1]/ul/li[1]";
    private final String Asuto = "//*[@id='input-asunto']/textarea";
    private final String Invitados = "//*[@id='input-invitados']/input";
    private final String listaInvitados = "/html/body/div[8]/div[2]/div/section/div/div/div/form/text[1]/div[6]/ul[2]/li[1]";
    private final String listaInvitados2 = "(//li[@class='ui-menu-item'])[1]";
    private final String nominvitado = "//*[@id='ui-id-387']";
    private final String Etiqueta = "//*[@id='form-create-task']/text[1]/div[8]/input";
    private final String listNEgocio = "/html/body/div[8]/div[2]/div/section/div/div/div/form/text[1]/div[9]/ul[2]/li[1]";
    private final String Negocios = "/html/body/div[8]/div[2]/div/section/div/div/div/form/text[1]/div[9]/input";
    //private String Descripcion = "//body/div[@id='1512']/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/form[1]/text[2]/div[1]/div[1]/div[1]/iframe[1]";
    private final String flecha = "//*[@id='dv-form-task']/div/div/a[2]";
    private final String fecha = "//*[@id='dv-fecha']/input";
    private final String clicDia = "//*[@id='dv-form-task']/div/table/tbody/tr[3]/td[2]/a";
    private final String Enviar = "//*[@id='dv-create-task']/div/input";
    private final String Opcion = "/html/body/section/div/aside/div/div[1]/div[3]/ul/li[1]";
    private final String OpFinalizar = "//li[@ng-click='Main.BindByBuzon(5, 'Finalizadas')']";
    private final String Tarea = "//div[@title='Prueba selenium']";
    private final String Mas = "//div[@class='button-more']";
    private final String Editar = "//*[@id='tutor-group-task-detail']/div/div[1]/div[1]/text/div/div/text/div[2]/div/ul/li[3]";
    private final String Guardar = "//*[@id='dv-create-task']/div/input";
    private final String CerrarEdicion = "//div[@class='button-close']";
    private final String quitarInvitado = "//*[@id='input-invitados']/ul[1]/li/span";
    private final String Finalizar = "//div[contains(text(), 'Finaliza')]";
    private final String Calificacion = "//input[@value='Guardar sin calificar']";
    private final String DetalleFinalizadas = "//li[@data-id ='543115']";

    
    public TareaNormalPages(){
            super(driver);
    }
    /*

    public void homeTutask(){
        recargarHome("http://192.168.10.2:8284/#/Tareas");
    }
    */
    

    public void clicNuevaTarea(){
        clickElementJS(DesplegableTarea);
    }

    public void clicTareaNormal(){
        clickElementJS(nuevaTarea);
    }

    public void campoTextto(String asuntos, String etiquetas){
        write(Asuto, asuntos);
        write(Etiqueta, etiquetas);
        //write(Descripcion, textToWrite);
    }
    /*
    public void campoTextto1(String asuntosCampo, String etiquetasCampo){
        write(Asuto, asuntosCampo);
        write(Etiqueta, etiquetasCampo);
        //write(Descripcion, textToWrite);
    }
     */
    public void quitarInvitado(){
        clickElementJS(quitarInvitado);
    }

    public void campoInvitado(String criterial){
        write(Invitados, criterial);
        clickElement(listaInvitados);

    }
    public void campoTextto2(String invitadosCampo){
        write(Invitados, invitadosCampo);
        clickElementJS(listaInvitados2);
    }
    public void campoNegocio2(String negociosCampo){
        write(Negocios, negociosCampo);
        clickElementJS(listNEgocio);
    }

    public void campoNegocio(String criterial){
        write(Negocios, criterial);
        clickElement(listNEgocio);
    }



    public void cilcFecha(){
        clickElement(fecha);
        clickElement(flecha);
        clickElement(flecha);
        clickElement(clicDia);
    }

    public void clicEnviar(){
        clickElement(Enviar);
    }

    public void clicEnOpcionToda(){

        clikCondicional(Opcion, "active");
    }


    public void clicTarea(){
        clickElementJS(Tarea);
    }
    public void clicMas(){
        clickElementJS(Mas);
        clickElementJS(Editar);
    }
    public void clicGuardar(){
        clickElementJS(Guardar);
    }
    public void clicCerrarEdicion(){
        clickElementJS(CerrarEdicion);
    }
    public  void clicTarea2() {
        clickElementJS(Tarea);
    }
    public void clicFinalizar(){
        clickElementJS(Finalizar);
    }
    public void clikCalificacion(){
        clickElementJS(Calificacion);
    }
    public void clicEnOpcionFinalizar(){
        clikCondicional(OpFinalizar, "active");
    }
    public  void DetalleFInalizar(){
        clickElementJS(DetalleFinalizadas);
    }
    public void SeleccionarMasFinalizar(){
        clickElementJS(Mas);
        clickElementJS(Editar);
    }



    
}
