public class SweetFactory implements Factory {

    @Override
    public Product getProduct(String product){

        product = product.replaceAll("\\s+", "");

        if(product == null){
            return null;
        }else if(product.equalsIgnoreCase("cupcake")){
            return new Cupcake();
        }else if(product.equalsIgnoreCase("rasmalai")){
            return new RasMalai();
        }else if(product.equalsIgnoreCase("kajubarfi")){
            return new KajuBarfi();
        }else{
            return null;
        }
    }
} 