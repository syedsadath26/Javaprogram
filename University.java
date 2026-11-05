class University {

    String universityName = "Cambridge University";

    static class Department {
        String departmentName = "Cyber Security";

        void displayDepartment() {
            System.out.println("Department: " + departmentName);
        }
    }

    class Faculty {
        String facultyName;
        String designation;

        Faculty(String name, String desig) {
            facultyName = name;
            designation = desig;
        }

        void displayFaculty() {
            System.out.println("Faculty Name: " + facultyName);
            System.out.println("Designation: " + designation);
        }
    }

    void displayUniversity() {
        System.out.println("University: " + universityName);
    }

    public static void main(String[] args) {

        University u = new University();

        University.Department d =
            new University.Department();

        University.Faculty f =
            u.new Faculty("Ramesh", "Professor");

        u.displayUniversity();
        d.displayDepartment();
        f.displayFaculty();
    }
}