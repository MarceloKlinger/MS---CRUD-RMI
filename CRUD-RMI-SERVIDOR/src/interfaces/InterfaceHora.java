package interfaces;

import classes.Hora;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface InterfaceHora extends Remote {
    public void setId(int id) throws RemoteException;
    public void setHoras(int horas) throws RemoteException;
    public void setMinutos(int minutos) throws RemoteException;
    public int getId() throws RemoteException;
    public int getHoras() throws RemoteException;
    public int getMinutos() throws RemoteException;
    public void insert() throws RemoteException;
    public ArrayList<Hora> select() throws RemoteException;
    public void delete(int id) throws RemoteException;
}
