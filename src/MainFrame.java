import base.MenuForm;
import javax.swing.JFrame;
import javax.swing.WindowConstants;


public class MainFrame extends JFrame {
     public void init() {
         MenuForm form = new MenuForm();
         form.show();
     }
}
