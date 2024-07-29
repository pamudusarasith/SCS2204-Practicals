def question2() = {
    getStudentInfo();
}

def getStudentInfo() = {
    val student = getStudentInfoWithRetry();

    val percentage = student(1) * 100.0 / student(2);
    val grade = if percentage >= 90.0 then 
                    'A'
                else if percentage >= 75.0 then 
                    'B' 
                else if percentage >= 50.0 then 
                    'C' 
                else 'D';

    printStudentRecord(student ++ (percentage, grade));
}

def printStudentRecord(student: (String, Int, Int, Double, Char)) = {
    println("Name: " + student(0));
    println("Marks: " + student(1));
    println("Total Possible Marks: " + student(2));
    println("Percentage: " + student(3) + "%");
    println("Grade: " + student(4));
}

def validateInput(student: (String, Int, Int)): (Boolean, Option[String]) = {
    if (student(0).trim() == "") then {
        (false, Some("Name cannot be empty."))
    } else if (student(1) < 0 || student(1) > student(2)) then {
        (false, Some("Marks must be between 0 and total possible marks."))
    } else {
        (true, None)
    }
}

def getStudentInfoWithRetry(): (String, Int, Int) = {
    print("Enter student name: ");
    val name = scala.io.StdIn.readLine();
    print("Enter student marks: ");
    val marks = scala.io.StdIn.readInt();
    print("Enter total marks: ");
    val totalMarks = scala.io.StdIn.readInt();

    val (isValid, errorMessage) = validateInput((name, marks, totalMarks));
    if (isValid) then {
        (name, marks, totalMarks)
    } else {
        println(errorMessage.get);
        getStudentInfoWithRetry();
    }
}