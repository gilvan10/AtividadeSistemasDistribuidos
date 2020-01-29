/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.rmi.RemoteException;
import java.rmi.registry.*;
import java.rmi.NotBoundException;

public class RMIClient {
    
    public static void main(String args[]) {
        ICalculadora calc; 
        Registry registry;
        try{
            registry=LocateRegistry.getRegistry("127.0.1.1",3232);
            calc = (ICalculadora) (registry.lookup("primeiraCalculadoraRemota"));
            System.out.println(calc.multiplicar(10,5));
        }catch(RemoteException e) {
           e.printStackTrace();
        }catch(NotBoundException e) {
           e.printStackTrace();
        }
    }
}
