package com.adriana.proyectocinema;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
public class InicioSesión {
	
	
	//public InicioSesión() {
		// TODO Auto-generated constructor stub
	//}

	public static void main(String[] args) throws IOException {
		BufferedReader bufEntrada = new BufferedReader (new InputStream(System.in));
		int opc;
		do{
			System.out.println("Bienvenido al sistema administrativo del cine");
			System.out.println("Escoja que acción desea hacer:\n");
			System.out.println("1. Iniciar sesión\n");
			System.out.println("2. Terminar Sesión\n");
			opc = Integer.parseInt(bufEntrada.readLine());
			switch (opc){
			case 1:
				System.out.println("Bienvenido\n");
				System.out.println("Favor ingresar usuario\n");
				break;
			case 2:
				System.out.println("Gracias, sesión finalizada\n");
				break;
			default:
				System.out.println("Opción no válida");
				}
			System.out.println("Presione enter para continuar");
			System.in.read();
		} while (opc!=2);
		}
				}


