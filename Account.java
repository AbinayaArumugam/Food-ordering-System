package com.foododering;

public  class Account {
    private String name;
    private int age;
    private String eMail;
    private String password;
    private String mobileNo;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobileNo(String mobileNo) {
        return this.mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String toString(){
        return " Name "+name+" Age "+age+" e-Mail "+eMail+" Password "+password+" Mobile No "+mobileNo;
    }
}
