package source;

import java.awt.Container;
import java.awt.event.*;
import java.io.*;

import javax.swing.*;

public class Principal {
	
	JFrame jframe;
	JLabel etiqueta;
	JButton boton;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	File f=new File("C:/Users/christian/Desktop/registros.txt"); 
			try{ 
			FileReader fr=new FileReader(f); 
			BufferedReader br=new BufferedReader(fr); 
			String s; 
			do{ 
			 s=br.readLine(); 
			 System.out.println(s); 
			}while(s!=null); 
			} 
			catch(FileNotFoundException e){ 
				System.out.println("Error al abrir el archivo"); 
				} 
				catch(IOException e){ 
				System.out.println("Error al leer"); 
				} 
			
			new Principal().init();
			}

	public void init(){
		jframe = new JFrame();
		jframe.setSize(800, 600);
		jframe.setVisible(true);
		etiqueta = new JLabel();
		etiqueta.setText("soy una etiqueta");
		etiqueta.setBounds(100, 100, 100, 50);
		jframe.add(etiqueta);
		boton = new JButton();
		boton.setText("Presioname");
		
		//adding a listener
				boton.addActionListener(new ActionListener() {
		            public void actionPerformed(ActionEvent e)
		            {
		                //Execute when button is pressed
		                System.out.println("Presionaste un botton");
		            }
		        });    
				jframe.add(boton);
	}
}
	
	
	
