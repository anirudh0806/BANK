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
    
    public int createAccount(String name, String gender, String occupation, String dateOfBirth, String idProof1, String idProof2, String idProof3, 
            String fatherName, String motherName, String address, String typeOfAccount, String userName);
    
    
    public int createLogin(String userId, String password, String role);
}
