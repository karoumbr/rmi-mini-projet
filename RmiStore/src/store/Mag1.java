package store;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Mag1 {
//serveur Mag1
	public static void main(String[] args) throws RemoteException, MalformedURLException, AlreadyBoundException {
		// TODO Auto-generated method stub
		
		//create the remote object
		Store obj = new StoreManager();
		//create the rmi registry
		Registry regstry = LocateRegistry.createRegistry(1099);
		//bind the remote object to the registry
		Naming.bind("StoreManager", obj);
		System.out.println("Server ready");
		

	}

}
