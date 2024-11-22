public class washing_machine {
    private boolean isOn;
    private int noOfClothes;
    private boolean detergentAdded;

   
    public washing_machine() {
        this.isOn = false;
        this.noOfClothes = 0;
        this.detergentAdded = false;
    }

    public void switchOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("Washing machine is now ON.");
        } else {
            System.out.println("Washing machine is already ON.");
        }
    }


    public int acceptClothes(int noOfClothes) {
        if (isOn) {
            this.noOfClothes = noOfClothes;
            System.out.println(noOfClothes + " clothes have been added.");
            return noOfClothes;
        } else {
            System.out.println("Cannot accept clothes. Please switch on the washing machine first.");
            return 0;
        }
    }

  
    public void acceptDetergent() {
        if (isOn) {
            detergentAdded = true;
            System.out.println("Detergent has been added.");
        } else {
            System.out.println("Cannot add detergent. Please switch on the washing machine first.");
        }
    }

    public void switchOff() {
        if (isOn) {
            isOn = false;
            noOfClothes = 0;
            detergentAdded = false;
            System.out.println("Washing machine is now OFF.");
        } else {
            System.out.println("Washing machine is already OFF.");
        }
    }

   
    public static void main(String[] args) {
    	washing_machine wm = new washing_machine();

        wm.switchOn();
        wm.acceptClothes(5);
        wm.acceptDetergent();
        wm.switchOff();
    }
}
