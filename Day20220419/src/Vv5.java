import java.util.Arrays;

public class Vv5 {

	public static void main(String[] args) {
		int[][] score= {
							{100,100,100},
							{20,20,20},
							{30,30,30},
							{40,40,40},
							{50,50,50}
		};
		
		int[][] result = new int[score.length+1][score[0].length+1];
		for(int i =0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				result[i][j]=score[i][j];
				
				result[i][result[0].length-1]+=score[i][j];
				result[result.length-1][j]+=score[i][j];
}
		}
		for(int i =0; i<result.length; i++) {
			for(int j=0; j<result[i].length; j++) {
				System.out.printf("%4d", result[i][j]);
			}
			System.out.println();
		}
		
		
		
		
	}
}
	
		
		
		
		
		
		
		
		
//		int[] answer= {1,4,4,3,1,4,4,2,1,3,2};
//		int[] counter = new int[4];
//		//				11번회전
//		for(int i =0; i<answer.length;i++) {
//					//아이0번째-1 =0 0번째위치 ++ 증가? 하라는듯? 그렇게반복?
//			counter[answer[i]-1]++; //1~4까지기때문에 0~3으로만듦
//		}
//			for(int i =0; i<counter.length; i++) {
//				//
//				System.out.print(counter[i]);
//				//
//				for(int j=0; j<counter[i]; j++)
//					System.out.print("*");
//			System.out.println();
//			}
		
		
		
	
		
		
		
		
//		for(int i=0; i<coinUnit.length; i++) {
//			int num=money/coinUnit[i];
//			
//			money%=coinUnit[i];
//			System.out.println(coinUnit[i]+"원 : "+num+"개");
//			
//
//			
//		}
//	
	
	
	
	
//		//다음은 1과9사이의 중복되지않은 숫자로 이루어진 3자리 숫자를 만들어내는
//		//프로그램이다 (1)~(2)에 알맞은코드를 넣어 완성
//		
//		int[] ballArr= {1,2,3,4,5,6,7,8,9};
//		int[] ball3 = new int[3];
//		//배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
//		for(int i=0; i<ballArr.length; i++) {
//			int j =(int)(Math.random()*ballArr.length);
//			int tmp=0;
//			//(1)
//			tmp=ballArr[i];
//			ballArr[i]=ballArr[j];
//			ballArr[j]=tmp;
//			}
//		System.out.println(Arrays.toString(ballArr));
//		//배열 ballArr의 앞에서 3개의 수를 배열 ball3dmfh 복사
//		//(2)
//		for(int i =0; i<3; i++)
//			ball3[i]=ballArr[i];
//		
//		for(int i=0; i<ball3.length; i++) {
//			System.out.print(ball3[i]);
//		}
	
	
//		int[][]arr= {
//						{5,5,5,5,5},
//						{10,10,10,10,10},
//						{20,20,20,20,20,20,20},
//						{30,30,30,30,30,30},
//		};
//		int total =0;
//		float average =0.0f;
//		int count=0;
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//			total+=arr[i][j];
//			count++;
//		}
//		}
//		System.out.println(total);
//		average=total/(float)(count);
//		System.out.printf("%.1f",average);
//		