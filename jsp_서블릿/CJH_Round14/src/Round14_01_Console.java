
public class Round14_01_Console {

	public static void main(String[] ar){
		
		System.out.println("매개변수 테스트 시작");
		
		if(ar ==null){
			System.out.println("매개변수가 없다.");
		}
		else{
			for(int i=0; i<ar.length; ++i){
				System.out.println(i + "번째 매개변수= " + ar[i]);
			}
		}
	
		
		
		System.out.println("매개변수 테스트 끝");
		System.out.println(ar);
	
		
	
	}
}
