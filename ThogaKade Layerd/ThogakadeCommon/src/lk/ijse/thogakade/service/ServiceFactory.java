/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.thogakade.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import lk.ijse.thogakade.observers.Subject;

/**
 *
 * @author student
 */
public interface ServiceFactory extends Remote{
    
    public enum ServiceTypes{
        CUSTOMER, ORDER,ITEM;
    }
    
    public SuperService getService(ServiceTypes serviceType) throws RemoteException;
    
}
