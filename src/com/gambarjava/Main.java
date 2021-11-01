package com.gambarjava;

import java.util.Scanner;

public class Main {
	public static void main (String []args) {
		
		MenggambarDenganJava mdj = new MenggambarDenganJava();
		mdj.printAllGambar(5);
		
//		
//		MenggambarDenganJava mdj = new MenggambarDenganJava();
//		String ulang = "Y";
//		Scanner scan = new Scanner(System.in);
//		while(ulang.equalsIgnoreCase("Y")) {
//		System.out.println("1.Gambar Kotak");
//		System.out.println("2.Gambar Segitiga Siku Biasa");
//		System.out.println("3.Gambar Segitiga Siku Terbalik");
//		System.out.println("4.Gambar Segitiga Selang-Seling");
//		System.out.println("5.Gambar Campur");
//		System.out.println("6.Gabung Gambar");
//		System.out.println("7.Exit");
//		System.out.print("Masukkan pilihan anda = ");
//		int pilihan = scan.nextInt();
//		
//		switch (pilihan) {
//		case 1:
//			mdj.gambarKotak(5);	
//			System.out.println("Gambar Kotak");
//			break;
//			
//		case 2:
//			mdj.gambarSegitigaSikuBiasa(5);	
//			break;
//			
//		case 3:
//			mdj.gambarSegitigaSikuTerbalik(5);	
//			break;
//			
//		case 4:
//			mdj.gambarSegitigaTerbalikSelangSeling(5);	
//			break;
//			
//		case 5:
//			mdj.gambarCampur(5);	
//			break;
//
//		case 6:
//			mdj.gabungGambar(5);	
//			break;
//			
//		case 7:
//		ulang ="T";
//		System.out.println("Telah Keluar.");
//		break;
//		
//		default:
//			System.out.println("Pilihan tidak ada.");
//			System.out.println();
//			}
//		}
		
	
	}
}
