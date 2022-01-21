package pages;

public class TareaNormalPages extends BasePages{

    private final String DesplegableTarea = "//*[@id='header-tutask']/nav/div[1]";
    private final String nuevaTarea = "//*[@id='header-tutask']/nav/div[1]/ul/li[1]";
    private final String Asuto = "//*[@id='input-asunto']/textarea";
    private final String Invitados = "//*[@id='input-invitados']/input";
    private final String listaInvitados = "/html/body/div[8]/div[2]/div/section/div/div/div/form/text[1]/div[6]/ul[2]/li[1]";
    private final String nominvitado = "//*[@id='ui-id-387']";
    private final String Etiqueta = "//*[@id='form-create-task']/text[1]/div[8]/input";
    private final String listNEgocio = "/html/body/div[8]/div[2]/div/section/div/div/div/form/text[1]/div[9]/ul[2]/li[1]";
    private final String Negocios = "/html/body/div[8]/div[2]/div/section/div/div/div/form/text[1]/div[9]/input";
    //private String Descripcion = "//body/div[@id='1512']/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/form[1]/text[2]/div[1]/div[1]/div[1]/iframe[1]";
    private final String flecha = "//*[@id='dv-form-task']/div/div/a[2]";
    private final String fecha = "//*[@id='dv-fecha']/input";
    private final String clicDia = "//*[@id='dv-form-task']/div/table/tbody/tr[3]/td[2]/a";
    private final String Enviar = "//*[@id='dv-create-task']/div/input";

    
    public TareaNormalPages(){
            super(driver);
    }
    /*

    public void homeTutask(){
        recargarHome("http://192.168.10.2:8284/#/Tareas");
    }
    */
    

    public void clicNuevaTarea(){
        clickElement2(DesplegableTarea);
    }

    public void clicTareaNormal(){
        clickElement(nuevaTarea);
    }

    public void campoTextto(String asuntos, String etiquetas){
        write(Asuto, asuntos);
        write(Etiqueta, etiquetas);
        //write(Descripcion, textToWrite);
    }

    public void campoInvitado(String criterial){
        write(Invitados, criterial);
        clickElement(listaInvitados);

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



    
}
