package com.gambarjava;

import java.util.Scanner;

public class MenggambarDenganJava{
	
	public int ukuran;

	public void inputUkuran(int ukuran) {
		this.ukuran=ukuran;
		
	}
	
	public void gambarKotak(int ukuran) {
			for (int i=0; i<ukuran; i++) {
				for(int j=0; j<ukuran; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}	
		}
	
	
	public void gambarSegitigaSikuBiasa(int ukuran) {		
			for(int i=0; i<ukuran; i++) {
				for (int j=0; j<=i; j++){
					System.out.print("* ");
				}
				System.out.println();
			}
		
	}
	
	
	
	public void gambarSegitigaSikuTerbalik(int ukuran) {		
			for(int i=ukuran; i>0; i--) {
				for(int j=i; j>0; j--) {
					System.out.print("* ");
				}
				System.out.println();
			}
		
	}
	
	
	public void gambarSegitigaTerbalikSelangSeling(int ukuran) {		
			for(int i=ukuran; i>0; i--) {
				for(int j=i; j>0; j--) {
					
					if(j%2==0){
						System.out.print("! ");
					}else {
						System.out.print("* ");
					}
				}
					System.out.println();
			}
		}
	
	
	
	public void gambarCampur(int ukuran) {		
			for (int i=0; i<ukuran; i++) {
				for (int j=0; j<=ukuran; j++) {
					if(j<=i) {
					System.out.print("* ");
				} else {
					System.out.print("# ");
					}
				}
				System.out.println();
			}	
	}
	
	
	public void gabungGambar(int ukuran) {
		gambarCampur(ukuran);
		gambarSegitigaTerbalikSelangSeling(ukuran);
	}
	
	
	
	public void printAllGambar(int ukuran) {
		
		gambarKotak(ukuran);
		System.out.println("Gambar Kotak ");
		System.out.println();
		
		gambarSegitigaSikuBiasa(ukuran);
		System.out.println("Gambar Segitiga Siku Biasa ");
		System.out.println();
		
		gambarSegitigaSikuTerbalik(ukuran);
		System.out.println("Gambar Segitiga Siku Terbalik ");
		System.out.println();
		
		gambarSegitigaTerbalikSelangSeling(ukuran);
		System.out.println("Gambar Segitiga Siku Terbalik Selang-Seling ");
		System.out.println();
		
		gambarCampur(ukuran);
		System.out.println("Gambar Campur ");
		System.out.println();
		
		gabungGambar(ukuran);
		System.out.println("Gabung Gambar ");
		System.out.println();
	}
	
	
}
