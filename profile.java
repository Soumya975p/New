
public class profile {
    enum StudentProfile {
      Soumya,
      Nineteen,
      IETDAVV;
    }
  
    public static void main(String[] args) {
      StudentProfile myVar1 = StudentProfile.Nineteen;
      StudentProfile myVar2 = StudentProfile.Soumya;
      StudentProfile myVar3 = StudentProfile.IETDAVV; 
      System.out.println(myVar1);
      System.out.println(myVar2);
      System.out.println(myVar3);
    }
  }
