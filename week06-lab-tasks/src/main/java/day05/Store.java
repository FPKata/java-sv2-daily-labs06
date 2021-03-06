package day05;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product){
        products.add(product);
    }

    public List<ProductWithPiece> numberOfProductsByType(){
        List<ProductWithPiece> result = new ArrayList<>();

        for (Product actual : products){
            ProductWithPiece productWithPiece = containsProduct(actual, result);
            if (productWithPiece != null){
                productWithPiece.incrementCount();
            }else{
                result.add(new ProductWithPiece(actual.getType()));
            }
        }
        return  result;
    }

    private ProductWithPiece containsProduct(Product actual, List<ProductWithPiece> productPieceList) {
        for (ProductWithPiece pwp : productPieceList){
            if (actual.getType() == pwp.getType()){
                return pwp;
            }
        }
        return null;  //null-t egyébként NE adjunk vissza!!!
    }
}
