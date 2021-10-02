
 private ImageIcon icon;
    private Container c;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;

public void iconuser()
    {
        icon = new ImageIcon(getClass().getResource("download.jpg"));
        this.setIconImage(icon.getImage());

    }
public Registationpage() {
        iconuser();
        initComponents();
     c = this.getContentPane();  
     c.setBackground(Color.red);
     initComponents();
    }