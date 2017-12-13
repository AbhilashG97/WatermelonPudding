public class DietFactory implements Factory {

    @Override
    public Product getProduct(String product){

        if(product == null){
            return null;
        }else if(product.equalsIgnoreCase("cupcake") && product.equalsIgnoreCase("rasmalai") &&
           product.equalsIgnoreCase("kajubarfi")){
               return null;
        }else{
            return new DietFood();
        }
    } 
}