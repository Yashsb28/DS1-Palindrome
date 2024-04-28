import java.rmi.*;

interface Serverintf extends Remote {

public boolean isPalindrome(String str) throws RemoteException;
}