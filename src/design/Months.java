package design;

public enum Months {
    January, February, March, April, May, June, July, August, September, October, November, December;
    public static int whichMonth(String givenMonth) {
        Months months = Months.valueOf(givenMonth);
        int date = 0;
        switch (months) {
            case January:
                date = 1;
                break;
            case February:
                date = 2;
                break;
            case March:
                date = 3;
                break;
            case April:
                date = 4;
                break;
            case May:
                date = 5;
                break;
            case June:
                date = 6;
                break;
            case July:
                date = 7;
                break;
            case August:
                date = 8;
                break;
            case September:
                date = 9;
                break;
            case October:
                date = 10;
                break;
            case November:
                date = 11;
                break;
            case December:
                date = 12;
                break;
            default:
                System.out.println("Not Valid");;
                break;
        }
        return date;

    }


    public static void main(String[] args) {

    }}
