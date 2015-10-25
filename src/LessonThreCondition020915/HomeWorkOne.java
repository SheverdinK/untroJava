package LessonThreCondition020915;


import myLabrairy.ToBeContinue;

public class  HomeWorkOne {

//   EX - 1 - IF statment

public void exGrade () {

    System.out.println ("Enter Number  from 0 to 100");
    int grade = value.getInt ();
    if (grade >= 0 && grade <= 100) {

        if (grade == 100) {
            System.out.println ("You are 'EXCELLENT'");
        } else if (grade >= 90 ) {
            System.out.println ("You are 'VERY GOOD'");
        } else if (grade >= 80 ) {
            System.out.println ("You are 'GOOD'");
        } else if (grade >= 60 ) {
            System.out.println ("You are 'OK'");
        } else {
            System.out.println ("You are 'FAIL'");
        }
    }
    else {
        System.out.println ("Number is not correct");
    }
}


ToBeContinue value = new ToBeContinue ();

public void exMonth () {
    System.out.println ("Enter Number  of 'MONTH'");
    int numMonth = value.getInt ();
    if (numMonth >=1 && numMonth <= 12) {
        switch (numMonth) {
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println ("This MONTH has '30 days'");
                    break;
                case 2:
                    System.out.println ("This MONTH has '28 or 29 days'");
                    break;
                default:
                    System.out.println ("This MONTH has '31 days'");
            }
    }
    else System.out.println ("The Number is not 'CORRECT'");
}
}



 /* 1.  take from user a grade
    100- exelent
    90-99-veryGood
    80-89-Good
    60-79-ok
    0-59- fail
    another number - error
    2. number = month.  calculate how much days have this month
if number > 12  error
*/
