/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tungi
 */
public class Supplier {

    private int id;
    private String name;
    private String address;
    private String phone;
    private boolean status;

    public Supplier() {
        this.id = 0;
        this.name = "";
        this.phone = "";
        this.address = "";
        this.status = false;
    }

    public Supplier(int id, String name, String address, String phone) {
        this.id = id;
        setName(name);
        this.address = address;
        setPhone(phone);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return toTitleCase(name);
    }

    public void setName(String name) {
//        if(name!=null){
//            if(!name.isEmpty()){
//                if(name.length()>=5 && name.length()<=50){
//                    this.name = name;
//                    this.status = true;
//                    return;
//                }
//            }
//        }
//        this.status = false;
        if (name != null && !name.isEmpty() && name.length() >= 5 && name.length() <= 50) {
            this.name = name;
            this.status = true;
        } else {
            this.name = "no name";
            this.status = false;
        }
    }

    public String getAddress() {
        return toTitleCase(address);
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (phone != null && phone.startsWith("0") && (phone.length() == 9 || phone.length() == 10)) {
            this.phone = phone;
        } else {
            this.phone = "000.000.0000";
        }
    }

    public boolean isStatus() {
        return status;
    }

    public boolean getStatus() {
        return status;
    }

    public String getStatusValue() {
        return (status) ? "Available" : "Unavailable";
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String toTitleCase(String s) {
        if (s != null) {
            s = s.trim(); // xoa khoang trang 2 dau
            String[] temp = s.split(" ");
            for (int i = 0; i < temp.length; i++) {
                if (!temp[i].isEmpty()) {
                    String word = temp[i];
                    word = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
                    temp[i] = word;
                }
            }
//            s = "";
//            for (int i = 0; i < temp.length; i++) {
//                if(!temp[i].trim().isEmpty()){
//                    s = (s +" "+temp[i]);
//                }
//            }
//            s=s.trim();

              s = String.join(" ", temp);
              while(s.indexOf("  ")>=0){ // Tim vi tri cua 2 khoang trang ke nhau
                  s = s.replaceAll("  ", " "); // Replace "  " => " "
              }
        }
        return s;
    }

    @Override
    public String toString() {
        return this.id + "," + getName() + "," + getAddress() + "," + getPhone() + "," + getStatusValue();
    }

}
