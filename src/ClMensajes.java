
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ClMensajes {
	
	JFrame FrmFrame;
	
	/** Constructor basico de la clase*/
	public ClMensajes() {
	}
	
	/** Metodo. Mostramos el mensaje que pasan por Msg */
	protected void setMensaje(String Msg) {
		try {
				JOptionPane.showMessageDialog(FrmFrame, Msg);
		} catch (NullPointerException Err) {
				JOptionPane.showMessageDialog(FrmFrame, "Error -- " + Err.getMessage());
		}
	}
}
