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

    @Override
    public int createAccount(String name, String gender, String occupation, String dateOfBirth, String idProof1, 
            String idProof2, String idProof3, String fatherName, String motherName, String address, String typeOfAccount, String userName)  {
        try{
            String sql = "INSERT INTO user_info (user_name, dob, father_name, mother_name, occupation) VALUES "
                + "('"+name+"','"+dateOfBirth+"','"+fatherName+"','"+motherName+"','"+occupation+"')";
            System.out.println(sql);
        return DBUtil.executeInsert(sql);
        }catch(Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    @Override
    public int createLogin(String userId, String password, String role) {
        try{
            String sql = "INSERT INTO login_tbl (user_id, password, role, creation_date) VALUES  "
                + "('"+userId+"','"+password+"','"+role+"',NOW())";
            System.out.println(sql);
        return DBUtil.executeInsert(sql);
        }catch(Exception e) {
            e.printStackTrace();
        }
        return -1; 
    }
    
    
}
