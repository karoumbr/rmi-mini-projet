package store;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class StoreManager extends UnicastRemoteObject implements Store{

	protected StoreManager() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public float getPrice(String ingredient) throws RemoteException {
		// TODO Auto-generated method stub
		float x = 0;
		 String filePath = "D:/rmiproject/RmiStore/src/store/Mag1.txt";
		 File file = new File(filePath);
		 try {
	            // Créez un flux d'entrée pour lire le fichier
	            FileInputStream fileInputStream = new FileInputStream(file);
	            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
	            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

	            String line;

	            int counter = 0;
	            // Lisez chaque ligne du fichier jusqu'à ce qu'il n'y en ait plus
	            while ((line = bufferedReader.readLine()) != null ) {
	                //System.out.println(line); // Affichez chaque ligne lue sur la console
	                //chercher l'ingrédient demandé
	            	counter++;
	            	if(counter==4) {
	            		x= Float.parseFloat(line);
	            		break;
	            	}
	            	//System.out.println(ingredient);	
	                
	                
	            }

	            // Fermez les flux pour libérer les ressources
	            bufferedReader.close();
	            inputStreamReader.close();
	            fileInputStream.close();

	        } catch (IOException e) {
	            System.out.println("Une erreur s'est produite lors de la lecture du fichier : " + e.getMessage());
	            e.printStackTrace();
	        }
		//= (float) 100.500;
		
		return x;
	}

}
