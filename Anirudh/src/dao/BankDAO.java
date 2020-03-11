/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Anirudh
 */
public interface BankDAO { 

    public int createTransaction(int fromAct, int toAct, String ifscCode, double amount);
    
}
