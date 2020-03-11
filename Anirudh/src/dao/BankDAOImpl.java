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
public class BankDAOImpl implements BankDAO {

    //CREATE MEMORY TABLE PUBLIC.TRANSACTION_TBL(FROM_AC INTEGER NOT NULL,TO_AC INTEGER NOT NULL,CREATION_DATE DATE,IFSC_CODE VARCHAR(50),AMOUNT DOUBLE)

    public int createTransaction(int fromAct, int toAct, String ifscCode, double amount) {
    	try{
            String sql = "INSERT INTO TRANSACTION_TBL (FROM_AC, TO_AC, CREATION_DATE, IFSC_CODE, AMOUNT) VALUES  "
                + "("+fromAct+","+toAct+",NOW(),'"+ifscCode+"',"+amount+")";
            System.out.println(sql);
            return DBUtil.executeInsert(sql);
        }catch(Exception e) {
            e.printStackTrace();
        }
        return -1; 
    }
    
}
