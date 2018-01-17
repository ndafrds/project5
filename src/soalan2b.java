/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FARID 1972
 */
import java.util.Scanner;
public class soalan2b {
public static void main(String[] args){
Scanner input=new Scanner(System.in);

int gajiasas=800;
double gaji;
double bonus;
int bilpelanggan;
 
    System.out.println("Masukkan bilangan pelanggan yang diperolehi:" );
    bilpelanggan=input.nextInt();
    
if (bilpelanggan==0){
    bonus=0;
}else if(bilpelanggan < 11){
    bonus=550;
}else if(bilpelanggan < 51){
    bonus=1400;    
}else if(bilpelanggan < 101){
    bonus=2500;
}else{
    bonus=10500;
}
gaji=gajiasas+bonus;
System.out.println("Jumlah gaji sebulan :" +gaji);
          
}
}

          
