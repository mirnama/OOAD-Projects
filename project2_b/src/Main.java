import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

import Staff.*;

public class Main {
    public static void main (String[] args) {
        Store store = new Store();
        ArrayList<Staff> hired = store.getStaffMembers();
        System.out.println(hired.get(0).getEmployeeName());
    }
}
