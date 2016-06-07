package fabricante;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import entidades.Aireacondicionado;
import entidades.Televisor;
public class Main {

	
	public static void main(String[] args) throws IOException
	{
	
		Fabricante fabricante1 = new Fabricante ();
		System.out.println("Ingrese el nombre del fabricante: ");
		String entrada = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		fabricante1.setNombre(entrada);
		System.out.println("Fabricante uno es "+fabricante1.getNombre());
		
		Fabricante fabricante2 = new Fabricante ();
		System.out.println("Ingrese el nombre del segundo fabricante: ");
	    entrada = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		fabricante2.setNombre(entrada);
		System.out.println("Fabricante dos es "+fabricante2.getNombre());		

		Televisor televisor1 = new Televisor ();		
		System.out.println("Ingrese el modelo del televisor 1 ");
		entrada = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		televisor1.setModelo(entrada);
		System.out.println("El modelo de televisor1 es "+televisor1.getModelo());
		System.out.println("Ingrese las pulgada del modelo de televisor 1 ");
		entrada = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		televisor1.setPulgadas( Integer.valueOf(entrada));
		System.out.println("El modelo de televisor1 tiene " + televisor1.getPulgadas() + " pulgadas ");
		System.out.println(" El modelo posee HDMI(true/false) ");
		entrada = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		televisor1.setPoseeHDMI( Boolean.getBoolean(entrada));
		System.out.println("El modelo de televisor1 tiene " + televisor1.getPulgadas() + " pulgadas ");
	
		
		Televisor televisor2 = new Televisor ();		
		System.out.println("Ingrese el modelo del televisor 2 ");
		entrada = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		televisor2.setModelo(entrada);
		System.out.println("El modelo de televisor2 es "+televisor2.getModelo());
		System.out.println("Ingrese las pulgadas del modelo de televisor 2 ");
		entrada = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		televisor2.setPulgadas( Integer.valueOf(entrada));
		System.out.println("El modelo de televisor 2 tiene " + televisor2.getPulgadas() + " pulgadas ");
		System.out.println(" El modelo posee HDMI(true/false) ");
		entrada = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		televisor2.setPoseeHDMI( Boolean.getBoolean(entrada));
		System.out.println("El modelo de televisor1 tiene " + televisor2.getPulgadas() + " pulgadas ");
		

		Aireacondicionado aire1 = new Aireacondicionado ();		
		System.out.println("Ingrese el modelo del aire 1 ");
		entrada = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		aire1.setModelo(entrada);
		System.out.println("El modelo de aire 1 es "+aire1.getModelo());
		System.out.println("Ingrese las frigorias del aire1 ");
		entrada = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		aire1.setFrigorias( Integer.valueOf(entrada));
		System.out.println("El modelo de aire1 tiene " + aire1.getFrigorias() + " frigorias ");
	

		
		Aireacondicionado aire2 = new Aireacondicionado ();		
		System.out.println("Ingrese el modelo del aire 2 ");
		entrada = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		aire2.setModelo(entrada);
		System.out.println("El modelo de aire 2 es "+aire2.getModelo());
		System.out.println("Ingrese las frigorias del aire2 ");
		entrada = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		aire2.setFrigorias( Integer.valueOf(entrada));
		System.out.println("El modelo de aire2 tiene " + aire2.getFrigorias() + " frigorias ");
		
		
		
		
	}
	
}
