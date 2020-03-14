/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;

/**
 *
 * @author Anirudh
 */
public interface BankDAO { 

    public int createTransaction(int fromAct, int toAct, String ifscCode, double amount);
    
    public Object[][] getTransactions(int fromAct);
    
    public List<Integer> fetchAllAccounts();
    
}
