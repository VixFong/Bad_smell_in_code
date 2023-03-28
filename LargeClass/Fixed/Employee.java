package LargeClass.Fixed;

public class Employee {
    private PersonalInfo personalInfo;
    private JobInfo jobInfo;
    
    public Employee(PersonalInfo personalInfo, JobInfo jobInfo) {
      this.personalInfo = personalInfo;
      this.jobInfo = jobInfo;
    }
    
    // getters and setters
    // other methods that operate on personalInfo and jobInfo
  }
 /*By extracting these two classes, we have made the Employee class more focused and easier to understand.
  We have also reduced the risk of duplicated code and made it easier to maintain and extend the code in the future. */