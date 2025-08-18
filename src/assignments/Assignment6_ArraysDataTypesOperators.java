package assignments;

public class Assignment6_ArraysDataTypesOperators {

	public static void main(String[] args) {
		String StudentName[]=new String[3];

		StudentName[0]="suresh";
		StudentName[1]="mahesh";
		StudentName[2]="naresh";

		int StudentMarks[]=new int[3];

		StudentMarks[0]=75;
		StudentMarks[1]=80;
		StudentMarks[2]=82;
		
		int UpdatedMarks[]=new int[3];
		
		UpdatedMarks[0]=StudentMarks[0]+10;
		UpdatedMarks[1]=StudentMarks[1]+10;
		UpdatedMarks[2]=StudentMarks[2]+10;
				
		System.out.println("Students Name & marks after Update");
		System.out.println(StudentName[0]+":"+UpdatedMarks[0]);
		System.out.println(StudentName[1]+":"+UpdatedMarks[1]);
		System.out.println(StudentName[2]+":"+UpdatedMarks[2]);
		
		int AvgMarks=(UpdatedMarks[0]+UpdatedMarks[1]+UpdatedMarks[2])/UpdatedMarks.length;
		System.out.println("Average Marks : " +AvgMarks);
			

	}

}
