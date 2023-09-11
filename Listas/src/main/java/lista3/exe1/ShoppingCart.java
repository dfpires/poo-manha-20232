/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista3.exe1;

import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class ShoppingCart {
    private int id;
    private ArrayList<CarItem> carItens; // vetor

    public ShoppingCart() {
        // alocar espaço na memória para o vetor
        carItens = new ArrayList();
    }

    public ShoppingCart(int id, ArrayList<CarItem> carItens) {
        this.id = id;
        this.carItens = carItens;
    }
    // adiciona um CarItem no vetor
    public void addCarItem(CarItem carItem){
        this.carItens.add(carItem);
    }
    // remove um item do carrinho 
    public boolean removeCarItem(CarItem carItem){
        return this.carItens.remove(carItem);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<CarItem> getCarItens() {
        return carItens;
    }

    public void setCarItens(ArrayList<CarItem> carItens) {
        this.carItens = carItens;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" + "id=" + id + ", carItens=" + carItens + '}';
    }
    
    
}
