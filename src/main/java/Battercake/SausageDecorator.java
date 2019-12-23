package Battercake;

public class SausageDecorator extends BattercakeDecorator {


    public SausageDecorator( Battercake battercake ) {
        super(battercake);
    }

    @Override
    protected void doSomething() {

    }


    protected String getMsg(){
        return super.getMsg()+"+1个根香肠";
    }

    protected int getPrice(){
        return super.getPrice()+2;
    }
}
