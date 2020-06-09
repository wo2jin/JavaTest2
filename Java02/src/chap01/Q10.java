package chap01;

import chap01.p2_14.PhyscData;

public class Q10 {
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
	static int midh(PhyscData[] x) {
		int sum =0;
		for(int i=0; i<x.length; i++) {
			sum +=x[i].height;	
		}
		return sum/x.length;
	}
	static void distvision(PhyscData[] x,int[] v) {

		for(int i =0;i<x.length;i++){
			v[(int)(x[i].vision*10)] += 1;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] v = new int[VMAX];
		
		PhyscData[] x = {
				new PhyscData("박현규",162,0.3),
				new PhyscData("함진아",173,0.3),
				new PhyscData("최윤미",175,2.0),
				new PhyscData("홍연의",171,1.5),
				new PhyscData("이수진",168,0.4),
				new PhyscData("김영준",174,1.2),
				new PhyscData("박용규",169,0.8),
		};
		distvision(x,v);
		for(int i=0;i<v.length;i++) {
			
			System.out.printf("%2.1f~:",i/10.0);
			int j=0;
//			System.out.println(v[i]);
			while(j<v[i]) {
				System.out.print("*");
				j++;
			}
			System.out.println();
		}
	}

}
