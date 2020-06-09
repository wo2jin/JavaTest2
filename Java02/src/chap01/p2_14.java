package chap01;
import java.util.*;
public class p2_14 {
	static final int VMAX =21; //시력 분포 0.0~0.1단위로 21개
	static class PhyscData{
		String name;
		int height;
		double vision;
		PhyscData(String name, int height, double vision){
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}
	static double aveHeight(PhyscData[] dat) {
		double sum =0;
		for(int i = 0; i<dat.length; i++) {
			sum +=dat[i].height;
			
		}
		return sum/dat.length;
	}
	static void distVision(PhyscData[] dat, int[] dist) {
		int i =0;
//		dist[i]=0;
		for(i=0;i<dat.length;i++) { //7번 실행
//			if(dat[i].vision >= 0.0&& dat[i].vision <= VMAX/10.0) {
				dist[(int)(dat[i].vision*10)]++; 
//			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhyscData[] x = {
				new PhyscData("박현규",162,0.3),
				new PhyscData("함진아",173,0.7),
				new PhyscData("최윤미",175,2.0),
				new PhyscData("홍연의",171,1.5),
				new PhyscData("이수진",168,0.4),
				new PhyscData("김영준",174,1.2),
				new PhyscData("박용규",169,0.8),
		};
		int[] vdist = new int[VMAX];//시력 분포 21개
		
//		for(int i =0; i<vdist.length;i++) {
//			System.out.println(vdist[i]);
//		}
		
		System.out.println("신체검사 리스트");
		System.out.println("이름    키   시력");
		System.out.println("==========");
		for(int i =0; i<x.length; i++) {
			System.out.printf("%-8s%3d%5.1f\n", x[i].name,x[i].height,x[i].vision);//-8은 8자리를 만든후 앞쪽으로 땡김
		}
		System.out.printf("\n 평균키 : %5.1fcm\n",aveHeight(x));
		
		distVision(x,vdist);
		
		System.out.println("\n시력 분포");
		for(int i =0; i<VMAX; i++) {//자리수에 맞게 틀을 만듦 ex)1/10 = 0.1 시력칸이 만들어짐
			System.out.printf("%2.1f~:%2d명\n",i/10.0,vdist[i]);
		}
	}

}
