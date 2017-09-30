/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mario
 */
public interface ConexionRemota extends Remote {
     void insertardatos(String[] datos) throws RemoteException;
     DefaultTableModel consultar() throws RemoteException;
}
