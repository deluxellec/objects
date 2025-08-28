import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Hello
{
    public static void main(String[] args) throws Exception
    {
        ImageIcon imageLocation = new ImageIcon("https://fetchpik.com-tFf2mOjRhw.gif");
        JOptionPane.showMessageDialog(null, "Hello", "Title", JOptionPane.PLAIN_MESSAGE, imageLocation);
    }
}
