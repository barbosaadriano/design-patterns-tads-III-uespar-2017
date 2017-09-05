package singleton;

import javax.swing.JOptionPane;

/**
 *
 * @author drink
 */
public class MessageHelper {

    public enum Type {

        info, alert, error
    }
    private String message;
    private Type tipo;
    private static int instanceCount = 0;
    private static MessageHelper instance = null;

    private void MessageHelper() {

    }

    public static MessageHelper getInstance() {
        if (instance == null) {
            instance = new MessageHelper();
            instanceCount++;
        }
        return instance;
    }

    public static int getCountInstance() {
        return instanceCount;
    }

    public MessageHelper message(String message) {
        this.message = message;
        return this;
    }

    public MessageHelper type(Type tipo) {
        this.tipo = tipo;
        return this;
    }

    public void show() {
        switch (tipo) {
            case alert:
                JOptionPane.showMessageDialog(null,
                        message + " Criada " + getCountInstance(), "Singleton Alert Message",
                        JOptionPane.WARNING_MESSAGE);
                break;
            case error:
                JOptionPane.showMessageDialog(null,
                        message + " Criada " + getCountInstance(), "Singleton Error Message",
                        JOptionPane.ERROR_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null, message + " Criada " + getCountInstance(), "Singleton Info Message",
                        JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
