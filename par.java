/**
  
 */
interface Ayah{
    void kaya();
}

interface Ibu{
    void kaya();
    void terpelajar();
}



class par implements Ayah, Ibu{

    @Override
    public void kaya(){
        System.out.println("Kaya dari Ayah dan Ibu");
    }

    @Override
    public void terpelajar(){
        System.out.println("Terpelajar dari Ibu");
    }

    public static void main(String[] args) {
        
        par anak = new par();

        anak.kaya();
        anak.terpelajar();


    }

}


