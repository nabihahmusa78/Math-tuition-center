// createed by team in Bangalore
public class Student {
    // data
    private String name;
    private String ic;
    private String address;
    
    //constructor
    public Student(String name,String ic,String address,String qualification,
    int experience,Date startDate){
    this.name=name;
    this.ic=ic;
    this.qualification=qualification;
    this.experience=experience;
    this.startDate=startDate;
    }
    
    // getters and setters
    public String getName(String name){
        return name;
    }
    
    public void setic(String ic) {
        this.ic=ic;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address=address;
    
}
