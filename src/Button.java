import javax.swing.JButton;
import javax.swing.Icon;
import java.awt.Font;

public class Button extends JButton {

    Button(String text, Icon icon) {

        super (text, icon);

        Font newButtonFont = new Font (this.getFont().getName(),this.getFont().getStyle(),11);

        this.setFont(newButtonFont);
        this.setFocusable(false);
        this.setHorizontalTextPosition(CENTER);
        this.setVerticalTextPosition(BOTTOM);
    }
}