/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
    
    public Object[][] getTransactions(int act) {
    	List<List<String>> output = new ArrayList<List<String>>();
    	try{
    		//"Date", "Description", "Credit", "Debit"
            String sql = "select CREATION_DATE, 'From Ac: '+From_AC as DESCRIPTION, AMOUNT AS CREDIT, NULL AS DEBIT FROM TRANSACTION_TBL "
            		+ "where to_AC = "+ act+ " "
            		+ "UNION ALL "
            		+ "select CREATION_DATE, 'To Ac: '+TO_AC as DESCRIPTION, NULL AS CREDIT, AMOUNT AS DEBIT FROM TRANSACTION_TBL "
            		+ "where from_AC = " +act;
            
            ResultSet set = DBUtil.executeSelect(sql);
            
            while(set.next()) {
            	List<String> row = new ArrayList<String>();
            	row.add(set.getString("CREATION_DATE"));
            	row.add(set.getString("DESCRIPTION"));
            	String credit = set.getString("CREDIT");
            	if(credit != null) credit = credit.replace("0E0", "00");
            	row.add(credit);
            	String debit = set.getString("DEBIT");
            	if(debit != null) debit = debit.replace("0E0", "00");
            	row.add(debit);
            	output.add(row);
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    	Object[][] op = new Object[output.size()][4];
        
    	int count = 0;
    	for(List row: output) {
    		op[count] = new Object[4];
    		op[count][0] = row.get(0);
    		op[count][1] = row.get(1);
    		op[count][2] = row.get(2);
    		op[count][3] = row.get(3);
    		count++;
    	}
    	return op;
    }
    
    public List<Integer> fetchAllAccounts() {
    	List<Integer> accounts = new ArrayList<>();
    	try{
            String sql = "select distinct ACC_NO from LOGIN_TBL";
            ResultSet set = DBUtil.executeSelect(sql);
            while(set.next()) {
            	int acNo = set.getInt("ACC_NO");
            	if(acNo > 0) {
            		accounts.add(acNo);
            	}
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
        return accounts; 
    }
}
