

public class RewardValue {

  private static double cashValue; 
  private final double milesToCash = 0.0035;  
  

  public  RewardValue(double cash){
    this.cashValue = cash;
  }
  
  public RewardValue(int miles){
    this.cashValue = milesToCashVal(miles);
  }


  public double milesToCashVal(int miles){ 
    return miles * milesToCash; 
  }

  public int cashToMiles(double cash) {
    return (int) (cashValue/ milesToCash);
  }

  public double getCashValue(){ 
    return cashValue ;
  }

  public int getMilesValue(){

    return cashToMiles(cashValue);
  }

}


