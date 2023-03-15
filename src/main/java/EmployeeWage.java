import java.util.Random;

public class EmployeeWage {
    int present = 1;
    int perHour = 20;
    int fullDay = 8;
    int salary = perHour*fullDay;
    Random random = new Random();
    int randomcheck = random.nextInt(2);
    void fun(){
        if (randomcheck==present){
            System.out.println("Total Employee Wage"+salary);
        }
        else {
            System.out.println("Employee is Absent");
        };
    }

    public static void main(String[] args) {
        EmployeeWage ob = new EmployeeWage();
        ob.fun();
    }
}
