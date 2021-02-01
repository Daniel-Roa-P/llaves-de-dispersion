
package dispersiones;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Dispersiones extends JFrame implements ActionListener{

    public JLabel label1 = new JLabel("Ingresar el codigo de la persona: ");
    public JLabel label2 = new JLabel("Ingresar el nombre de la persona:");
    public JLabel label3 = new JLabel("llave de disperción:");
    public JLabel label4 = new JLabel("Cursores, ");
    public JLabel label5 = new JLabel("Cabeza de listas");
    public JLabel label6 = new JLabel("Siguiente disponible:");
    public JLabel label7 = new JLabel("Daniel Alejandro Roa Palacios");
    public JLabel label8 = new JLabel("Universidad Distrital Francisco Jose de Caldas");
    public JLabel label9 = new JLabel("20171020077");
    public JLabel label10 = new JLabel("Ingresar el codigo de la persona a retirar: ");
    
    public JLabel llaveTexto = new JLabel("3");
    public JLabel sigTexto = new JLabel("1");
    public JLabel infoTexto = new JLabel("Informacion: ");
    
    public JTextField tfCodigo = new JTextField("156");
    public JTextField tfCodigoRetiro = new JTextField("156");
    public JTextField tfNombre = new JTextField("Manuel");
    
    public JButton botonIngresar = new JButton("Ingresar");
    public JButton botonRetirar = new JButton("Retirar");
    
    JScrollPane scrollPane = new JScrollPane();
    JScrollPane scrollPane1 = new JScrollPane();
    
    JScrollPane scrollPane2 = new JScrollPane();
    JScrollPane scrollPane3 = new JScrollPane();
    
    int llave = 5;
    
    ListaIndices lista = new ListaIndices();
    
    public static void main(String[] args) {

        Dispersiones dispersion = new Dispersiones(); 
        dispersion.setBounds(0, 0, 1100, 650);
        dispersion.setTitle("Dispersiones - Encadenamiento separado");
        dispersion.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        dispersion.setVisible(true);

    }
    
    Dispersiones(){
        
        Container c = getContentPane();
        c.setLayout(null);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        
        c.add(label1);
        c.add(label2);
        c.add(label3);
        c.add(label4);
        c.add(label5);
        c.add(label6);
        c.add(label7);
        c.add(label8);
        c.add(label9);
        c.add(label10);
        c.add(llaveTexto);
        c.add(sigTexto);
        c.add(infoTexto);
        
        c.add(tfNombre);
        c.add(tfCodigo);
        c.add(tfCodigoRetiro);
        
        c.add(botonIngresar);
        c.add(botonRetirar);
        
        c.add(scrollPane1);
        c.add(scrollPane3);
        
        label1.setBounds(350, 25, 200, 20);
        label2.setBounds(350, 50, 500, 20);
        label3.setBounds(750, 25, 150, 20);
        label4.setBounds(25, 125, 200, 20);
        label5.setBounds(750, 125, 500, 20);
        label6.setBounds(85, 125, 150, 20);
        label7.setBounds(25, 25, 200, 20);
        label8.setBounds(25, 50, 500, 20);
        label9.setBounds(25, 75, 370,20);
        label10.setBounds(750, 50, 250, 20);
        
        llaveTexto.setBounds(870, 25, 30, 20);
        sigTexto.setBounds(210, 125, 20, 20);
        infoTexto.setBounds(25, 550, 1000, 30);
        
        tfNombre.setBounds(550, 48, 145, 20);
        tfCodigo.setBounds(550, 25, 145, 20);
        tfCodigoRetiro.setBounds(990, 50, 50, 20);
        
        botonIngresar.addActionListener(this);
        botonIngresar.setBackground(Color.GREEN);
        botonIngresar.setBounds(350, 75, 350,20);
        botonRetirar.addActionListener(this);
        botonRetirar.setBackground(Color.RED);
        botonRetirar.setBounds(750, 75, 290,20);        
        
        scrollPane.setBounds(25, 150, 2500, 2500);
        scrollPane.setPreferredSize(new Dimension(2500, 2500));  
        
        scrollPane1.setBounds(25, 150, 675, 400);
        scrollPane1.setPreferredSize(new Dimension(1150, 400)); 
        
        scrollPane2.setBounds(750, 150, 2500, 2500);
        scrollPane2.setPreferredSize(new Dimension(2500, 2500));  
        
        scrollPane3.setBounds(750, 150, 290, 400);
        scrollPane3.setPreferredSize(new Dimension(1150, 400)); 
        
    }
    
    public void pintarCabezas(){
        
        scrollPane2.removeAll();
        
        NodoIndice indice = lista.getCabezaIndice();
        
        System.out.println(lista.getTamaño());
        
        for(int i = 0; i < lista.getTamaño(); i++){
            
            JLabel textoIndice = new JLabel(Integer.toString(indice.getIndice()));
            textoIndice.setBounds((i*50) + 5 , 30, 150, 30);
            
            scrollPane2.add(textoIndice);
            
            NodoCodigo codigo = indice.getCodigos().getCabezaCodigo();
            
            for(int j = 0; j < indice.getTamaño(); j++){
            
                JLabel img = new JLabel();
        
                ImageIcon imgIcon = new ImageIcon(getClass().getResource("Abajo.png"));

                Image imgEscalada = imgIcon.getImage().getScaledInstance(30,50, Image.SCALE_SMOOTH);
                Icon iconoEscalado = new ImageIcon(imgEscalada);
                img.setBounds(i*48 , 70 + (j*100), 30, 50);
                img.setIcon(iconoEscalado);
                
                JLabel textoEstudiante = new JLabel(Integer.toString(codigo.getCogigo()));
                textoEstudiante.setBounds(i*48, 120 + (j*100), 150, 50);

                scrollPane2.add(textoEstudiante);
                
                scrollPane2.add(img);
                
                codigo = codigo.getSiguiente();
                
            }
            
            if(i < lista.getTamaño()-1){
                
                JLabel img2 = new JLabel();
        
                ImageIcon imgIcon = new ImageIcon(getClass().getResource("Derecha.png"));

                Image imgEscalada = imgIcon.getImage().getScaledInstance(45,25, Image.SCALE_SMOOTH);
                Icon iconoEscalado = new ImageIcon(imgEscalada);
                img2.setBounds(10 + (i*50) , 30, 45, 25);
                img2.setIcon(iconoEscalado);

                scrollPane2.add(img2);
                
            }

            indice = indice.getSiguiente();
            
        }
        
        scrollPane2.repaint();
        scrollPane3.setViewportView(scrollPane2);
        
    }
    
    void calcularNuevaLlave(){
        
        llave = llave + 2;
        int divisor = 3;
        
        while(true){
            
            if( (llave % divisor) != 0 || llave == divisor){
            
                if( llave != divisor ){
                
                    divisor = divisor + 2;
                
                } else {
                    
                    System.out.println(llave);
                    break;
                    
                }
                                            
            } else {
                            
            llave = llave + 2;
            divisor = 3;
            
            }
        }
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == botonIngresar){

            if(lista.getTamaño()==0){
                
                for(int i = 0; i<llave; i++){

                    
                    lista.insertar(i);

                }

            }
            
            int codigo = Integer.parseInt(tfCodigo.getText());
            String nombre = tfNombre.getText();

            lista.ingresarCodigo(codigo%llave, codigo, nombre);
            
            pintarCabezas();
            
        } else if (e.getSource() == botonRetirar){
        
            int codigo = Integer.parseInt(tfCodigoRetiro.getText());

            lista.eliminarCodigo(codigo%llave, codigo);
            
            pintarCabezas();
            
        }
        
    }
    
}
