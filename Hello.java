import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Hello
{
    public static void main(String[] args) throws Exception
    {
        URL imageLocation = new URL("https://media.tenor.com/view/agnes-tachyon-uma-musume-dancing-dance-jukebox-gif-7997437424071463202.gif");
        JOptionPane.showMessageDialog(null, "Hello", "Title", JOptionPane.PLAIN_MESSAGE,
        new ImageIcon(imageLocation));
    }
}
