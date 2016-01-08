public class Studentinfotester{
  public static void main (String[]args){
    Studentinfo first = new Studentinfo ("Mark Lee", new int[]{1,2,3}, "Fail");
    System.out.println(first.getName());
    System.out.println(first.getGrade());
    System.out.ptintln(first.getTestAvg(new int [] {1,2,3}));

  }

}
