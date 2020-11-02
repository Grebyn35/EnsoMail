public class OperationCompare implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        if(num1 > num2){
            return num1;
        }else{
            return num2;
        }

    }
}
