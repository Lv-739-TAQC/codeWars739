package com.org.ita.kata.menus;

import com.org.ita.kata.MenuNumber;
import com.org.ita.kata.students.delegator.Student;
import com.org.ita.kata.utils.NameMethod;
import com.org.ita.kata.utils.SystemInput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MenuSix extends MenuNumber {

    public MenuSix() {
    }

    public MenuSix(Student student) {
        super(student);
    }

    @NameMethod(name = "Build a pile of Cubes")
    public void getBuildAPileOfCubesTask() {
        System.out.println("Enter the total volume of the building : ");
        long volume = SystemInput.inputLongNumber();
        System.out.println("Number of cubes = " + getStudentSixKataRealisation().findNb(volume));
    }


    public boolean exitMenu;

    @NameMethod(name = "Easy balance checking")
    public void getEasyBalanceCheckingTask() {
        exitMenu = false;
        Scanner scanner = new Scanner(System.in);
        String file1Content = "";
        String file2Content = "";
        String file3Content = "";
        String path = "src/main/resources/balance/";
        File input1 = new File(path + "input1.txt");
        File input2 = new File(path + "input2.txt");
        File input3 = new File(path + "input3.txt");
        System.out.println();
        System.out.println("Please, choose one of three files to work with while Balance Checking task execution: ");
        System.out.println();
        file1Content = getContent("First", input1);
        file2Content = getContent("Second", input2);
        file3Content = getContent("Third", input3);
        while (!exitMenu) {
            System.out.println("Enter '1' to work with input1.txt");
            System.out.println("Enter '2' to work with input2.txt");
            System.out.println("Enter '3' to work with input3.txt");
            System.out.println();
            System.out.println("Make Your choice: ");
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    System.out.println(getStudentSixKataRealisation().balance(file1Content));
                    System.out.println();
                    return;
                case 2:
                    System.out.println(getStudentSixKataRealisation().balance(file2Content));
                    System.out.println();
                    return;
                case 3:
                    System.out.println(getStudentSixKataRealisation().balance(file3Content));
                    System.out.println();
                    return;
                default:
                    System.out.println("Please, enter correct value: 1, 2 or 3.");
                    System.out.println();
            }
        }
        scanner.close();
    }

    public String getContent(String fileNum, File input) {
        StringBuilder sb = new StringBuilder();
        try {
            Scanner scanner = new Scanner(input);
            System.out.println(fileNum + " file name: " + input.getName());
            System.out.println(fileNum + " file content: ");
            while (scanner.hasNextLine()) {
                sb.append(scanner.nextLine()).append("\n");
            }
            System.out.println();
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found, please, make sure, the path is correct.");
            System.out.println();
            exitMenu = true;
        }
        return sb.toString();
    }


    @NameMethod(name = "Floating-point Approximation (I)")
    public void getFloatingPointApproximationITask() {
        System.out.println("Enter x near zero for f(x) function : ");
        double x = SystemInput.inputNearZeroNumber();
        System.out.println("Good approximation of f(x) is : " + getStudentSixKataRealisation().f(x));
    }

    @NameMethod(name = "Rainfall")
    public void getRainfallTask() {
        String data1 = "Rome:Jan 81.2,Feb 63.2,Mar 70.3,Apr 55.7,May 53.0,Jun 36.4,Jul 17.5,Aug 27.5,Sep 60.9,Oct 117.7,Nov 111.0,Dec 97.9" +
                "\n" +
                "London:Jan 48.0,Feb 38.9,Mar 39.9,Apr 42.2,May 47.3,Jun 52.1,Jul 59.5,Aug 57.2,Sep 55.4,Oct 62.0,Nov 59.0,Dec 52.9" +
                "\n" +
                "Paris:Jan 182.3,Feb 120.6,Mar 158.1,Apr 204.9,May 323.1,Jun 300.5,Jul 236.8,Aug 192.9,Sep 66.3,Oct 63.3,Nov 83.2,Dec 154.7" +
                "\n" +
                "NY:Jan 108.7,Feb 101.8,Mar 131.9,Apr 93.5,May 98.8,Jun 93.6,Jul 102.2,Aug 131.8,Sep 92.0,Oct 82.3,Nov 107.8,Dec 94.2" +
                "\n" +
                "Vancouver:Jan 145.7,Feb 121.4,Mar 102.3,Apr 69.2,May 55.8,Jun 47.1,Jul 31.3,Aug 37.0,Sep 59.6,Oct 116.3,Nov 154.6,Dec 171.5" +
                "\n" +
                "Sydney:Jan 103.4,Feb 111.0,Mar 131.3,Apr 129.7,May 123.0,Jun 129.2,Jul 102.8,Aug 80.3,Sep 69.3,Oct 82.6,Nov 81.4,Dec 78.2" +
                "\n" +
                "Bangkok:Jan 10.6,Feb 28.2,Mar 30.7,Apr 71.8,May 189.4,Jun 151.7,Jul 158.2,Aug 187.0,Sep 319.9,Oct 230.8,Nov 57.3,Dec 9.4" +
                "\n" +
                "Tokyo:Jan 49.9,Feb 71.5,Mar 106.4,Apr 129.2,May 144.0,Jun 176.0,Jul 135.6,Aug 148.5,Sep 216.4,Oct 194.1,Nov 95.6,Dec 54.4" +
                "\n" +
                "Beijing:Jan 3.9,Feb 4.7,Mar 8.2,Apr 18.4,May 33.0,Jun 78.1,Jul 224.3,Aug 170.0,Sep 58.4,Oct 18.0,Nov 9.3,Dec 2.7" +
                "\n" +
                "Lima:Jan 1.2,Feb 0.9,Mar 0.7,Apr 0.4,May 0.6,Jun 1.8,Jul 4.4,Aug 3.1,Sep 3.3,Oct 1.7,Nov 0.5,Dec 0.7";
        String data2 = "Rome:Jan 90.2,Feb 73.2,Mar 80.3,Apr 55.7,May 53.0,Jun 36.4,Jul 17.5,Aug 27.5,Sep 60.9,Oct 147.7,Nov 121.0,Dec 97.9" +
                "\n" +
                "London:Jan 58.0,Feb 38.9,Mar 49.9,Apr 42.2,May 67.3,Jun 52.1,Jul 59.5,Aug 77.2,Sep 55.4,Oct 62.0,Nov 69.0,Dec 52.9" +
                "\n" +
                "Paris:Jan 182.3,Feb 120.6,Mar 188.1,Apr 204.9,May 323.1,Jun 350.5,Jul 336.8,Aug 192.9,Sep 66.3,Oct 63.3,Nov 83.2,Dec 154.7" +
                "\n" +
                "NY:Jan 128.7,Feb 121.8,Mar 151.9,Apr 93.5,May 98.8,Jun 93.6,Jul 142.2,Aug 131.8,Sep 92.0,Oct 82.3,Nov 107.8,Dec 94.2" +
                "\n" +
                "Vancouver:Jan 155.7,Feb 121.4,Mar 132.3,Apr 69.2,May 85.8,Jun 47.1,Jul 31.3,Aug 37.0,Sep 69.6,Oct 116.3,Nov 154.6,Dec 171.5" +
                "\n" +
                "Sydney:Jan 123.4,Feb 111.0,Mar 151.3,Apr 129.7,May 123.0,Jun 159.2,Jul 102.8,Aug 90.3,Sep 69.3,Oct 82.6,Nov 81.4,Dec 78.2" +
                "\n" +
                "Bangkok:Jan 20.6,Feb 28.2,Mar 40.7,Apr 81.8,May 189.4,Jun 151.7,Jul 198.2,Aug 197.0,Sep 319.9,Oct 230.8,Nov 57.3,Dec 9.4" +
                "\n" +
                "Tokyo:Jan 59.9,Feb 81.5,Mar 106.4,Apr 139.2,May 144.0,Jun 186.0,Jul 155.6,Aug 148.5,Sep 216.4,Oct 194.1,Nov 95.6,Dec 54.4" +
                "\n" +
                "Beijing:Jan 13.9,Feb 14.7,Mar 18.2,Apr 18.4,May 43.0,Jun 88.1,Jul 224.3,Aug 170.0,Sep 58.4,Oct 38.0,Nov 19.3,Dec 2.7" +
                "\n" +
                "Lima:Jan 11.2,Feb 10.9,Mar 10.7,Apr 10.4,May 10.6,Jun 11.8,Jul 14.4,Aug 13.1,Sep 23.3,Oct 1.7,Nov 0.5,Dec 10.7";
        String data = "";
        boolean isNotChosen = true;
        while (isNotChosen) {
            System.out.println("There is data written in data1, data2" +
                    "\nChoose which one to use:" +
                    "\n1) data1" +
                    "\n2) data2" +
                    "\n3) data1 + data2");
            String ans = SystemInput.input.nextLine();
            switch (ans) {
                case "1":
                    data = data1;
                    isNotChosen = false;
                    break;
                case "2":
                    data = data2;
                    isNotChosen = false;
                    break;
                case "3":
                    data = data1 + data2;
                    isNotChosen = false;
                    break;
                default:
                    System.out.println(INCORRECT_INPUT);
                    break;
            }
        }

        System.out.println("Towns: Rome, London, Paris, NY, Vancouver, Sydney, Bangkok, Tokyo, Beijing, Lima" +
                "\nEnter name of town: ");
        String town = SystemInput.input.nextLine();
        double result = getStudentSixKataRealisation().mean(town, data);

        if (result < 0) {
            System.out.println(town + " has no records");
        } else {
            System.out.println("The average of rainfall for the " + town + ": " + result);

        }
    }

    @NameMethod(name = "Ranking NBA")
    public void getRankingNBATask() {
        System.out.print("Enter results of NBA teams in format \"team goal team goal, ... , team goal team goal\"" +
                " or \"file path_file\": ");
        String games = SystemInput.input.nextLine();
        if (games.subSequence(0, 4).equals("file")) {
            games = SystemInput.readFromFile();
        }
        games = SystemInput.readFromFile();
        System.out.print("Enter team: ");
        String team = SystemInput.readFromFile();
        getStudentSixKataRealisation().nbaCup(games, team);
    }

    @NameMethod(name = "Help the bookseller!")
    public void getHelpTheBooksellerTask() {
        {
            System.out.println("Enter the code of books : ");
            String[] L = {"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
            String [] N = {"BBAR 150", "CDXE 515", "BKWR 250", "BTSQ 890", "DRTY 600"};
            String[] code = {""};
            boolean isNotChosen = true;
            while (isNotChosen) {
                System.out.println("There are codes of stocklistes" +
                        "\nChoose which one to use:" +
                        "\n-> L" +
                        "\n-> N");
                String yourCode = SystemInput.input.nextLine();
                switch (yourCode) {
                    case "L":
                        code = L;
                        isNotChosen = false;
                        break;
                    case "N":
                        code = N;
                        isNotChosen = false;
                        break;
                    default:
                        System.out.println(INCORRECT_INPUT);
                        break;
                }
                System.out.println("Enter the first letter of category : ");
                String[] category = SystemInput.inputString();
                System.out.println("Your report " + getStudentSixKataRealisation().stockSummary(code, category));
            }
        }
    }
}
