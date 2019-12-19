package cn.npu.design_pattern.state;

public class NoRaffleState implements State {

    RaffleActivity raffleActivity;

    public NoRaffleState(RaffleActivity raffleActivity){
        this.raffleActivity=raffleActivity;
    }

    //当前状态可以扣积分，扣除后，将状态设置成可以抽奖状态
    @Override
    public void deduceMoney() {
        System.out.println("扣除50积分");
        raffleActivity.setState(raffleActivity.getCanRaffleState());
    }

    @Override
    public boolean raffle() {
        System.out.println("积分没扣，不能抽奖");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("不能发奖品");
    }
}
