

package DTO;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class DTO_Category {
    private String kind;
    private JPanel jpanel;
    private JLabel jlabel;

    public DTO_Category(){}
    
    public DTO_Category(String kind, JPanel jpanel, JLabel jlabel) {
        this.kind = kind;
        this.jpanel = jpanel;
        this.jlabel = jlabel;
    }

    public String getKind() {
        return kind;
    }

    public JPanel getJpanel() {
        return jpanel;
    }

    public JLabel getJlabel() {
        return jlabel;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setJpanel(JPanel jpanel) {
        this.jpanel = jpanel;
    }

    public void setJlabel(JLabel jlabel) {
        this.jlabel = jlabel;
    }
     
   
    
}
