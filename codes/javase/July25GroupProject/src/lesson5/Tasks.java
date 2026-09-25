package lesson5;

public class Tasks {

	    public static void main(String[] args) {

	        // 1
	        int age = 20;
	        double price = 9.9;
	        String name = "Ali";
	        boolean student = true;
	        System.out.println(age + " " + price + " " + name + " " + student);

	        // 2
	        int userAge = 20;
	        String studentName = "Ali";
	        boolean isInClass = true;

	        // 3
	        int studentAge = 18;
	        double productPrice = 99.9;
	        String userName = "ibadov";

	        // 4
	        boolean isLoggedIn = true, hasAccess = false, canEdit = true;
	        if (isLoggedIn) System.out.println("Login");
	        if (hasAccess) System.out.println("Access");
	        if (canEdit) System.out.println("Edit");

	        // 5
	        int x = 5, y = 10, z = x + y; // Bad names
	        int first = 5, second = 10, sum = first + second; // Good names

	        // 6
	        int age1 = 10, Age = 20, AGE = 30;
	        System.out.println(age1 + " " + Age + " " + AGE);

	        // 7
	        String[] userList = {"Ali"};
	        int maxScore = 100;
	        double tempValue = 1.5;
	    }
	}

