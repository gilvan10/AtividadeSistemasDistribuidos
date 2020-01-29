package negocio;

import java.net.InetAddress;
import java.rmi.RemoteException;
import java.rmi.server.*;
import java.rmi.registry.*;
import java.rmi.registry.LocateRegistry;

public class Calculadora extends UnicastRemoteObject implements ICalculadora {

    public Calculadora(String name) throws RemoteException {
        super();
        Registry registry;
        int porta = 3232;
        try {
            String address= (InetAddress.getLocalHost()).toString();
            System.out.println(address); 
            registry = LocateRegistry.createRegistry(porta);
            registry.rebind(name, this);
        }
        catch(RemoteException e){
            e.printStackTrace();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public int somar(int x, int y) throws RemoteException{
        return x + y;
    }

    @Override
    public int subtrair(int x, int y) throws RemoteException{
        return x - y;
    }

    @Override
    public int multiplicar(int x, int y) throws RemoteException{
        return x * y;
    }

    @Override
    public int dividir(int x, int y) throws RemoteException{
        return x / y;
    }
    
}
