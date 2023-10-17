public class HandleBA {
    private String name;    //통장 주인이름
    private String surname; //은행 이름
    private long balance; //돈

    HandleBA() {
        balance = 0;
    }
    

    public void HandleBAs(String filename) {
        //TODO
        
        
    }

    public void interests(double rate) {
        if (rate <0) {
            rate = 0;
        }
        balance += balance * rate;
    }

    public void printNegative() {
        System.out.println(balance);
    }

}
