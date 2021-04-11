package inventory;
import java.util.Scanner;
import java.util.InputMismatchException;

public class InventPro {
    Scanner run = new Scanner(System.in);
    int semua;
    String[] nama = new String[25];
    int[] jumBarang = new int[25];
    int[] harga = new int[25];
    int[] stok = new int[25];
    int[] jumlah = new int[25];
    
    public void menu(){
        do{
            System.out.println("jumlah produk yang ingin diinput : ");
            semua = run.nextInt();

            if (semua <= 0){
                System.out.println("inputan yang anda masukkan lebih dari 0");
            }else {
                InputData();
            }
        }while (semua <= 0);
    }
    
    public void InputData(){
        try{
            for(int i=0;i < semua;i++){
            	jumBarang[i]=i+1;
                run.nextLine();
                
                System.out.println("nama produk :  ");
                nama[i] = run.nextLine();

                if (nama[i].equals("0")){
                    break;
                }

                System.out.println("harga produk : ");
                harga[i]= run.nextInt();
                
                System.out.println("stok produk : ");
                stok[i]= run.nextInt();
                jumlah[i]=stok[i]*harga[i];
             }
          }
        	catch (InputMismatchException e){
            System.out.println("Inputan harus berupa angka ");
            run.nextLine();
            menu();
        }
    }
  
    public void getnilaidata(){
        for (int i =0; i < semua; i++){
        	System.out.println("===================");
            System.out.println("Jumlah produk : "+jumBarang[i]);
            System.out.println(" nama produk : "+ nama[i]);
            System.out.println("harga produk : "+harga[i]);
            System.out.println("stok produk : "+stok[i]);
            System.out.println("Total : "+jumlah[i]);
            System.out.println("===================");
        }
    }
}
