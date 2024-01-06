/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Gilang
 */
public class Nilai {
    private int nilai;

    public int getNilai() {
        return nilai;
    }

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }
    
    public void inputNilai() throws ValidateScoreException{
        Scanner inputNilai = new Scanner(System.in);
        
        try{
        System.out.print("Masukan Nilai (Wajib direntang 0 - 100) : ");
        this.setNilai(inputNilai.nextInt());
        if (this.getNilai() < 0 || this.getNilai() > 100){
            throw new InputMismatchException();
        }
        }catch (InputMismatchException e){
            String messege = "Nilai yang diinputkan harus bertipe integer";
            if (this.getNilai()<0||this.getNilai()>100){
                messege = "Nilai Tidak Direntang 0 s/d 100";                
            }
            throw new ValidateScoreException(messege);
        }
    }
}
