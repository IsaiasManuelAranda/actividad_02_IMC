
package Main;

import views.ViewIMC;
import models.ModelIMC;
import controllers.ControllerIMC;

public class Main {
    private static ViewIMC viewIMC;
    private static ModelIMC modelIMC;
    private static ControllerIMC controllerIMC;
    
    public static void main(String[] args) {
        viewIMC = new ViewIMC();
        modelIMC = new ModelIMC();
        controllerIMC = new ControllerIMC(modelIMC, viewIMC);
    }
    
}
