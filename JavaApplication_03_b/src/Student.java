public class Student {
    private String code;
    private String name;
    private int bYear;
    private String address;
    private String hiddenInfo;

    public Student() {
        this.code="001";
        this.name="Nguyen Xuan Son";
        this.bYear=1997;
        this.address="Ha Noi";
    }

    public Student(String code, String name, int bYear, String address) {
        this.code = code;
        this.name = name;
        this.bYear = bYear;
        this.address = address;
    }
    
    @Override
    public String toString() {
        return "Student{" + "code=" + code + ", name=" + name + ", bYear=" + bYear + ", address=" + address + '}';
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getbYear() {
        return bYear;
    }

    public String getAddress() {
        return address;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        if (name.length()>0)
            this.name = name;
    }

    public void setbYear(int bYear) {
        if(bYear>0)
            this.bYear = bYear;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
}
