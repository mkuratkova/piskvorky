package cz.czechitas.piskvorky;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;

public class HlavniOkno extends JFrame {

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner non-commercial license
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button6;
    JButton button7;
    JButton button5;
    JButton button8;
    JButton button9;
    JTextField textField1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    JPanel contentPane;
    MigLayout migLayoutManager;
    JButton stisknuteTlacitko;

    public HlavniOkno() {
        initComponents();
    }

    // dopsat kod pro opakovani - hrac muze hrat jenom pokud je policko oznacene jako "" + ukončení hry

    boolean hrac = true;
    int i = 0;

    private void priKlepnutiNaTlacitko(MouseEvent e) {
        stisknuteTlacitko = (JButton) e.getSource();

        if (stisknuteTlacitko.getText() == "") {
            if (hrac) {
                stisknuteTlacitko.setText("X");
                textField1.setText("Teď je na řadě druhý hráč.");
                hrac = false;

            } else {
                stisknuteTlacitko.setText("O");
                textField1.setText("Teď je na řadě druhý hráč.");
                hrac = true;
            }
        }
        i += 1;
        if (i == 9) {
            textField1.setText("Hra skoncila.");
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner non-commercial license
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        button5 = new JButton();
        button8 = new JButton();
        button9 = new JButton();
        textField1 = new JTextField();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MK_piskvorky");
        setMinimumSize(new Dimension(35, 57));
        Container contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "insets rel,hidemode 3,align trailing center",
            // columns
            "[fill]" +
            "[fill]" +
            "[fill]",
            // rows
            "[]" +
            "[]" +
            "[]" +
            "[]"));
        this.contentPane = (JPanel) this.getContentPane();
        this.contentPane.setBackground(this.getBackground());
        LayoutManager layout = this.contentPane.getLayout();
        if (layout instanceof MigLayout) {
            this.migLayoutManager = (MigLayout) layout;
        }

        //---- button1 ----
        button1.setFont(button1.getFont().deriveFont(button1.getFont().getSize() + 3f));
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                priKlepnutiNaTlacitko(e);
            }
        });
        contentPane.add(button1, "cell 0 0,dock center,wmin 40,hmin 40");

        //---- button2 ----
        button2.setFont(button2.getFont().deriveFont(button2.getFont().getSize() + 3f));
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                priKlepnutiNaTlacitko(e);
            }
        });
        contentPane.add(button2, "cell 1 0,dock center,wmin 40,hmin 40");

        //---- button3 ----
        button3.setFont(button3.getFont().deriveFont(button3.getFont().getSize() + 3f));
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                priKlepnutiNaTlacitko(e);
            }
        });
        contentPane.add(button3, "cell 2 0,dock center,wmin 40,hmin 40");

        //---- button4 ----
        button4.setFont(button4.getFont().deriveFont(button4.getFont().getSize() + 3f));
        button4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                priKlepnutiNaTlacitko(e);
            }
        });
        contentPane.add(button4, "cell 0 1,dock center,wmin 40,hmin 40");

        //---- button6 ----
        button6.setFont(button6.getFont().deriveFont(button6.getFont().getSize() + 3f));
        button6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                priKlepnutiNaTlacitko(e);
            }
        });
        contentPane.add(button6, "cell 1 1,dock center,wmin 40,hmin 40");

        //---- button7 ----
        button7.setFont(button7.getFont().deriveFont(button7.getFont().getSize() + 3f));
        button7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                priKlepnutiNaTlacitko(e);
            }
        });
        contentPane.add(button7, "cell 2 1,dock center,wmin 40,hmin 40");

        //---- button5 ----
        button5.setFont(button5.getFont().deriveFont(button5.getFont().getSize() + 3f));
        button5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                priKlepnutiNaTlacitko(e);
            }
        });
        contentPane.add(button5, "cell 0 2,dock center,wmin 40,hmin 40");

        //---- button8 ----
        button8.setFont(button8.getFont().deriveFont(button8.getFont().getSize() + 3f));
        button8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                priKlepnutiNaTlacitko(e);
            }
        });
        contentPane.add(button8, "cell 1 2,dock center,wmin 40,hmin 40");

        //---- button9 ----
        button9.setFont(button9.getFont().deriveFont(button9.getFont().getSize() + 3f));
        button9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                priKlepnutiNaTlacitko(e);
            }
        });
        contentPane.add(button9, "cell 2 2,dock center,wmin 40,hmin 40");

        //---- textField1 ----
        textField1.setEditable(false);
        textField1.setFont(textField1.getFont().deriveFont(textField1.getFont().getSize() + 3f));
        contentPane.add(textField1, "cell 0 3 3 1");
        setSize(326, 300);
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
}
