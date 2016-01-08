public class Studentinfo{
  private String name;
  private int [] tests;
  private String grade;
  public final static int NUM_TESTS = 3;
  
  public Studentinfo(){
    name= "";
    tests= new int [NUM_TESTS];
    grade= "";
  }
  public Studentinfo(String studname, int[] studtests, String studgrade){
  name= studname;
  tests= studtests;
  grade= studgrade;
  }
  public String getName(){
    return name;
  }
  public String getGraded(){
    return grade;
  }
  public void setGrade (String updatedgrade){
    grade = updatedgrade;
  }
  public double getTestAvg(){
   double tot= 0;
   for(int i=0;i<3;i++){
     tot+=tests[i];}
   return tot/NUM_TESTS;
  }
  public void computeGrade(){
    if(name.equals(""))
      grade= "No grade";
    else if (getTestAvg()>= 65)
      grade= "Pass";
    else
      grade= "Fail";
  }
}

