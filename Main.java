import java.util.*;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Main {
  public static void main(String[] args) throws NoSuchAlgorithmException, InterruptedException{

    String id;
    String name;
    String password;
    String tel;
    String[] info = new String[3];
    int menu;

    // 스캐너, 해쉬맵 선언
    Scanner scan = new Scanner(System.in);
    HashMap<String, String[]> map = new HashMap<String, String[]>();

    System.out.println("1 : 회원등록\n2 : 회원조회");

    switch(menu){
      case 1:
        // 회원정보 입력
        System.out.print("아이디를 입력해 주세요 : ");
        id = scan.nextLine();

        System.out.print("이름을 입력해 주세요 : ");
        name = scan.nextLine();
        info[0] = name;

        System.out.print("비밀번호를 입력해 주세요 : ");
        password = scan.nextLine();
      
        // password 암호화
        MessageDigest msgdigest = MessageDigest.getInstance("SHA-256");
        msgdigest.update(password.getBytes());
        String cipherPassword = String.format("%064x", new BigInteger(1, msgdigest.digest()));
        String strCipherPassword = cipherPassword.toString();
        info[1] = strCipherPassword;

        System.out.print("전화번호를 입력해 주세요 : ");
        tel = scan.nextLine();
        info[2] = tel;

        map.put(id,info);

      case 2:
        //회원정보 조회
        look();

      default:
        System.out.println("오류");
    }
  }
}



