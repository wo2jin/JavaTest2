package chap02;

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = -1; i<10; i++) {
			for(int j = -1; j<10; j++) {
				if(i>0&&j>0) {
					System.out.print(i*j+",");
				}else if(i==-1&&j==-1){
					System.out.print(" ");
				}else if(j==-1&&i>0){
					System.out.print(i);
				}else if(i==-1&&j>0) {
					System.out.print(j);
				}else if(i==0&&j==0){
					System.out.print("+");
				}else if(i==0) {
					System.out.print("-");
				}else if(j==0) {
					System.out.print("|");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}

}
