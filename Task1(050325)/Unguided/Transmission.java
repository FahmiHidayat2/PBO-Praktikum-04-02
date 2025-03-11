/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided;

/**
 *
 * @author ASUS
 */
public class Transmission {
   private String type;  // Jenis transmisi, misalnya "Manual" atau "Otomatis".
    private int gears;  // Jumlah gigi transmisi.

    // Konstruktor untuk membuat transmisi dengan jenis dan jumlah gigi tertentu.
    public Transmission(String type, int gears) {
        this.type = type;
        this.gears = gears;
    }

    // Method untuk mengoper gigi transmisi.
    public void shiftGear(int gear) {
        System.out.println("Oper gigi ke " + gear + ".");
    }

    // Method untuk mendapatkan jenis transmisi.
    public String getType() {
        return type;
    }

    // Method untuk mendapatkan jumlah gigi transmisi.
    public int getGears() {
        return gears;
    } 
}
