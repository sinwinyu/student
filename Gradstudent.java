  public class GradStudent extends Studentinfo{
    private int gradID;
    public GradStudent(){
      super();
      gradID=0;
    }
    public GradStudent (String studname, int[] studtests, String studgrade, int studID){
      super(studname,studtests,studgrade);
      gradID= studID;
    }
    public int getID(){
      return gradID;
    }
    public void computeGrade(){
      super.computeGrade();
      if(getTestAvg()>90)
        setGrade("Pass with distiction");
    }
  }
  
