package com.zz.java.thinking.struct.agent.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemote extends Remote {

    public String sayHello() throws RemoteException;

}