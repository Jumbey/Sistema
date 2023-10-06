
package Clases;

import javax.swing.JPanel;

public class CambiarVistas {
    public void hiden_panel(JPanel... panel){
        for(int i = 0; i<panel.length;i++){
        
            panel[i].setVisible(false);
        }
    }
}
