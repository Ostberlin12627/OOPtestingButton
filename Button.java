import javax.swing.*;
import java.awt.*;

public class Button {
    private String text = "Zurück";

    private int x = 100;

    private int y = 100;

    private int width = 100;

    private int height = 100;

    private Color bColor = Color.BLACK;

    private Color fColor = Color.WHITE;

    private Boolean focu = true;

    private Font font = new Font("Arial",Font.BOLD,20);
    JButton back;
    public Button(String text,int x,int y,int width,int height,Color bColor,Color fColor,Boolean focu){
            this.back = new JButton();
            this.back.setText(text);
            this.back.setBounds(x,y,width,height);
            this.back.setBackground(bColor);
            this.back.setForeground(fColor);
            this.back.setFocusable(focu);
            this.back.setFont(font);
        }

        public void setText(){
            this.text = text;
            back.setText(text);
        }

        public void setkoords(){
            this.x = x;
            this.y =y;
            back.setBounds(x,y,width,height);
        }

        public void setgroesse(){
            this.width = width;
            this.height = height;
            back.setBounds(x, y, width, height);
        }

        public void sethintergrund(Color bColor) {
            this.bColor = bColor;
            back.setBackground(bColor);
        }

        public void setSchriftfarbe(Color fColor) {
            this.fColor = fColor;
            back.setForeground(fColor);
        }

}

