package ch11_proxy;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
    String location;
    int count;

    public GumballMachine(String location, int count) throws RemoteException {
        this.location = location;
        this.count = count;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public State getState() throws RemoteException {
        return null;
    }

    public int getCount() {
        return count;
    }
}
