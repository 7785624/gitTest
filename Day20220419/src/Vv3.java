import java.util.Arrays;
//> 좌변이크면 트루 <작으면 트루 >=크거나 같으면 <=작거나같으면

public class Vv3 {

	public static void main(String[] args) {
		int[][] score = {
						{100,100,100},
						{20,20,20},
						{30,30,30},
						{40,40,40},
						{50,50,50},
		};
		int korTotal =0, engTotal = 0, mathTotal=0;
		System.out.println("번호 국어 영어 수학 총점 평균");
		System.out.println("================================");
		//아이가0	부터 스코어랭스 5개니까 
		for(int i=0; i<score.length; i++) {
			int sum=0; //개인별총점
			float avg=0.0f; //개인별평균
			
			korTotal += score[i][0];// 0번쩨0번
			engTotal += score[i][1];//1번째 1번
			mathTotal += score[i][2];//2번쩨 2번
			System.out.printf("%3d",i+1);
			//아이가 0
			for(int j=0; j<score[i].length; j++) {
					sum+=score[i][j]; //0행0열값누적
								//자리맞출려고 오디
					System.out.printf("%5d",score[i][j]);
			}
			avg=sum/(float)score[i].length;//평균계산
			System.out.printf("%5d %5.1f%n",sum,avg);
		}//포문끝나면 다시 위로 반복..?
		System.out.println("============================");
		System.out.printf("총점:%3d %4d %4d%n",korTotal,engTotal,mathTotal);
		
		
	}	
	}
//	int [][] score = { //행과 열 둘다 4개임
//						{100,100,100}, //0번쩨행 만약 스코어[0].랭스 하면 3임
//						{20,20,20}, //1번째행
//						{30,30,30},
//						{40,40,40},
//					};
//	int sum = 0;
//			//0~4까지 4번돌고 행이 4개니까?
//	for(int i=0; i<score.length; i++) {
//				//i 가 0이니까 0번쩨 행의 갯수 0번째 행 3개니까 3개찍고
//		for(int j=0; j<score[i].length; j++)
//			System.out.printf("score[%d][%d]=%d%n",i,j,score[i][j]);
////			System.out.print(score[i][j]+" ");
//		System.out.println();
//	}
//	
//	System.out.println("---------------------------");
//	//tmp는 1열한줄전체 100 100 100
//	for(int[]tmp:score) { //score 배열의 값을 통으로 tmp에 전달
//		for(int i : tmp) { //score 1행 1열부터 순차적으로 전달 100 100 100 다했으면 2행 1열이런식으로 
//			sum+=i; //sum값에 누적
//		}
//	}
//		System.out.printf("sum="+sum);
		
		
		
		
		
	
//		//스트링 클레스는 캐릭터배열에 기능(메써드)을 추가한것
//		String src = "ABCDE";
//		
//		for(int i=0; i<src.length(); i++) {
//			char ch = src.charAt(i);//src의 i번째 문자를 ch에 저장 첫회전에선1가0이니까 0번째
//			//char ch = 'A'; // i=0 하나씩 찍어줌
//			System.out.println("src.charAt("+i+"):"+ch);
//		}//String을 char[]로 변환
//		char[] chArr =src.toCharArray();
//		//char배열(char[])를 출력
//		//캐릭터만 배열입력하면바로찍힘 다른것들은 그 어레이즈 스트링써야댐
//		System.out.println(chArr);
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		//예제5-13
//		char[] hex = {'C','A','F','E'};//16진수
//							//2진수
//		String[] binary = {"0000","0001","0010","0011",
//						   "0100","0101","0110","0111",
//						   "1000","1001","1010","1011",
//						   "1100","1101","1110","1111" };
//
//		String result = "";
//		
//		for(int i=0; i<hex.length; i++) {//배열 hex에 저장된 문자를 하나씩읽음

