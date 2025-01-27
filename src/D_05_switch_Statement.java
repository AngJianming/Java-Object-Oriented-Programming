public class D_05_switch_Statement {
    public static void main(String[] args) {
        // switch Statement

//        switch (expression) {
//            case value1:
//                // Code block when expression == value1
//                break; // optional, but often used to prevent "fall-through"
//
//            case value2:
//                // Code block when expression == value2
//                break;

//            // You can have as many cases as needed.
//            default:
//                // Code block if expression doesn't match any case
//        }

//        expression: A value or variable that the switch will evaluate. This expression must result in a value of type byte, short, char, int, String, or an enum (and their corresponding wrapper classes in newer Java versions).

//        case value: Each case compares the expression against a constant. If the expression matches this constant, the code for that case executes.

//        break: The break statement prevents "fall-through", meaning that the program will exit the switch block once that case executes. Without a break, execution would continue to subsequent cases even if they don't match.

//        default: The optional default case runs if none of the specified cases match the expression. It’s like the else in an if-else-if structure.


        // Example
        int day = 4;
        String dayName;

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }

        System.out.println("The day is: " + dayName);

    }
}
