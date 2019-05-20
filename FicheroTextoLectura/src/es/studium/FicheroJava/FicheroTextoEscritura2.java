package es.studium.FicheroJava;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FicheroTextoEscritura2
{
	public FicheroTextoEscritura2()
	{
		//FileWriter tamb�en puede lanzar una excepci�n
		try {
			//Destino de los datos

			FileWriter fw = new FileWriter("Archivo.txt");

			//Buffer de escritura

			BufferedWriter bw = new BufferedWriter(fw);

			//Objeto para la escritura

			PrintWriter salida = new PrintWriter(bw);

			//Guardamos la primera l�nea
			//Segunda parte: A�adiremos la segunda frase y un double
			salida.println("Segunda l�nea");
			double b= 123.45;
			
			salida.println(b);
			//Cerrar el objeto salida, el objeto bw y el fw
			
			salida.close();
			bw.close();
			fw.close();
			System.out.println("Archivo creado correctamente!");
		}
		catch (IOException i)
		{
			System.out.println("Se produjo un error de Archivo");
			
		}
	}
	public static void main (String[] args)
	{
		new FicheroTextoEscritura2();
	}
}
	

