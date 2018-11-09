package practice01;

public class Prob5 {

	public static void main(String[] args) {
		boolean b1, b2;
		for(int i = 1; i < 100; i++) {
			if ( i<10) { //입력값이 한자리 수인 경우
				if ((i % 3) == 0)
					System.out.println(i + "짝");
			}
			else { //입력값이 두자리 수인 경우
				b1 = (i/10) % 3 == 0; //십의 자리수가 3의 배수인지 판별
				b2 = (i%10) % 3 == 0; //일의 자리수가 3의 배수인지 판별
				
				if ((i%10) == 0) //예외처리. ex)30, 60, 90
					b2 = false;
				
				if (b1 && b2)
					System.out.println(i + "짝짝");
				else if ( b1 || b2 )
					System.out.println(i + "짝");
			}
		}
		
//		//힌트
//		int i = 59;
//		String s = String.valueOf(i); //"59" <- 59
//		
//		int countClap = 0;
//		for(int j = 0; j < s.length(); j++)
//			char c = s.charAt(j);
//			if( c == '3' || c == '6' || c == '9') {
//				countClap++;
//			}
//			
//		System.out.println(countClap);
	}
}
