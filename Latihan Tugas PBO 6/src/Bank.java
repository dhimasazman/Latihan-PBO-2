/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author dhima
 */
public class Bank {

        int saldo,simpanUang,getSaldo;
        
        public Bank(int saldo){
            
            this.saldo=saldo;
            
            System.out.println("Selamat Datang di Bank ABC");
            System.out.println("Saldo saat ini: Rp " + saldo);
            System.out.println("___________________________");
            
        }
        
        void simpanUang(int simpanUang){
                    
            System.out.println("Simpan Uang : Rp " +simpanUang);
            System.out.println("Saldo saat ini Rp " + saldo);
            System.out.println("___________________________");
        
        }
            
        void getSaldo(int getSaldo){
            System.out.println("Ambil Uang : Rp " +getSaldo);
            System.out.println("Saldo saat ini : Rp "+saldo);
            System.out.println("___________________________");
            
        }
            
            
            
        }
    
    

