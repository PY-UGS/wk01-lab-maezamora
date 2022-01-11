public class Lab1 {
    public static void main(String[] args) {
        System.out.println("Hello, I am Zchyrlene");
        System.out.println();

        String module = "CSC1009";
        switch (module) {
            case "CSC1006":
                System.out.println("Mathematics 2");
                break;
            case "CSC1007":
                System.out.println("Operating Systems");
                break;
            case "CSC1008":
                System.out.println("Data Structures and Algorithms");
                break;
            case "CSC1009":
                System.out.println("Object-Oriented Programming");
                break;
            case "CSC1010":
                System.out.println("Computer Networks");
                break;
            default:
                System.out.println("No module");
                break;
        }

        for (int x = 102; x >= 66; x = x - 1) {
            if (x % 2 != 0) // if x%2 is not equal to zero, the number is odd
            {
                System.out.println("value of x : " + x);
            }
        }
    }
}
