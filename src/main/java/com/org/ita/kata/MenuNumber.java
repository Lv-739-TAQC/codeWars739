package com.org.ita.kata;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.TreeMap;

import com.org.ita.kata.students.delegator.Student;
import com.org.ita.kata.utils.NameMethod;
import com.org.ita.kata.utils.SystemInput;

public abstract class MenuNumber {

    public final String INCORRECT_INPUT = "Incorrect input";
    public final String GO_BACK = "Back";

    private Student student;

    public MenuNumber() {
    }

    public MenuNumber(Student student) {
        this.student = student;
    }

    public void SetStudent(Student student) {
        this.student = student;
    }

    public Object whoImplemented() {
        return student.getStudentRealisation().getClass();
    }

    public Eight getStudentEightKataRealisation() {
        return student.getStudentRealisation().implementationEightKata();
    }

    public Five getStudentFiveKataRealisation() {
        return student.getStudentRealisation().implementationFiveKata();
    }

    public Four getStudentFourKataRealisation() {
        return student.getStudentRealisation().implementationFourKata();
    }

    public Seven getStudentSevenKataRealisation() {
        return student.getStudentRealisation().implementationSevenKata();
    }

    public Six getStudentSixKataRealisation() {
        return student.getStudentRealisation().implementationSixKata();
    }

    public void getAllTasks() {
        System.out.println("\n[IMPLEMENTED BY : " + whoImplemented() + "]\n");
        Map<Integer, Method> methods = new TreeMap<>();
        StringBuilder sb = new StringBuilder("[ALL TASKS]\n");
        int count = 1;
        for (Method method : this.getClass().getMethods()) {
            try {
                NameMethod nameMethod = method.getAnnotation(NameMethod.class);
                String name = nameMethod.name();
                sb.append(count + ". " + name + "\n");
                methods.put(count, method);
                count++;
            } catch (Exception e) {
            }
        }
        sb.append("0. Go back\n").append("Enter number of task : ");

        while (true) {
            System.out.print(sb);

            try {
                int taskNumber = Integer.valueOf(SystemInput.input.nextLine());
                if (taskNumber == 0) {
                    return;
                }
                Method chosenMethod = methods.get(taskNumber);
                chosenMethod.invoke(this);
            } catch (Exception e) {
                System.out.println(INCORRECT_INPUT);
            }

            System.out.print("Put Enter");
            SystemInput.input.nextLine();
        }
    }
}
