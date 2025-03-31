package bai5;

public class Student {
    private String stID;
    private String stName;
    private String stClass;
  
    public Student() {
        this.stID = "";
        this.stName = "";
        this.stClass = "";
    }
    
    public Student(String stID, String stName, String stClass) {
        this.stID = stID;
        this.stName = stName;
        this.stClass = stClass;
    }
    
    public String getStID() {
        return stID;
    }
    
    public String getStName() {
        return stName;
    }
    
    public String getStClass() {
        return stClass;
    }
    
    public void setStID(String stID) {
        this.stID = stID;
    }
    
    public void setStName(String stName) {
        this.stName = stName;
    }
    
    public void setStClass(String stClass) {
        this.stClass = stClass;
    }
    
    @Override
    public String toString() {
        return "ID: " + stID + ", Ten: " + stName + ", Lop: " + stClass;
    }
}

