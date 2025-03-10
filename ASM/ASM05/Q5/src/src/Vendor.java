
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tungi
 */
public class Vendor implements Comparable<Vendor> {

    private int id;
    private String name;
    private String address;
    private String phone;
    private double sale;

    public Vendor() {
        setId(0);
        setName("");
        setAddress("");
        setPhone("");
        setSale(0);
    }

    public Vendor(int id, String name, String address, String phone, double sale) {
        this.id = id;
        setName(name);
        setAddress(address);
        setPhone(phone);
        setSale(sale);
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
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            this.name = "No Name";
        }
    }

    public String getAddress() {
        return toTitleCase(address);
    }

    public void setAddress(String address) {
        if (address != null && !address.trim().isEmpty()) {
            this.address = address;
        } else {
            this.address = "No Address";
        }
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        String regex1 = "^0\\d{8,9}$";
        String regex2 = "^\\(0\\d{2}\\)\\d{8}$";
        if (phone.matches(regex1) || phone.matches(regex2)) {
            this.phone = phone;
        } else {
            this.phone = "No Phone";
        }
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        if (sale >= 100 && sale <= 5000000) {
            this.sale = sale;
        } else {
            this.sale = 100;
        }
    }

    @Override
    public String toString() {
        return getId() + "," + getName() + "," + getAddress() + "," + getPhone() + "," + String.format("%.3f", getSale());
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vendor other = (Vendor) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.sale) != Double.doubleToLongBits(other.sale)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        if (!Objects.equals(this.phone, other.phone)) {
            return false;
        }
        return true;
    }

    public String toTitleCase(String s) {
        String result = "";
        String[] words = s.split(" ");
        for (String word : words) {
            if (word.trim().length() > 0) {
                String temp = word.substring(0, 1).toUpperCase()
                        + word.substring(1).toLowerCase();
                result += (temp + " ");
            }
        }
        return result.trim();
    }

    @Override
    public int compareTo(Vendor that) {
        // = 0: a==b
        // > 0: a>b
        // < 0: a<b
        if (this.getSale() == that.getSale()) {
            return this.getName().compareTo(that.getName());
        } else {
            // descending
            if (this.getSale() - that.getSale() < 0) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}
