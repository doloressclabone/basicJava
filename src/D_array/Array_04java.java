package D_array;

import java.util.Arrays;

public class Array_04java {
	public static void main(String[] args) {
//		s[0][0] = (int)(Math.random()*101);
//		s[0][1] = (int)(Math.random()*101);
//		s[0][2] = (int)(Math.random()*101);
//		s[0][3] = (int)(Math.random()*101);
//		s[0][4] = (int)(Math.random()*101);
//		s[0][5] = (int)(Math.random()*101);
//		s[0][6] = (int)(Math.random()*101);
//		for(int j=0; j<s[0].length; j++){
//			s[0][j]=(int)(Math.random()*101);
//		}
//		s[1][0] = (int)(Math.random()*101);
//		s[1][1] = (int)(Math.random()*101);
//		s[1][2] = (int)(Math.random()*101);
//		s[1][3] = (int)(Math.random()*101);
//		s[1][4] = (int)(Math.random()*101);
//		s[1][5] = (int)(Math.random()*101);
//		s[1][6] = (int)(Math.random()*101);
//		for(int j=0; j<s[1].length; j++){
//			s[1][j]=(int)(Math.random()*101);
//		}
//		s[2][0] = (int)(Math.random()*101);
//		s[2][1] = (int)(Math.random()*101);
//		s[2][2] = (int)(Math.random()*101);
//		s[2][3] = (int)(Math.random()*101);
//		s[2][4] = (int)(Math.random()*101);
//		s[2][5] = (int)(Math.random()*101);
//		s[2][6] = (int)(Math.random()*101);
//		for(int j=0; j<s[2].length; j++){
//			s[2][j]=(int)(Math.random()*101);
//		}
//		s[3][0] = (int)(Math.random()*101);
//		s[3][1] = (int)(Math.random()*101);
//		s[3][2] = (int)(Math.random()*101);
//		s[3][3] = (int)(Math.random()*101);
//		s[3][4] = (int)(Math.random()*101);
//		s[3][5] = (int)(Math.random()*101);
//		s[3][6] = (int)(Math.random()*101);
//		for(int j=0; j<s[3].length; j++){
//			s[3][j]=(int)(Math.random()*101);
//		}
//		s[4][0] = (int)(Math.random()*101);
//		s[4][1] = (int)(Math.random()*101);
//		s[4][2] = (int)(Math.random()*101);
//		s[4][3] = (int)(Math.random()*101);
//		s[4][4] = (int)(Math.random()*101);
//		s[4][5] = (int)(Math.random()*101);
//		s[4][6] = (int)(Math.random()*101);
//		for(int j=0; j<s[4].length; j++){
//			s[4][j]=(int)(Math.random()*101);
//		}
//		s[5][0] = (int)(Math.random()*101);
//		s[5][1] = (int)(Math.random()*101);
//		s[5][2] = (int)(Math.random()*101);
//		s[5][3] = (int)(Math.random()*101);
//		s[5][4] = (int)(Math.random()*101);
//		s[5][5] = (int)(Math.random()*101);
//		s[5][6] = (int)(Math.random()*101);
//		for(int j=0; j<s[5].length; j++){
//			s[5][j]=(int)(Math.random()*101);
//		}
		
//		1.6명의 7과목을 저장할 수 있는 변수 score를 선언 및 생성해주세요.
		String[] sn ={"현웅","상엽","은우","대웅","재은","진경"};
		String[] sj ={"변수", "연산자", "조건문", "반복문", "배열", "객체", "객체2"};
		int[][] s = new int[sn.length][sj.length];
//		
////		2.score의 각방을 0~100점 사이의 랜덤한 정수값을 저장해주세요.
		for(int i=0; i<s.length; i++){
			for(int j=0; j<s[i].length; j++){
				s[i][j]=(int)(Math.random()*101);
			}
		} 
//		3.합계 값을 저장해주세요.
		int[] pt = new int[sn.length];
		for(int i=0; i<s.length; i++){
			for(int j=0; j<s[i].length; j++){
				pt[i]+=s[i][j];
			}
		}
		
//		4.평균 값을 저장해주세요
//		(int)((float)pt[0]/sj.length*100+0.5)/100f;
//		(428/7*100+0.5)/100
		float[] avg = new float[sj.length];
		
		for(int i=0; i<s.length; i++){
			avg[i] = (int)((float)pt[i]/sj.length*100+0.5)/100f;
		}
		
//		5.과목별 합계
		int[] sjt = new int[sj.length];
		for(int i=0; i<s.length; i++){
			for(int j=0; j<s[i].length; j++){
				sjt[j]+=s[i][j];
//				System.out.print(sjt[i]+"\t");
			}
			
		}
//		합계 값 공통점 찾기.
//		sjt[0]=sn[0][0],sn[1][0],sn[2][0],sn[3][0],sn[4][0],sn[5][0],
		
		
//		6.과목별 합계
		
		
		
//		7.과목별 평균
		float[] sjavg = new float[sj.length];
//		sjavg[0]=sjt[0]/sn.length
//		sjavg[1]=sjt[1]/sn.length
//		sjavg[2]=sjt[2]/sn.length
//		sjavg[4]=sjt[4]/sn.length
//		sjavg[5]=sjt[5]/sn.length
//		sjavg[6]=sjt[6]/sn.length
		for(int i=0; i<sj.length; i++){
			sjavg[i]=(int)((float)sjt[i]/sn.length*100+0.5f)/100f;
		}
				
		
		
//		8.반 순위
		int[] rank;
		for(int i=0; i<sn.length; i++){
			rank[i]=1;
			for(int j=0; j<sn.length; j++){
				if(pt[i]<pt[j]){
					pt[i] += 1;
				} else if(pt[i]>pt[j]){
					continue;
				}
			} rank[i]
			
		}
		
		
		
		
		
	
//		0.출력하세요
		System.out.print("\t");
		for(int i=0; i<sj.length; i++){
			System.out.print(sj[i]+"\t");
		}
		System.out.println("||"+"\t"+"합계"+"\t"+"평균");
		
		for(int i=0; i<s.length; i++){
			System.out.print(sn[i]+" :\t");
			for(int j=0; j<s[i].length; j++){
				System.out.print(s[i][j]+"\t");
			}
			System.out.print("||");
			System.out.println("\t"+pt[i]+"\t"+avg[i]);
		}
		System.out.print("과목합계"+":"+"\t");
		
//		과목별 합계
		for(int i=0; i<sj.length; i++){
			System.out.print(sjt[i]+"\t");
		}
// 		과목합계의 더블유 슬래쉬		
		System.out.print("||");
//		과목합계의 총합계
		int sjtt = 0;
		for(int i=0; i<sjt.length; i++){
			sjtt += sjt[i];
		}
		System.out.println("\t"+sjtt);
		
		System.out.print("과목평균"+"\t");
		for(int i=0; i<sjavg.length; i++){	
			System.out.print(sjavg[i]+"\t");
		}
		
		System.out.println("||");
//		3.각 사람의 합계를 저장해주세요
			
//		for(int i=0; i<s.length; i++){
//			for(int j=0; j<s[i].length; j++){
//				pt[i]+=s[i][j]; 
//			}
//			System.out.println(sn[i]+":"+pt[i]);
//		}
		
		
		
			
	} 
}
//		pk[0]+=s[0][0~6];
//		pk[1]+=s[1][0~6];
//		pk[2]+=s[2][0~6];
//		pk[3]+=s[3][0~6];
//		pk[4]+=s[4][0~6];
//		pk[5]+=s[5][0~6];
						
		
		
		
		
		
		


