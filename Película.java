package com.adriana.proyectocinema;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Película {
			BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));

		public void pelicula1() throws IOException {
			String director;
			String genero;
			String nombre;
			String sala;
			System.out.println("Datos de la Pelicula\n");
			System.out.println("Nombre Película:\n ");
			nombre = bufEntrada.readLine();
			System.out.println("Nombre director:\n ");
			director = bufEntrada.readLine();
			System.out.println("Genero de la película:\n ");
			genero = bufEntrada.readLine();
			System.out.println("Sala en que se proyecta:\n ");
			sala = bufEntrada.readLine();
			System.out.println("Película 1 a presentar:\n ");
			System.out.println(nombre+director+genero+sala);
		}

		public void pelicula2() throws IOException {
			String director;
			String genero;
			String nombre;
			String sala;
			System.out.println("Datos de la Pelicula\n");
			System.out.println("Nombre Película:\n ");
			nombre = bufEntrada.readLine();
			System.out.println("Nombre director:\n ");
			director = bufEntrada.readLine();
			System.out.println("Genero de la película:\n ");
			genero = bufEntrada.readLine();
			System.out.println("Sala en que se proyecta:\n ");
			sala = bufEntrada.readLine();
			System.out.println("Película 2 a presentar:\n ");
			System.out.println(nombre+director+genero+sala);
		}

		public void pelicula3() throws IOException {
			String director;
			String genero;
			String nombre;
			String sala;
			System.out.println("Datos de la Pelicula\n");
			System.out.println("Nombre Película:\n ");
			nombre = bufEntrada.readLine();
			System.out.println("Nombre director:\n ");
			director = bufEntrada.readLine();
			System.out.println("Genero de la película:\n ");
			genero = bufEntrada.readLine();
			System.out.println("Sala en que se proyecta:\n ");
			sala = bufEntrada.readLine();
			System.out.println("Película 3 a presentar:\n ");
			System.out.println(nombre+director+genero+sala);
		}

		public void pelicula4() throws IOException {
			String director;
			String genero;
			String nombre;
			String sala;
			System.out.println("Datos de la Pelicula\n");
			System.out.println("Nombre Película:\n ");
			nombre = bufEntrada.readLine();
			System.out.println("Nombre director:\n ");
			director = bufEntrada.readLine();
			System.out.println("Genero de la película:\n ");
			genero = bufEntrada.readLine();
			System.out.println("Sala en que se proyecta:\n ");
			sala = bufEntrada.readLine();
			System.out.println("Película 1 a presentar:\n ");
			System.out.println(nombre+director+genero+sala);
		}

		public void main(String args[]) throws IOException {
			System.out.println("Película 1 a presentar: ");
			pelicula1();
			System.out.println("Película 2 a presentar: ");
			pelicula2();
			System.out.println("Película 3 a presentar: ");
			pelicula3();
			System.out.println("Película 4 a presentar: ");
			pelicula4();
		}
	}
