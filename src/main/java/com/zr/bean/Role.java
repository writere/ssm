package com.zr.bean;

public class Role {
    public Role() {
    }

    public Role(int id, String rolename, String roledesc) {
        this.id = id;
        this.rolename = rolename;
        this.roledesc = roledesc;
    }

    private int id;
    private String rolename;
    private String roledesc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String getRoledesc() {
        return roledesc;
    }

    public void setRoledesc(String roledesc) {
        this.roledesc = roledesc;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", rolename='" + rolename + '\'' +
                ", roledesc='" + roledesc + '\'' +
                '}';
    }
}
