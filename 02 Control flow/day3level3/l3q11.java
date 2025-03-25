public class l3q11 {
    public static void main(String[] args) {
        int m = 3; 
        int d = 20; 
        int y = 2025; 
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
        switch (d0) {
            case 0:
                System.out.println("The day of the week is Sunday");
                break;
            case 1:
                System.out.println("The day of the week is Monday");
                break;
            case 2:
                System.out.println("The day of the week is Tuesday");
                break;
            case 3:
                System.out.println("The day of the week is Wednesday");
                break;
            case 4:
                System.out.println("The day of the week is Thursday");
                break;
            case 5:
                System.out.println("The day of the week is Friday");
                break;
            case 6:
                System.out.println("The day of the week is Saturday");
                break;
            default:
                System.out.println("Invalid computation.");
        }
    }
}
