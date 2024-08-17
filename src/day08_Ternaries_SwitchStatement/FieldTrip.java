package day08_Ternaries_SwitchStatement;

public class FieldTrip {

    public static void main(String[] args) {

        int grade = 3;
        String location = "Unknown";
        int numberOfGroups = 0;
        String teacherInCharge = "Unknown";


        if (grade >= 1 && grade <= 4) {

            if (grade == 1) {
                location = "Apple orchard";
                numberOfGroups = 3;
                teacherInCharge = "Ms.Smith";
            } else if (grade == 2) {
                location = "Zoo";
                numberOfGroups = 7;
                teacherInCharge = "Mr.Lee";
            } else if (grade == 3) {
                location = "Aquarium";
                numberOfGroups = 5;
                teacherInCharge = "Mr.Wilson";
            } else {
                location = "Six Flags";
                numberOfGroups = 8;
                teacherInCharge = "Mr.Watt";

            }
        }

                System.out.println("Location - " + location);
                System.out.println("Number of groups - " + numberOfGroups);
                System.out.println("Teacher in charge - " + teacherInCharge);


    }
}

/*
2. Create a class called FieldTrip. Your school goes on a Field trip each year.The place you go will be based on your grade.
		Given a variable gradeNumber figure out the details of your field trip. Print the information at the end.
			    Data based on grade:
			        grade - 1
				        location -  Apple orchard
				        number of groups - 3
				        teacher in charge - Ms. Smith

			        grade - 2
				        location - Zoo
				        number of groups - 7
				        teacher in charge - Mr. Lee

			        grade - 3
				        location - Aquarium
				        number of groups - 5
				        teacher in charge - Ms. Wilson

			        grade - 4
				        location - Movie theater
				        number of groups - 2
				        teacher in charge - Ms. Reyes

			        grade - 5
				        location - Museum
				        number of groups - 5
				        teacher in charge - Ms. Lela

			        grade - 6
				        location - Six Flags
				        number of groups - 8
				        teacher in charge - Mr. Watt

			        for any other gradeNumber:
			        	location - Unknown
			        	numer of gourps - 0
			        	teacher in charge - Unknown


 */