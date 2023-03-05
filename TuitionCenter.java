public class TuitionCenter {
    private String address;
    private String headmaster;
    private ArrayList<Teacher> teachers;
    
    //constructor
    public TuitionCenter(String address, String Headmaster) {
        this.address = address;
        this.Headmaster = Headmaster;
        teachers = new ArrayList<Teacher>();
    }
    
    //getters and setters
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getHeadmaster() {
        return Headmaster;
    }
    
    public void setHeadmaster(String headmaster) {
        this.Headmaster = Headmaster;
    }
    
    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }
    
    //methods to add and remove teachers
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
    
    public void removeTeacher(Teacher teacher) {
        teachers.remove(teacher);
    }
}
