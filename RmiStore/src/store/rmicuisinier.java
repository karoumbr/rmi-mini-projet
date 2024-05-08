package store;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class rmicuisinier {
//le client RMI
	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		// TODO Auto-generated method stub
	
		
		System.out.println("Sélectionner le numéro de l’ingrédient, puis cliquez sur « Entrée » :");
		System.out.println("[1] cornichons");
		System.out.println("[2] safran");
		System.out.println("[3] sel");
		System.out.println("[4] poivre");
		
		//lire le choix de l'utilisateur
		Scanner scan = new Scanner(System.in);
		String choix =	 scan.next();
		System.out.println(choix);
		//selon le choix appeler les 3 magasins pour récupérer le prix de l'ingrédient
		Store obj = (Store) Naming.lookup("rmi://localhost:1099/StoreManager");
		
		//invoke a method on the remote object
	
		System.out.println("le prix est : "+ obj.getPrice("ingredient"));
	
		
		//comparer les prix récupérés
		
		//afficher le minimum des prix et le nom du magasin ayant ce dernier
		
		
	}

}