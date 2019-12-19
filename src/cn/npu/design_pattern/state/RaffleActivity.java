package cn.npu.design_pattern.state;

public class RaffleActivity {

    State state=null;

    State noRaffleState=new NoRaffleState(this);
    State canRaffleState=new CanRaffleState(this);
    State dispenseState=new DispenseState(this);

    public void deductMoney(){
        state.deduceMoney();
    }

    public void raffle(){
        state.raffle();
    }

    public void dispensePrize(){
        state.dispensePrize();
    }

    public void setState(State state){
        this.state=state;
    }

    public State getNoRaffleState() {
        return noRaffleState;
    }

    public void setNoRaffleState(State noRaffleState) {
        this.noRaffleState = noRaffleState;
    }

    public State getCanRaffleState() {
        return canRaffleState;
    }

    public void setCanRaffleState(State canRaffleState) {
        this.canRaffleState = canRaffleState;
    }

    public State getDispenseState() {
        return dispenseState;
    }

    public void setDispenseState(State dispenseState) {
        this.dispenseState = dispenseState;
    }

    public RaffleActivity(int count) {
        this.state=getNoRaffleState();
    }
}
