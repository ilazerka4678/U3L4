public class Lottery {
    private int lotteryNumber;
    private String lotteryNum;

    public Lottery(){
        lotteryNumber = (int)(Math.random()*99+1);
        if (lotteryNumber/10 == 0){
            lotteryNum = "0" + lotteryNumber;
        }
        else{
            lotteryNum = "" + lotteryNumber;
        }
    }
    public int determinePrize(String userInput){
        if (userInput.equals(lotteryNum)){
            return 100;
        }
        if (userInput.substring(0,1).equals(lotteryNum.substring(0,1)) || userInput.substring(0,1).equals(lotteryNum.substring(1))|| ){
            return
        }
    }
}
