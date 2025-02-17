package horaDaPratica.api.consultaCEP;

public class Main {
    public static void main(String[] args) {
        SearchAddress searchAdd = new SearchAddress();
        try{
            Address address = searchAdd.searchFromPostalCode("4176003");
            System.out.println(address);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println("Exiting program..");
        }


    }
}
