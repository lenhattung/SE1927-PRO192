public class Student {
    private String code;
    private String name;
    private int bYear;
    private String address;

    public Student() {
        this.code="001";
        this.name="Nguyen Xuan Son";
        this.bYear=1997;
        this.address="Ha Noi";
    }

    @Override
    public String toString() {
        return "Student{" + "code=" + code + ", name=" + name + ", bYear=" + bYear + ", address=" + address + '}';
    }
}
