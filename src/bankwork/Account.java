/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankwork;

/**
 *
 * @author userland
 */
public class Account {
    private int acoNo;
    private String title;
    private double amout;

    public Account() {
        acoNo = 1020;
        title = "test";
        amout = 5000;
    }

    public Account(int acoNo, String title, double amout) {
        this.acoNo = acoNo;
        this.title = title;
        this.amout = amout;
    }
    
    
    public int getAcoNo() {
        return acoNo;
    }

    public void setAcoNo(int acoNo) {
        this.acoNo = acoNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getAmout() {
        return amout;
    }

    public void setAmout(double amout) {
        this.amout = amout;
    }
    
    public void widtrhow(int amout) {
        if(amout > 0)
            this.amout -= amout;
        else
            System.out.println("your ballance is zero");
   
    }
    
    public void deposit(int amout){
        this.amout += amout;
    }

    @Override
    public String toString() {
        return "Account{" + "acoNo=" + acoNo + ", title=" + title + ", amout=" + amout + '}';
    }
    
    
}