//			if(hex[i]>='0'&&hex[i]<='9') {//
//				result +=binary[hex[i]-'0'];//'8'-'0'의결과는 8이다
//				}else {//A~F이면
//					result += binary[hex[i]-'A'+10];//'C'-'A'의결과는 2 =12 12번째 2진수
//				} //12번째이진수를 리절트에
//		}
//		System.out.println("hex : "+ new String(hex)); //String(char[] value)
//		System.out.println("binary : "+result);
		
		
		
		
	
	
//String[] name = {"Kim" ,"Park","Yi"};
//
//for(int i=0; i<name.length; i++) {
//	System.out.println("name["+i+"] :"+name[i]);
//}
//		String tmp = name[2]; //배열 name의 3번째요소를 템프에저장
//		System.out.println("tmp : "+tmp);
//		
//		name[0]="Yu";//배열 name의 첫번쨰요소를 yu로변경
//		
////		for(int i=0; i<name.length; i++) {
////			System.out.println(name[i]);
//		
//		for(String str : name)//향상된 포문.. 위에포문이랑 같음 yu park yi를 하나하나씩전달
//			//전달할값이없으면 이제 포문나감
//			System.out.println(str);

		
		
		
		
		
		
		
//		int[] numArr = new int[10];//배열 10
//		int[] counter = new int[10];//배열 10 개수새는용도
//		
//		//9회전
//		for(int i=0; i<numArr.length; i++) {
//			numArr[i]=(int)(Math.random()*10);//0~9의수를 numArr에 저장 순서대로
//			System.out.print(numArr[i]);// 출력
//		}
//		System.out.println();//줄바꿈
//		
//		//9회전
//		for(int i=0; i<numArr.length; i++) {
//			counter[numArr[i]]++;//numArr의 입력수에서 counter[i]i해당수의 개수를더함
//			//ex)만약에 numArr[0]번째방에 9있으면 9번쩨방에 값하나 증가
////			System.out.println(">>>" + numArr[i]);//
////			System.out.println(">>" + counter[numArr[i]]);
//		}
//		for(int i=0; i<numArr.length; i++) {
//			System.out.println(i+"의 개수 : " + counter[i]);
//		}
	
//		int[] numArr =new int[10];//방 10개
//		
//		//배열안에 0~9까지 랜덤수 배열길이가 10이니까 
//		for(int i=0; i<numArr.length; i++) {
//			System.out.print(numArr[i]=(int)(Math.random()*10));
//		}
//		System.out.println();
//		//numArr-1만큼 반복?
//		for(int i =0; i<numArr.length-1; i++) {
//		//changed에 펄스값입력
//			boolean changed = false;
//			//num[j]가 num[j+i]보다 크면 두수를 교환라고 이를 배열크기 -i-1만큼반복..
//			for(int j=0; j<numArr.length-1-i; j++) {//9 진행될때마다 -1 8 .. 7 ..
//				if(numArr[j]>numArr[j+1]) {//왼쪽의값이크면 서로 바꾼다
//					int temp = numArr[j];
//				numArr[j]=numArr[j+1];
//				numArr[j+1]=temp;
//				//값이바뀌면 트루? 다시위로 바뀌면 찍어주고
//				changed=true;
//				}
//			}//체인지값이 바뀌지않았으면 문장을 찍지말라는?듯 for문을 나오라는? 중복방지
//			if(!changed)break;// ==if(changed != true)
//			//numArr에입력된 배열을 0부터 numArr까지출력
//			for(int k=0; k<numArr.length; k++)
//				System.out.println(numArr[k]);
//			System.out.println();
		
			
	
	
//		int[] code = {-4, -1, 3, 6, 11 };//배열길이 5
//		int[] arr = new int[10];
//		
//		for(int i=0; i<arr.length; i++) {//10번회전 arr가 10개니까
//			int tmp = (int)(Math.random()*code.length);//배열길이가 5니까 code 배열0~4까지의 랜덤
//			arr[i]=code[tmp];//arr배열에 code배열의0~4까지의랜덤숫자를 집어넣기
//		
//		}
//		System.out.println(Arrays.toString(arr));
//		
	

		
		
		
		
		
		
		
		
		
//		//45개 방 만듬
//		int ball[]=new int [45];
//		// 각 방에다 1~45저장
//		for(int i=0; i<ball.length; i++)
//			ball[i]=i+1;
//		
//		//값 섞을때 변수
//		int tmp =0;
//		int num =0;
//		
//		//6번째에서 섞기??
//		for(int i=0; i<6; i++) {
//			num=(int)(Math.random()*45);
		
		
				
			
		
		
		
		
		
		
		
		
//		int sum=0; //총점
//		float average=0f;//평균
//		//점수 배열
//		int[]score= {100,88,100,100,90};
//		//i가 0이고 i가 
//		for(int i = 0; i<score.length; i++) {
//			sum+=score[i];
//		}
//average=sum/(float)score.length;
//System.out.println("총점 : " + sum);
//System.out.println("평균 : " + average);
	


