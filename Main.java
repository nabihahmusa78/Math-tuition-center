// application team in UTP
public class Main
{
    // application code
	public static void main(String[] args) {
        Student nana= new Student();
        mike.setName("Nabihah");
        Student amira = new Student();
        adila.setName("Amiratul");
        Student aqila = new Student();
        imran.setName("Aqila");

        // creating a batch object
        StudentBatch sb2023 = new StudentBatch();
        sb2023.add(nana);
        sb2023.add(amira, 0);       
        
        // declare a method that allows for the following:
        boolean isIn = sb2023.find("amira");
        
        
        Teacher Headmaster = new Teacher();
        nana.setName("Nabihah");
        
        for (int i=0; i<5; i++) 
            nana.setMark(100, i)
        
        // calculate and print the avg
        float avg = 0;
        avg = nana.calcAvg();
        System.out.println("Avg = " + avg);
        
        // calculate the min marks for mike
        System.out.println("Min = " + nana.calcMin());        
	}
}
