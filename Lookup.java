import java.util.*;

public class Lookup{
  public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String search;
		void look(){
      String search;

      System.out.println("회원 조회 입니다.");
      System.out.println("검색하고 싶은 ID를 입력해주세요.");
      search = scan.nextLine();
      
      String getInfo = map.get(search);
      System.out.println(getInfo);
    }
	}
}