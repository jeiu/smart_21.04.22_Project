public class Member{
  String name;
  String id;
  String password;
  String tel;

    void member(String name, String id, String password, String tel){
      this.name = name;
      this.id = id;
      this.password = password;
      this.tel = tel;
    }

    //값을 지정하기 위한 메소드
    void setId(String id){
      this.id = id;
    }

    void setPassword(String password){
      this.password = password;
    }

    void setName(String name){
      this.name = name;
    }

    void setTel(String tel){
      this.tel = tel;
    }

    //값을 받아오기 위한 메소드
    String getId(){
      return this.id;
    }

    String getPassword(){
      return this.password;
    }

    String getName(){
      return this.name;
    }

    String getTel(){
      return this.tel;
    }
}