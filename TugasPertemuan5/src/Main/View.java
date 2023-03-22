/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.awt.event.*;
import javax.swing.*;
import Ruang.Balok;
import Bidang.PersegiPanjang;
import java.util.InputMismatchException;
/**
 *
 * @author ASUS
 */
public class View extends JFrame implements ActionListener {
  private JLabel lbljudul, lblpanjang, lbllebar, lbltinggi, lblhasil, lblVolume, lblLp, lblLuas, lblKeliling;
  private JTextField panjang, lebar, tinggi;
  private JButton count, reset;

    public View() {
        setTitle("Cuboid Calculator");
        setSize(400, 500);
        setLocationRelativeTo(null);
        setLayout(null);

        lbljudul = new JLabel("Cuboid Calculator");
        lblpanjang = new JLabel("Lenght");
        lbllebar = new JLabel("width");
        lbltinggi = new JLabel("Height");
        lblhasil = new JLabel("result");

        panjang = new JTextField();
        lebar = new JTextField();
        tinggi = new JTextField();

        count = new JButton("Count");
        reset = new JButton("Reset");

        lbljudul.setBounds(150, 30, 150, 20);
        lblpanjang.setBounds(80, 80, 150, 20);
        lbllebar.setBounds(80, 110, 150, 20);
        lbltinggi.setBounds(80, 140, 150, 20);
        panjang.setBounds(170, 80, 150, 20);
        lebar.setBounds(170, 110, 150, 20);
        tinggi.setBounds(170, 140, 150, 20);
        lblhasil.setBounds(150, 170, 150, 20);
        count.setBounds(100, 400, 70, 20);
        reset.setBounds(200, 400, 70, 20);
        add(lbljudul);
        add(lblpanjang);
        add(lbllebar);
        add(lbltinggi);
        add(panjang);
        add(lebar);
        add(tinggi);
        add(lblhasil);
        add(count);
        add(reset);

        count.addActionListener(this);
        reset.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == count)
        {
            double vBalok, lpBalok, lPersegiPjg, kPersegiPjg;

            //float p = Integer.parseInt(panjang.getText());
            //float l = Integer.parseInt(lebar.getText());
            //float t = Integer.parseInt(tinggi.getText());

            try
            {
                float p = Integer.parseInt(panjang.getText());
                float l = Integer.parseInt(lebar.getText());
                float t = Integer.parseInt(tinggi.getText());
                
                           PersegiPanjang PersegiPjg = new PersegiPanjang(p, l);
            lPersegiPjg = PersegiPjg.luas();
            kPersegiPjg = PersegiPjg.keliling();
            Balok balok = new Balok(p, l, t);
            lpBalok = balok.luasPermukaan();
            vBalok = balok.volume();

            lblLuas = new JLabel();
            lblKeliling = new JLabel();
            lblVolume = new JLabel();
            lblLp = new JLabel();

            lblLuas.setBounds(80, 200, 300, 20);
            lblKeliling.setBounds(80, 230, 300, 20);
            lblLp.setBounds(80, 260, 300, 20);
            lblVolume.setBounds(80, 290, 300, 20);

            add(lblLuas);
            add(lblKeliling);
            add(lblVolume);
            add(lblLp);

            lblLuas.setText("Square Area : " + String.valueOf(lPersegiPjg));
            lblKeliling.setText("Square Circumference : " + String.valueOf(kPersegiPjg));
            lblVolume.setText("Cuboid Valoume  : " + String.valueOf(vBalok));
            lblLp.setText("Cuboid Surface Area : " + String.valueOf(lpBalok));
            } catch (NumberFormatException error)
            {
                JOptionPane.showMessageDialog(this, "Input nya angka yh");
            }
        } else if (e.getSource() == reset)
        {
            panjang.setText("");
            lebar.setText("");
            tinggi.setText("");
            lblLuas.setText("");
            lblKeliling.setText("");
            lblLp.setText("");
            lblVolume.setText("");
        }
    }  
    
}
