package dishwasher;

// NOTE: Add code to the TODO at bottom, but otherwise DO NOT alter this class.  



public class DishWasherUnit {
    private int cycle;
    private boolean extendedDry;

    public DishWasherUnit() {
        this.cycle = 1;
        this.extendedDry = false;
    }

    // Setters and Getters
    public int getCycle() {
        return cycle;
    }

    public void setCycle(int cycle) {
        this.cycle = cycle;
    }
    
  //
  	

	
    public boolean isExtendedDry() {
        return extendedDry;
    }

    public void setExtendedDry(boolean extendedDry) {
        this.extendedDry = extendedDry;
    }

  
 /*   public String getCycleName() {
        String name = ""; 

        // TODO 1: Add decision statements to get cycle name
        if (this.cycle == 1) 
            name = "Normal Cycle";
         else if (this.cycle == 2) 
            name = "Quick Cycle ";
         else if (this.cycle == 3) 
            name = "Heavy Cycle";
         else if (this.cycle == 4) 
            name = "Pre-wash Cycle";
         else  if (this.cycle == 5) 
            name = "Delicate Cycle";
         else 
        	 System.out.print("enter valide number");
        

        return name;
    }
  */
    
    
   public String getCycleName() {
        String name="";

        switch (this.cycle) {
            case 1:
                name = "Normal Cycle";
                break;
            case 2:
                name = "Quick Cycle";
                break;
            case 3:
                name = "Heavy Cycle";
                break;
            case 4:
                name = "Pre-wash Cycle";
                break;
            case 5:
                name = "Delicate Cycle";
                break;
            default:
                name = "Unknown Cycle"; // Handle unexpected values
        }

        return name;
    }

  
    public int getCycleDuration() {
        int cycleTime = 0;

        // TODO 2: Add decision statements to set cycle duration
        switch (this.cycle) {
            case 1:
                cycleTime = 120;  
                break;
            case 2:
                cycleTime = 85;  
                break;
            case 3:
                cycleTime = 175;  
                break;
            case 4:
                cycleTime = 20; 
                break;
            case 5:
                cycleTime = 200;   
                break;
        }

        // TODO 3: Add an additional 30 minutes to the cycle time if extendedDry is on
        if (this.extendedDry) {
            cycleTime += 30;
        }

        return cycleTime;
    }

    
    
    @Override
    public String toString() {
        int duration = getCycleDuration();
        int hours = duration / 60;
        int minutes = (duration - (hours * 60));
     
        String name = getCycleName();
        String dryOption = "OFF";

        // TODO 4: Set dryOption to "ON" if extended dry is enabled
        if (this.extendedDry) {
            dryOption = "ON";
        }

        return String.format(
            "Starting wash using %s, it will take %d hours and %d minutes to complete. Extended dry is: %s",
            name, hours, minutes, dryOption
        );
    }
}

