public class Oprestion implements Oprestion_Interface {
int result;
    @Override
    public void addistion(int a, int b) {
        result =a+b;
        System.out.println("Addtion : -  "+result);

    }

    @Override
    public void subtration(int a, int b) {
        result=a-b;
        System.out.println( "Subtration  :- "+result);
    }

    @Override
    public void multiplication(int a, int b) {
        result=a*b;
        System.out.println("multiplation :-"+result);

    }

    @Override
    public void dividestion(int a, int b) {
        try {
            result=a/b;
            System.out.println("dividestion:- "+result);

            if (result==0){

            }
        }catch (Exception e){
            System.out.println("Not divided by zero");
        }

    }
}
