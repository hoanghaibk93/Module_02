package ss09_dsa_list.bai_tap.arraylist;

public class MyListTest {

    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Student studentOne = new Student(23, "Hung");
        Student studentTwo = new Student(24, "Anh");
        Student studentThree = new Student(24, "Minh");
        Student studentFour = new Student(26, "Hai");
        MyList<Student> myList = new MyList<>();
        myList.add(studentOne);
        myList.add(studentTwo);
        myList.add(studentThree);
        for (int i = 0; i < myList.size(); i++) {
            Student student = (Student) myList.elements[i];
            System.out.println(student);
        }
        System.out.println(myList.size());
        myList.add(1, new Student(27, "Hoang"));
        System.out.println(myList.size());
        System.out.println(myList.remove(2));
        System.out.println(myList.contains(new Student(23, "Hung")));
    }
}
