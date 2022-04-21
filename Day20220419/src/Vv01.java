import java.util.*;
public class Vv01 {
	static Vv01 vv01 = new Vv01();
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        
         /*
          * monthSet은 각 달에 대한 날짜들을 저장한 배열,
          * year은 연도, month는 달, week는 요일, day는 일, i는 반복문을 사용하기 위한 변수.
          */
         int year=0, month=0, week=0, day=0, i=0; 
         int monthSet[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
     
     
         while(true) {
          System.out.println("연도를 입력하세요. (0을 누르면 종료합니다.)");
          year = sc.nextInt();
          if(year==0) {
           System.exit(0);
           break;
          }
          System.out.println("원하는 달을 입력하세요.");
          month = sc.nextInt();
          if(month<1 || month>12) {
           System.out.println("1월에서 12월 사이의 달을 입력해주세요.");
           return;
          }
          System.out.println("");
      
          if(year%4 == 0 && year%100 != 0 || year%400 == 0) // 윤년계산 연도%4했을때 0이거나 연도% 100했을때 0이 아니면 || 연도 %400했을때 나머지가 0이면
        	  //윤년은 4로는 나눠지고 100으로는 안나눠짐
           monthSet[1] = 29; // 윤년이면 2월 29
          else
           monthSet[1] = 28; // 평년이면 2월은 28
      
          // 01년 1월 1일부터 계산.
          day = (year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400;
          for(i=0;i<month-1;i++) {
           day += monthSet[i];  
          }
          
          week=day%7; // 달의 시작 요일을 구함.
      
          System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t\n", "월", "화", "수", "목", "금", "토", "일");   
          for(i=0;i<week;i++) {
           System.out.print("\t"); // 1일이 시작하기 전 공백을 위한 반복문.
          }
          for(i=1;i<=monthSet[month-1];i++) {
           System.out.printf("%d\t", i); // i를 입력한 달의 일수만큼 찍음.
           week++;   
           if(week%7 == 0)        // 요일이 일요일이 지나면
            System.out.println(); // 줄을 바꿈.
       
          }
          if(week%7 != 0) {
           System.out.println();
          }
         }


	}

}
