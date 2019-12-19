package cn.npu.design_pattern.state;

public class CanRaffleState implements State {

    RaffleActivity raffleActivity;

    public CanRaffleState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

    @Override
    public void deduceMoney() {
        System.out.println("已经扣过了");
    }

    @Override
    public boolean raffle() {
        raffleActivity.setState(raffleActivity.getDispenseState());
        return true;
    }

    @Override
    public void dispensePrize() {
        System.out.println("先抽奖吧");
    }
}
