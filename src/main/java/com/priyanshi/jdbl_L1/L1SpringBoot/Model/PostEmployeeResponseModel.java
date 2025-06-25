package com.priyanshi.jdbl_L1.L1SpringBoot;

public class PostEmployeeResponseModel {

    int id;
    String name;
    int sal;
    String dept;
    int status;
    String message;

    public PostEmployeeResponseModel(int id, String name,  int sal, String dept, int status,String message) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.sal = sal;
        this.message = message;
        this.status = status;
    }
    @Override
    public String toString() {
        return "PostEmployeeResponseModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                ", dept='" + dept + '\'' +
                ", status=" + status +
                ", message='" + message + '\'' +
                '}';
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

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public PostEmployeeResponseModel(){
        super();
    }


}
