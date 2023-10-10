package lista3.exe1;
public class Testa {

    public static void main(String[] args) {
        // cria um produto
        Product objProd1 = new Product("Barra de chocolate", 12);
        
        CarItem objCI1 = new CarItem(2, objProd1);
        
        CarItem objCI2 = new CarItem(5, objProd1);
        
        //System.out.println(objCI1.toString());
        //System.out.println(objCI2.toString());
        ShoppingCart objSC1 = new ShoppingCart();
        objSC1.setId(10);
        objSC1.addCarItem(objCI1);
        objSC1.addCarItem(objCI2);
        System.out.println(objSC1.toString());
        
    }
    
}
