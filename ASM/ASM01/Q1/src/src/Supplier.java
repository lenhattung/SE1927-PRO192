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
        return name;
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
          if(name!=null && !name.isEmpty() && name.length()>=5 && name.length()<=50){
              this.name = name;
              this.status = true;
          }else{
              this.name = "no name";
              this.status = false;
          }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
       if(phone!=null && phone.startsWith("0") &&(phone.length()==9|| phone.length()==10)){
           this.phone = phone;
       }else{
           this.phone = "000.000.0000";
       }
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Supplier{" + "id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + ", status=" + status + '}';
    }
    
}
