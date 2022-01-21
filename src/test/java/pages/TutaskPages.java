package pages;

public class TutaskPages extends BasePages {

    private final String EntrarTextField = "//*[@id='logonprincipalform']/div[1]/input[1]";
    private final String PasswordTextField = "//*[@id='logonprincipalform']/div[1]/input[2]";
    private final String EntrarButton = "//*[@id='logonprincipalform']/div[2]/input";
    //---------------------------------------------------------------------------------------------------------------------
   

    //private String centroNegocios = "//div[@id='input-asunto']";
    //private String categoryDrop = "//html/body/div/text/nav/li[2]";
                                    
    

    public TutaskPages(){
            super(driver);
    }

    public void navegarTutask(){
        navegarTu("http://192.168.10.2:8284/Home/Login");
    }
    
    public void enterEntrarCriteria(String state){
        write(EntrarTextField, state);
    }
    public void enterPasswordCriterial(String password){
        write(PasswordTextField, password);
    }
    public void clicEntrada(){
        clickElement(EntrarButton);
    }
//-------------------------------------------------------------------------------------------------------
   


   



    /*
    public void clicCentroNegocios(){
        clickElement4(centroNegocios);
    }
    
    public void category(String category){
        selectNuevaTarea(categoryDrop, category);
    }
    */

}
