package com.adriana.proyectocinema;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
public class InicioSesi�n {
	
	
	//public InicioSesi�n() {
		// TODO Auto-generated constructor stub
	//}

	public static void main(String[] args) throws IOException {
		BufferedReader bufEntrada = new BufferedReader (new InputStream(System.in));
		int opc;
		do{
			System.out.println("Bienvenido al sistema administrativo del cine");
			System.out.println("Escoja que acci�n desea hacer:\n");
			System.out.println("1. Iniciar sesi�n\n");
			System.out.println("2. Terminar Sesi�n\n");
			opc = Integer.parseInt(bufEntrada.readLine());
			switch (opc){
			case 1:
				System.out.println("Bienvenido\n");
				System.out.println("Favor ingresar usuario\n");
				break;
			case 2:
				System.out.println("Gracias, sesi�n finalizada\n");
				break;
			default:
				System.out.println("Opci�n no v�lida");
				}
			System.out.println("Presione enter para continuar");
			System.in.read();
		} while (opc!=2);
		}
				}


