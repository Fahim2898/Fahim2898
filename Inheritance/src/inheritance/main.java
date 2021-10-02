package inheritance;

public class main {

    public static void main(String[] args) {

        System.out.println("Student");
        student stdarr[] = new student[4];
        for (int i = 1; i < stdarr.length; i++) {
            System.out.println("Student: " + i);
            stdarr[i] = new student();
            stdarr[i].setInformation();
            stdarr[i].student();
        }
        System.out.println("Teacher");
        teacher teach[] = new teacher[3];
        for (int i = 1; i < teach.length; i++) {
            System.out.println("Teacher: " + i);
            teach[i] = new teacher();
            teach[i].setInformation();
            teach[i].teacher("100000");
        }

        System.out.println("Course");
        course cou[] = new course[4];
        for (int i = 1; i < cou.length; i++) {
            System.out.println("Course: " + i);
            cou[i] = new course();
            cou[i].setcourse();
        }
        for (int i = 1; i < stdarr.length; i++) {
            stdarr[i].asscourse(cou[i].Coursecode);
        }
        for (int i = 1; i < teach.length; i++) {
            teach[i].asscourse(cou[i].Coursecode, cou[i].chour);
        }

        for (int i = 1; i < stdarr.length; i++) {
            stdarr[i].prininfo();
            stdarr[i].prininfo1();
        }
        for (int i = 1; i < teach.length; i++) {
            teach[i].prininfo();
            teach[i].prininfo2();
        }
        for (int i = 1; i < cou.length; i++) {
            cou[i].printcourse();
            cou[i].assnostu();
            cou[i].tstu();
        }
    }

}
