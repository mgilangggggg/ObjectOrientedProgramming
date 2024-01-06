/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

/**
 *
 * @author Gilang
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        User user = new User();
        
        while (user.getLogin() != 1) {
            try{
                user.inputDataUser();
                user.tampilDataUser();
            }catch (ValidateUserException e) {
                System.out.println(e);
                System.out.println("");
            }
        }
    }
}
