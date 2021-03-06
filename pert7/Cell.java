/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prisontest;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Cell {
    private final String cell;
    private boolean doorCondition;
    private final int securityCode;
    



Cell(String name, boolean onOff, int secure){
        cell = name;
        doorCondition = onOff;
        securityCode = secure;
    }
    public String getCell(){
        return cell;
    }
    public boolean getDoorCondition(){
        return doorCondition;
    }
    private boolean codeVerif(int code){
        return code == securityCode;
    }
    private void setCell(){
        if(doorCondition == true){
            this.doorCondition = false;
            System.out.println("Door is now closed");
        }
        else{
            this.doorCondition = true;
            System.out.println("Door is now Open");
        }
    }

    


public void setDoor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Security Code:");
        int code = sc.nextInt();
        boolean status = codeVerif(code);
        while (status != true){
            System.out.println("Password is incorrect");
            System.out.println("Enter Security Code:");
            code = sc.nextInt();
            status = codeVerif(code);
        }
        if(status == true){
            setCell();
        }
    }
}
