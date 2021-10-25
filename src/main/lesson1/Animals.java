package main.lesson1;

public abstract class Animals {
    protected abstract String voice();
    private boolean sleep = false;
    private boolean eat = false;

    public void setSleep(boolean sleep1) {
        sleep = sleep1;
        isSleeping();
    }
    public void setEat(boolean eat1){
        eat = eat1;
        isEating();
    }
    boolean getSleep(){
        return sleep;
    }

    private void isSleeping(){
        if (sleep)
            System.out.println("Животное спит");
        else
            System.out.println("Животное не спит");
    }

    private void isEating(){
        if (eat){
            if (!sleep)
                System.out.println("Животное проснулось, чтобы покушать");
            sleep = true;
            System.out.println("Животное кушает");
        }
        else
            System.out.println("Живаотное не кушает");
    }


}
