package com.org.ita.kata.menus;

import com.org.ita.kata.MenuNumber;
import com.org.ita.kata.Six;
import com.org.ita.kata.students.delegator.StudentRealisationFactory;

import com.org.ita.kata.utils.SystemInput;

public class MenuSix implements MenuNumber {

    private StudentRealisationFactory studentRealisationFactory;
    private String allTasks = "1.) Build a pile of Cubes\n"
            + "2.) Easy balance checking\n"
            + "3.) Floating-point Approximation (I)\n"
            + "4.) Rainfall\n"
            + "5.) Ranking NBA\n"
            + "6.) Help the bookseller!";

    public MenuSix(StudentRealisationFactory studentRealisationFactory) {
        this.studentRealisationFactory = studentRealisationFactory;
    }

    @Override
    public Object whoImplemented() {
        return this.studentRealisationFactory.setUpImplementation().getClass();
    }

    public Six getStudentSixKataRealisation() {
        return this.studentRealisationFactory.setUpImplementation().implementationSixKata();
    }

    public void getBuildAPileOfCubesTask() {
        System.out.println("Enter the total volume of the building : ");
        long volume = SystemInput.inputLongNumber();
        System.out.println("Number of cubes = " + getStudentSixKataRealisation().findNb(volume));
    }

    public void getEasyBalanceCheckingTask() {

    }

    public void getFloatingPointApproximationITask() {

    }

    public void getRainfallTask() {

    }

    public void getRankingNBATask() {

    }

    public void getHelpTheBooksellerTask() {
        System.out.println("Enter the code of books : ");
        String L [] = {"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
        String M [] = {"BBAR 150", "CDXE 515", "BKWR 250", "BTSQ 890", "DRTY 600"};
        String N [] = {"CBART 20", "CDXEF 50", "BKWRK 25", "BTSQZ 89", "DRTYM 60"};
        String F [] = {"ROXANNE 102", "RHODODE 123", "BKWRKAA 125", "BTSQZFG 239", "DRTYMKH 060"};
        String P [] = {};
        String code []  = {""};
        boolean isNotChosen = true;
        while (isNotChosen) {
            System.out.println("There are codes of stocklist" +
                    "\nChoose which one to use:" +
                    "\n-> L" +
                    "\n-> M" +
                    "\n-> N" +
                    "\n-> F" +
                    "\n-> P");
            String yourCode = SystemInput.input.nextLine();
            switch (yourCode) {
                case "L":
                    code  = L ;
                    isNotChosen = false;
                    break;
                case "M":
                    code  = M ;
                    isNotChosen = false;
                    break;
                case "N":
                    code  = N;
                    isNotChosen = false;
                    break;
                case "F":
                    code  = F ;
                    isNotChosen = false;
                    break;
                case "P":
                    code  = P ;
                    isNotChosen = false;
                    break;
                default:
                    System.out.println(INCORRECT_INPUT);
                    break;
            }
        }
        System.out.println("Enter the first letter of category : ");
        String category []  = SystemInput.inputString();
        System.out.println("Your report " + getStudentSixKataRealisation().stockSummary(code, category));
    }

    @Override
    public void getAllTasks() {
        System.out.println("\n[IMPLEMENTED BY : " + whoImplemented() + "]\n");
        while (true) {
            System.out.println("[ALL TASKS]\n" + allTasks);
            System.out.println("7.) Go back\n");
            System.out.println("Enter number of task : ");
            String taskNumber = SystemInput.input.nextLine();
            switch (taskNumber) {
                case "1":
                    getBuildAPileOfCubesTask();
                    break;
                case "2":
                    getEasyBalanceCheckingTask();
                    break;
                case "3":
                    getFloatingPointApproximationITask();
                    break;
                case "4":
                    getRainfallTask();
                    break;
                case "5":
                    getRankingNBATask();
                    break;
                case "6":
                    getHelpTheBooksellerTask();
                    break;
                case "7":
                    System.out.println(GO_BACK);
                    return;
                default:
                    System.out.println(INCORRECT_INPUT);
                    break;
            }
        }
    }
}
